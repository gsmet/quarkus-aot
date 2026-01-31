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

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Groepering van Examenstatus-objecten en toegestane statusovergangen die voor een lijst
 * van taxonomien de examenworkflow beschrijven. Landelijk zijn er twee examenworkflows
 * gedefinieerd: Voor VO/VAVO en voor MBO/CGO.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
public class ExamenWorkflow extends LandelijkOfInstellingEntiteit
{
	@Column(nullable = false, length = 30)
	private String naam;

	@Column(nullable = false)
	private boolean heeftTijdvakken;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examenWorkflow")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
	private List<Examenstatus> examenstatussen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examenWorkflow")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
	private List<ToegestaneExamenstatusOvergang> toegestaneExamenstatusOvergangen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examenWorkflow")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
	private List<ExamenWorkflowTaxonomie> examenWorflowTaxonomieen;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public boolean isHeeftTijdvakken() {
		return heeftTijdvakken;
	}

	public void setHeeftTijdvakken(boolean heeftTijdvakken) {
		this.heeftTijdvakken = heeftTijdvakken;
	}

	public List<Examenstatus> getExamenstatussen() {
		return examenstatussen;
	}

	public void setExamenstatussen(List<Examenstatus> examenstatussen) {
		this.examenstatussen = examenstatussen;
	}

	public List<ToegestaneExamenstatusOvergang> getToegestaneExamenstatusOvergangen() {
		return toegestaneExamenstatusOvergangen;
	}

	public void setToegestaneExamenstatusOvergangen(List<ToegestaneExamenstatusOvergang> toegestaneExamenstatusOvergangen) {
		this.toegestaneExamenstatusOvergangen = toegestaneExamenstatusOvergangen;
	}

	public List<ExamenWorkflowTaxonomie> getExamenWorflowTaxonomieen() {
		return examenWorflowTaxonomieen;
	}

	public void setExamenWorflowTaxonomieen(List<ExamenWorkflowTaxonomie> examenWorflowTaxonomieen) {
		this.examenWorflowTaxonomieen = examenWorflowTaxonomieen;
	}
}
