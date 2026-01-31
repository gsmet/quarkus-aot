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
package nl.topicus.eduarte.model.entities.bpv;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.BronEntiteitStatus;
import nl.topicus.eduarte.model.entities.IBronStatusEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.inschrijving.BPVInschrijvingBijlage;
import nl.topicus.eduarte.model.entities.inschrijving.BronCommuniceerbaar;
import nl.topicus.eduarte.model.entities.inschrijving.OnderwijsproductAfname;
import nl.topicus.eduarte.model.entities.inschrijving.RedenUitschrijving;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.personen.ExterneOrganisatieContactPersoon;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.entities.vrijevelden.BPVInschrijvingVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * BPVInschrijving
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@IsViewWhenOnNoise
public class BPVInschrijving extends BeginEinddatumInstellingEntiteit implements IBronStatusEntiteit,
IBijlageKoppelEntiteit<BPVInschrijvingBijlage>, VrijVeldable<BPVInschrijvingVrijVeld> {
	public enum BPVStatus implements BronCommuniceerbaar {

		/**
		 * De BPV is nog niet officieel. Alle gegevens kunnen nog wijzigen. De BPV is
		 * nog niet aan BRON gemeld. De deelnemer is nog niet aan de slag gegaan bij het
		 * BPV-bedrijf.
		 */
		Voorlopig,

		/**
		 * De BPV is nog niet officieel (niet ondertekend), maar alle gegevens liggen in
		 * principe vast. De BPV wordt aan BRON gemeld. Er kan een BPVO worden
		 * afgedrukt. Bij het op volledig zetten wordt gecontroleerd of is voldaan aan
		 * alle eisen die BRON aan de gegevens stelt. Als dit niet het geval is, wordt
		 * dit via een melding weergegeven en blijft de status op voorlopig staan.
		 * Wanneer de status op “Volledig” gezet wordt, zijn ook praktijkopleider,
		 * praktijkbegeleider, kenniscentrum (bij BBL), verwachte einddatum, totale
		 * omvang en uren en dagen per week verplicht.
		 */
		Volledig,

		/**
		 * De BPVO is wel afgedrukt, maar nog niet ondertekend. De BPV is aan BRON
		 * gemeld (of de melding staat in de wachtrij). Gedurende deze status wordt
		 * gewacht op de retourontvangst van een ondertekende BPVO.
		 */
		OvereenkomstAfgedrukt {
			@Override
			public String toString() {
				return "Overeenkomst afgedrukt";
			}
		},

		/**
		 * De BPV is officieel en getekend. Alle gegevens liggen vast. De BPV is aan
		 * BRON gemeld (of melding staat in de wachtrij). De deelnemer kan aan de slag
		 * gaan bij het BPV-bedrijf.
		 */
		Definitief,

		/**
		 * De (werkelijke) einddatum van de BPV is verstreken. Deze status is in feite
		 * impliciet, want deze status wordt automatisch bereikt door het verstrijken
		 * van de einddatum, behalve wanneer de BPV afgemeld of afgewezen is.
		 */
		Beëindigd,

		/**
		 * De deelnemer heeft zich afgemeld voor de BPV. De BPV zal nooit worden
		 * geëffectueerd en de deelnemer zal niet aan de slag gaan bij het BPV-bedrijf.
		 * Er is geen melding naar BRON geweest, of, wanneer deze status via
		 * “definitief” was bereikt, de BPV-melding is uit BRON verwijderd. De
		 * verbintenis mag niet meer worden gewijzigd zodra deze status wordt bereikt.
		 */
		Afgemeld,

		/**
		 * De instelling, het BPV-bedrijf, het kenniscentrum of BRON heeft de BPV niet
		 * goedgekeurd. De BPV zal nooit worden geëffectueerd en de deelnemer zal niet
		 * aan de slag gaan bij het BPV-bedrijf. Er is geen melding naar BRON geweest,
		 * of, wanneer deze status via “volledig” was bereikt, de BPV-melding is uit
		 * BRON verwijderd. De BPV mag niet meer worden gewijzigd zodra deze status
		 * wordt bereikt.
		 */
		Afgewezen;

		/**
		 * @return <code>true</code> als <tt>status1 &lt;= this &lt;= status2</tt>
		 */
		public boolean tussen(BPVStatus status1, BPVStatus status2) {
			return (status1.ordinal() <= this.ordinal()) && this.ordinal() <= status2.ordinal();
		}

		/**
		 * @return <code>true</code> als
		 */
		@Override
		public boolean isBronCommuniceerbaar() {
			return tussen(BPVStatus.Volledig, BPVStatus.Beëindigd);
		}

		/**
		 * Deze methode geeft de mogelijke vervolgstatussen terug voor een normale
		 * gebruiker
		 *
		 * @return de mogelijke vervolgstatussen van deze status.
		 */
		public BPVStatus[] getVervolgNormaal() {
			switch (this) {
			case Voorlopig:
				return new BPVStatus[] { this, Volledig, Afgewezen, Afgemeld };
			case Volledig:
				// KOL 20091110: Afgedrukt weggehaald als vervolgstatus omdat dit
				// alleen mag met de knop 'Afdrukken'
				return new BPVStatus[] { this };
			case OvereenkomstAfgedrukt:
				return new BPVStatus[] { this, Definitief };
			case Definitief:
				return new BPVStatus[] { this }; // Beeindigd moet je bereiken
				// via BPV beeindigen
			case Beëindigd:
				return new BPVStatus[] { this };
			case Afgemeld:
				return new BPVStatus[] { this, Voorlopig };
			case Afgewezen:
				return new BPVStatus[] { this, Voorlopig };
			default:
			}
			return new BPVStatus[] { this };
		}

		/**
		 * Deze methode geeft de mogelijke vervolgstatussen terug voor gebruikers die
		 * extra geautoriseerd zijn
		 *
		 * @return De mogelijke vervolgstatussen bij extra autorisatie.
		 */
		public BPVStatus[] getVervolgUitgebreid() {
			switch (this) {
			case Voorlopig:
				return new BPVStatus[] { this, Volledig, Afgewezen, Afgemeld };
			case Volledig:
				// KOL 20091110: Afgedrukt weggehaald als vervolgstatus omdat dit
				// alleen mag met de knop 'Afdrukken'
				return new BPVStatus[] { this, Afgewezen, Afgemeld, Voorlopig };
			case OvereenkomstAfgedrukt:
				return new BPVStatus[] { this, Definitief, Afgewezen, Afgemeld, Volledig, Voorlopig };
			case Definitief:
				return new BPVStatus[] { this, Voorlopig }; // Beeindigd moet je
				// bereiken
			case Beëindigd:
				return new BPVStatus[] { this };
			case Afgemeld:
				return new BPVStatus[] { this, Voorlopig, Volledig, OvereenkomstAfgedrukt };
			case Afgewezen:
				return new BPVStatus[] { this, Voorlopig, Volledig, OvereenkomstAfgedrukt };
			default:
			}
			return new BPVStatus[] { this };
		}

		public static List<BPVStatus> getBronCommuniceerbareStatussen() {
			List<BPVStatus> result = new ArrayList<>();
			for (BPVStatus status : values()) {
				if (status.isBronCommuniceerbaar()) {
					result.add(status);
				}
			}
			return result;
		}

		public static List<BPVStatus> getNietBronCommuniceerbareStatussen() {
			List<BPVStatus> result = new ArrayList<>();
			for (BPVStatus status : values()) {
				if (!status.isBronCommuniceerbaar()) {
					result.add(status);
				}
			}
			return result;
		}

		public boolean isActief() {
			return this != Afgemeld && this != Afgewezen;
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "verbintenis")
	private Verbintenis verbintenis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvBedrijf", nullable = false)
	private ExterneOrganisatie bpvBedrijf;

	/**
	 * Deze moet gekoppeld zijn aan de externe organisatie bpvBedrijf
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contactPersoonBPVBedrijf", nullable = true)
	private ExterneOrganisatieContactPersoon contactPersoonBPVBedrijf;

	/**
	 * Dit is de praktijkbegeleider van de instelling, verplicht bij status
	 * volledig.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "praktijkbegeleider", nullable = true)
	private Medewerker praktijkbegeleider;

	/**
	 * De datum waarop de praktijkovereenkomst is opgesteld, zoals vastgelegd in de
	 * praktijkovereenkomst. Dit is niet per s&eacute; de datum waarop alle
	 * benodigde handtekeningen op de praktijkovereenkomst hoeven te staan.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Bron(verplicht = true)
	private Date afsluitdatum = new Date();

	@Column(nullable = false)
	@Bron(verplicht = true)
	private int volgnummer;

	/**
	 * Een gegenereerd overeenkomstnummer, vergelijkbaar met het deelnemernummer.
	 */
	@Column(nullable = false)
	private long overeenkomstnummer;

	/**
	 * De totale omvang van de BPV in klokuren, verplicht bij status volledig.
	 */
	@Bron
	@Column(nullable = true, length = 4)
	@Comment("40/52 van het aantal uren per week over de periode tussen begin- en verwachte einddatum, met een maximum van 5120")
	private Integer totaleOmvang;

	@Column(nullable = true, length = 4)
	private Integer gerealiseerdeOmvang;

	/**
	 * Het aantal klokuren per week, verplicht bij status volledig.
	 */
	@Column(nullable = true, scale = 2, precision = 12)
	private BigDecimal urenPerWeek;

	/**
	 * Het aantal dagen per weerk, verplicht bij status volledig.
	 */
	@Column(nullable = true, length = 4)
	private Integer dagenPerWeek;

	/**
	 * De werkdagen waarop de deelnemer op BPV is.
	 */
	@Column(nullable = true, length = 30)
	private String werkdagen;

	/**
	 * De plek waar de POK zich fysiek bevindt (bijvoorbeeld bij deelnemer, in
	 * archief etc).
	 */
	@Column(nullable = true, length = 30)
	private String locatiePOK;

	/**
	 * Het BPVBedrijfsgegeven legt het BPV-bedrijf, het kenniscentrum en de code
	 * leerbedrijf vast. Verplicht bij status volledig.
	 */
	@Bron
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bedrijfsgegeven", nullable = true)
	private BPVBedrijfsgegeven bedrijfsgegeven = null;

	/**
	 * De contractpartner, in gevallen waarbij de BPV-overeenkomst wordt gesloten
	 * met een geaccrediteerd uitzendbureau/detacheringsorganisatie, maar de
	 * deelnemer werkzaamheden uitvoert bij een ander bedrijf.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contractpartner", nullable = true)
	@Comment("De contractpartner, in gevallen waarbij bij de BPV-overeenkomst niet alleen het geaccrediteerde BPV-bedrijf betrokken is, maar ook een contractpartner die optreedt als werkgever, holding of bijv. uitzendbureau.")
	private ExterneOrganisatie contractpartner;

	/**
	 * Deze moet gekoppeld zijn aan de externe organisatie contractpartner
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contactPersoonContractpartner", nullable = true)
	private ExterneOrganisatieContactPersoon contactPersoonContractpartner;

	/**
	 * Deze moet gekoppeld zijn aan de externe organisatie bpvBedrijf
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "praktijkopleiderBPVBedrijf", nullable = true)
	private ExterneOrganisatieContactPersoon praktijkopleiderBPVBedrijf;

	@Column(nullable = true, length = 100)
	private String naamPraktijkopleiderBPVBedrijf;

	/**
	 * De reden van beinding van de bpv, als de verbintenis beeindigd wordt, wordt
	 * deze ook gevuld met dezelfde reden als bij de verbintenis
	 */
	@Bron
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "redenUitschrijving", nullable = true)
	private RedenUitschrijving redenUitschrijving;

	@Lob
	@Column(nullable = true)
	private String toelichtingBeeindiging;

	/**
	 * De status van de BPV, hierboven staan de verschillende statussen beschreven
	 */
	@Bron
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private BPVStatus status;

	@Column(nullable = false)
	@Bron
	private boolean opnemenInBron = true;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvInschrijving")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<BPVInschrijvingVrijVeld> vrijVelden;

	/**
	 * De bijlages van deze inschrijving
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvInschrijving")
	private List<BPVInschrijvingBijlage> bijlagen;

	public enum PraktijkbiedendeOrganisatie {
		BPVBEDRIJF {
			@Override
			public String toString() {
				return "BPV-bedrijf";
			}
		},

		CONTRACTPARTNER {
			@Override
			public String toString() {
				return "Contractpartner";
			}
		};
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private PraktijkbiedendeOrganisatie praktijkbiedendeOrganisatie;

	/**
	 * De verwachte einddatum van de BPV, verplicht bij status volledig.
	 */
	@Bron
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date verwachteEinddatum;

	@Lob
	@Column(nullable = true)
	private String opmerkingen;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BronEntiteitStatus bronStatus = BronEntiteitStatus.Geen;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date bronDatum;

	@Column(nullable = true)
	@Comment("Geeft aan dat het BPV-bedrijf de betalingsplicht van alle kosten overneemt.")
	private Boolean neemtBetalingsplichtOver = Boolean.FALSE;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvPlaats", nullable = true)
	private BPVPlaats bpvPlaats;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvInschrijving")
	private List<OnderwijsproductAfname> onderwijsproductAfnames = new ArrayList<>();

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public ExterneOrganisatie getBpvBedrijf() {
		return bpvBedrijf;
	}

	public void setBpvBedrijf(ExterneOrganisatie bpvBedrijf) {
		this.bpvBedrijf = bpvBedrijf;
	}

	public ExterneOrganisatieContactPersoon getContactPersoonBPVBedrijf() {
		return contactPersoonBPVBedrijf;
	}

	public void setContactPersoonBPVBedrijf(ExterneOrganisatieContactPersoon contactPersoonBPVBedrijf) {
		this.contactPersoonBPVBedrijf = contactPersoonBPVBedrijf;
	}

	public Medewerker getPraktijkbegeleider() {
		return praktijkbegeleider;
	}

	public void setPraktijkbegeleider(Medewerker praktijkbegeleider) {
		this.praktijkbegeleider = praktijkbegeleider;
	}

	public Date getAfsluitdatum() {
		return afsluitdatum;
	}

	public void setAfsluitdatum(Date afsluitdatum) {
		this.afsluitdatum = afsluitdatum;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public long getOvereenkomstnummer() {
		return overeenkomstnummer;
	}

	public void setOvereenkomstnummer(long overeenkomstnummer) {
		this.overeenkomstnummer = overeenkomstnummer;
	}

	public Integer getTotaleOmvang() {
		return totaleOmvang;
	}

	public void setTotaleOmvang(Integer totaleOmvang) {
		this.totaleOmvang = totaleOmvang;
	}

	public Integer getGerealiseerdeOmvang() {
		return gerealiseerdeOmvang;
	}

	public void setGerealiseerdeOmvang(Integer gerealiseerdeOmvang) {
		this.gerealiseerdeOmvang = gerealiseerdeOmvang;
	}

	public BigDecimal getUrenPerWeek() {
		return urenPerWeek;
	}

	public void setUrenPerWeek(BigDecimal urenPerWeek) {
		this.urenPerWeek = urenPerWeek;
	}

	public Integer getDagenPerWeek() {
		return dagenPerWeek;
	}

	public void setDagenPerWeek(Integer dagenPerWeek) {
		this.dagenPerWeek = dagenPerWeek;
	}

	public String getWerkdagen() {
		return werkdagen;
	}

	public void setWerkdagen(String werkdagen) {
		this.werkdagen = werkdagen;
	}

	public String getLocatiePOK() {
		return locatiePOK;
	}

	public void setLocatiePOK(String locatiePOK) {
		this.locatiePOK = locatiePOK;
	}

	public BPVBedrijfsgegeven getBedrijfsgegeven() {
		return bedrijfsgegeven;
	}

	public void setBedrijfsgegeven(BPVBedrijfsgegeven bedrijfsgegeven) {
		this.bedrijfsgegeven = bedrijfsgegeven;
	}

	public ExterneOrganisatie getContractpartner() {
		return contractpartner;
	}

	public void setContractpartner(ExterneOrganisatie contractpartner) {
		this.contractpartner = contractpartner;
	}

	public ExterneOrganisatieContactPersoon getContactPersoonContractpartner() {
		return contactPersoonContractpartner;
	}

	public void setContactPersoonContractpartner(ExterneOrganisatieContactPersoon contactPersoonContractpartner) {
		this.contactPersoonContractpartner = contactPersoonContractpartner;
	}

	public ExterneOrganisatieContactPersoon getPraktijkopleiderBPVBedrijf() {
		return praktijkopleiderBPVBedrijf;
	}

	public void setPraktijkopleiderBPVBedrijf(ExterneOrganisatieContactPersoon praktijkopleiderBPVBedrijf) {
		this.praktijkopleiderBPVBedrijf = praktijkopleiderBPVBedrijf;
	}

	public String getNaamPraktijkopleiderBPVBedrijf() {
		return naamPraktijkopleiderBPVBedrijf;
	}

	public void setNaamPraktijkopleiderBPVBedrijf(String naamPraktijkopleiderBPVBedrijf) {
		this.naamPraktijkopleiderBPVBedrijf = naamPraktijkopleiderBPVBedrijf;
	}

	public RedenUitschrijving getRedenUitschrijving() {
		return redenUitschrijving;
	}

	public void setRedenUitschrijving(RedenUitschrijving redenUitschrijving) {
		this.redenUitschrijving = redenUitschrijving;
	}

	public String getToelichtingBeeindiging() {
		return toelichtingBeeindiging;
	}

	public void setToelichtingBeeindiging(String toelichtingBeeindiging) {
		this.toelichtingBeeindiging = toelichtingBeeindiging;
	}

	public BPVStatus getStatus() {
		return status;
	}

	public void setStatus(BPVStatus status) {
		this.status = status;
	}

	public boolean isOpnemenInBron() {
		return opnemenInBron;
	}

	public void setOpnemenInBron(boolean opnemenInBron) {
		this.opnemenInBron = opnemenInBron;
	}

	@Override
	public List<BPVInschrijvingVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<BPVInschrijvingVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	@Override
	public List<BPVInschrijvingBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<BPVInschrijvingBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public PraktijkbiedendeOrganisatie getPraktijkbiedendeOrganisatie() {
		return praktijkbiedendeOrganisatie;
	}

	public void setPraktijkbiedendeOrganisatie(PraktijkbiedendeOrganisatie praktijkbiedendeOrganisatie) {
		this.praktijkbiedendeOrganisatie = praktijkbiedendeOrganisatie;
	}

	public Date getVerwachteEinddatum() {
		return verwachteEinddatum;
	}

	public void setVerwachteEinddatum(Date verwachteEinddatum) {
		this.verwachteEinddatum = verwachteEinddatum;
	}

	public String getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}

	@Override
	public BronEntiteitStatus getBronStatus() {
		return bronStatus;
	}

	@Override
	public void setBronStatus(BronEntiteitStatus bronStatus) {
		this.bronStatus = bronStatus;
	}

	@Override
	public Date getBronDatum() {
		return bronDatum;
	}

	@Override
	public void setBronDatum(Date bronDatum) {
		this.bronDatum = bronDatum;
	}

	public Boolean getNeemtBetalingsplichtOver() {
		return neemtBetalingsplichtOver;
	}

	public void setNeemtBetalingsplichtOver(Boolean neemtBetalingsplichtOver) {
		this.neemtBetalingsplichtOver = neemtBetalingsplichtOver;
	}

	public BPVPlaats getBpvPlaats() {
		return bpvPlaats;
	}

	public void setBpvPlaats(BPVPlaats bpvPlaats) {
		this.bpvPlaats = bpvPlaats;
	}

	public List<OnderwijsproductAfname> getOnderwijsproductAfnames() {
		return onderwijsproductAfnames;
	}

	public void setOnderwijsproductAfnames(List<OnderwijsproductAfname> onderwijsproductAfnames) {
		this.onderwijsproductAfnames = onderwijsproductAfnames;
	}

	@Override
	public boolean isActief(Date peildatum) {
		return false;
	}

	@Override
	public BPVInschrijvingVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<BPVInschrijvingVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
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
	public BPVInschrijvingBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}