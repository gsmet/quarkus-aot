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
package nl.topicus.eduarte.model.entities.taxonomie;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.examen.ExamenWorkflowTaxonomie;

/**
 * Een specifieke taxonomie
 *
 */
@Entity()
public class Taxonomie extends TaxonomieElement {
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taxonomie")
	private List<TaxonomieElementType> taxonomieElementTypes = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taxonomie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
	private List<ExamenWorkflowTaxonomie> taxonomieExamenWorkflows;

	public List<TaxonomieElementType> getTaxonomieElementTypes() {
		return taxonomieElementTypes;
	}

	public void setTaxonomieElementTypes(List<TaxonomieElementType> taxonomieElementTypes) {
		this.taxonomieElementTypes = taxonomieElementTypes;
	}

	public List<ExamenWorkflowTaxonomie> getTaxonomieExamenWorkflows() {
		return taxonomieExamenWorkflows;
	}

	public void setTaxonomieExamenWorkflows(List<ExamenWorkflowTaxonomie> taxonomieExamenWorkflows) {
		this.taxonomieExamenWorkflows = taxonomieExamenWorkflows;
	}

	public boolean isMBO() {
		return false;
	}

	public boolean isVO() {
		return false;
	}

	public boolean isCGO() {
		return false;
	}
}
