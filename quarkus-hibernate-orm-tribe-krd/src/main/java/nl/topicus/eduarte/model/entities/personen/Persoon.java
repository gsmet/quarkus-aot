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
package nl.topicus.eduarte.model.entities.personen;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;
import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.duo.bron.vo.waardelijsten.CumiCategorie;
import nl.topicus.eduarte.model.duo.bron.vo.waardelijsten.CumiRatio;
import nl.topicus.eduarte.model.duo.criho.annot.Criho;
import nl.topicus.eduarte.model.entities.AutomatischeIncasso;
import nl.topicus.eduarte.model.entities.Betaalwijze;
import nl.topicus.eduarte.model.entities.Geslacht;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.hogeronderwijs.Correspondentietaal;
import nl.topicus.eduarte.model.entities.landelijk.Gemeente;
import nl.topicus.eduarte.model.entities.landelijk.Land;
import nl.topicus.eduarte.model.entities.landelijk.Nationaliteit;
import nl.topicus.eduarte.model.entities.landelijk.Verblijfsvergunning;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.vrijevelden.PersoonVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Een persoon kan een medewerker of een deelnemer zijn.
 *
 * <h2>Namen</h2>
 *
 * Het is een enorm gezeik met de naam. Hier is de officiele regeling met
 * betrekking tot namen: Het veld officiele naam is ook bekend als de
 * geboortenaam. Dit is de naam die een persoon had voor een huwelijk de
 * achternaam heeft doen veranderen. Voorheen was dit ook bekend als
 * meisjesnaam, maar omdat we kennelijk in een homodictatuur (aldus de
 * Telegraaf) leven, dekt *meisjes*naam de lading niet.
 *
 * De naamvelden zonder prefix officieel zijn de aanspreeknamen. Deze worden in
 * het dagelijks leven gebruikt en ook getoond in de applicatie. Je zal dus
 * normaal gesproken het veld achternaam moeten tonen ipv officieleAchternaam.
 * Bij twijfel: achternaam ipv officieleAchternaam.
 *
 * Bij de intake wizard wordt de officieleAchternaam velden ingevuld, en de
 * waarden ook in het veld achternaam gekopieerd. Als de aanspreeknaam anders
 * is, dan kan de gebruiker deze apart invullen.
 *
 * Dit is ook <a href=
 * "http://taalunieversum.org/taalunie/hoe_noem_je_de_familienaam_die_iemand_gebruikte_vr_het_huwelijk/"
 * >gedocumenteerd door de Nederlandse Taalunie</a>.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@BatchSize(size = 20)
