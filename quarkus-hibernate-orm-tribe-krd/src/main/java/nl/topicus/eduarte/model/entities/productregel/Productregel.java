/*
 * Copyright 2022 Topicus Onderwijs Eduarte B.V..
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package nl.topicus.eduarte.model.entities.productregel;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.hogeronderwijs.Fase;
import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.taxonomie.Verbintenisgebied;

/**
 * Productregel representeert zowel landelijke als lokale productregels. Een
 * productregel geeft aan welke onderwijsproducten een deelnemer af moet nemen
 * voor het behalen van zijn/haar diploma. Voor elke productregel mag of moet
 * een deelnemer een onderwijsproduct selecteren. De mogelijke
 * onderwijsproducten van een productregel worden gedefinieerd als een lijst van
 * deelgebieden (landelijke productregels) of een lijst van onderwijsproducten
 * (lokale productregels).
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = { "afkorting", "opleiding", "verbintenisgebied", "cohort" }),
		@UniqueConstraint(columnNames = { "volgnummer", "soortProductregel", "opleiding", "verbintenisgebied",
		"cohort" }) })
public class Productregel extends LandelijkOfInstellingEntiteit {
	/**
	 * Een productregel kan een normale productregel zijn, waar een deelnemer een
	 * keuze voor maakt, of het kan een afgeleide productregel zijn waarbij de
	 * deelnemer geen keuze maakt, maar waarbij het eindresultaat van de
	 * productregel het gemiddelde is van de onderwijsproducten die de deelnemer bij
	 * andere productregels gekozen heeft. Als een afgeleide productregel
	 * bijvoorbeeld de onderwijsproducten ma, ckv en anw bevat, en de deelnemer
	 * heeft ma en ckv bij andere productregels gekozen, is het eindresultaat van de
	 * afgeleide productregel het gemiddelde van de eindresultaten van ma en ckv.
	 *
	 *
	 */
	public enum TypeProductregel {
		Productregel, AfgeleideProductregel;
	}

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private TypeProductregel typeProductregel;

	/**
	 * Unieke afkorting per verbintenisgebied/opleiding.
	 */
	@Column(nullable = false, length = 20)
	private String afkorting;

	@Column(nullable = false, length = 255)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "soortProductregel")
	private SoortProductregel soortProductregel;

	/**
	 * Niet nullable, oftewel ook invullen bij lokale productregels. Dit is dan wel
	 * redundante informatie, maar maakt het mogelijk om een unique constraint te
	 * plaatsen op de afkorting per verbintenisgebied/opleiding.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "verbintenisgebied")
	private Verbintenisgebied verbintenisgebied;

	/**
	 * Nullable voor landelijke productregels, verplicht voor lokale productregels.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "opleiding")
	private Opleiding opleiding;

	@Column(nullable = false)
	private int volgnummer;

	/**
	 * Is dit een verplichte productregel?
	 */
	@Column(nullable = false)
	private boolean verplicht;

	/**
	 * Aantal decimalen voor een afgeleide productregel.
	 */
	@Column(nullable = false)
	private int aantalDecimalen;

	/**
	 * De minimale waarde voor deze productregel. Deze waarde kan gebruikt worden in
	 * de formules van de criteriumbank, of kan afgedrukt worden op een cijferlijst.
	 */
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal minimaleWaarde;

	@Column(nullable = true, length = 10)
	private String minimaleWaardeTekst;

	/**
	 * Productregels zijn altijd cohortspecifiek
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "cohort")
	private Cohort cohort;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productregel")
	@Cache(region = "Instelling", usage = CacheConcurrencyStrategy.READ_WRITE)
	@BatchSize(size = 100)
	private List<ToegestaanOnderwijsproduct> toegestaneOnderwijsproducten;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "productregel")
	@Cache(region = "Landelijk", usage = CacheConcurrencyStrategy.READ_WRITE)
	@BatchSize(size = 100)
	private List<ToegestaanDeelgebied> toegestaneDeelgebieden;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "fase")
	private Fase fase;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "alleOnderwProdToestaanVan")
	private OrganisatieEenheid alleOnderwijsproductenToestaanVan;

	public TypeProductregel getTypeProductregel() {
		return typeProductregel;
	}

	public void setTypeProductregel(TypeProductregel typeProductregel) {
		this.typeProductregel = typeProductregel;
	}

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public SoortProductregel getSoortProductregel() {
		return soortProductregel;
	}

	public void setSoortProductregel(SoortProductregel soortProductregel) {
		this.soortProductregel = soortProductregel;
	}

	public Verbintenisgebied getVerbintenisgebied() {
		return verbintenisgebied;
	}

	public void setVerbintenisgebied(Verbintenisgebied verbintenisgebied) {
		this.verbintenisgebied = verbintenisgebied;
	}

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(Opleiding opleiding) {
		this.opleiding = opleiding;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public boolean isVerplicht() {
		return verplicht;
	}

	public void setVerplicht(boolean verplicht) {
		this.verplicht = verplicht;
	}

	public int getAantalDecimalen() {
		return aantalDecimalen;
	}

	public void setAantalDecimalen(int aantalDecimalen) {
		this.aantalDecimalen = aantalDecimalen;
	}

	public BigDecimal getMinimaleWaarde() {
		return minimaleWaarde;
	}

	public void setMinimaleWaarde(BigDecimal minimaleWaarde) {
		this.minimaleWaarde = minimaleWaarde;
	}

	public String getMinimaleWaardeTekst() {
		return minimaleWaardeTekst;
	}

	public void setMinimaleWaardeTekst(String minimaleWaardeTekst) {
		this.minimaleWaardeTekst = minimaleWaardeTekst;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public List<ToegestaanOnderwijsproduct> getToegestaneOnderwijsproducten() {
		return toegestaneOnderwijsproducten;
	}

	public void setToegestaneOnderwijsproducten(List<ToegestaanOnderwijsproduct> toegestaneOnderwijsproducten) {
		this.toegestaneOnderwijsproducten = toegestaneOnderwijsproducten;
	}

	public List<ToegestaanDeelgebied> getToegestaneDeelgebieden() {
		return toegestaneDeelgebieden;
	}

	public void setToegestaneDeelgebieden(List<ToegestaanDeelgebied> toegestaneDeelgebieden) {
		this.toegestaneDeelgebieden = toegestaneDeelgebieden;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public OrganisatieEenheid getAlleOnderwijsproductenToestaanVan() {
		return alleOnderwijsproductenToestaanVan;
	}

	public void setAlleOnderwijsproductenToestaanVan(OrganisatieEenheid alleOnderwijsproductenToestaanVan) {
		this.alleOnderwijsproductenToestaanVan = alleOnderwijsproductenToestaanVan;
	}
}
