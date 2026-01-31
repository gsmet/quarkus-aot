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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een toets die onderdeel is van een resultaatstructuur.
 *
 */
// deze worden in CreateDatabaseSchemaImporter toevoegd, maar dan
// "initially deferred deferrable"
// @javax.persistence.Table(uniqueConstraints = {
// @UniqueConstraint(columnNames = {"code", "resultaatstructuur", "parent"}),
// @UniqueConstraint(columnNames = {"volgnummer", "resultaatstructuur", "parent"})})
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
public class Toets extends InstellingEntiteit {
	public static final int MAX_HERKANSINGEN = 10;

	public static class BerekendResultaat {
		private BigDecimal onafgerondCijfer;

		private Object resultaat;

		public BerekendResultaat(BigDecimal onafgerondCijfer, Object resultaat) {
			this.onafgerondCijfer = onafgerondCijfer;
			this.resultaat = resultaat;
		}

		public BigDecimal getOnafgerondCijfer() {
			return onafgerondCijfer;
		}

		public Object getResultaat() {
			return resultaat;
		}
	}

	/**
	 */
	public enum Scoreschaal {
		/**
		 * Geen scoreschaal
		 */
		Geen,
		/**
		 * Lineaire scoreschaal
		 */
		Lineair,
		/**
		 * Scoretabel
		 */
		Tabel;
	}

	public enum Herkansingsscore {
		Hoogste {
			@Override
			public boolean isGeldend(Resultaat oud, Resultaat nieuw) {
				return false;
				// return !nieuw.isNullResultaat() && nieuw.isHogerDan(oud);
			}
		},
		Laatste {
			@Override
			public boolean isGeldend(Resultaat oud, Resultaat nieuw) {
				return false;
				// return !nieuw.isNullResultaat() && nieuw.isLaterDan(oud);
			}
		};

		public abstract boolean isGeldend(Resultaat oud, Resultaat nieuw);
	}

	/**
	 * Sommige toetsen kunnen een speciale status hebben binnen een
	 * resultaatstructuur. Dat wordt hiermee aangegeven.
	 *
	 *
	 */
	public enum SoortToets {
		/**
		 * Toets die verder geen specifieke betekenis voor het KRD heeft.
		 */
		Toets(false),
		/**
		 * SE-resultaat voor VO/VAVO
		 */
		Schoolexamen(true),
		/**
		 * CE-resultaat voor VO/VAVO
		 */
		CentraalExamen(true),
		/**
		 * Vaardigheid 'Spreken' voor talen (NT2, Nederlands MBO en moderne vreemde
		 * talen MBO)
		 */
		Spreken(true),
		/**
		 * Vaardigheid 'Luisteren' voor talen (NT2, Nederlands MBO en moderne vreemde
		 * talen MBO)
		 */
		Luisteren(true),
		/**
		 * Vaardigheid 'Lezen' voor talen (NT2, Nederlands MBO en moderne vreemde talen
		 * MBO)
		 */
		Lezen(true),
		/**
		 * Vaardigheid 'Schrijven' voor talen (NT2, Nederlands MBO en moderne vreemde
		 * talen MBO)
		 */
		Schrijven(true),
		/**
		 * Vaardigheid 'Gesprekken' voor talen (NT2, Nederlands MBO en moderne vreemde
		 * talen MBO)
		 */
		Gesprekken(true),
		/**
		 * Toets geeft het instroomniveau van de deelnemer aan (voor NT2)
		 */
		Instroomniveau(false),
		/**
		 * Toets geeft het behaalde niveau van de deelnemer aan (voor NT2)
		 */
		BehaaldNiveau(false),

		Getallen(false),

		RuimteVorm(false),

		Gegevensverwerking(false),

		Verbanden(false),
		/**
		 * Toets is examenonderdeel voor inburgering
		 */
		ExamenonderdeelInburgering(false);

