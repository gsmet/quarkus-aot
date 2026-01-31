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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.TrajectBijlage;
import nl.topicus.eduarte.model.entities.dbs.trajecten.templates.BegeleidingsHandelingTemplate;
import nl.topicus.eduarte.model.entities.dbs.trajecten.templates.TrajectTemplate;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Traject extends BeginEinddatumInstellingEntiteit
		implements ZorgvierkantObject, IBijlageKoppelEntiteit<TrajectBijlage> {
	public static final String TRAJECT = "TRAJECT";

	public static final String VERTROUWELIJK_TRAJECT = "VERTROUWELIJK_TRAJECT";

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date beoogdeEinddatum;

	@Column(nullable = false, length = 255)
	private String titel;

	@Column(nullable = false, length = 1024)
	private String omschrijving;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Column(nullable = true, length = 2)
	private Integer zorglijn;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trajectSoort", nullable = false, foreignKey = @ForeignKey(name = "FK_Traject_soort"))
	private TrajectSoort trajectSoort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trajectStatusSoort", nullable = false, foreignKey = @ForeignKey(name = "FK_Traject_trajSSrt"))
	private TrajectStatusSoort trajectStatusSoort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false, foreignKey = @ForeignKey(name = "FK_Traject_deelnemer"))
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis", nullable = true, foreignKey = @ForeignKey(name = "FK_Traject_verbintenis"))
	private Verbintenis verbintenis;

	/**
	 * Tekstuele aanleiding van het traject.
	 */
	@Column(nullable = true)
	@Lob
	private String aanleiding;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traject")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<Aanleiding> aanleidingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traject")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BegeleidingsHandeling> begeleidingsHandelingen = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eindHandelingTemplate")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private BegeleidingsHandelingTemplate eindHandelingTemplate;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traject")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TrajectStatusovergang> trajectStatusovergangen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traject")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TrajectUitvoerder> uitvoerders = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Verantwoordelijke", nullable = false, foreignKey = @ForeignKey(name = "FK_Traject_Verantw"))
	private Medewerker verantwoordelijke;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traject")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TrajectBijlage> bijlagen = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Template", nullable = true, foreignKey = @ForeignKey(name = "FK_Traject_Template"))
	@Comment("Met trajecttemplate "
			+ "kunnen de meeste velden van een traject automatisch gevuld worden. Let op: bij het "
			+ "wijzigen van dit veld zullen waardes overschreven worden. Koppelingen naar "
			+ "aanleidingen zullen alleen gelegd worden indien de benodigde rechten aanwezig zijn.")
	private TrajectTemplate trajectTemplate;

	@Lob
	@Basic(optional = true)
	private String doelen;

	@Lob
	@Basic(optional = true)
	private String beginSituatie;

	@Lob
	@Basic(optional = true)
	private String handelingen;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "traject")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TrajectNietTonenInZorgvierkant> nietTonenInZorgvierkants = new ArrayList<>();

	public Date getBeoogdeEinddatum() {
		return beoogdeEinddatum;
	}

	public void setBeoogdeEinddatum(Date beoogdeEinddatum) {
		this.beoogdeEinddatum = beoogdeEinddatum;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	@Override
	public boolean isVertrouwelijk() {
		return vertrouwelijk;
	}

	public void setVertrouwelijk(boolean vertrouwelijk) {
		this.vertrouwelijk = vertrouwelijk;
	}

	@Override
	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public TrajectSoort getTrajectSoort() {
		return trajectSoort;
	}

	public void setTrajectSoort(TrajectSoort trajectSoort) {
		this.trajectSoort = trajectSoort;
	}

	public TrajectStatusSoort getTrajectStatusSoort() {
		return trajectStatusSoort;
	}

	public void setTrajectStatusSoort(TrajectStatusSoort trajectStatusSoort) {
		this.trajectStatusSoort = trajectStatusSoort;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public String getAanleiding() {
		return aanleiding;
	}

	public void setAanleiding(String aanleiding) {
		this.aanleiding = aanleiding;
	}

	public List<Aanleiding> getAanleidingen() {
		return aanleidingen;
	}

	public void setAanleidingen(List<Aanleiding> aanleidingen) {
		this.aanleidingen = aanleidingen;
	}

	public List<BegeleidingsHandeling> getBegeleidingsHandelingen() {
		return begeleidingsHandelingen;
	}

	public void setBegeleidingsHandelingen(List<BegeleidingsHandeling> begeleidingsHandelingen) {
		this.begeleidingsHandelingen = begeleidingsHandelingen;
	}

	public BegeleidingsHandelingTemplate getEindHandelingTemplate() {
		return eindHandelingTemplate;
	}

	public void setEindHandelingTemplate(BegeleidingsHandelingTemplate eindHandelingTemplate) {
		this.eindHandelingTemplate = eindHandelingTemplate;
	}

	public List<TrajectStatusovergang> getTrajectStatusovergangen() {
		return trajectStatusovergangen;
	}

	public void setTrajectStatusovergangen(List<TrajectStatusovergang> trajectStatusovergangen) {
		this.trajectStatusovergangen = trajectStatusovergangen;
	}

	public List<TrajectUitvoerder> getUitvoerders() {
		return uitvoerders;
	}

	public void setUitvoerders(List<TrajectUitvoerder> uitvoerders) {
		this.uitvoerders = uitvoerders;
	}

	public Medewerker getVerantwoordelijke() {
		return verantwoordelijke;
	}

	public void setVerantwoordelijke(Medewerker verantwoordelijke) {
		this.verantwoordelijke = verantwoordelijke;
	}

	@Override
	public List<TrajectBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<TrajectBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public TrajectTemplate getTrajectTemplate() {
		return trajectTemplate;
	}

	public void setTrajectTemplate(TrajectTemplate trajectTemplate) {
		this.trajectTemplate = trajectTemplate;
	}

	public String getDoelen() {
		return doelen;
	}

	public void setDoelen(String doelen) {
		this.doelen = doelen;
	}

	public String getBeginSituatie() {
		return beginSituatie;
	}

	public void setBeginSituatie(String beginSituatie) {
		this.beginSituatie = beginSituatie;
	}

	public String getHandelingen() {
		return handelingen;
	}

	public void setHandelingen(String handelingen) {
		this.handelingen = handelingen;
	}

	public List<TrajectNietTonenInZorgvierkant> getNietTonenInZorgvierkants() {
		return nietTonenInZorgvierkants;
	}

	public void setNietTonenInZorgvierkants(List<TrajectNietTonenInZorgvierkant> nietTonenInZorgvierkants) {
		this.nietTonenInZorgvierkants = nietTonenInZorgvierkants;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public TrajectBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public String getSecurityId() {
		return null;
	}

	@Override
	public String getVertrouwelijkSecurityId() {
		return null;
	}

	@Override
	public boolean isTonenInZorgvierkant() {
		return false;
	}
}
