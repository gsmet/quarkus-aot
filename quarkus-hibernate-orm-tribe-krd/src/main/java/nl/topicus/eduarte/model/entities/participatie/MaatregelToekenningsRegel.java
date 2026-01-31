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
package nl.topicus.eduarte.model.entities.participatie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.participatie.enums.MaatregelRegelSoort;
import nl.topicus.eduarte.model.entities.participatie.enums.MaatregelToekennenOp;
import nl.topicus.eduarte.model.entities.participatie.enums.PeriodeType;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class MaatregelToekenningsRegel extends InstellingEntiteit {
	/**
	 * Het aantal meldingen waarbij deze toekenningsregel aanslaat.
	 */
	@Column(nullable = false)
	private int aantalMeldingen;

	/**
	 * Het aantal 'vrije' meldingen, dwz het aantal meldingen een leerling mag
	 * hebben voordat deze regel in werking treedt.
	 */
	@Column(nullable = false)
	private int aantalVrijeMeldingen;

	@Column(nullable = false)
	private boolean actief;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "absentieReden", nullable = false)
	private AbsentieReden absentieReden;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maatregel", nullable = false)
	private Maatregel maatregel;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MaatregelRegelSoort regelsoort;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MaatregelToekennenOp maatregelToekennenOp;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private PeriodeType periodeType;

	/*
	 * Moet alleen gezet worden als periodeType Laatste_x_weken is.
	 */
	@Column(nullable = true)
	private int aantalWeken;

	/*
	 * Moet alleen gezet worden als periodeType Periode is.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "periode", nullable = true)
	private PeriodeIndeling periode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	public MaatregelToekenningsRegel() {
	}

	public int getAantalMeldingen() {
		return aantalMeldingen;
	}

	public void setAantalMeldingen(int aantalMeldingen) {
		this.aantalMeldingen = aantalMeldingen;
	}

	public int getAantalVrijeMeldingen() {
		return aantalVrijeMeldingen;
	}

	public void setAantalVrijeMeldingen(int aantalVrijeMeldingen) {
		this.aantalVrijeMeldingen = aantalVrijeMeldingen;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public AbsentieReden getAbsentieReden() {
		return absentieReden;
	}

	public void setAbsentieReden(AbsentieReden absentieReden) {
		this.absentieReden = absentieReden;
	}

	public Maatregel getMaatregel() {
		return maatregel;
	}

	public void setMaatregel(Maatregel maatregel) {
		this.maatregel = maatregel;
	}

	public MaatregelRegelSoort getRegelsoort() {
		return regelsoort;
	}

	public void setRegelsoort(MaatregelRegelSoort regelsoort) {
		this.regelsoort = regelsoort;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public PeriodeType getPeriodeType() {
		return periodeType;
	}

	public void setPeriodeType(PeriodeType periodeType) {
		this.periodeType = periodeType;
	}

	public int getAantalWeken() {
		return aantalWeken;
	}

	public void setAantalWeken(int aantalWeken) {
		this.aantalWeken = aantalWeken;
	}

	public PeriodeIndeling getPeriode() {
		return periode;
	}

	public void setPeriode(PeriodeIndeling periode) {
		this.periode = periode;
	}

	public MaatregelToekennenOp getMaatregelToekennenOp() {
		return maatregelToekennenOp;
	}

	public void setMaatregelToekennenOp(MaatregelToekennenOp maatregelToekennenOp) {
		this.maatregelToekennenOp = maatregelToekennenOp;
	}

	/**
	 * @return true als de organisatie-eenheid is toegestaan, anders false
	 */
	public boolean isOrganisatieEenheidToegestaan() {
		return getMaatregel().getOrganisatieEenheid().isParentOf(getOrganisatieEenheid());
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public Locatie getLocatie() {
		return locatie;
	}
}
