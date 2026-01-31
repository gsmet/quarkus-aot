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
package nl.topicus.eduarte.model.entities.dbs.gedrag;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
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

import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.NotitieBijlage;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Notitie extends InstellingEntiteit implements IBijlageKoppelEntiteit<NotitieBijlage>, ZorgvierkantObject {
	public static final String NOTITIES = "NOTITIES";

	public static final String VERTROUWELIJKE_NOTITIES = "VERTROUWELIJKE_NOTITIES";

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notitie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<NotitieBijlage> bijlagen = new ArrayList<>();

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Basic(optional = false)
	private Date dossierEindDatum;

	@Column(length = 50, nullable = false)
	private String titel;

	@Lob
	private String omschrijving;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date datumInvoer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auteur", nullable = false)
	private Medewerker auteur;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Kleur kleur;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@Column(nullable = true, length = 2)
	private Integer zorglijn;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "notitie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<NotitieNietTonenInZorgvierkant> nietTonenInZorgvierkants = new ArrayList<>();

	@Override
	public List<NotitieBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<NotitieBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public Date getDossierEindDatum() {
		return dossierEindDatum;
	}

	public void setDossierEindDatum(Date dossierEindDatum) {
		this.dossierEindDatum = dossierEindDatum;
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

	public Date getDatumInvoer() {
		return datumInvoer;
	}

	public void setDatumInvoer(Date datumInvoer) {
		this.datumInvoer = datumInvoer;
	}

	public Medewerker getAuteur() {
		return auteur;
	}

	public void setAuteur(Medewerker auteur) {
		this.auteur = auteur;
	}

	public Kleur getKleur() {
		return kleur;
	}

	public void setKleur(Kleur kleur) {
		this.kleur = kleur;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	@Override
	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public List<NotitieNietTonenInZorgvierkant> getNietTonenInZorgvierkants() {
		return nietTonenInZorgvierkants;
	}

	public void setNietTonenInZorgvierkants(List<NotitieNietTonenInZorgvierkant> nietTonenInZorgvierkants) {
		this.nietTonenInZorgvierkants = nietTonenInZorgvierkants;
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

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public NotitieBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
