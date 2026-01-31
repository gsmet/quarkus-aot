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

import java.util.List;
import java.util.Map;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 */
@Entity
public class IJkpunt extends CompetentieNiveauVerzameling {
	@OneToMany(mappedBy = "ijkpunt", cascade = jakarta.persistence.CascadeType.REMOVE)
	@Cascade({ CascadeType.REMOVE })
	private List<RapportageTemplateIJkpunt> rapportageTemplates;

	public String getTypeNaam() {
		return "IJkpunt" + (getDeelnemer() == null ? "" : " (individueel)");
	}

	public List<RapportageTemplateIJkpunt> getRapportageTemplates() {
		return rapportageTemplates;
	}

	public void setRapportageTemplates(List<RapportageTemplateIJkpunt> rapportageTemplates) {
		this.rapportageTemplates = rapportageTemplates;
	}

	public boolean isBereikt(Map<Leerpunt, CompetentieNiveau> beoordelingMap) {
		return true;
	}
}
