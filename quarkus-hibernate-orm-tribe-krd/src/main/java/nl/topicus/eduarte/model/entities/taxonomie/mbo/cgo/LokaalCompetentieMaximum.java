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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

/**
 * Een {@link LokaalCompetentieMaximum} definieert een verzameling met
 * competentieniveaus, die als maximum zullen gelden voor alle beoordelingen bij
 * de opleiding waar het bij hoort. Bij het invullen van een competentiematrix
 * kan dus voor elke cel geen hogere waarde gekozen worden dan het
 * corresponderende maximum uit deze verzameling.
 *
 */
@Entity
public class LokaalCompetentieMaximum extends CompetentieNiveauVerzameling {
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private MeeteenheidKoppelType type;

	public MeeteenheidKoppelType getType() {
		return type;
	}

	public void setType(MeeteenheidKoppelType type) {
		this.type = type;
	}

	public String getTypeNaam() {
		return "Lokaal maximum";
	}
}
