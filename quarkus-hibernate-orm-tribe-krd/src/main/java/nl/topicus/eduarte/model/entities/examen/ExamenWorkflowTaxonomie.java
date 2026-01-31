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

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.Taxonomie;

/**
 * Koppeltabel tussen examenworkflow en taxonomie. Hiermee wordt aangegeven
 * welke workflow geldt voor welke taxonomie.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@jakarta.persistence.Table(name = "ExamenWorkflowTax")
public class ExamenWorkflowTaxonomie extends LandelijkOfInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "examenWorkflow")
	private ExamenWorkflow examenWorkflow;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "taxonomie")
	private Taxonomie taxonomie;

	public ExamenWorkflow getExamenWorkflow() {
		return examenWorkflow;
	}

	public void setExamenWorkflow(ExamenWorkflow examenWorkflow) {
		this.examenWorkflow = examenWorkflow;
	}

	public Taxonomie getTaxonomie() {
		return taxonomie;
	}

	public void setTaxonomie(Taxonomie taxonomie) {
		this.taxonomie = taxonomie;
	}
}