		SoortToets(boolean uniekBinnenResultaatstructuur) {
			this.uniekBinnenResultaatstructuur = uniekBinnenResultaatstructuur;
		}

		private final boolean uniekBinnenResultaatstructuur;

		public boolean isUniekBinnenResultaatstructuur() {
			return uniekBinnenResultaatstructuur;
		}

		public boolean isNT2VaardigheidToets() {
			return tussen(SoortToets.Spreken, SoortToets.Gesprekken);
		}

		public static List<SoortToets> nt2vaardigheidToetsen() {
			var vaardigheden = new ArrayList<SoortToets>();
			for (SoortToets soortToets : SoortToets.values()) {
				if (soortToets.isNT2VaardigheidToets()) {
					vaardigheden.add(soortToets);
				}
			}
			return vaardigheden;
		}

		public boolean tussen(SoortToets toets1, SoortToets toets2) {
			return (toets1.ordinal() <= this.ordinal()) && this.ordinal() <= toets2.ordinal();
		}

		public static ArrayList<SoortToets> mogelijkeWaarden(Onderwijsproduct onderwijsproduct) {
			var res = new ArrayList<SoortToets>();
			// res.add(SoortToets.Toets);
			// if (onderwijsproduct.isGekoppeldAanVOTaxonomie()) {
			// res.add(SoortToets.Schoolexamen);
			// res.add(SoortToets.CentraalExamen);
			// }
			// if (onderwijsproduct.isGekoppeldAanEducatieTaxonomie()
			// || onderwijsproduct.isGekoppeldAanInburgeringTaxonomie()
			// || onderwijsproduct.isGekoppeldAanCGOTaxonomie()
			// || onderwijsproduct.getOnderwijsproductTaxonomieList().isEmpty()) {
			// res.add(SoortToets.Spreken);
			// res.add(SoortToets.Luisteren);
			// res.add(SoortToets.Lezen);
			// res.add(SoortToets.Schrijven);
			// res.add(SoortToets.Gesprekken);
			// res.add(SoortToets.Instroomniveau);
			// res.add(SoortToets.BehaaldNiveau);
			// res.add(SoortToets.Getallen);
			// res.add(SoortToets.RuimteVorm);
			// res.add(SoortToets.Gegevensverwerking);
			// res.add(SoortToets.Verbanden);
			// res.add(SoortToets.ExamenonderdeelInburgering);
			// }
			//
			return res;
		}
	}

	public enum Rekenregel {
		Gemiddelde {
			@Override
			public BerekendResultaat calculateSamengesteldResultaat(Map<Toets, Resultaat> deeltoetsen,
					Toets samengesteldeToets) {
				var ret = BigDecimal.ZERO;
				var totaalWeging = 0;
				// for (Resultaat curDeeltoetsResultaat : deeltoetsen.values()) {
				// if (curDeeltoetsResultaat != null) {
				// var curWeging = curDeeltoetsResultaat.getWegingVoorBerekening();
				// if (curWeging != null) {
				// totaalWeging += curWeging;
				// ret =
				// ret.add(curDeeltoetsResultaat.getCijfer().multiply(BigDecimal.valueOf(curWeging)));
				// }
				// }
				// }
				// if (totaalWeging == 0)
				// return null;

				return samengesteldeToets.getSchaal().calculateCijferOfWaarde(ret, totaalWeging);
			}
		},

		Prioriteit {
			@Override
			public BerekendResultaat calculateSamengesteldResultaat(Map<Toets, Resultaat> deeltoetsen,
					Toets samengesteldeToets) {
				BigDecimal ret = null;
				return samengesteldeToets.getSchaal().calculateCijferOfWaarde(ret, 1);
			}
		},

		Formule {
			@Override
			public BerekendResultaat calculateSamengesteldResultaat(Map<Toets, Resultaat> deeltoetsen,
					Toets samengesteldeToets) {
				// try {
				// return samengesteldeToets.getSchaal()
				// .calculateCijferOfWaarde(FormuleBerekening.bereken(deeltoetsen,
				// samengesteldeToets), 1);
				// } catch (EvaluationException e) {
				// }
				return null;
			}
		};

