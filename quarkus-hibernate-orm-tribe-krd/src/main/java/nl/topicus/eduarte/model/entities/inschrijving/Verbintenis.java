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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;
import org.hibernate.annotations.Formula;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.duo.bron.bve.waardelijsten.Intensiteit;
import nl.topicus.eduarte.model.duo.criho.annot.Criho;
import nl.topicus.eduarte.model.entities.BronEntiteitStatus;
import nl.topicus.eduarte.model.entities.IBronStatusEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.bpv.BPVInschrijving;
import nl.topicus.eduarte.model.entities.examen.Examendeelname;
import nl.topicus.eduarte.model.entities.hogeronderwijs.Inschrijvingsverzoek;
import nl.topicus.eduarte.model.entities.ibgverzuimloket.IbgVerzuimmelding;
import nl.topicus.eduarte.model.entities.inschrijving.SoortVooropleiding.SoortOnderwijs;
import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.onderwijsproduct.OnderwijsproductAfnameContext;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.Brin;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.VerbintenisBijlage;
import nl.topicus.eduarte.model.entities.vrijevelden.VerbintenisVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Een inschrijving voor een opleiding.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@BatchSize(size = 20)
@IsViewWhenOnNoise
public class Verbintenis extends BeginEinddatumInstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelEntiteit<Verbintenis>, VrijVeldable<VerbintenisVrijVeld>,
IBijlageKoppelEntiteit<VerbintenisBijlage>, IVooropleiding, IBronStatusEntiteit {

	public static final String TABEL = "VERBINTENIS";

	/**
	 * De status van een inschrijving.
	 *
	 * Direct wanneer de deelnemer een intakeprocedure start, wordt een verbintenis
	 * aangemaakt. Deze verbintenis aangemaakt, ook al is er nog geen positieve
	 * uitkomst van een intakegesprek. Deze "zeer voorlopige" verbintenis heeft de
	 * status "intake", hetgeen betekent dat deze nog niet wordt getoond in het
	 * tabblad Verbintenis van een deelnemer. Pas bij een positieve uitkomst van een
	 * intakegesprek, wanneer de administratief medewerker een (voorlopige)
	 * verbintenis "aanmaakt", verschijnt de verbintenis op het tabblad Verbintenis.
	 * Het bestaan van een verbintenis met status "intake" waarborgt echter dat de
	 * deelnemer in het scherm "Deelnemer zoeken" en "Uitgebreid zoeken" kan worden
	 * gevonden en zorgt ervoor dat de autorisatie goed werkt.
	 *
	 * Zolang een verbintenis voorlopig is, kent zij geen verplichte velden en wordt
	 * de keuze voor een opleiding/organisatie-eenheid/locatie als voorlopig
	 * beschouwd. Er gaat pas een melding naar BRON wanneer de verbintenis volledig
	 * is.
	 *
	 */
	public enum VerbintenisStatus implements BronCommuniceerbaar {
		/**
		 * De deelnemer heeft zichzelf aangemeld maar de aanmelding is nog niet helemaal
		 * verwerkt. De status van de verwerking is te zien in de aanmelding De
		 * verbintenis is nog niet te vinden op het deelnemer zoeken scherm
		 */
		Aangemeld,
		/**
		 * De deelnemer bevindt zich nog in het intakeproces waar vanuit nog geen
		 * (voorlopige) verbintenis is gerealiseerd. In het tabblad Verbintenis is deze
		 * verbintenis nog niet zichtbaar.
		 */
		Intake,

		/**
		 * De verbintenis is nog niet officieel. Alle gegevens kunnen nog wijzigen. De
		 * deelnemer is nog niet aan BRON gemeld. De deelnemer is nog niet opgenomen in
		 * het onderwijslogistieke proces.
		 */
		Voorlopig,

		/**
		 * De verbintenis is nog niet officieel (niet ondertekend), maar alle gegevens
		 * liggen in principe vast. De deelnemer wordt al wel opgenomen in het
		 * onderwijslogistieke proces. De deelnemer is aan BRON gemeld (of de melding
		 * staat in de wachtrij). Er kan een overeenkomst worden afgedrukt. Bij het op
		 * volledig zetten wordt gecontroleerd of alle gegevens voor BRON aanwezig zijn,
		 * als dit niet het geval is, wordt dit via een melding weergegeven. De status
		 * wordt terug gezet of blijft op voorlopig staan.
		 */
		Volledig,

		/**
		 * De onderwijsovereenkomst is wel afgedrukt, maar nog niet ondertekend. De
		 * deelnemer is aan BRON gemeld (of de melding staat in de wachtrij). Gedurende
		 * deze status wordt gewacht op de retourontvangst van een ondertekende
		 * onderwijsovereenkomst.
		 */
		Afgedrukt,

		/**
		 * De verbintenis is officieel en getekend. Alle gegevens liggen vast. De
		 * deelnemer is aan BRON gemeld (of melding staat in de wachtrij). De deelnemer
		 * neemt deel aan het onderwijs.
		 */
		Definitief,

		/**
		 * De (werkelijke) einddatum van de verbintenis is verstreken. Deze status is in
		 * feite impliciet, want deze status wordt automatisch bereikt door het
		 * verstrijken van de einddatum, behalve wanneer de verbintenis afgemeld of
		 * afgewezen is.
		 */
		Beeindigd,

		/**
		 * De deelnemer heeft zich afgemeld. De verbintenis zal nooit worden
		 * geëffectueerd en de deelnemer neemt geen deel aan het onderwijslogistieke
		 * proces. Er is geen melding naar BRON geweest, of, wanneer deze status via
		 * Definitief was bereikt, de inschrijving is uit BRON verwijderd. De
		 * verbintenis mag niet meer gewijzigd worden zodra deze status bereikt wordt.
		 */
		Afgemeld,

		/**
		 * De instelling heeft de deelnemer afgewezen. De verbintenis zal nooit worden
		 * geëffectueerd en de deelnemer neemt geen deel aan het onderwijslogistieke
		 * proces. Er is geen melding naar BRON geweest, of, wanneer deze status via
		 * "definitief" was bereikt, de inschrijving is uit BRON verwijderd. De
		 * verbintenis mag niet meer gewijzigd worden zodra deze status bereikt wordt.
		 */
		Afgewezen;

		/**
		 * @see nl.topicus.eduarte.model.entities.inschrijving.BronCommuniceerbaar#isBronCommuniceerbaar()
		 */
		@Override
		public boolean isBronCommuniceerbaar() {
			return tussen(VerbintenisStatus.Volledig, VerbintenisStatus.Beeindigd);
		}

		/**
		 * @return <code>true</code> als <tt>status1 &lt;= this &lt;= status2</tt>
		 */
		public boolean tussen(VerbintenisStatus status1, VerbintenisStatus status2) {
			return (status1.ordinal() <= this.ordinal()) && this.ordinal() <= status2.ordinal();
		}

		/**
		 * @return De toegestane vervolgstatussen
		 */
		public VerbintenisStatus[] getVervolgEnHuidige(boolean authorized, boolean isVO) {
			var overgangen = getVervolg(authorized, isVO);
			var ret = new VerbintenisStatus[1 + overgangen.length];

			System.arraycopy(new VerbintenisStatus[] { this }, 0, ret, 0, 1);
			System.arraycopy(overgangen, 0, ret, 1, overgangen.length);

			return ret;
		}

		public VerbintenisStatus[] getVervolg(boolean authorized) {
			return getVervolg(authorized, false);
		}

		/**
		 * @return De toegestane vervolgstatussen
		 */
		public VerbintenisStatus[] getVervolg(boolean authorized, boolean isVO) {
			switch (this) {
			case Aangemeld:
				return new VerbintenisStatus[] { Intake };
			case Intake:
				return new VerbintenisStatus[] { Voorlopig };
			case Voorlopig:
				return new VerbintenisStatus[] { Volledig, Afgewezen, Afgemeld };
			case Volledig:
				// KOL 20091110: Afgedrukt weggehaald als vervolgstatus omdat dit
				// alleen mag met de knop 'Afdrukken'
				if (authorized && isVO)
					return new VerbintenisStatus[] { Definitief, Afgewezen, Afgemeld };
				else if (authorized)
					return new VerbintenisStatus[] { Afgewezen, Afgemeld };
				else if (isVO)
					return new VerbintenisStatus[] { Definitief };
				else
					return new VerbintenisStatus[] {};
			case Afgedrukt:
				if (authorized)
					return new VerbintenisStatus[] { Definitief, Afgewezen, Afgemeld };
				else
					return new VerbintenisStatus[] { Definitief };
			case Definitief:
				return new VerbintenisStatus[] {}; // Beeindigd moet je bereiken
				// via Verbintenis beeindigen
			case Beeindigd:
				return new VerbintenisStatus[] {};
			case Afgemeld:
				return new VerbintenisStatus[] { Voorlopig };
			case Afgewezen:
				return new VerbintenisStatus[] { Voorlopig };
			default:
			}
			return new VerbintenisStatus[] {};
		}

		/**
		 * @return true indien deze verbintenis door iedereen gemuteerd kan worden (voor
		 *         wat betreft de velden die in de onderwijsovereenkomst en BRON
		 *         vastliggen)
		 */
		public boolean isMuteerbaar() {
			return equals(Aangemeld) || equals(Intake) || equals(Voorlopig);
		}

		public boolean isAfgesloten() {
			return equals(Afgemeld) || equals(Afgewezen) || equals(Beeindigd);
		}

		public boolean isVerwijderd() {
			return equals(Afgemeld) || equals(Afgewezen);
		}

		/**
		 * @return true indien de deelnemer, gezien zijn status, actief is (afgezien van
		 *         begin- en einddatum). Dit zijn de statussen voorlopig t/m definitief.
		 */
		public boolean isActief() {
			return equals(Voorlopig) || equals(Volledig) || equals(Afgedrukt) || equals(Definitief);
		}

		public static List<VerbintenisStatus> getBronCommuniceerbareStatussen() {
			List<VerbintenisStatus> result = new ArrayList<>();
			for (VerbintenisStatus status : values()) {
				if (status.isBronCommuniceerbaar()) {
					result.add(status);
				}
			}
			return result;
		}

		public static List<VerbintenisStatus> getNietBronCommuniceerbareStatussen() {
			List<VerbintenisStatus> result = new ArrayList<>();
			for (VerbintenisStatus status : values()) {
				if (!status.isBronCommuniceerbaar()) {
					result.add(status);
				}
			}
			return result;
		}
	}

	public enum Vertrekstatus {
		Vertrokken, BevorderdVMBOBL("Bevorderd naar VMBO BL"), BevorderdVMBOKL("Bevorderd naar VMBO KL"),
		BevorderdVMBOGL("Bevorderd naar VMBO GL"), BevorderdVMBOTL("Bevorderd naar VMBO TL"),
		BevorderdHAVO("Bevorderd naar HAVO"), BevorderdVWO("Bevorderd naar VWO"), NietBevorderd, AndereOpleiding,
		Geslaagd, Afgewezen;

		private String omschrijving;

		Vertrekstatus() {
			this(null);
		}

		Vertrekstatus(String omschrijving) {
			this.omschrijving = omschrijving;
		}

		@Override
		public String toString() {
			return omschrijving;
		}
	}

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Bron(verplicht = true)
	private Date geplandeEinddatum;

	@Bron
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "redenUitschrijving", nullable = true)
	private RedenUitschrijving redenUitschrijving;

	@Formula(value = "case when einddatum is null then 0 else 1 end")
	private boolean beeindigd;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@Bron
	@Criho
	private VerbintenisStatus status;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumDefinitief;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumGeplaatst;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumVoorlopig;

	@Column(nullable = false)
	@Bron(verplicht = true)
	private int volgnummer;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumOvereenkomstOndertekend;

	/**
	 * Een gegenereerd overeenkomstnummer, vergelijkbaar met het deelnemernummer.
	 */
	@Column(nullable = false)
	private long overeenkomstnummer;

	/**
	 * Het volgnummer van deze entiteit in het oude pakket (bijvoorbeeld nOISe).
	 * Indien gevuld wordt dit volgnummer gebruikt in communicatie met BRON.
	 */
	@Column(nullable = true)
	private String volgnummerInOudPakket;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@Bron(verplicht = true)
	@Criho
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "opleiding", nullable = true)
	private Opleiding opleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brin", nullable = true)
	private Brin brin;

	/**
	 * De hoofdlocatie van de inschrijving
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	@Bron
	private Locatie locatie;

	@Bron
	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<OnderwijsproductAfnameContext> afnameContexten = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cohort", nullable = true)
	private Cohort cohort;

	@Bron
	@Criho
	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, einddatum DESC")
	private List<Plaatsing> plaatsingen = new ArrayList<>();

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, einddatum DESC")
	private List<BPVInschrijving> bpvInschrijvingen = new ArrayList<>();

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("datumTijd DESC")
	private List<Intakegesprek> intakegesprekken = new ArrayList<>();

	public enum Bekostigd {
		/**
		 * Ja
		 */
		Ja,
		/**
		 * Nee
		 */
		Nee,
		/**
		 * Gedeeltelijk. In 'bekostigingsperiodes' wordt de periode waarin de
		 * verbintenis wel/niet bekostigd is opgeslagen.
		 */
		Gedeeltelijk;
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	@Bron
	private Bekostigd bekostigd = Bekostigd.Nee;

	@Column(nullable = true)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum ASC")
	@Bron
	private List<Bekostigingsperiode> bekostigingsperiodes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<VerbintenisVrijVeld> vrijVelden;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<VerbintenisContract> contracten;

	@Lob
	@Column(nullable = true)
	private String toelichting;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	@Bron(verplicht = true)
	private Intensiteit intensiteit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relevanteVooropleiding", nullable = true)
	@Bron(verplicht = true)
	private Vooropleiding relevanteVooropleidingVooropleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relevanteVerbintenis", nullable = true)
	@Bron(verplicht = true)
	private Verbintenis relevanteVerbintenis;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Vertrekstatus vertrekstatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vervolgonderwijs", nullable = true)
	private Vervolgonderwijs vervolgonderwijs;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<Examendeelname> examendeelnames = new ArrayList<>();

	@Bron
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal contacturenPerWeek;

	/**
	 * De bijlages van deze verbintenis
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	private List<VerbintenisBijlage> bijlagen;

	/**
	 * Bij inburgeraars moet voor rapportage aan opdrachtgevers worden aangegeven of
	 * de deelnemers al of niet verplicht moeten inburgeren. Veld is niet meer nodig
	 * voor het keurmerk inburgering, maar opdrachtgevers willen het wel weten.
	 * Verplicht veld voor inburgeringsverbintenissen.
	 */
	public enum RedenInburgering {
		Inburgeringsplichtig, Inburgeringsbehoeftig;
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private RedenInburgering redenInburgering;

	/**
	 * Bij inburgering en staatsexamen dient een examendatum aangegeven te worden
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date examenDatum;

	/**
	 * Soort staatsexamen dat een deelnemer doet
	 */
	public enum StaatsExamenType {
		StaatsExamen1, StaatsExamen2;
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private StaatsExamenType staatsExamenType;

	/**
	 * Soort inburgering die de inburgeraar volgt. Afhankelijk van het profiel zal
	 * men bepaalde onderwijsproducten willen aanbieden.
	 */
	public enum ProfielInburgering {
		/**
		 * Opvoeding, Gezondheidszorg en Onderwijs
		 */
		OGO, Werk, Ondernemerschap, MaatschappelijkeParticipatie;
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private ProfielInburgering profielInburgering;

	/**
	 * Voor inburgering. Geeft min of meer het niveau van de inburgeraar aan. Nodig
	 * voor rapportage aan het keurmerk inburgering en waarschijnlijk nuttig om
	 * mensen van hetzelfde niveau bij elkaar in de klas te kunnen zetten.
	 */
	public enum Leerprofiel {
		P1a, P1b, P1c, P2, P3, P4;

		@Override
		public String toString() {
			return name().substring(1);
		}
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Leerprofiel leerprofiel;

	/**
	 * Voor inburgering. Wordt gebruikt voor rapportage aan het keurmerk
	 * inburgering.
	 */
	@Column(nullable = true)
	private Boolean deelcursus;

	/**
	 * Voor inburgering. De wijze waarop het praktijkexamen zal worden afgenomen.
	 * Dient te worden opgenomen in de onderwijsovereenkomst.
	 */
	public enum SoortPraktijkexamen {
		Portfolio, Assessment, Combinatie,
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private SoortPraktijkexamen soortPraktijkexamen;

	/**
	 * Voor inburgering. Als verbintenis onder een inburgeringscontract valt, is dit
	 * de datum waarop de opdrachtgever de cursist heeft aangemeld. Nodig voor
	 * rapportage aan het keurmerk inburgering.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Comment("Als verbintenis onder een inburgeringscontract valt, is dit de datum waarop de opdrachtgever de cursist heeft aangemeld. Nodig voor rapportage aan het keurmerk inburgering.")
	private Date datumAanmelden;

	/**
	 * Voor inburgering. Als verbintenis NIET onder een inburgeringscontract valt,
	 * is dit de datum waarop de cursist de onderwijsovereenkomst heeft ondertekend.
	 * Nodig voor rapportage aan het keurmerk inburgering.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Comment("Als verbintenis NIET onder een inburgeringscontract valt, is dit de datum waarop de cursist de onderwijsovereenkomst heeft getekend. Nodig voor rapportage aan het keurmerk inburgering.")
	private Date datumAkkoord;

	/**
	 * Voor inburgering. Wordt gebruikt voor berekening doorlooptijd voor start van
	 * de cursus (prestatie-indicator 1 van het keurmerk). De verwachte startdatum
	 * die in deze indicator wordt gevraagd, is de begindatum van de verbintenis.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumEersteActiviteit;

	@Column(nullable = true, name = "beginNivSchrVaardigheden")
	@Enumerated(EnumType.STRING)
	private NT2Niveau beginNiveauSchriftelijkeVaardigheden;

	@Column(nullable = true, name = "eindNivSchrVaardigheden")
	@Enumerated(EnumType.STRING)
	private NT2Niveau eindNiveauSchriftelijkeVaardigheden;

	/**
	 * Geeft aan of de deelnemer extra financiering met zich meebrengt als gevolg
	 * van een handicap indicatie.
	 */
	@Column(nullable = false)
	@Bron
	private boolean indicatieGehandicapt;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BronEntiteitStatus bronStatus = BronEntiteitStatus.Geen;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date bronDatum;

	/**
	 * Sommige bronsystemen ondersteunen een afwijkende externe code voor een
	 * verbintenis. Dat wil zeggen dat de deelnemer ingeschreven is op een opleiding
	 * met externe code X, maar voor deze deelnemer geldt alsnog externe code Y. Dit
	 * veld wordt gebruikt om deze gegevens mee te kunnen krijgen vanuit deze
	 * bronsystemen, maar is niet in te vullen in de applicatie. De methode
	 * 'getExterneCode' houdt rekening met dit property.
	 */
	@Column(nullable = true, length = 20)
	private String afwijkendeExterneCode;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<IbgVerzuimmelding> verzuimmeldingen;

	@Comment("Zorgt dat de deelnemer op basis van deze verbintenis geen facturen meer krijgt, totdat dit veld is uitgeschakeld.")
	private boolean uitsluitenVanFacturatie = false;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<Inschrijvingsverzoek> inschrijvingsverzoeken = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenis")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
	private List<VerbintenisFaseCredits> creditsPerFase = new ArrayList<>();

	@Comment("Breng voor deze verbintenis alleen wettelijk collegegeld in rekening, ook als de student niet aan de voorwaarden m.b.t. nationaliteit, woonadres of behaalde graad voldoet.")
	@Column(name = "negeerWettCollGeldVoorwaarden")
	private Boolean negeerWettelijkCollegegeldVoorwaarden = false;

	public Date getGeplandeEinddatum() {
		return geplandeEinddatum;
	}

	public void setGeplandeEinddatum(Date geplandeEinddatum) {
		this.geplandeEinddatum = geplandeEinddatum;
	}

	public RedenUitschrijving getRedenUitschrijving() {
		return redenUitschrijving;
	}

	public void setRedenUitschrijving(RedenUitschrijving redenUitschrijving) {
		this.redenUitschrijving = redenUitschrijving;
	}

	public boolean isBeeindigd() {
		return beeindigd;
	}

	public void setBeeindigd(boolean beeindigd) {
		this.beeindigd = beeindigd;
	}

	public VerbintenisStatus getStatus() {
		return status;
	}

	public void setStatus(VerbintenisStatus status) {
		this.status = status;
	}

	public Date getDatumDefinitief() {
		return datumDefinitief;
	}

	public void setDatumDefinitief(Date datumDefinitief) {
		this.datumDefinitief = datumDefinitief;
	}

	public Date getDatumGeplaatst() {
		return datumGeplaatst;
	}

	public void setDatumGeplaatst(Date datumGeplaatst) {
		this.datumGeplaatst = datumGeplaatst;
	}

	public Date getDatumVoorlopig() {
		return datumVoorlopig;
	}

	public void setDatumVoorlopig(Date datumVoorlopig) {
		this.datumVoorlopig = datumVoorlopig;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public Date getDatumOvereenkomstOndertekend() {
		return datumOvereenkomstOndertekend;
	}

	public void setDatumOvereenkomstOndertekend(Date datumOvereenkomstOndertekend) {
		this.datumOvereenkomstOndertekend = datumOvereenkomstOndertekend;
	}

	public long getOvereenkomstnummer() {
		return overeenkomstnummer;
	}

	public void setOvereenkomstnummer(long overeenkomstnummer) {
		this.overeenkomstnummer = overeenkomstnummer;
	}

	public String getVolgnummerInOudPakket() {
		return volgnummerInOudPakket;
	}

	public void setVolgnummerInOudPakket(String volgnummerInOudPakket) {
		this.volgnummerInOudPakket = volgnummerInOudPakket;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	@Override
	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	@Override
	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(Opleiding opleiding) {
		this.opleiding = opleiding;
	}

	public Brin getBrin() {
		return brin;
	}

	public void setBrin(Brin brin) {
		this.brin = brin;
	}

	@Override
	public Locatie getLocatie() {
		return locatie;
	}

	@Override
	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public List<OnderwijsproductAfnameContext> getAfnameContexten() {
		return afnameContexten;
	}

	public void setAfnameContexten(List<OnderwijsproductAfnameContext> afnameContexten) {
		this.afnameContexten = afnameContexten;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public List<Plaatsing> getPlaatsingen() {
		return plaatsingen;
	}

	public void setPlaatsingen(List<Plaatsing> plaatsingen) {
		this.plaatsingen = plaatsingen;
	}

	public List<BPVInschrijving> getBpvInschrijvingen() {
		return bpvInschrijvingen;
	}

	public void setBpvInschrijvingen(List<BPVInschrijving> bpvInschrijvingen) {
		this.bpvInschrijvingen = bpvInschrijvingen;
	}

	public List<Intakegesprek> getIntakegesprekken() {
		return intakegesprekken;
	}

	public void setIntakegesprekken(List<Intakegesprek> intakegesprekken) {
		this.intakegesprekken = intakegesprekken;
	}

	public Bekostigd getBekostigd() {
		return bekostigd;
	}

	public void setBekostigd(Bekostigd bekostigd) {
		this.bekostigd = bekostigd;
	}

	public List<Bekostigingsperiode> getBekostigingsperiodes() {
		return bekostigingsperiodes;
	}

	public void setBekostigingsperiodes(List<Bekostigingsperiode> bekostigingsperiodes) {
		this.bekostigingsperiodes = bekostigingsperiodes;
	}

	@Override
	public List<VerbintenisVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<VerbintenisVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public List<VerbintenisContract> getContracten() {
		return contracten;
	}

	public void setContracten(List<VerbintenisContract> contracten) {
		this.contracten = contracten;
	}

	public String getToelichting() {
		return toelichting;
	}

	public void setToelichting(String toelichting) {
		this.toelichting = toelichting;
	}

	public Intensiteit getIntensiteit() {
		return intensiteit;
	}

	public void setIntensiteit(Intensiteit intensiteit) {
		this.intensiteit = intensiteit;
	}

	public Vooropleiding getRelevanteVooropleidingVooropleiding() {
		return relevanteVooropleidingVooropleiding;
	}

	public void setRelevanteVooropleidingVooropleiding(Vooropleiding relevanteVooropleidingVooropleiding) {
		this.relevanteVooropleidingVooropleiding = relevanteVooropleidingVooropleiding;
	}

	public Verbintenis getRelevanteVerbintenis() {
		return relevanteVerbintenis;
	}

	public void setRelevanteVerbintenis(Verbintenis relevanteVerbintenis) {
		this.relevanteVerbintenis = relevanteVerbintenis;
	}

	public Vertrekstatus getVertrekstatus() {
		return vertrekstatus;
	}

	public void setVertrekstatus(Vertrekstatus vertrekstatus) {
		this.vertrekstatus = vertrekstatus;
	}

	public Vervolgonderwijs getVervolgonderwijs() {
		return vervolgonderwijs;
	}

	public void setVervolgonderwijs(Vervolgonderwijs vervolgonderwijs) {
		this.vervolgonderwijs = vervolgonderwijs;
	}

	public List<Examendeelname> getExamendeelnames() {
		return examendeelnames;
	}

	public void setExamendeelnames(List<Examendeelname> examendeelnames) {
		this.examendeelnames = examendeelnames;
	}

	public BigDecimal getContacturenPerWeek() {
		return contacturenPerWeek;
	}

	public void setContacturenPerWeek(BigDecimal contacturenPerWeek) {
		this.contacturenPerWeek = contacturenPerWeek;
	}

	@Override
	public List<VerbintenisBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<VerbintenisBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public RedenInburgering getRedenInburgering() {
		return redenInburgering;
	}

	public void setRedenInburgering(RedenInburgering redenInburgering) {
		this.redenInburgering = redenInburgering;
	}

	public Date getExamenDatum() {
		return examenDatum;
	}

	public void setExamenDatum(Date examenDatum) {
		this.examenDatum = examenDatum;
	}

	public StaatsExamenType getStaatsExamenType() {
		return staatsExamenType;
	}

	public void setStaatsExamenType(StaatsExamenType staatsExamenType) {
		this.staatsExamenType = staatsExamenType;
	}

	public ProfielInburgering getProfielInburgering() {
		return profielInburgering;
	}

	public void setProfielInburgering(ProfielInburgering profielInburgering) {
		this.profielInburgering = profielInburgering;
	}

	public Leerprofiel getLeerprofiel() {
		return leerprofiel;
	}

	public void setLeerprofiel(Leerprofiel leerprofiel) {
		this.leerprofiel = leerprofiel;
	}

	public Boolean getDeelcursus() {
		return deelcursus;
	}

	public void setDeelcursus(Boolean deelcursus) {
		this.deelcursus = deelcursus;
	}

	public SoortPraktijkexamen getSoortPraktijkexamen() {
		return soortPraktijkexamen;
	}

	public void setSoortPraktijkexamen(SoortPraktijkexamen soortPraktijkexamen) {
		this.soortPraktijkexamen = soortPraktijkexamen;
	}

	public Date getDatumAanmelden() {
		return datumAanmelden;
	}

	public void setDatumAanmelden(Date datumAanmelden) {
		this.datumAanmelden = datumAanmelden;
	}

	public Date getDatumAkkoord() {
		return datumAkkoord;
	}

	public void setDatumAkkoord(Date datumAkkoord) {
		this.datumAkkoord = datumAkkoord;
	}

	public Date getDatumEersteActiviteit() {
		return datumEersteActiviteit;
	}

	public void setDatumEersteActiviteit(Date datumEersteActiviteit) {
		this.datumEersteActiviteit = datumEersteActiviteit;
	}

	public NT2Niveau getBeginNiveauSchriftelijkeVaardigheden() {
		return beginNiveauSchriftelijkeVaardigheden;
	}

	public void setBeginNiveauSchriftelijkeVaardigheden(NT2Niveau beginNiveauSchriftelijkeVaardigheden) {
		this.beginNiveauSchriftelijkeVaardigheden = beginNiveauSchriftelijkeVaardigheden;
	}

	public NT2Niveau getEindNiveauSchriftelijkeVaardigheden() {
		return eindNiveauSchriftelijkeVaardigheden;
	}

	public void setEindNiveauSchriftelijkeVaardigheden(NT2Niveau eindNiveauSchriftelijkeVaardigheden) {
		this.eindNiveauSchriftelijkeVaardigheden = eindNiveauSchriftelijkeVaardigheden;
	}

	public boolean isIndicatieGehandicapt() {
		return indicatieGehandicapt;
	}

	public void setIndicatieGehandicapt(boolean indicatieGehandicapt) {
		this.indicatieGehandicapt = indicatieGehandicapt;
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

	public String getAfwijkendeExterneCode() {
		return afwijkendeExterneCode;
	}

	public void setAfwijkendeExterneCode(String afwijkendeExterneCode) {
		this.afwijkendeExterneCode = afwijkendeExterneCode;
	}

	public List<IbgVerzuimmelding> getVerzuimmeldingen() {
		return verzuimmeldingen;
	}

	public void setVerzuimmeldingen(List<IbgVerzuimmelding> verzuimmeldingen) {
		this.verzuimmeldingen = verzuimmeldingen;
	}

	public boolean isUitsluitenVanFacturatie() {
		return uitsluitenVanFacturatie;
	}

	public void setUitsluitenVanFacturatie(boolean uitsluitenVanFacturatie) {
		this.uitsluitenVanFacturatie = uitsluitenVanFacturatie;
	}

	public List<Inschrijvingsverzoek> getInschrijvingsverzoeken() {
		return inschrijvingsverzoeken;
	}

	public void setInschrijvingsverzoeken(List<Inschrijvingsverzoek> inschrijvingsverzoeken) {
		this.inschrijvingsverzoeken = inschrijvingsverzoeken;
	}

	// public Map<Hoofdfase, Integer> getCreditsPerFase() {
	// return creditsPerFase;
	// }
	//
	// public void setCreditsPerFase(Map<Hoofdfase, Integer> creditsPerFase) {
	// this.creditsPerFase = creditsPerFase;
	// }

	public Boolean getNegeerWettelijkCollegegeldVoorwaarden() {
		return negeerWettelijkCollegegeldVoorwaarden;
	}

	public void setNegeerWettelijkCollegegeldVoorwaarden(Boolean negeerWettelijkCollegegeldVoorwaarden) {
		this.negeerWettelijkCollegegeldVoorwaarden = negeerWettelijkCollegegeldVoorwaarden;
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
	public boolean isDiplomaBehaald() {
		return false;
	}

	@Override
	public Schooladvies getSchooladvies() {
		return null;
	}

	@Override
	public Integer getCitoscore() {
		return null;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public VerbintenisBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public VerbintenisVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<VerbintenisVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public IOrganisatieEenheidLocatieKoppelbaarEntiteit<Verbintenis> getEntiteit() {
		return null;
	}
}
