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
package nl.topicus.eduarte.model.entities.onderwijsproduct;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.bpv.BPVCriteriaOnderwijsproduct;
import nl.topicus.eduarte.model.entities.inschrijving.OnderwijsproductAfname;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.resultaatstructuur.Resultaatstructuur;
import nl.topicus.eduarte.model.entities.vrijevelden.OnderwijsproductVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Onderwijsproduct is een vak, project, lessenreeks, les, stage enz. Let op:
 * Dit is iets anders dan een opleiding waarop een deelnemer ingeschreven kan
 * worden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "code", "organisatie" }) })
public class Onderwijsproduct extends BeginEinddatumInstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelbaarEntiteit<OnderwijsproductAanbod>,
VrijVeldable<OnderwijsproductVrijVeld>, IBijlageKoppelEntiteit<OnderwijsproductBijlage> {
	@Column(nullable = false, length = 20)
	private String code;

	@Column(nullable = false, length = 100)
	private String titel;

	@Column(nullable = true, length = 100)
	private String internationaleTitel;

	@Lob()
	private String omschrijving;

	@Lob()
	private String internationaleOmschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "soortProduct")
	private SoortOnderwijsproduct soortProduct;

	/**
	 * Zoektermen van dit onderwijsproduct.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductZoekterm> zoektermen;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private OnderwijsproductStatus status;

	/**
	 * Omschrijving van wanneer in het jaar het onderwijsproduct beschikbaar is.
	 */
	@Column(nullable = true, length = 2000)
	private String kalender;

	/**
	 * De (gewenste) uitvoeringsfrequentie van het onderwijsproduct, bijvoorbeeld 3
	 * uur per week, 2 keer in de maand.
	 */
	@Column(nullable = true, length = 2000)
	private String uitvoeringsfrequentie;

	/**
	 * De omvang van het onderwijsproduct in aantal begeleide klokuren.
	 */
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal omvang;

	/**
	 * De belasting van het onderwijsproduct. De meeteenheid is door de
	 * onderwijsinstelling te bepalen (bijvoorbeeld studielasturen of studiepunten).
	 */
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal belasting;

	/**
	 * Aggregatieniveau van het onderwijsproduct geeft aan waar in de hierarchie dat
	 * een onderwijsproduct geplaatst mag worden.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "aggregatieniveau")
	private Aggregatieniveau aggregatieniveau;

	/**
	 * Geeft aan of dit onderwijsproduct geschikt is als een startonderwijsproduct.
	 * Als dit property op true gezet wordt, mogen geen voorwaardelijke
	 * onderwijsproducten aangegeven worden.
	 */
	@Column(nullable = false)
	private boolean startonderwijsproduct;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "leerstijl")
	private Leerstijl leerstijl;

	/**
	 * Omschrijving van de toegankelijkheid van het onderwijsproduct.
	 */
	@Lob()
	private String toegankelijkheid;

	@Column(nullable = true)
	private Integer minimumAantalDeelnemers;

	@Column(nullable = true)
	private Integer maximumAantalDeelnemers;

	@Column(nullable = true, length = 2000)
	private String juridischEigenaar;

	@Column(nullable = true, length = 2000)
	private String gebruiksrecht;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "soortPraktijklokaal")
	private SoortPraktijklokaal soortPraktijklokaal;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "typeToets")
	private TypeToets typeToets;

	/**
	 * Vereiste competenties van het personeel.
	 */
	@Column(nullable = true, length = 2000)
	private String personeelCompetenties;

	@Column(nullable = true, length = 2000)
	private String personeelKennisgebiedEnNiveau;

	@Column(nullable = true, length = 2000)
	private String personeelWettelijkeVereisten;

	@Column(nullable = true, length = 2000)
	private String personeelBevoegdheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "typeLocatie")
	private TypeLocatie typeLocatie;

	/**
	 * Geeft aan of er voor een deelnemer die dit onderwijsproduct afneemt een
	 * werkstuktitel ingevoerd kan worden. Dit property zou op true gezet moeten
	 * worden voor het sectorwerkstuk en profielwerkstuk.
	 */
	@Column(nullable = false)
	private boolean heeftWerkstuktitel;

	/**
	 * Geeft aan of dit onderwijsproduct alleen door externe organisatie aangeboden
	 * wordt, en dat deze instelling het onderwijsproduct alleen als een EVC erkend.
	 */
	@Column(nullable = false)
	private boolean alleenExtern;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductGebruiksmiddel> onderwijsproductGebruiksmiddelen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductVerbruiksmiddel> onderwijsproductVerbruiksmiddelen;

	@Column(nullable = true, scale = 2, precision = 19)
	private BigDecimal kostprijs;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductAanbod> onderwijsproductAanbodList;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductTaxonomie> onderwijsproductTaxonomieList;

	/**
	 * De onderwijsproducten die onderdeel uit maken van dit onderwijsproduct.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductSamenstelling> onderdelen;

	/**
	 * De onderwijsproducten waarvan dit onderwijsproduct een onderdeel van is.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "child")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductSamenstelling> onderdeelVan;

	/**
	 * De onderwijsproducten die een voorwaarde vormen voor dit product.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "voorwaardeVoor")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductVoorwaarde> voorwaarden;

	/**
	 * De onderwijsproducten die een voorwaarde vormen voor dit product.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "voorwaardelijkProduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductVoorwaarde> voorwaardelijkVoor;

	/**
	 * De onderwijsproducten die de opvolgers zijn van dit product.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "oudProduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductOpvolger> opvolgers;

	/**
	 * De onderwijsproducten waarvoor dit onderwijsproduct een opvolger is.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "nieuwProduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductOpvolger> opvolgerVan;

	/**
	 * De bijlages van dit onderwijsproduct
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<OnderwijsproductBijlage> bijlagen;

	/**
	 * De afnames van dit onderwijsproduct
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	private List<OnderwijsproductAfname> afnames;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	private List<Resultaatstructuur> resultaatstructuren;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<OnderwijsproductVrijVeld> vrijVelden;

	/**
	 * Geeft aan of dit onderwijsproduct ook afgenomen mag worden bij een
	 * Verbintenis met status Intake.
	 */
	@Column(nullable = false)
	private boolean bijIntake;

	/**
	 * Uitbreiding onderwijscatalogus voor Amarantis
	 */

	@Column(nullable = true)
	private Boolean individueel;

	@Column(nullable = true)
	private Boolean onafhankelijk;

	@Column(nullable = true)
	private Boolean begeleid;

	@Lob()
	private String vereisteVoorkennis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "niveauaanduiding")
	private OnderwijsproductNiveauaanduiding niveauaanduiding;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal belastingEC;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal belastingOverig;

	@Column(nullable = true, length = 500)
	private String leerstofdrager;

	@Lob()
	private String literatuur;

	@Lob()
	private String hulpmiddelen;

	@Lob()
	private String docentactiviteiten;

	@Column(nullable = true)
	private Integer frequentiePerWeek;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal tijdPerEenheid;

	@Column(nullable = true)
	private Integer aantalWeken;

	@Column(nullable = true)
	private Integer credits;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproduct")
	private List<BPVCriteriaOnderwijsproduct> bpvCriteria = new ArrayList<>();

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getInternationaleTitel() {
		return internationaleTitel;
	}

	public void setInternationaleTitel(String internationaleTitel) {
		this.internationaleTitel = internationaleTitel;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getInternationaleOmschrijving() {
		return internationaleOmschrijving;
	}

	public void setInternationaleOmschrijving(String internationaleOmschrijving) {
		this.internationaleOmschrijving = internationaleOmschrijving;
	}

	public SoortOnderwijsproduct getSoortProduct() {
		return soortProduct;
	}

	public void setSoortProduct(SoortOnderwijsproduct soortProduct) {
		this.soortProduct = soortProduct;
	}

	public List<OnderwijsproductZoekterm> getZoektermen() {
		return zoektermen;
	}

	public void setZoektermen(List<OnderwijsproductZoekterm> zoektermen) {
		this.zoektermen = zoektermen;
	}

	public OnderwijsproductStatus getStatus() {
		return status;
	}

	public void setStatus(OnderwijsproductStatus status) {
		this.status = status;
	}

	public String getKalender() {
		return kalender;
	}

	public void setKalender(String kalender) {
		this.kalender = kalender;
	}

	public String getUitvoeringsfrequentie() {
		return uitvoeringsfrequentie;
	}

	public void setUitvoeringsfrequentie(String uitvoeringsfrequentie) {
		this.uitvoeringsfrequentie = uitvoeringsfrequentie;
	}

	public BigDecimal getOmvang() {
		return omvang;
	}

	public void setOmvang(BigDecimal omvang) {
		this.omvang = omvang;
	}

	public BigDecimal getBelasting() {
		return belasting;
	}

	public void setBelasting(BigDecimal belasting) {
		this.belasting = belasting;
	}

	public Aggregatieniveau getAggregatieniveau() {
		return aggregatieniveau;
	}

	public void setAggregatieniveau(Aggregatieniveau aggregatieniveau) {
		this.aggregatieniveau = aggregatieniveau;
	}

	public boolean isStartonderwijsproduct() {
		return startonderwijsproduct;
	}

	public void setStartonderwijsproduct(boolean startonderwijsproduct) {
		this.startonderwijsproduct = startonderwijsproduct;
	}

	public Leerstijl getLeerstijl() {
		return leerstijl;
	}

	public void setLeerstijl(Leerstijl leerstijl) {
		this.leerstijl = leerstijl;
	}

	public String getToegankelijkheid() {
		return toegankelijkheid;
	}

	public void setToegankelijkheid(String toegankelijkheid) {
		this.toegankelijkheid = toegankelijkheid;
	}

	public Integer getMinimumAantalDeelnemers() {
		return minimumAantalDeelnemers;
	}

	public void setMinimumAantalDeelnemers(Integer minimumAantalDeelnemers) {
		this.minimumAantalDeelnemers = minimumAantalDeelnemers;
	}

	public Integer getMaximumAantalDeelnemers() {
		return maximumAantalDeelnemers;
	}

	public void setMaximumAantalDeelnemers(Integer maximumAantalDeelnemers) {
		this.maximumAantalDeelnemers = maximumAantalDeelnemers;
	}

	public String getJuridischEigenaar() {
		return juridischEigenaar;
	}

	public void setJuridischEigenaar(String juridischEigenaar) {
		this.juridischEigenaar = juridischEigenaar;
	}

	public String getGebruiksrecht() {
		return gebruiksrecht;
	}

	public void setGebruiksrecht(String gebruiksrecht) {
		this.gebruiksrecht = gebruiksrecht;
	}

	public SoortPraktijklokaal getSoortPraktijklokaal() {
		return soortPraktijklokaal;
	}

	public void setSoortPraktijklokaal(SoortPraktijklokaal soortPraktijklokaal) {
		this.soortPraktijklokaal = soortPraktijklokaal;
	}

	public TypeToets getTypeToets() {
		return typeToets;
	}

	public void setTypeToets(TypeToets typeToets) {
		this.typeToets = typeToets;
	}

	public String getPersoneelCompetenties() {
		return personeelCompetenties;
	}

	public void setPersoneelCompetenties(String personeelCompetenties) {
		this.personeelCompetenties = personeelCompetenties;
	}

	public String getPersoneelKennisgebiedEnNiveau() {
		return personeelKennisgebiedEnNiveau;
	}

	public void setPersoneelKennisgebiedEnNiveau(String personeelKennisgebiedEnNiveau) {
		this.personeelKennisgebiedEnNiveau = personeelKennisgebiedEnNiveau;
	}

	public String getPersoneelWettelijkeVereisten() {
		return personeelWettelijkeVereisten;
	}

	public void setPersoneelWettelijkeVereisten(String personeelWettelijkeVereisten) {
		this.personeelWettelijkeVereisten = personeelWettelijkeVereisten;
	}

	public String getPersoneelBevoegdheid() {
		return personeelBevoegdheid;
	}

	public void setPersoneelBevoegdheid(String personeelBevoegdheid) {
		this.personeelBevoegdheid = personeelBevoegdheid;
	}

	public TypeLocatie getTypeLocatie() {
		return typeLocatie;
	}

	public void setTypeLocatie(TypeLocatie typeLocatie) {
		this.typeLocatie = typeLocatie;
	}

	public boolean isHeeftWerkstuktitel() {
		return heeftWerkstuktitel;
	}

	public void setHeeftWerkstuktitel(boolean heeftWerkstuktitel) {
		this.heeftWerkstuktitel = heeftWerkstuktitel;
	}

	public boolean isAlleenExtern() {
		return alleenExtern;
	}

	public void setAlleenExtern(boolean alleenExtern) {
		this.alleenExtern = alleenExtern;
	}

	public List<OnderwijsproductGebruiksmiddel> getOnderwijsproductGebruiksmiddelen() {
		return onderwijsproductGebruiksmiddelen;
	}

	public void setOnderwijsproductGebruiksmiddelen(
			List<OnderwijsproductGebruiksmiddel> onderwijsproductGebruiksmiddelen) {
		this.onderwijsproductGebruiksmiddelen = onderwijsproductGebruiksmiddelen;
	}

	public List<OnderwijsproductVerbruiksmiddel> getOnderwijsproductVerbruiksmiddelen() {
		return onderwijsproductVerbruiksmiddelen;
	}

	public void setOnderwijsproductVerbruiksmiddelen(
			List<OnderwijsproductVerbruiksmiddel> onderwijsproductVerbruiksmiddelen) {
		this.onderwijsproductVerbruiksmiddelen = onderwijsproductVerbruiksmiddelen;
	}

	public BigDecimal getKostprijs() {
		return kostprijs;
	}

	public void setKostprijs(BigDecimal kostprijs) {
		this.kostprijs = kostprijs;
	}

	public List<OnderwijsproductAanbod> getOnderwijsproductAanbodList() {
		return onderwijsproductAanbodList;
	}

	public void setOnderwijsproductAanbodList(List<OnderwijsproductAanbod> onderwijsproductAanbodList) {
		this.onderwijsproductAanbodList = onderwijsproductAanbodList;
	}

	public List<OnderwijsproductTaxonomie> getOnderwijsproductTaxonomieList() {
		return onderwijsproductTaxonomieList;
	}

	public void setOnderwijsproductTaxonomieList(List<OnderwijsproductTaxonomie> onderwijsproductTaxonomieList) {
		this.onderwijsproductTaxonomieList = onderwijsproductTaxonomieList;
	}

	public List<OnderwijsproductSamenstelling> getOnderdelen() {
		return onderdelen;
	}

	public void setOnderdelen(List<OnderwijsproductSamenstelling> onderdelen) {
		this.onderdelen = onderdelen;
	}

	public List<OnderwijsproductSamenstelling> getOnderdeelVan() {
		return onderdeelVan;
	}

	public void setOnderdeelVan(List<OnderwijsproductSamenstelling> onderdeelVan) {
		this.onderdeelVan = onderdeelVan;
	}

	public List<OnderwijsproductVoorwaarde> getVoorwaarden() {
		return voorwaarden;
	}

	public void setVoorwaarden(List<OnderwijsproductVoorwaarde> voorwaarden) {
		this.voorwaarden = voorwaarden;
	}

	public List<OnderwijsproductVoorwaarde> getVoorwaardelijkVoor() {
		return voorwaardelijkVoor;
	}

	public void setVoorwaardelijkVoor(List<OnderwijsproductVoorwaarde> voorwaardelijkVoor) {
		this.voorwaardelijkVoor = voorwaardelijkVoor;
	}

	public List<OnderwijsproductOpvolger> getOpvolgers() {
		return opvolgers;
	}

	public void setOpvolgers(List<OnderwijsproductOpvolger> opvolgers) {
		this.opvolgers = opvolgers;
	}

	public List<OnderwijsproductOpvolger> getOpvolgerVan() {
		return opvolgerVan;
	}

	public void setOpvolgerVan(List<OnderwijsproductOpvolger> opvolgerVan) {
		this.opvolgerVan = opvolgerVan;
	}

	@Override
	public List<OnderwijsproductBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<OnderwijsproductBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<OnderwijsproductAfname> getAfnames() {
		return afnames;
	}

	public void setAfnames(List<OnderwijsproductAfname> afnames) {
		this.afnames = afnames;
	}

	public List<Resultaatstructuur> getResultaatstructuren() {
		return resultaatstructuren;
	}

	public void setResultaatstructuren(List<Resultaatstructuur> resultaatstructuren) {
		this.resultaatstructuren = resultaatstructuren;
	}

	@Override
	public List<OnderwijsproductVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<OnderwijsproductVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public boolean isBijIntake() {
		return bijIntake;
	}

	public void setBijIntake(boolean bijIntake) {
		this.bijIntake = bijIntake;
	}

	public Boolean getIndividueel() {
		return individueel;
	}

	public void setIndividueel(Boolean individueel) {
		this.individueel = individueel;
	}

	public Boolean getOnafhankelijk() {
		return onafhankelijk;
	}

	public void setOnafhankelijk(Boolean onafhankelijk) {
		this.onafhankelijk = onafhankelijk;
	}

	public Boolean getBegeleid() {
		return begeleid;
	}

	public void setBegeleid(Boolean begeleid) {
		this.begeleid = begeleid;
	}

	public String getVereisteVoorkennis() {
		return vereisteVoorkennis;
	}

	public void setVereisteVoorkennis(String vereisteVoorkennis) {
		this.vereisteVoorkennis = vereisteVoorkennis;
	}

	public OnderwijsproductNiveauaanduiding getNiveauaanduiding() {
		return niveauaanduiding;
	}

	public void setNiveauaanduiding(OnderwijsproductNiveauaanduiding niveauaanduiding) {
		this.niveauaanduiding = niveauaanduiding;
	}

	public BigDecimal getBelastingEC() {
		return belastingEC;
	}

	public void setBelastingEC(BigDecimal belastingEC) {
		this.belastingEC = belastingEC;
	}

	public BigDecimal getBelastingOverig() {
		return belastingOverig;
	}

	public void setBelastingOverig(BigDecimal belastingOverig) {
		this.belastingOverig = belastingOverig;
	}

	public String getLeerstofdrager() {
		return leerstofdrager;
	}

	public void setLeerstofdrager(String leerstofdrager) {
		this.leerstofdrager = leerstofdrager;
	}

	public String getLiteratuur() {
		return literatuur;
	}

	public void setLiteratuur(String literatuur) {
		this.literatuur = literatuur;
	}

	public String getHulpmiddelen() {
		return hulpmiddelen;
	}

	public void setHulpmiddelen(String hulpmiddelen) {
		this.hulpmiddelen = hulpmiddelen;
	}

	public String getDocentactiviteiten() {
		return docentactiviteiten;
	}

	public void setDocentactiviteiten(String docentactiviteiten) {
		this.docentactiviteiten = docentactiviteiten;
	}

	public Integer getFrequentiePerWeek() {
		return frequentiePerWeek;
	}

	public void setFrequentiePerWeek(Integer frequentiePerWeek) {
		this.frequentiePerWeek = frequentiePerWeek;
	}

	public BigDecimal getTijdPerEenheid() {
		return tijdPerEenheid;
	}

	public void setTijdPerEenheid(BigDecimal tijdPerEenheid) {
		this.tijdPerEenheid = tijdPerEenheid;
	}

	public Integer getAantalWeken() {
		return aantalWeken;
	}

	public void setAantalWeken(Integer aantalWeken) {
		this.aantalWeken = aantalWeken;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public List<BPVCriteriaOnderwijsproduct> getBpvCriteria() {
		return bpvCriteria;
	}

	public void setBpvCriteria(List<BPVCriteriaOnderwijsproduct> bpvCriteria) {
		this.bpvCriteria = bpvCriteria;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public OnderwijsproductBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public OnderwijsproductVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<OnderwijsproductVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public List<OnderwijsproductAanbod> getOrganisatieEenheidLocatieKoppelingen() {
		return null;
	}
}