@IsViewWhenOnNoise
public class Persoon extends InstellingEntiteit
implements VrijVeldable<PersoonVrijVeld>, IBijlageKoppelEntiteit<PersoonBijlage> {
	@Column(length = 24, nullable = true)
	@Criho
	private String voorletters;

	@Column(length = 80, nullable = true)
	@Bron
	@Criho
	private String voornamen;

	@Column(length = 40, nullable = true)
	private String roepnaam;

	@Column(name = "voorvoegsel", nullable = true)
	private String voorvoegsel;

	@Column(length = 80, nullable = false)
	private String achternaam;

	@Column(length = 80, nullable = false)
	private String lowercaseAchternaam;

	@Column(length = 165, nullable = false)
	private String berekendeZoeknaam;

	@Bron
	@Criho
	@Column(length = 20, nullable = true)
	private String officieleVoorvoegsel;

	@Bron
	@Criho
	@Column(length = 80, nullable = false)
	private String officieleAchternaam;

	@XmlType(name = "ToepassingGeboortedatum")
	@XmlEnum
	public enum ToepassingGeboortedatum {
		/**
		 * Maand en geboortejaar gebruiken. 01-01-2009 wordt 00-10-2009.
		 */
		@XmlEnumValue("00-MM-JJJJ")
		GeboortemaandEnJaar {
			@Override
			public String toString() {
				return "Geboortemaand en -jaar";
			}
		},
		/**
		 * Alleen geboortejaar gebruiken. 01-01-2009 wordt 00-00-2009.
		 */
		@XmlEnumValue("00-00-JJJJ")
		Geboortejaar;
	}

	/**
	 * nullable is true omdat de persoon opgeslagen moet kunnen worden, zonder dat
	 * de verbintenis definitief is. Dit veld is pas verplicht als de verbintenis
	 * definitief wordt.
	 *
	 * @mantis 37579
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Bron(sleutel = true, verplicht = true)
	@Criho
	private Date geboortedatum;

	@Bron(sleutel = true)
	@Criho
	@Enumerated(EnumType.STRING)
	@Column(nullable = true)
	private ToepassingGeboortedatum toepassingGeboortedatum;

	/**
	 * nullable is true omdat de persoon opgeslagen moet kunnen worden, zonder dat
	 * de verbintenis definitief is. Dit veld is pas verplicht als de verbintenis
	 * definitief wordt.
	 *
	 * @mantis 37579
	 */
	@Column(nullable = true)
	@Enumerated(value = EnumType.STRING)
	@Bron(sleutel = true, verplicht = true)
	@Criho
	private Geslacht geslacht;

	@Column(nullable = true)
	@Bron(sleutel = true)
	private Long bsn;

	@Column(nullable = true)
	private Long debiteurennummer;

	@Column(nullable = true)
	private Date laatsteExportDatum;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nationaliteit1", nullable = true)
	private Nationaliteit nationaliteit1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nationaliteit2", nullable = true)
	private Nationaliteit nationaliteit2;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumInNederland;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geboorteGemeente", nullable = true)
	private Gemeente geboorteGemeente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geboorteland", nullable = true)
	private Land geboorteland;

	/**
	 * Voor bijvoorbeeld personen die in het buitenland zijn geboren.
	 */
	@Column(nullable = true)
	private String geboorteplaats;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumOverlijden;

	@BatchSize(size = 20)
	@Bron
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "begindatum DESC")
	private List<PersoonAdres> adressen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "volgorde")
	@BatchSize(size = 20)
	private List<PersoonContactgegeven> contactgegevens = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<AbstractRelatie> relaties = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afbeelding", nullable = true)
	private PersoonBijlage afbeelding;

	@Column
	@Enumerated(value = EnumType.STRING)
	private BurgerlijkeStaat burgerlijkeStaat;

	@Column(length = 11, nullable = true)
	private String bankrekeningnummer;

	@Column(length = 60, nullable = true)
	private String bankrekeningTenaamstelling;

	/**
	 * Unordered voor joins
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	private List<PersoonAdres> persoonAdressenUnordered = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	private List<PersoonContactgegeven> persoonTelefoonsUnordered = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<PersoonVrijVeld> vrijVelden = new ArrayList<>();

	@OneToOne(mappedBy = "persoon", fetch = FetchType.LAZY)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private Deelnemer deelnemer;

	@Bron
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private CumiRatio cumiRatio;

	@Bron
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private CumiCategorie cumiCategorie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoon")
	private List<PersoonBijlage> bijlagen = new ArrayList<>();

	/**
	 * De indiciatie die aangeeft of de deelnemer door de gemeente als inburgeraar
	 * is aangemeld. Nodig bij BRON communicatie voor VAVO en ED.
	 */
	@Column(nullable = false)
	@Bron
	private boolean nieuwkomer;

	@Column(nullable = false)
	@Comment("Indicatie die aangeeft of informatie over deze deelnemer verstrekt mag worden aan derden")
	private boolean nietVerstrekkenAanDerden;

	@Enumerated(EnumType.STRING)
	@Column(length = 20, nullable = false)
	private AutomatischeIncasso automatischeIncasso = AutomatischeIncasso.Geen;

	@Column(nullable = true)
	@Comment("Einddatum van de machtiging. Na deze datum zullen geen bedragen automatisch meer worden geïncasseerd.")
	private Date automatischeIncassoEinddatum;

	@Column(nullable = true)
	@Comment("Specifieke betalingstermijn voor deze debiteur (in dagen).")
	private Integer betalingstermijn;

	/**
	 * Dit is niet een account wachtwoord, maar een (tijdelijk) wachtwoord dat door
	 * webservices wordt aangeboden voor communicatie met de deelnemer/medewerker.
	 * Plain tekst, heeft geen verdere betekenis binnen KRD.
	 */
	@Comment("Extern wachtwoord dat niet gekoppeld is aan het account van deze persoon.")
	@Column(length = 128, nullable = true, name = "wachtwoord")
	private String wachtwoord;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geboortelandOuder1", nullable = true)
	private Land geboortelandOuder1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "geboortelandOuder2", nullable = true)
	private Land geboortelandOuder2;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verblijfsvergunning", nullable = true)
	private Verblijfsvergunning verblijfsvergunning;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Correspondentietaal correspondentietaal;

	@Column(length = 34, nullable = true)
	private String buitenlandsBankrekeningnummer;

	@Column(length = 50, nullable = true)
	private String buitenlandseBanknaam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "landBank", nullable = true)
	private Land landBank;

	@Enumerated(EnumType.STRING)
	@Column(length = 30, nullable = false)
	private Betaalwijze factuurBetaalwijze = Betaalwijze.OVERIG;

	public String getVoorletters() {
		return voorletters;
	}

	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}

	public String getVoornamen() {
		return voornamen;
	}

	public void setVoornamen(String voornamen) {
		this.voornamen = voornamen;
	}

	public String getRoepnaam() {
		return roepnaam;
	}

	public void setRoepnaam(String roepnaam) {
		this.roepnaam = roepnaam;
	}

	public String getVoorvoegsel() {
		return voorvoegsel;
	}

	public void setVoorvoegsel(String voorvoegsel) {
		this.voorvoegsel = voorvoegsel;
	}

	public String getAchternaam() {
		return achternaam;
	}

	public void setAchternaam(String achternaam) {
		this.achternaam = achternaam;
	}

	public String getLowercaseAchternaam() {
		return lowercaseAchternaam;
	}

	public void setLowercaseAchternaam(String lowercaseAchternaam) {
		this.lowercaseAchternaam = lowercaseAchternaam;
	}

	public String getBerekendeZoeknaam() {
		return berekendeZoeknaam;
	}

	public void setBerekendeZoeknaam(String berekendeZoeknaam) {
		this.berekendeZoeknaam = berekendeZoeknaam;
	}

	public String getOfficieleVoorvoegsel() {
		return officieleVoorvoegsel;
	}

	public void setOfficieleVoorvoegsel(String officieleVoorvoegsel) {
		this.officieleVoorvoegsel = officieleVoorvoegsel;
	}

	public String getOfficieleAchternaam() {
		return officieleAchternaam;
	}

	public void setOfficieleAchternaam(String officieleAchternaam) {
		this.officieleAchternaam = officieleAchternaam;
	}

	public Date getGeboortedatum() {
		return geboortedatum;
	}

	public void setGeboortedatum(Date geboortedatum) {
		this.geboortedatum = geboortedatum;
	}

	public ToepassingGeboortedatum getToepassingGeboortedatum() {
		return toepassingGeboortedatum;
	}

	public void setToepassingGeboortedatum(ToepassingGeboortedatum toepassingGeboortedatum) {
		this.toepassingGeboortedatum = toepassingGeboortedatum;
	}

	public Geslacht getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(Geslacht geslacht) {
		this.geslacht = geslacht;
	}

	public Long getBsn() {
		return bsn;
	}

	public void setBsn(Long bsn) {
		this.bsn = bsn;
	}

	public Long getDebiteurennummer() {
		return debiteurennummer;
	}

	public void setDebiteurennummer(Long debiteurennummer) {
		this.debiteurennummer = debiteurennummer;
	}

	public Date getLaatsteExportDatum() {
		return laatsteExportDatum;
	}

	public void setLaatsteExportDatum(Date laatsteExportDatum) {
		this.laatsteExportDatum = laatsteExportDatum;
	}

	public Nationaliteit getNationaliteit1() {
		return nationaliteit1;
	}

	public void setNationaliteit1(Nationaliteit nationaliteit1) {
		this.nationaliteit1 = nationaliteit1;
	}

	public Nationaliteit getNationaliteit2() {
		return nationaliteit2;
	}

	public void setNationaliteit2(Nationaliteit nationaliteit2) {
		this.nationaliteit2 = nationaliteit2;
	}

	public Date getDatumInNederland() {
		return datumInNederland;
	}

	public void setDatumInNederland(Date datumInNederland) {
		this.datumInNederland = datumInNederland;
	}

	public Gemeente getGeboorteGemeente() {
		return geboorteGemeente;
	}

	public void setGeboorteGemeente(Gemeente geboorteGemeente) {
		this.geboorteGemeente = geboorteGemeente;
	}

	public Land getGeboorteland() {
		return geboorteland;
	}

	public void setGeboorteland(Land geboorteland) {
		this.geboorteland = geboorteland;
	}

	public String getGeboorteplaats() {
		return geboorteplaats;
	}

	public void setGeboorteplaats(String geboorteplaats) {
		this.geboorteplaats = geboorteplaats;
	}

	public Date getDatumOverlijden() {
		return datumOverlijden;
	}

	public void setDatumOverlijden(Date datumOverlijden) {
		this.datumOverlijden = datumOverlijden;
	}

	public List<PersoonAdres> getAdressen() {
		return adressen;
	}

	public void setAdressen(List<PersoonAdres> adressen) {
		this.adressen = adressen;
	}

	public List<PersoonContactgegeven> getContactgegevens() {
		return contactgegevens;
	}

	public void setContactgegevens(List<PersoonContactgegeven> contactgegevens) {
		this.contactgegevens = contactgegevens;
	}

	public List<AbstractRelatie> getRelaties() {
		return relaties;
	}

	public void setRelaties(List<AbstractRelatie> relaties) {
		this.relaties = relaties;
	}

	public PersoonBijlage getAfbeelding() {
		return afbeelding;
	}

	public void setAfbeelding(PersoonBijlage afbeelding) {
		this.afbeelding = afbeelding;
	}

	public BurgerlijkeStaat getBurgerlijkeStaat() {
		return burgerlijkeStaat;
	}

	public void setBurgerlijkeStaat(BurgerlijkeStaat burgerlijkeStaat) {
		this.burgerlijkeStaat = burgerlijkeStaat;
	}

	public String getBankrekeningnummer() {
		return bankrekeningnummer;
	}

	public void setBankrekeningnummer(String bankrekeningnummer) {
		this.bankrekeningnummer = bankrekeningnummer;
	}

	public String getBankrekeningTenaamstelling() {
		return bankrekeningTenaamstelling;
	}

	public void setBankrekeningTenaamstelling(String bankrekeningTenaamstelling) {
		this.bankrekeningTenaamstelling = bankrekeningTenaamstelling;
	}

	public List<PersoonAdres> getPersoonAdressenUnordered() {
		return persoonAdressenUnordered;
	}

	public void setPersoonAdressenUnordered(List<PersoonAdres> persoonAdressenUnordered) {
		this.persoonAdressenUnordered = persoonAdressenUnordered;
	}

	public List<PersoonContactgegeven> getPersoonTelefoonsUnordered() {
		return persoonTelefoonsUnordered;
	}

	public void setPersoonTelefoonsUnordered(List<PersoonContactgegeven> persoonTelefoonsUnordered) {
		this.persoonTelefoonsUnordered = persoonTelefoonsUnordered;
	}

	@Override
	public List<PersoonVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<PersoonVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public CumiRatio getCumiRatio() {
		return cumiRatio;
	}

	public void setCumiRatio(CumiRatio cumiRatio) {
		this.cumiRatio = cumiRatio;
	}

	public CumiCategorie getCumiCategorie() {
		return cumiCategorie;
	}

	public void setCumiCategorie(CumiCategorie cumiCategorie) {
		this.cumiCategorie = cumiCategorie;
	}

	@Override
	public List<PersoonBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<PersoonBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public boolean isNieuwkomer() {
		return nieuwkomer;
	}

	public void setNieuwkomer(boolean nieuwkomer) {
		this.nieuwkomer = nieuwkomer;
	}

	public boolean isNietVerstrekkenAanDerden() {
		return nietVerstrekkenAanDerden;
	}

	public void setNietVerstrekkenAanDerden(boolean nietVerstrekkenAanDerden) {
		this.nietVerstrekkenAanDerden = nietVerstrekkenAanDerden;
	}

	public AutomatischeIncasso getAutomatischeIncasso() {
		return automatischeIncasso;
	}

	public void setAutomatischeIncasso(AutomatischeIncasso automatischeIncasso) {
		this.automatischeIncasso = automatischeIncasso;
	}

	public Date getAutomatischeIncassoEinddatum() {
		return automatischeIncassoEinddatum;
	}

	public void setAutomatischeIncassoEinddatum(Date automatischeIncassoEinddatum) {
		this.automatischeIncassoEinddatum = automatischeIncassoEinddatum;
	}

	public Integer getBetalingstermijn() {
		return betalingstermijn;
	}

	public void setBetalingstermijn(Integer betalingstermijn) {
		this.betalingstermijn = betalingstermijn;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public Land getGeboortelandOuder1() {
		return geboortelandOuder1;
	}

	public void setGeboortelandOuder1(Land geboortelandOuder1) {
		this.geboortelandOuder1 = geboortelandOuder1;
	}

	public Land getGeboortelandOuder2() {
		return geboortelandOuder2;
	}

	public void setGeboortelandOuder2(Land geboortelandOuder2) {
		this.geboortelandOuder2 = geboortelandOuder2;
	}

	public Verblijfsvergunning getVerblijfsvergunning() {
		return verblijfsvergunning;
	}

	public void setVerblijfsvergunning(Verblijfsvergunning verblijfsvergunning) {
		this.verblijfsvergunning = verblijfsvergunning;
	}

	public Correspondentietaal getCorrespondentietaal() {
		return correspondentietaal;
	}

	public void setCorrespondentietaal(Correspondentietaal correspondentietaal) {
		this.correspondentietaal = correspondentietaal;
	}

	public String getBuitenlandsBankrekeningnummer() {
		return buitenlandsBankrekeningnummer;
	}

	public void setBuitenlandsBankrekeningnummer(String buitenlandsBankrekeningnummer) {
		this.buitenlandsBankrekeningnummer = buitenlandsBankrekeningnummer;
	}

	public String getBuitenlandseBanknaam() {
		return buitenlandseBanknaam;
	}

	public void setBuitenlandseBanknaam(String buitenlandseBanknaam) {
		this.buitenlandseBanknaam = buitenlandseBanknaam;
	}

	public Land getLandBank() {
		return landBank;
	}

	public void setLandBank(Land landBank) {
		this.landBank = landBank;
	}

	public Betaalwijze getFactuurBetaalwijze() {
		return factuurBetaalwijze;
	}

	public void setFactuurBetaalwijze(Betaalwijze factuurBetaalwijze) {
		this.factuurBetaalwijze = factuurBetaalwijze;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public PersoonBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public PersoonVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<PersoonVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	public String getVolledigeNaam() {
		return null;
	}
}