		public abstract BerekendResultaat calculateSamengesteldResultaat(Map<Toets, Resultaat> deeltoetsen,
				Toets samengesteldeToets);
	}

	/**
	 * Geeft aan welke modes gebruikt moet worden voor het genereren van toetscode
	 * paden.
	 *
	 */
	public enum ToetsCodePathMode {
		/**
		 * Genereer standaard paden. Toetsen met dezelfde codes, maar binnen een andere
		 * resultaatstructuur zullen hetzelfde pad krijgen.
		 */
		STANDAARD,
		/**
		 * Genereer paden die uniek zijn binnen een resultaatstructuur, ook als de codes
		 * van de toetsen hetzelfde zijn.
		 */
		STRUCTUUR_LOKAAL
	}

	@Enumerated(value = EnumType.STRING)
	@Column(nullable = false)
	private SoortToets soort = SoortToets.Toets;

	/**
	 * Een toets hoort altijd bij een resultaatstructuur.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "resultaatstructuur", nullable = false)
	private Resultaatstructuur resultaatstructuur;

	@Column(nullable = false, length = 10)
	private String code;

	@Column(nullable = false, length = 200)
	private String codePath;

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = true, length = 20)
	private String referentieCode;

	@Column(nullable = true)
	private Integer referentieVersie = 1;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "schaal", nullable = false)
	private Schaal schaal;

	/**
	 * De parent toets van deze deeltoets.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "parent")
	private Toets parent;

	@Column(nullable = false)
	private int volgnummer;

	/**
	 * Is dit een eindtoets? Dit komt overeen met 'parent==null', maar het is veel
	 * efficienter te zoeken naar 'eindtoets==true'. Standaard wordt de property op
	 * true gezet, maar als een parent gezet wordt, wordt het property automatisch
	 * aangepast.
	 */
	@Column(nullable = false)
	private boolean eindtoets = true;

	/**
	 * De children toetsen van deze deeltoets.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	@BatchSize(size = 100)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@OrderBy("volgnummer ASC")
	private List<Toets> children = new ArrayList<>();

	/**
	 * Weging van de toets.
	 */
	@Column(nullable = true)
	private Integer weging;

	@Column(nullable = false)
	private boolean automatischeWeging;

	@Column(nullable = false)
	private boolean verplicht;

	/**
	 * Is dit een samengestelde toets met een berekend resultaat.
	 */
	@Column(nullable = false)
	private boolean samengesteld;

	private boolean samengesteldMetHerkansing;

	private boolean samengesteldMetVarianten;

	@Column(nullable = true)
	private Integer variantVoorPoging;

	@Column(nullable = false)
	private boolean verwijsbaar;

	@Column(nullable = false)
	private boolean handmatigInleveren;

	/**
	 * Is het berekende resultaat van deze toets overschrijfbaar (alleen van
	 * toepassing bij samengestelde toetsen of toetsen met een schaal).
	 */
	@Column(nullable = false)
	private boolean overschrijfbaar;

	@Column(nullable = true)
	private Integer maxAantalNietBehaald;

	@Column(nullable = true)
	private Integer minAantalIngevuld;

	@Column(nullable = true)
	private Integer maxAantalIngevuld;

	@Column(nullable = true)
	private Integer minStudiepuntenVoorBehaald;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal compenseerbaarVanaf;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Rekenregel rekenregel;

	@Column(nullable = true, length = 1000)
	private String formule;

	/**
	 * Het aantal herkansingen voor deze toets. Is alleen van toepassing voor niet
	 * samengestelde toetsen.
	 */
	@Column(nullable = true)
	private int aantalHerkansingen;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Herkansingsscore scoreBijHerkansing;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Scoreschaal scoreschaal;

