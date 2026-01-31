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
package nl.topicus.eduarte.model.entities.organisatie;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.entities.Betaalwijze;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.bpv.BPVBedrijfsgegeven;
import nl.topicus.eduarte.model.entities.bpv.BPVCriteriaExterneOrganisatie;
import nl.topicus.eduarte.model.entities.kenmerk.ExterneOrganisatieKenmerk;
import nl.topicus.eduarte.model.entities.personen.ExterneOrganisatieContactPersoon;
import nl.topicus.eduarte.model.entities.vrijevelden.ExterneOrganisatieVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Externe organisatie.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@IsViewWhenOnNoise
public class ExterneOrganisatie extends BeginEinddatumLandelijkOfInstellingEntiteit
implements VrijVeldable<ExterneOrganisatieVrijVeld>, IBijlageKoppelEntiteit<ExterneOrganisatieBijlage> {
	/**
	 * Status van vergelijking van interne gegevens met externe service.
	 */
	public enum ControleResultaat {
		ONBEKEND, GELIJK, VERSCHILLEND;
	}

	@Column(length = 100, nullable = false)
	private String naam;

	@Column(length = 50, nullable = false)
	private String verkorteNaam;

	@BatchSize(size = 100)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "begindatum DESC")
	private List<ExterneOrganisatieAdres> adressen = new ArrayList<>();

	@BatchSize(size = 100)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "volgorde")
	private List<ExterneOrganisatieContactgegeven> contactgegevens;

	@BatchSize(size = 100)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "begindatum")
	private List<ExterneOrganisatieContactPersoon> contactPersonen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BPVBedrijfsgegeven> bpvBedrijfsgegevens = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortExterneOrganisatie", nullable = true)
	private SoortExterneOrganisatie soortExterneOrganisatie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<ExterneOrganisatieVrijVeld> vrijVelden;

	@Column(nullable = true)
	private Long debiteurennummer;

	@Column(length = 11, nullable = true)
	private String bankrekeningnummer;

	@Column(nullable = true)
	private Date laatsteExportDatum;

	@Column(nullable = false)
	private boolean bpvBedrijf;

	@Column(nullable = true)
	@Lob
	private String omschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ondertekeningBPVOdoor", nullable = true)
	@Comment("Geeft aan dat een andere organisatie (bijv. holding) verantwoordelijk is voor de ondertekening van BPV-overeenkomsten gesloten met deze organisatie.")
	private ExterneOrganisatie ondertekeningBPVOdoor;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ExterneOrganisatieKenmerk> kenmerken = new ArrayList<>();

	@Comment("Geeft aan of dit bedrijf verzamelfacturen wil ontvangen voor meerdere deelnemers.")
	private boolean verzamelfacturen = true;

	@Column(nullable = true)
	@Comment("Specifieke betalingstermijn voor deze debiteur (in dagen).")
	private Integer betalingstermijn;

	/**
	 * Geeft aan of dit veld nog gecontroleerd moet worden dmv. webservice.
	 */
	@Column(nullable = true)
	private Boolean nogControleren;

	@Enumerated(EnumType.STRING)
	@Column(nullable = true)
	private ControleResultaat controleResultaat;

	/**
	 * Niet geschikt voor BPV-deelnemers: het kan voorkomen dat een
	 * onderwijsinstelling naar een bepaald BPV-bedrijf liever geen deelnemers
	 * stuurt. Dit kan worden aangegeven door de checkbox „Niet geschikt voor
	 * BPV-deelnemers‟ aan te vinken. In het tekstveld bij „Toelichting‟ kan een
	 * verklaring hiervoor worden ingevoerd. Wanneer deze vink bij een BPV-bedrijf
	 * aanstaat, wordt tijdens het matchen bij leerplaatsen van dit bedrijf een
	 * waarschuwingsicoontje getoond. Wanneer de muis boven het icoontje wordt
	 * gehouden, verschijnt een popup met de toelichting, indien deze aanwezig is.
	 * De gebruiker kan ervoor kiezen om toch een deelnemer aan het bedrijf te
	 * matchen.
	 */
	@Column(nullable = true)
	private Boolean nietGeschiktVoorBPVDeelnemers;

	@Column(nullable = true)
	@Lob
	private String toelichtingNietGeschiktVoorBPV;

	@BatchSize(size = 100)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ExterneOrganisatiePraktijkbegeleider> praktijkbegeleiders = new ArrayList<>();

	@BatchSize(size = 100)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("datum")
	private List<ExterneOrganisatieOpmerking> opmerkingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	private List<ExterneOrganisatieBijlage> bijlagen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BPVCriteriaExterneOrganisatie> bpvCriteria = new ArrayList<>();

	/**
	 * Niet geschikt voor BPV-match: instellingen kunnen bij BPV bedrijven ervoor
	 * kiezen dat de stageplaatsen van een bedrijf niet meegenomen worden in de
	 * matching procedures. Op deze manier kunnen de stages van bepaalde bedrijven
	 * exclusief gehouden worden en enkel door de instelling aan een kandidaat
	 * vergeven worden.
	 */
	@Column(nullable = true)
	@Comment("Stage/BPV-plaatsen van dit bedrijf zijn niet bedoeld om mee te nemen in de matching procedure.")
	private Boolean nietGeschiktVoorBPVMatch;

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private Betaalwijze factuurBetaalwijze;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getVerkorteNaam() {
		return verkorteNaam;
	}

	public void setVerkorteNaam(String verkorteNaam) {
		this.verkorteNaam = verkorteNaam;
	}

	public List<ExterneOrganisatieAdres> getAdressen() {
		return adressen;
	}

	public void setAdressen(List<ExterneOrganisatieAdres> adressen) {
		this.adressen = adressen;
	}

	public List<ExterneOrganisatieContactgegeven> getContactgegevens() {
		return contactgegevens;
	}

	public void setContactgegevens(List<ExterneOrganisatieContactgegeven> contactgegevens) {
		this.contactgegevens = contactgegevens;
	}

	public List<ExterneOrganisatieContactPersoon> getContactPersonen() {
		return contactPersonen;
	}

	public void setContactPersonen(List<ExterneOrganisatieContactPersoon> contactPersonen) {
		this.contactPersonen = contactPersonen;
	}

	public List<BPVBedrijfsgegeven> getBpvBedrijfsgegevens() {
		return bpvBedrijfsgegevens;
	}

	public void setBpvBedrijfsgegevens(List<BPVBedrijfsgegeven> bpvBedrijfsgegevens) {
		this.bpvBedrijfsgegevens = bpvBedrijfsgegevens;
	}

	public SoortExterneOrganisatie getSoortExterneOrganisatie() {
		return soortExterneOrganisatie;
	}

	public void setSoortExterneOrganisatie(SoortExterneOrganisatie soortExterneOrganisatie) {
		this.soortExterneOrganisatie = soortExterneOrganisatie;
	}

	@Override
	public List<ExterneOrganisatieVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<ExterneOrganisatieVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public Long getDebiteurennummer() {
		return debiteurennummer;
	}

	public void setDebiteurennummer(Long debiteurennummer) {
		this.debiteurennummer = debiteurennummer;
	}

	public String getBankrekeningnummer() {
		return bankrekeningnummer;
	}

	public void setBankrekeningnummer(String bankrekeningnummer) {
		this.bankrekeningnummer = bankrekeningnummer;
	}

	public Date getLaatsteExportDatum() {
		return laatsteExportDatum;
	}

	public void setLaatsteExportDatum(Date laatsteExportDatum) {
		this.laatsteExportDatum = laatsteExportDatum;
	}

	public boolean isBpvBedrijf() {
		return bpvBedrijf;
	}

	public void setBpvBedrijf(boolean bpvBedrijf) {
		this.bpvBedrijf = bpvBedrijf;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public ExterneOrganisatie getOndertekeningBPVOdoor() {
		return ondertekeningBPVOdoor;
	}

	public void setOndertekeningBPVOdoor(ExterneOrganisatie ondertekeningBPVOdoor) {
		this.ondertekeningBPVOdoor = ondertekeningBPVOdoor;
	}

	public List<ExterneOrganisatieKenmerk> getKenmerken() {
		return kenmerken;
	}

	public void setKenmerken(List<ExterneOrganisatieKenmerk> kenmerken) {
		this.kenmerken = kenmerken;
	}

	public boolean isVerzamelfacturen() {
		return verzamelfacturen;
	}

	public void setVerzamelfacturen(boolean verzamelfacturen) {
		this.verzamelfacturen = verzamelfacturen;
	}

	public Integer getBetalingstermijn() {
		return betalingstermijn;
	}

	public void setBetalingstermijn(Integer betalingstermijn) {
		this.betalingstermijn = betalingstermijn;
	}

	public Boolean getNogControleren() {
		return nogControleren;
	}

	public void setNogControleren(Boolean nogControleren) {
		this.nogControleren = nogControleren;
	}

	public ControleResultaat getControleResultaat() {
		return controleResultaat;
	}

	public void setControleResultaat(ControleResultaat controleResultaat) {
		this.controleResultaat = controleResultaat;
	}

	public Boolean getNietGeschiktVoorBPVDeelnemers() {
		return nietGeschiktVoorBPVDeelnemers;
	}

	public void setNietGeschiktVoorBPVDeelnemers(Boolean nietGeschiktVoorBPVDeelnemers) {
		this.nietGeschiktVoorBPVDeelnemers = nietGeschiktVoorBPVDeelnemers;
	}

	public String getToelichtingNietGeschiktVoorBPV() {
		return toelichtingNietGeschiktVoorBPV;
	}

	public void setToelichtingNietGeschiktVoorBPV(String toelichtingNietGeschiktVoorBPV) {
		this.toelichtingNietGeschiktVoorBPV = toelichtingNietGeschiktVoorBPV;
	}

	public List<ExterneOrganisatiePraktijkbegeleider> getPraktijkbegeleiders() {
		return praktijkbegeleiders;
	}

	public void setPraktijkbegeleiders(List<ExterneOrganisatiePraktijkbegeleider> praktijkbegeleiders) {
		this.praktijkbegeleiders = praktijkbegeleiders;
	}

	public List<ExterneOrganisatieOpmerking> getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(List<ExterneOrganisatieOpmerking> opmerkingen) {
		this.opmerkingen = opmerkingen;
	}

	@Override
	public List<ExterneOrganisatieBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<ExterneOrganisatieBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<BPVCriteriaExterneOrganisatie> getBpvCriteria() {
		return bpvCriteria;
	}

	public void setBpvCriteria(List<BPVCriteriaExterneOrganisatie> bpvCriteria) {
		this.bpvCriteria = bpvCriteria;
	}

	public Boolean getNietGeschiktVoorBPVMatch() {
		return nietGeschiktVoorBPVMatch;
	}

	public void setNietGeschiktVoorBPVMatch(Boolean nietGeschiktVoorBPVMatch) {
		this.nietGeschiktVoorBPVMatch = nietGeschiktVoorBPVMatch;
	}

	@Override
	public ExterneOrganisatieVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<ExterneOrganisatieVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public ExterneOrganisatieBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}