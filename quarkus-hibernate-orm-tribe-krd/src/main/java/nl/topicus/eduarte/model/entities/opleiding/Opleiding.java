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
package nl.topicus.eduarte.model.entities.opleiding;

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
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.duo.bron.bve.waardelijsten.Intensiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.curriculum.Curriculum;
import nl.topicus.eduarte.model.entities.hogeronderwijs.OpleidingFase;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.MBOLeerweg;
import nl.topicus.eduarte.model.entities.taxonomie.MBONiveau;
import nl.topicus.eduarte.model.entities.taxonomie.Verbintenisgebied;
import nl.topicus.eduarte.model.entities.vrijevelden.OpleidingVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Een opleiding die door een instelling aangeboden kan worden op 1 of meer
 * organisatie-eenheden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@BatchSize(size = 20)
@IsViewWhenOnNoise
public class Opleiding extends BeginEinddatumInstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelbaarEntiteit<OpleidingAanbod>, VrijVeldable<OpleidingVrijVeld>,
IBijlageKoppelEntiteit<OpleidingBijlage> {
	@Column(nullable = false, length = 20)
	private String code;

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = true, length = 100)
	private String internationaleNaam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "verbintenisgebied")
	private Verbintenisgebied verbintenisgebied;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "opleiding")
	// @OrderBy(value = "locatie, organisatieEenheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<OpleidingAanbod> aanbod;

	@Column(nullable = true)
	private Integer beginLeerjaar;

	@Column(nullable = true)
	private Integer eindLeerjaar;

	@Column(nullable = true)
	private Date datumLaatsteInschrijving;

	@Column(nullable = true)
	@Enumerated(value = EnumType.STRING)
	private MBOLeerweg leerweg;

	@Column(nullable = true)
	private Integer duurInMaanden;

	/**
	 * Vrije tekst die opgenomen kan worden op diploma's.
	 */
	@Column(nullable = true, length = 1000)
	private String diplomatekst1;

	@Column(nullable = true, length = 1000)
	private String diplomatekst2;

	@Column(nullable = true, length = 1000)
	private String diplomatekst3;

	/**
	 * Vlaggetje om aan te geven of eventuele landelijke productregels genegeerd
	 * moeten worden.
	 */
	@Column(nullable = false)
	private boolean negeerLandelijkeProductregels;

	/**
	 * Of een kenniscentrum gekozen moet worden voor verbintenissen van deze
	 * opleiding (mantis 63058)
	 */
	@Column(nullable = false)
	private boolean kiesKenniscentrum = false;

	/**
	 * Vlaggetje om aan te geven of eventuele landelijke criteria genegeerd moeten
	 * worden.
	 */
	@Column(nullable = false)
	private boolean negeerLandelijkeCriteria;

	/**
	 * Vlaggetje om aan te geven of deze opleiding met BRON gecommuniceerd moet
	 * worden. Heeft alleen invloed op opleidingen die binnen een taxonomie vallen
	 * die daadwerkelijk met BRON uitgewisseld kunnen worden.
	 */
	@Column(nullable = false, name = "communicerenMetBRON")
	private boolean communicerenMetBRON = true;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "opleiding")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<OpleidingVrijVeld> vrijVelden;

	/**
	 * De bijlages van deze opleiding
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "opleiding")
	private List<OpleidingBijlage> bijlagen;

	@Column(nullable = false, length = 100)
	@Comment("Deze naam kan gebruikt worden bij bijvoorbeeld een digitaal aanmeld portaal")
	private String wervingsnaam;

	@Column(nullable = true, length = 100)
	@Enumerated(value = EnumType.STRING)
	@Comment("De default intensiteit voor deelnemers die ingeschreven worden op deze opleiding")
	private Intensiteit defaultIntensiteit;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "opleiding")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	// @OrderBy("cohort ASC")
	private List<Curriculum> curriculums;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "opleiding")
	@OrderBy(value = "opleidingsvorm desc, hoofdfase desc")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<OpleidingFase> fases;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getInternationaleNaam() {
		return internationaleNaam;
	}

	public void setInternationaleNaam(String internationaleNaam) {
		this.internationaleNaam = internationaleNaam;
	}

	public Verbintenisgebied getVerbintenisgebied() {
		return verbintenisgebied;
	}

	public void setVerbintenisgebied(Verbintenisgebied verbintenisgebied) {
		this.verbintenisgebied = verbintenisgebied;
	}

	public List<OpleidingAanbod> getAanbod() {
		return aanbod;
	}

	public void setAanbod(List<OpleidingAanbod> aanbod) {
		this.aanbod = aanbod;
	}

	public Integer getBeginLeerjaar() {
		return beginLeerjaar;
	}

	public void setBeginLeerjaar(Integer beginLeerjaar) {
		this.beginLeerjaar = beginLeerjaar;
	}

	public Integer getEindLeerjaar() {
		return eindLeerjaar;
	}

	public void setEindLeerjaar(Integer eindLeerjaar) {
		this.eindLeerjaar = eindLeerjaar;
	}

	public Date getDatumLaatsteInschrijving() {
		return datumLaatsteInschrijving;
	}

	public void setDatumLaatsteInschrijving(Date datumLaatsteInschrijving) {
		this.datumLaatsteInschrijving = datumLaatsteInschrijving;
	}

	public MBOLeerweg getLeerweg() {
		return leerweg;
	}

	public void setLeerweg(MBOLeerweg leerweg) {
		this.leerweg = leerweg;
	}

	public Integer getDuurInMaanden() {
		return duurInMaanden;
	}

	public void setDuurInMaanden(Integer duurInMaanden) {
		this.duurInMaanden = duurInMaanden;
	}

	public String getDiplomatekst1() {
		return diplomatekst1;
	}

	public void setDiplomatekst1(String diplomatekst1) {
		this.diplomatekst1 = diplomatekst1;
	}

	public String getDiplomatekst2() {
		return diplomatekst2;
	}

	public void setDiplomatekst2(String diplomatekst2) {
		this.diplomatekst2 = diplomatekst2;
	}

	public String getDiplomatekst3() {
		return diplomatekst3;
	}

	public void setDiplomatekst3(String diplomatekst3) {
		this.diplomatekst3 = diplomatekst3;
	}

	public boolean isNegeerLandelijkeProductregels() {
		return negeerLandelijkeProductregels;
	}

	public void setNegeerLandelijkeProductregels(boolean negeerLandelijkeProductregels) {
		this.negeerLandelijkeProductregels = negeerLandelijkeProductregels;
	}

	public boolean isKiesKenniscentrum() {
		return kiesKenniscentrum;
	}

	public void setKiesKenniscentrum(boolean kiesKenniscentrum) {
		this.kiesKenniscentrum = kiesKenniscentrum;
	}

	public boolean isNegeerLandelijkeCriteria() {
		return negeerLandelijkeCriteria;
	}

	public void setNegeerLandelijkeCriteria(boolean negeerLandelijkeCriteria) {
		this.negeerLandelijkeCriteria = negeerLandelijkeCriteria;
	}

	public boolean isCommunicerenMetBRON() {
		return communicerenMetBRON;
	}

	public void setCommunicerenMetBRON(boolean communicerenMetBRON) {
		this.communicerenMetBRON = communicerenMetBRON;
	}

	@Override
	public List<OpleidingVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<OpleidingVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	@Override
	public List<OpleidingBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<OpleidingBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public String getWervingsnaam() {
		return wervingsnaam;
	}

	public void setWervingsnaam(String wervingsnaam) {
		this.wervingsnaam = wervingsnaam;
	}

	public Intensiteit getDefaultIntensiteit() {
		return defaultIntensiteit;
	}

	public void setDefaultIntensiteit(Intensiteit defaultIntensiteit) {
		this.defaultIntensiteit = defaultIntensiteit;
	}

	public List<Curriculum> getCurriculums() {
		return curriculums;
	}

	public void setCurriculums(List<Curriculum> curriculums) {
		this.curriculums = curriculums;
	}

	public List<OpleidingFase> getFases() {
		return fases;
	}

	public void setFases(List<OpleidingFase> fases) {
		this.fases = fases;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public OpleidingBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public OpleidingVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<OpleidingVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public List<OpleidingAanbod> getOrganisatieEenheidLocatieKoppelingen() {
		return null;
	}

	public MBONiveau getNiveau() {
		return null;
	}

	public boolean isVavo() {
		return false;
	}
}
