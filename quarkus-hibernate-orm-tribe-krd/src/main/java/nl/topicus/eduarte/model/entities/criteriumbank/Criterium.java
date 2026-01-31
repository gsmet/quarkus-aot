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
package nl.topicus.eduarte.model.entities.criteriumbank;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.Verbintenisgebied;

/**
 * Een criterium is een regel uit de criteriumbank die bepaalt of een deelnemer voldoet
 * aan de eisen van zijn/haar opleiding. Een criterium kan zowel landelijk als lokaal
 * gedefinieerd worden. Een criterium bestaat uit een formule die een integer moet
 * opleveren. 0 betekent dat de regel niet met succes is voltooid, en alle andere waarden
 * geven aan dat de deelnemer wel voldoet aan de regel.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"opleiding",
		"verbintenisgebied", "cohort", "volgnummer"})})
public class Criterium extends LandelijkOfInstellingEntiteit
{
	/**
	 * Een criterium is gekoppeld aan of een opleiding (lokaal) of een verbintenisgebied
	 * (landelijk)
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "opleiding")
	private Opleiding opleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "verbintenisgebied")
	private Verbintenisgebied verbintenisgebied;

	/**
	 * Een criterium is altijd cohortspecifiek
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "cohort")
	private Cohort cohort;

	@Column(nullable = false)
	private int volgnummer;

	/**
	 * De naam van deze regel, zoals 'Alle cijfers moeten 4 of hoger zijn'
	 */
	@Column(nullable = false, length = 500)
	private String naam;

	/**
	 * De melding die gegeven moet worden als een deelnemer niet voldoet aan de regel,
	 * zoals 'De deelnemer heeft een cijfer die lager is dan 4'.
	 */
	@Column(nullable = false, length = 500)
	private String melding;

	/**
	 * De formule die geevalueerd moet worden.
	 */
	@Lob()
	@Basic(optional = false)
	private String formule;

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(Opleiding opleiding) {
		this.opleiding = opleiding;
	}

	public Verbintenisgebied getVerbintenisgebied() {
		return verbintenisgebied;
	}

	public void setVerbintenisgebied(Verbintenisgebied verbintenisgebied) {
		this.verbintenisgebied = verbintenisgebied;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getMelding() {
		return melding;
	}

	public void setMelding(String melding) {
		this.melding = melding;
	}

	public String getFormule() {
		return formule;
	}

	public void setFormule(String formule) {
		this.formule = formule;
	}
}
