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

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;
import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 * Een onderwijsproduct dat een summatief resultaat levert heeft een
 * resultaatstructuur per cohort.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
@jakarta.persistence.Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = { "code", "organisatie", "cohort", "onderwijsproduct" }) })
public class Resultaatstructuur extends CodeNaamActiefInstellingEntiteit {
	public static final String RES_SUMMATIEF = "RES_SUMMATIEF";

	public static final String RES_FORMATIEF = "RES_FORMATIEF";

	public static final String VERWIJDEREN = "_VERWIJDEREN";

	public static final String KOPIEREN = "_KOPIEREN";

	public static final String IMPORTEREN = "_IMPORTEREN";

	public static final String ANDERMANS_STRUCTUREN = "ANDERMANS_STRUCTUREN";

	public enum Status {
		IN_HERBEREKENING, BESCHIKBAAR, IN_ONDERHOUD, FOUTIEF;
	}

	public enum Type {
		SUMMATIEF(RES_SUMMATIEF), FORMATIEF(RES_FORMATIEF);

		Type(String securityId) {
			this.securityId = securityId;
		}

		public String securityId;

		public String getSecurityId() {
			return securityId;
		}
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Type type;

	@Column(nullable = false)
	private boolean specifiek;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "categorie")
	private ResultaatstructuurCategorie categorie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "cohort")
	private Cohort cohort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "onderwijsproduct")
	private Onderwijsproduct onderwijsproduct;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "auteur")
	private Medewerker auteur;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Status status;

	/**
	 * Nullable omdat het een 1-op-1 relatie is die eigenlijk aan allebei kanten
	 * not-null zouden moeten zijn. Dit is echter niet mogelijk omdat de twee
	 * records dan tegelijkertijd inserted zouden moeten worden.
	 */
	@Basic(optional = false)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "eindresultaat")
	private Toets eindresultaat;

	/**
	 * Alle toetsen waar de resultaatstructuur uit bestaat
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resultaatstructuur")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 100)
	private List<Toets> toetsen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resultaatstructuur")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<DeelnemerResultaatVersie> versies = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resultaatstructuur")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ResultaatstructuurMedewerker> medewerkers = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "resultaatstructuur")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ResultaatstructuurDeelnemer> deelnemers = new ArrayList<>();

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public boolean isSpecifiek() {
		return specifiek;
	}

	public void setSpecifiek(boolean specifiek) {
		this.specifiek = specifiek;
	}

	public ResultaatstructuurCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(ResultaatstructuurCategorie categorie) {
		this.categorie = categorie;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public Onderwijsproduct getOnderwijsproduct() {
		return onderwijsproduct;
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct) {
		this.onderwijsproduct = onderwijsproduct;
	}

	public Medewerker getAuteur() {
		return auteur;
	}

	public void setAuteur(Medewerker auteur) {
		this.auteur = auteur;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Toets getEindresultaat() {
		return eindresultaat;
	}

	public void setEindresultaat(Toets eindresultaat) {
		this.eindresultaat = eindresultaat;
	}

	public List<Toets> getToetsen() {
		return toetsen;
	}

	public void setToetsen(List<Toets> toetsen) {
		this.toetsen = toetsen;
	}

	public List<DeelnemerResultaatVersie> getVersies() {
		return versies;
	}

	public void setVersies(List<DeelnemerResultaatVersie> versies) {
		this.versies = versies;
	}

	public List<ResultaatstructuurMedewerker> getMedewerkers() {
		return medewerkers;
	}

	public void setMedewerkers(List<ResultaatstructuurMedewerker> medewerkers) {
		this.medewerkers = medewerkers;
	}

	public List<ResultaatstructuurDeelnemer> getDeelnemers() {
		return deelnemers;
	}

	public void setDeelnemers(List<ResultaatstructuurDeelnemer> deelnemers) {
		this.deelnemers = deelnemers;
	}
}
