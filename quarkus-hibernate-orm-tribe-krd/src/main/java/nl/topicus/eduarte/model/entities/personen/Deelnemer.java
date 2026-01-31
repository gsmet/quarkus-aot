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
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;
import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.duo.criho.annot.Criho;
import nl.topicus.eduarte.model.entities.BronEntiteitStatus;
import nl.topicus.eduarte.model.entities.IBronStatusEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.trajecten.Traject;
import nl.topicus.eduarte.model.entities.groep.Groepsdeelname;
import nl.topicus.eduarte.model.entities.hogeronderwijs.StudielinkBericht;
import nl.topicus.eduarte.model.entities.inschrijving.OnderwijsproductAfname;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.inschrijving.Vooropleiding;
import nl.topicus.eduarte.model.entities.kenmerk.DeelnemerKenmerk;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Deelnemer (leerling). Verwijst naar Persoon waar bijvoorbeeld naam en
 * sofinummer is opgeslagen.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "organisatie", "deelnemernummer" }) })
@BatchSize(size = 20)
@IsViewWhenOnNoise
public class Deelnemer extends InstellingEntiteit implements IBijlageKoppelEntiteit<DeelnemerBijlage>,
IOrganisatieEenheidLocatieKoppelbaarEntiteit<Verbintenis>, IBronStatusEntiteit {
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = false)
	@Bron
	private Persoon persoon;

	@Column(nullable = true)
	private boolean allochtoon;

	/**
	 * Dit is het 'ov-nummer' of 'deelnemernummer' zoals dit bekend is bij
	 * medewerkers van scholen. Dit is dus waaraan een deelnemer uniek
	 * geidentificeerd wordt binnen een school.
	 */
	@Bron(sleutel = true)
	@Column(nullable = false)
	private int deelnemernummer;

	@Column(nullable = true)
	@Bron(sleutel = true)
	private Long onderwijsnummer;

	/**
	 * LGF = Leerlinggebonden Financiering. Wordt niet aangevraagd via KRD / BRON,
	 * maar bij de CVI (indicatiestellingsorgaan). Scholen willen wel graag weten
	 * dat sprake is van LGF omdat ze dan geld hebben om de deelnemer extra te
	 * begeleiden.
	 */
	@Column(nullable = false)
	@Comment("Leerling Gebonden Financiering geeft aan of "
			+ "de Commissie voor Indicatiestelling extra middelen heeft toegekend voor "
			+ "ondersteuning en begeleiding van de deelnemer met een bepaalde handicap of "
			+ "beperking. Ook bekend als het \"rugzakje\".")
	private boolean lgf;

	/**
	 * Lijst met alle inschrijvingen voor deze deelnemer.
	 */
	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, volgnummer DESC, einddatum DESC, geplandeEinddatum DESC")
	@Bron
	private List<Verbintenis> verbintenissen = new ArrayList<>();

	/**
	 * Unordered, alleen gebruiken voor joins
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	private List<Verbintenis> verbintenissenUnordered;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, einddatum DESC")
	private List<Groepsdeelname> groepsdeelnames;

	/**
	 * Unordered, alleen gebruiken voor joins
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	private List<Groepsdeelname> groepsdeelnamesUnordered;

	/**
	 * De bijlages van deze deelnemer
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	private List<DeelnemerBijlage> bijlagen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@Bron
	private List<Vooropleiding> vooropleidingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<OnderwijsproductAfname> onderwijsproductAfnames = new ArrayList<>();

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BronEntiteitStatus bronStatus = BronEntiteitStatus.Geen;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date bronDatum;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<DeelnemerKenmerk> kenmerken = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<Traject> trajecten = new ArrayList<>();

	@Temporal(value = TemporalType.DATE)
	private Date registratieDatum;

	@Column(nullable = true)
	@Temporal(value = TemporalType.DATE)
	private Date startkwalificatieplichtigTot;

	@Comment("Zorgt dat de deelnemer geen facturen meer krijgt, totdat dit veld is uitgeschakeld.")
	private boolean uitsluitenVanFacturatie = false;

	@Criho
	@Column(nullable = true)
	private Long ocwnummer;

	@Column(nullable = true)
	private Integer studielinknummer;

	@Column(nullable = true)
	private Boolean gbaRelatie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "deelnemer")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<StudielinkBericht> studielinkBerichten = new ArrayList<>();

	@Column(nullable = true)
	private Boolean daPersGegegensConflict;

	@Column(nullable = true)
	private Boolean heeftBachelorgraad;

	@Column(nullable = true)
	private Boolean heeftMastergraad;

	public Persoon getPersoon() {
		return persoon;
	}

	public void setPersoon(Persoon persoon) {
		this.persoon = persoon;
	}

	public boolean isAllochtoon() {
		return allochtoon;
	}

	public void setAllochtoon(boolean allochtoon) {
		this.allochtoon = allochtoon;
	}

	public int getDeelnemernummer() {
		return deelnemernummer;
	}

	public void setDeelnemernummer(int deelnemernummer) {
		this.deelnemernummer = deelnemernummer;
	}

	public Long getOnderwijsnummer() {
		return onderwijsnummer;
	}

	public void setOnderwijsnummer(Long onderwijsnummer) {
		this.onderwijsnummer = onderwijsnummer;
	}

	public boolean isLgf() {
		return lgf;
	}

	public void setLgf(boolean lgf) {
		this.lgf = lgf;
	}

	public List<Verbintenis> getVerbintenissen() {
		return verbintenissen;
	}

	public void setVerbintenissen(List<Verbintenis> verbintenissen) {
		this.verbintenissen = verbintenissen;
	}

	public List<Verbintenis> getVerbintenissenUnordered() {
		return verbintenissenUnordered;
	}

	public void setVerbintenissenUnordered(List<Verbintenis> verbintenissenUnordered) {
		this.verbintenissenUnordered = verbintenissenUnordered;
	}

	public List<Groepsdeelname> getGroepsdeelnames() {
		return groepsdeelnames;
	}

	public void setGroepsdeelnames(List<Groepsdeelname> groepsdeelnames) {
		this.groepsdeelnames = groepsdeelnames;
	}

	public List<Groepsdeelname> getGroepsdeelnamesUnordered() {
		return groepsdeelnamesUnordered;
	}

	public void setGroepsdeelnamesUnordered(List<Groepsdeelname> groepsdeelnamesUnordered) {
		this.groepsdeelnamesUnordered = groepsdeelnamesUnordered;
	}

	@Override
	public List<DeelnemerBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<DeelnemerBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<Vooropleiding> getVooropleidingen() {
		return vooropleidingen;
	}

	public void setVooropleidingen(List<Vooropleiding> vooropleidingen) {
		this.vooropleidingen = vooropleidingen;
	}

	public List<OnderwijsproductAfname> getOnderwijsproductAfnames() {
		return onderwijsproductAfnames;
	}

	public void setOnderwijsproductAfnames(List<OnderwijsproductAfname> onderwijsproductAfnames) {
		this.onderwijsproductAfnames = onderwijsproductAfnames;
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

	public List<DeelnemerKenmerk> getKenmerken() {
		return kenmerken;
	}

	public void setKenmerken(List<DeelnemerKenmerk> kenmerken) {
		this.kenmerken = kenmerken;
	}

	public List<Traject> getTrajecten() {
		return trajecten;
	}

	public void setTrajecten(List<Traject> trajecten) {
		this.trajecten = trajecten;
	}

	public Date getRegistratieDatum() {
		return registratieDatum;
	}

	public void setRegistratieDatum(Date registratieDatum) {
		this.registratieDatum = registratieDatum;
	}

	public Date getStartkwalificatieplichtigTot() {
		return startkwalificatieplichtigTot;
	}

	public void setStartkwalificatieplichtigTot(Date startkwalificatieplichtigTot) {
		this.startkwalificatieplichtigTot = startkwalificatieplichtigTot;
	}

	public boolean isUitsluitenVanFacturatie() {
		return uitsluitenVanFacturatie;
	}

	public void setUitsluitenVanFacturatie(boolean uitsluitenVanFacturatie) {
		this.uitsluitenVanFacturatie = uitsluitenVanFacturatie;
	}

	public Long getOcwnummer() {
		return ocwnummer;
	}

	public void setOcwnummer(Long ocwnummer) {
		this.ocwnummer = ocwnummer;
	}

	public Integer getStudielinknummer() {
		return studielinknummer;
	}

	public void setStudielinknummer(Integer studielinknummer) {
		this.studielinknummer = studielinknummer;
	}

	public Boolean getGbaRelatie() {
		return gbaRelatie;
	}

	public void setGbaRelatie(Boolean gbaRelatie) {
		this.gbaRelatie = gbaRelatie;
	}

	public List<StudielinkBericht> getStudielinkBerichten() {
		return studielinkBerichten;
	}

	public void setStudielinkBerichten(List<StudielinkBericht> studielinkBerichten) {
		this.studielinkBerichten = studielinkBerichten;
	}

	public Boolean getDaPersGegegensConflict() {
		return daPersGegegensConflict;
	}

	public void setDaPersGegegensConflict(Boolean daPersGegegensConflict) {
		this.daPersGegegensConflict = daPersGegegensConflict;
	}

	public Boolean getHeeftBachelorgraad() {
		return heeftBachelorgraad;
	}

	public void setHeeftBachelorgraad(Boolean heeftBachelorgraad) {
		this.heeftBachelorgraad = heeftBachelorgraad;
	}

	public Boolean getHeeftMastergraad() {
		return heeftMastergraad;
	}

	public void setHeeftMastergraad(Boolean heeftMastergraad) {
		this.heeftMastergraad = heeftMastergraad;
	}

	@Override
	public List<Verbintenis> getOrganisatieEenheidLocatieKoppelingen() {
		return null;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public DeelnemerBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}