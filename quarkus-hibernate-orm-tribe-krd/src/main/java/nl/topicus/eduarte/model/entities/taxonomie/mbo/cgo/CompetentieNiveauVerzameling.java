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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 *
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "CompetentieNiveauVerzameling")
public abstract class CompetentieNiveauVerzameling extends InstellingEntiteit {
	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date datum;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = true)
	private Deelnemer deelnemer;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "matrix", nullable = false)
	private CompetentieMatrix matrix;

	@OneToMany(mappedBy = "niveauVerzameling")
	protected List<CompetentieNiveau> competentieNiveaus = new ArrayList<>();

	@Column(length = 100, nullable = false)
	private String naam;

	@Lob
	@Column(nullable = true)
	private String commentaar;

	@ManyToOne
	@Basic(optional = false)
	@JoinColumn(name = "meeteenheid", nullable = false)
	private Meeteenheid meeteenheid;

	@ManyToOne(optional = true)
	@JoinColumn(name = "opleiding", nullable = true)
	private Opleiding opleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "cohort")
	private Cohort cohort;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public CompetentieMatrix getMatrix() {
		return matrix;
	}

	public void setMatrix(CompetentieMatrix matrix) {
		this.matrix = matrix;
	}

	public List<CompetentieNiveau> getCompetentieNiveaus() {
		return competentieNiveaus;
	}

	public void setCompetentieNiveaus(List<CompetentieNiveau> competentieNiveaus) {
		this.competentieNiveaus = competentieNiveaus;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getCommentaar() {
		return commentaar;
	}

	public void setCommentaar(String commentaar) {
		this.commentaar = commentaar;
	}

	public Meeteenheid getMeeteenheid() {
		return meeteenheid;
	}

	public void setMeeteenheid(Meeteenheid meeteenheid) {
		this.meeteenheid = meeteenheid;
	}

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(Opleiding opleiding) {
		this.opleiding = opleiding;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}
}
