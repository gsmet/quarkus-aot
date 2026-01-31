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
package nl.topicus.eduarte.model.entities.examen;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Status van een examendeelname. Voor VO/VAVO en MBO/CGO zijn er landelijke statussen
 * gedefinieerd. Voor andere taxonomien kunnen er lokale statussen gedefinieerd worden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
public class Examenstatus extends LandelijkOfInstellingEntiteit
{
	@Column(nullable = false)
	private int volgnummer;

	@Column(nullable = false, length = 50)
	private String naam;

	/**
	 * Per examenworkflow moet er precies 1 beginstatus gedefinieerd worden.
	 */
	@Column(nullable = false)
	private boolean beginstatus;

	/**
	 * Per examenworkflow kunnen meerdere examenstatussen als eindstatus aangemerkt
	 * worden. Een eindstatus geeft aan dat de examendeelname hiermee in principe
	 * beeindigd is, en dat een nieuwe examendeelname aangemaakt mag worden voor het
	 * verbintenis.
	 */
	@Column(nullable = false)
	private boolean eindstatus;

	/**
	 * Deze status geeft aan dat de deelnemer voor dit examenonderdeel geslaagd is.
	 * Hiermee kan namelijk in de software geredeneerd worden over de examendeelnames,
	 * bijvoorbeeld of een examendeelname naar BRON toe moet of niet. Is niet specifiek
	 * voor &eacute;&eacute;n examendeelname, maar voor deze status (die gebruikt wordt
	 * bij meerdere deelnames).
	 */
	@Column(nullable = false)
	private boolean geslaagd;

	/**
	 * Boolean die aangeeft of een criteriumbankcontrole verplicht is om deze status te
	 * bereiken. Bij statusovergangen die deze status als naarstatus hebben moet een
	 * criteriumbankcontrole uitgevoerd worden.
	 */
	@Column(nullable = false)
	private boolean criteriumbankControle;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "examenWorkflow", nullable = false)
	private ExamenWorkflow examenWorkflow;

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

	public boolean isBeginstatus() {
		return beginstatus;
	}

	public void setBeginstatus(boolean beginstatus) {
		this.beginstatus = beginstatus;
	}

	public boolean isEindstatus() {
		return eindstatus;
	}

	public void setEindstatus(boolean eindstatus) {
		this.eindstatus = eindstatus;
	}

	public boolean isGeslaagd() {
		return geslaagd;
	}

	public void setGeslaagd(boolean geslaagd) {
		this.geslaagd = geslaagd;
	}

	public boolean isCriteriumbankControle() {
		return criteriumbankControle;
	}

	public void setCriteriumbankControle(boolean criteriumbankControle) {
		this.criteriumbankControle = criteriumbankControle;
	}

	public ExamenWorkflow getExamenWorkflow() {
		return examenWorkflow;
	}

	public void setExamenWorkflow(ExamenWorkflow examenWorkflow) {
		this.examenWorkflow = examenWorkflow;
	}
}