	@Column(nullable = true)
	private Integer studiepunten;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "toets")
	@OrderBy("vanafScore")
	private List<Scoreschaalwaarde> scoreschaalwaarden = new ArrayList<>();

	@Column(nullable = true)
	private Integer scoreschaalLengteTijdvak1;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal scoreschaalNormeringTijdvak1 = BigDecimal.ONE;

	@Column(nullable = true)
	private Integer scoreschaalLengteTijdvak2;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal scoreschaalNormeringTijdvak2 = BigDecimal.ONE;

	@Column(nullable = true)
	private Integer scoreschaalLengteTijdvak3;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal scoreschaalNormeringTijdvak3 = BigDecimal.ONE;

	@Column(nullable = false)
	private boolean alternatiefResultaatMogelijk;

	@Column(nullable = false)
	private boolean alternatiefCombinerenMetHoofd;

	@Column(nullable = false)
	private long bevrorenPogingen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "toets")
	private List<Resultaat> resultaten = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lezenUit")
	@BatchSize(size = 100)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<ToetsVerwijzing> uitgaandeVerwijzingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schrijvenIn")
	@BatchSize(size = 100)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<ToetsVerwijzing> inkomendeVerwijzingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "toets")
	@BatchSize(size = 100)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<PersoonlijkeToetscode> persoonlijkeToetscodes = new ArrayList<>();

	public SoortToets getSoort() {
		return soort;
	}

	public void setSoort(SoortToets soort) {
		this.soort = soort;
	}

	public Resultaatstructuur getResultaatstructuur() {
		return resultaatstructuur;
	}

	public void setResultaatstructuur(Resultaatstructuur resultaatstructuur) {
		this.resultaatstructuur = resultaatstructuur;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCodePath() {
		return codePath;
	}

	public void setCodePath(String codePath) {
		this.codePath = codePath;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getReferentieCode() {
		return referentieCode;
	}

	public void setReferentieCode(String referentieCode) {
		this.referentieCode = referentieCode;
	}

	public Integer getReferentieVersie() {
		return referentieVersie;
	}

	public void setReferentieVersie(Integer referentieVersie) {
		this.referentieVersie = referentieVersie;
	}

	public Schaal getSchaal() {
		return schaal;
	}

	public void setSchaal(Schaal schaal) {
		this.schaal = schaal;
	}

	public Toets getParent() {
		return parent;
	}

	public void setParent(Toets parent) {
		this.parent = parent;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public boolean isEindtoets() {
		return eindtoets;
	}

	public void setEindtoets(boolean eindtoets) {
		this.eindtoets = eindtoets;
	}

	public List<Toets> getChildren() {
		return children;
	}

	public void setChildren(List<Toets> children) {
		this.children = children;
	}

	public Integer getWeging() {
		return weging;
	}

	public void setWeging(Integer weging) {
		this.weging = weging;
	}

	public boolean isAutomatischeWeging() {
		return automatischeWeging;
	}

	public void setAutomatischeWeging(boolean automatischeWeging) {
		this.automatischeWeging = automatischeWeging;
	}

	public boolean isVerplicht() {
		return verplicht;
	}

	public void setVerplicht(boolean verplicht) {
		this.verplicht = verplicht;
	}

	public boolean isSamengesteld() {
		return samengesteld;
	}

	public void setSamengesteld(boolean samengesteld) {
		this.samengesteld = samengesteld;
	}

	public boolean isSamengesteldMetHerkansing() {
		return samengesteldMetHerkansing;
	}

	public void setSamengesteldMetHerkansing(boolean samengesteldMetHerkansing) {
		this.samengesteldMetHerkansing = samengesteldMetHerkansing;
	}

	public boolean isSamengesteldMetVarianten() {
		return samengesteldMetVarianten;
	}

	public void setSamengesteldMetVarianten(boolean samengesteldMetVarianten) {
		this.samengesteldMetVarianten = samengesteldMetVarianten;
	}

	public Integer getVariantVoorPoging() {
		return variantVoorPoging;
	}

	public void setVariantVoorPoging(Integer variantVoorPoging) {
		this.variantVoorPoging = variantVoorPoging;
	}

	public boolean isVerwijsbaar() {
		return verwijsbaar;
	}

	public void setVerwijsbaar(boolean verwijsbaar) {
		this.verwijsbaar = verwijsbaar;
	}

	public boolean isHandmatigInleveren() {
		return handmatigInleveren;
	}

	public void setHandmatigInleveren(boolean handmatigInleveren) {
		this.handmatigInleveren = handmatigInleveren;
	}

	public boolean isOverschrijfbaar() {
		return overschrijfbaar;
	}

	public void setOverschrijfbaar(boolean overschrijfbaar) {
		this.overschrijfbaar = overschrijfbaar;
	}

	public Integer getMaxAantalNietBehaald() {
		return maxAantalNietBehaald;
	}

	public void setMaxAantalNietBehaald(Integer maxAantalNietBehaald) {
		this.maxAantalNietBehaald = maxAantalNietBehaald;
	}

	public Integer getMinAantalIngevuld() {
		return minAantalIngevuld;
	}

	public void setMinAantalIngevuld(Integer minAantalIngevuld) {
		this.minAantalIngevuld = minAantalIngevuld;
	}

	public Integer getMaxAantalIngevuld() {
		return maxAantalIngevuld;
	}

	public void setMaxAantalIngevuld(Integer maxAantalIngevuld) {
		this.maxAantalIngevuld = maxAantalIngevuld;
	}

	public Integer getMinStudiepuntenVoorBehaald() {
		return minStudiepuntenVoorBehaald;
	}

	public void setMinStudiepuntenVoorBehaald(Integer minStudiepuntenVoorBehaald) {
		this.minStudiepuntenVoorBehaald = minStudiepuntenVoorBehaald;
	}

	public BigDecimal getCompenseerbaarVanaf() {
		return compenseerbaarVanaf;
	}

	public void setCompenseerbaarVanaf(BigDecimal compenseerbaarVanaf) {
		this.compenseerbaarVanaf = compenseerbaarVanaf;
	}

	public Rekenregel getRekenregel() {
		return rekenregel;
	}

	public void setRekenregel(Rekenregel rekenregel) {
		this.rekenregel = rekenregel;
	}

	public String getFormule() {
		return formule;
	}

	public void setFormule(String formule) {
		this.formule = formule;
	}

	public int getAantalHerkansingen() {
		return aantalHerkansingen;
	}

	public void setAantalHerkansingen(int aantalHerkansingen) {
		this.aantalHerkansingen = aantalHerkansingen;
	}

	public Herkansingsscore getScoreBijHerkansing() {
		return scoreBijHerkansing;
	}

	public void setScoreBijHerkansing(Herkansingsscore scoreBijHerkansing) {
		this.scoreBijHerkansing = scoreBijHerkansing;
	}

	public Scoreschaal getScoreschaal() {
		return scoreschaal;
	}

	public void setScoreschaal(Scoreschaal scoreschaal) {
		this.scoreschaal = scoreschaal;
	}

	public Integer getStudiepunten() {
		return studiepunten;
	}

	public void setStudiepunten(Integer studiepunten) {
		this.studiepunten = studiepunten;
	}

	public List<Scoreschaalwaarde> getScoreschaalwaarden() {
		return scoreschaalwaarden;
	}

	public void setScoreschaalwaarden(List<Scoreschaalwaarde> scoreschaalwaarden) {
		this.scoreschaalwaarden = scoreschaalwaarden;
	}

	public Integer getScoreschaalLengteTijdvak1() {
		return scoreschaalLengteTijdvak1;
	}

	public void setScoreschaalLengteTijdvak1(Integer scoreschaalLengteTijdvak1) {
		this.scoreschaalLengteTijdvak1 = scoreschaalLengteTijdvak1;
	}

	public BigDecimal getScoreschaalNormeringTijdvak1() {
		return scoreschaalNormeringTijdvak1;
	}

	public void setScoreschaalNormeringTijdvak1(BigDecimal scoreschaalNormeringTijdvak1) {
		this.scoreschaalNormeringTijdvak1 = scoreschaalNormeringTijdvak1;
	}

	public Integer getScoreschaalLengteTijdvak2() {
		return scoreschaalLengteTijdvak2;
	}

	public void setScoreschaalLengteTijdvak2(Integer scoreschaalLengteTijdvak2) {
		this.scoreschaalLengteTijdvak2 = scoreschaalLengteTijdvak2;
	}

	public BigDecimal getScoreschaalNormeringTijdvak2() {
		return scoreschaalNormeringTijdvak2;
	}

	public void setScoreschaalNormeringTijdvak2(BigDecimal scoreschaalNormeringTijdvak2) {
		this.scoreschaalNormeringTijdvak2 = scoreschaalNormeringTijdvak2;
	}

	public Integer getScoreschaalLengteTijdvak3() {
		return scoreschaalLengteTijdvak3;
	}

	public void setScoreschaalLengteTijdvak3(Integer scoreschaalLengteTijdvak3) {
		this.scoreschaalLengteTijdvak3 = scoreschaalLengteTijdvak3;
	}

	public BigDecimal getScoreschaalNormeringTijdvak3() {
		return scoreschaalNormeringTijdvak3;
	}

	public void setScoreschaalNormeringTijdvak3(BigDecimal scoreschaalNormeringTijdvak3) {
		this.scoreschaalNormeringTijdvak3 = scoreschaalNormeringTijdvak3;
	}

	public boolean isAlternatiefResultaatMogelijk() {
		return alternatiefResultaatMogelijk;
	}

	public void setAlternatiefResultaatMogelijk(boolean alternatiefResultaatMogelijk) {
		this.alternatiefResultaatMogelijk = alternatiefResultaatMogelijk;
	}

	public boolean isAlternatiefCombinerenMetHoofd() {
		return alternatiefCombinerenMetHoofd;
	}

	public void setAlternatiefCombinerenMetHoofd(boolean alternatiefCombinerenMetHoofd) {
		this.alternatiefCombinerenMetHoofd = alternatiefCombinerenMetHoofd;
	}

	public long getBevrorenPogingen() {
		return bevrorenPogingen;
	}

	public void setBevrorenPogingen(long bevrorenPogingen) {
		this.bevrorenPogingen = bevrorenPogingen;
	}

	public List<Resultaat> getResultaten() {
		return resultaten;
	}

	public void setResultaten(List<Resultaat> resultaten) {
		this.resultaten = resultaten;
	}

	public List<ToetsVerwijzing> getUitgaandeVerwijzingen() {
		return uitgaandeVerwijzingen;
	}

	public void setUitgaandeVerwijzingen(List<ToetsVerwijzing> uitgaandeVerwijzingen) {
		this.uitgaandeVerwijzingen = uitgaandeVerwijzingen;
	}

	public List<ToetsVerwijzing> getInkomendeVerwijzingen() {
		return inkomendeVerwijzingen;
	}

	public void setInkomendeVerwijzingen(List<ToetsVerwijzing> inkomendeVerwijzingen) {
		this.inkomendeVerwijzingen = inkomendeVerwijzingen;
	}

	public List<PersoonlijkeToetscode> getPersoonlijkeToetscodes() {
		return persoonlijkeToetscodes;
	}

	public void setPersoonlijkeToetscodes(List<PersoonlijkeToetscode> persoonlijkeToetscodes) {
		this.persoonlijkeToetscodes = persoonlijkeToetscodes;
	}
}
