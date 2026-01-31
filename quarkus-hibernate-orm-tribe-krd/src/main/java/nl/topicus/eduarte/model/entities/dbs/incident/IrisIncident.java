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
package nl.topicus.eduarte.model.entities.dbs.incident;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.IrisIncidentBijlage;
import nl.topicus.eduarte.model.entities.dbs.gedrag.IncidentCategorie;
import nl.topicus.eduarte.model.entities.dbs.gedrag.IrisIncidentNietTonenInZorgvierkant;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Kleur;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.iris.DagDeel;
import nl.topicus.eduarte.model.iris.TijdSpecificatie;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class IrisIncident extends BeginEinddatumInstellingEntiteit
		implements IBijlageKoppelEntiteit<IrisIncidentBijlage> {

	@Column(length = 50, nullable = false)
	private String titel;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Kleur kleur;

	@Column(nullable = true, length = 2)
	private Integer zorglijn;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "irisIncident")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<IrisIncidentNietTonenInZorgvierkant> nietTonenInZorgvierkants = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "irisIncident")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<IrisBetrokkene> betrokkene = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@JoinColumn(name = "auteur", nullable = false)
	private Medewerker auteur;

	@ManyToOne(fetch = FetchType.LAZY)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@JoinColumn(name = "categorie", nullable = false)
	private IncidentCategorie categorie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "incident")
	private List<IrisIncidentLocatie> incidentLocatie = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "incident")
	private List<IrisIncidentVoorwerp> incidentVoorwerp = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "irisIncident")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<IrisIncidentBijlage> bijlagen = new ArrayList<>();

	@ManyToOne(optional = true)
	@JoinColumn(nullable = true)
	private OrganisatieEenheid organisatieEenheid;

	@Column(nullable = false)
	private boolean afgerond;

	@Column(nullable = false)
	private boolean onzeker;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Lob
	private String toelichting;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TijdSpecificatie tijdType;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private DagDeel dagDeel;

	@Column(nullable = true)
	private String irisIncidentNummer;

	@Column(nullable = true)
	private String tijdstip;

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Kleur getKleur() {
		return kleur;
	}

	public void setKleur(Kleur kleur) {
		this.kleur = kleur;
	}

	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public List<IrisIncidentNietTonenInZorgvierkant> getNietTonenInZorgvierkants() {
		return nietTonenInZorgvierkants;
	}

	public void setNietTonenInZorgvierkants(List<IrisIncidentNietTonenInZorgvierkant> nietTonenInZorgvierkants) {
		this.nietTonenInZorgvierkants = nietTonenInZorgvierkants;
	}

	public List<IrisBetrokkene> getBetrokkene() {
		return betrokkene;
	}

	public void setBetrokkene(List<IrisBetrokkene> betrokkene) {
		this.betrokkene = betrokkene;
	}

	public Medewerker getAuteur() {
		return auteur;
	}

	public void setAuteur(Medewerker auteur) {
		this.auteur = auteur;
	}

	public IncidentCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(IncidentCategorie categorie) {
		this.categorie = categorie;
	}

	public List<IrisIncidentLocatie> getIncidentLocatie() {
		return incidentLocatie;
	}

	public void setIncidentLocatie(List<IrisIncidentLocatie> incidentLocatie) {
		this.incidentLocatie = incidentLocatie;
	}

	public List<IrisIncidentVoorwerp> getIncidentVoorwerp() {
		return incidentVoorwerp;
	}

	public void setIncidentVoorwerp(List<IrisIncidentVoorwerp> incidentVoorwerp) {
		this.incidentVoorwerp = incidentVoorwerp;
	}

	@Override
	public List<IrisIncidentBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<IrisIncidentBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public boolean isAfgerond() {
		return afgerond;
	}

	public void setAfgerond(boolean afgerond) {
		this.afgerond = afgerond;
	}

	public boolean isOnzeker() {
		return onzeker;
	}

	public void setOnzeker(boolean onzeker) {
		this.onzeker = onzeker;
	}

	public boolean isVertrouwelijk() {
		return vertrouwelijk;
	}

	public void setVertrouwelijk(boolean vertrouwelijk) {
		this.vertrouwelijk = vertrouwelijk;
	}

	public String getToelichting() {
		return toelichting;
	}

	public void setToelichting(String toelichting) {
		this.toelichting = toelichting;
	}

	public TijdSpecificatie getTijdType() {
		return tijdType;
	}

	public void setTijdType(TijdSpecificatie tijdType) {
		this.tijdType = tijdType;
	}

	public DagDeel getDagDeel() {
		return dagDeel;
	}

	public void setDagDeel(DagDeel dagDeel) {
		this.dagDeel = dagDeel;
	}

	public String getIrisIncidentNummer() {
		return irisIncidentNummer;
	}

	public void setIrisIncidentNummer(String irisIncidentNummer) {
		this.irisIncidentNummer = irisIncidentNummer;
	}

	public String getTijdstip() {
		return tijdstip;
	}

	public void setTijdstip(String tijdstip) {
		this.tijdstip = tijdstip;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public IrisIncidentBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
