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
package nl.topicus.eduarte.model.entities.inschrijving;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.IBeginEinddatumEntiteit;
import nl.topicus.eduarte.model.entities.hogeronderwijs.VooropleidingSignaalcode;
import nl.topicus.eduarte.model.entities.hogeronderwijs.VooropleidingVakResultaat;
import nl.topicus.eduarte.model.entities.hogeronderwijs.VooropleidingVerificatieStatus;
import nl.topicus.eduarte.model.entities.inschrijving.SoortVooropleiding.SoortOnderwijs;
import nl.topicus.eduarte.model.entities.landelijk.Land;
import nl.topicus.eduarte.model.entities.organisatie.Brin;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.taxonomie.ho.CrohoOpleiding;
import nl.topicus.eduarte.model.entities.vrijevelden.VooropleidingVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Vooropleiding van een deelnemer.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Vooropleiding extends InstellingEntiteit
implements IBeginEinddatumEntiteit, IVooropleiding, VrijVeldable<VooropleidingVrijVeld> {
	public enum SoortVooropleidingOrganisatie {
		ExterneOrganisatie {
			@Override
			public String toString() {
				return "Externe Organisatie";
			}
		},
		Buitenland, Overig;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private SoortVooropleidingOrganisatie soortOrganisatie = SoortVooropleidingOrganisatie.ExterneOrganisatie;

	/**
	 * De externe organisatie (landelijk of instelling-specifiek) waaraan de
	 * vooropleiding is genoten.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = true)
	@Bron
	private ExterneOrganisatie externeOrganisatie;

	/**
	 * Naam van de organisatie waar de vooropleiding is genoten.
	 */
	@Column(length = 100, nullable = true)
	private String naam;

	@Column(length = 100, nullable = true)
	private String plaats;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortVooropleiding", nullable = true)
	@Bron
	private SoortVooropleiding soortVooropleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortVooropleidingHO", nullable = true)
	private SoortVooropleidingHO soortVooropleidingHO;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortVooropleidingBuitenlands", nullable = true)
	private SoortVooropleidingBuitenlands soortVooropleidingBuitenlands;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortVooropleidingCroho", nullable = true)
	private CrohoOpleiding soortVooropleidingCroho;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "land", nullable = true)
	private Land land;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schooladvies", nullable = true)
	private Schooladvies schooladvies;

	@Column(nullable = true)
	private Integer citoscore;

	@Column(nullable = false)
	@Bron
	private boolean diplomaBehaald;

	@Column(nullable = true)
	private Integer aantalJarenOnderwijs;

	@Column(nullable = false)
	private boolean aantalJarenZelfInvullen = false;

	/**
	 * De eerste dag waarop de vooropleiding geldig wordt.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date begindatum;

	/**
	 * De laatste dag waarop de vooropleiding geldig wordt.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date einddatum;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vooropleiding")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<VooropleidingVrijVeld> vrijVelden;

	@Column(length = 100, nullable = true)
	private String vooropleidingNaam;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vooropleiding")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<VooropleidingSignaalcode> vooropleidingSignaalcodes = new ArrayList<>();

	@Column(nullable = true)
	@Enumerated(value = EnumType.STRING)
	private VooropleidingVerificatieStatus verificatieStatus;

	@Column(nullable = true)
	private Date verificatieDatum;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verificatieBrin", nullable = true)
	private Brin verificatieDoor;

	@Column(length = 70, nullable = true)
	private String verificatieDoorInstelling;

	@Column(length = 35, nullable = true)
	private String verificatieDoorMedewerker;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vooropleiding")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<VooropleidingVakResultaat> vooropleidingVakResultaten = new ArrayList<>();

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public SoortVooropleidingOrganisatie getSoortOrganisatie() {
		return soortOrganisatie;
	}

	public void setSoortOrganisatie(SoortVooropleidingOrganisatie soortOrganisatie) {
		this.soortOrganisatie = soortOrganisatie;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public SoortVooropleiding getSoortVooropleiding() {
		return soortVooropleiding;
	}

	public void setSoortVooropleiding(SoortVooropleiding soortVooropleiding) {
		this.soortVooropleiding = soortVooropleiding;
	}

	public SoortVooropleidingHO getSoortVooropleidingHO() {
		return soortVooropleidingHO;
	}

	public void setSoortVooropleidingHO(SoortVooropleidingHO soortVooropleidingHO) {
		this.soortVooropleidingHO = soortVooropleidingHO;
	}

	public SoortVooropleidingBuitenlands getSoortVooropleidingBuitenlands() {
		return soortVooropleidingBuitenlands;
	}

	public void setSoortVooropleidingBuitenlands(SoortVooropleidingBuitenlands soortVooropleidingBuitenlands) {
		this.soortVooropleidingBuitenlands = soortVooropleidingBuitenlands;
	}

	public CrohoOpleiding getSoortVooropleidingCroho() {
		return soortVooropleidingCroho;
	}

	public void setSoortVooropleidingCroho(CrohoOpleiding soortVooropleidingCroho) {
		this.soortVooropleidingCroho = soortVooropleidingCroho;
	}

	public Land getLand() {
		return land;
	}

	public void setLand(Land land) {
		this.land = land;
	}

	@Override
	public Schooladvies getSchooladvies() {
		return schooladvies;
	}

	public void setSchooladvies(Schooladvies schooladvies) {
		this.schooladvies = schooladvies;
	}

	@Override
	public Integer getCitoscore() {
		return citoscore;
	}

	public void setCitoscore(Integer citoscore) {
		this.citoscore = citoscore;
	}

	@Override
	public boolean isDiplomaBehaald() {
		return diplomaBehaald;
	}

	public void setDiplomaBehaald(boolean diplomaBehaald) {
		this.diplomaBehaald = diplomaBehaald;
	}

	public Integer getAantalJarenOnderwijs() {
		return aantalJarenOnderwijs;
	}

	public void setAantalJarenOnderwijs(Integer aantalJarenOnderwijs) {
		this.aantalJarenOnderwijs = aantalJarenOnderwijs;
	}

	public boolean isAantalJarenZelfInvullen() {
		return aantalJarenZelfInvullen;
	}

	public void setAantalJarenZelfInvullen(boolean aantalJarenZelfInvullen) {
		this.aantalJarenZelfInvullen = aantalJarenZelfInvullen;
	}

	@Override
	public Date getBegindatum() {
		return begindatum;
	}

	public void setBegindatum(Date begindatum) {
		this.begindatum = begindatum;
	}

	@Override
	public Date getEinddatum() {
		return einddatum;
	}

	public void setEinddatum(Date einddatum) {
		this.einddatum = einddatum;
	}

	@Override
	public List<VooropleidingVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<VooropleidingVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public String getVooropleidingNaam() {
		return vooropleidingNaam;
	}

	public void setVooropleidingNaam(String vooropleidingNaam) {
		this.vooropleidingNaam = vooropleidingNaam;
	}

	public List<VooropleidingSignaalcode> getVooropleidingSignaalcodes() {
		return vooropleidingSignaalcodes;
	}

	public void setVooropleidingSignaalcodes(List<VooropleidingSignaalcode> vooropleidingSignaalcodes) {
		this.vooropleidingSignaalcodes = vooropleidingSignaalcodes;
	}

	public VooropleidingVerificatieStatus getVerificatieStatus() {
		return verificatieStatus;
	}

	public void setVerificatieStatus(VooropleidingVerificatieStatus verificatieStatus) {
		this.verificatieStatus = verificatieStatus;
	}

	public Date getVerificatieDatum() {
		return verificatieDatum;
	}

	public void setVerificatieDatum(Date verificatieDatum) {
		this.verificatieDatum = verificatieDatum;
	}

	public Brin getVerificatieDoor() {
		return verificatieDoor;
	}

	public void setVerificatieDoor(Brin verificatieDoor) {
		this.verificatieDoor = verificatieDoor;
	}

	public String getVerificatieDoorInstelling() {
		return verificatieDoorInstelling;
	}

	public void setVerificatieDoorInstelling(String verificatieDoorInstelling) {
		this.verificatieDoorInstelling = verificatieDoorInstelling;
	}

	public String getVerificatieDoorMedewerker() {
		return verificatieDoorMedewerker;
	}

	public void setVerificatieDoorMedewerker(String verificatieDoorMedewerker) {
		this.verificatieDoorMedewerker = verificatieDoorMedewerker;
	}

	public List<VooropleidingVakResultaat> getVooropleidingVakResultaten() {
		return vooropleidingVakResultaten;
	}

	public void setVooropleidingVakResultaten(List<VooropleidingVakResultaat> vooropleidingVakResultaten) {
		this.vooropleidingVakResultaten = vooropleidingVakResultaten;
	}

	@Override
	public VooropleidingVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<VooropleidingVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public SoortOnderwijs getSoortOnderwijs() {
		return null;
	}

	@Override
	public String getOmschrijving() {
		return null;
	}

	@Override
	public String getBrincode() {
		return null;
	}

	@Override
	public String getOrganisatieOmschrijving() {
		return null;
	}

	@Override
	public String getNaamVooropleiding() {
		return null;
	}

	@Override
	public Date getEinddatumNotNull() {
		return null;
	}
}