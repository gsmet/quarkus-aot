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
package nl.topicus.eduarte.model.entities.participatie.settings;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import nl.topicus.eduarte.model.entities.settings.OrganisatieEenheidSetting;

/**
 * Houd per organisatie eenheid bij of absentie dan wel presentie wordt
 * bijgehouden in noise. Dit is puur een flag om de beste strategie te bepalen
 * bij het weergeven hiervan.
 *
 */
@Entity()
public class AbsentiePresentieSetting extends OrganisatieEenheidSetting<AbsentiePresentie> {
	@Column(name = "absentiePresentie", nullable = true)
	@Basic(optional = false)
	private AbsentiePresentie value;

	@Override
	public AbsentiePresentie getValue() {
		return value;
	}

	@Override
	public void setValue(AbsentiePresentie value) {
		this.value = value;

	}

	@Override
	public final String getOmschrijving() {
		return "Bijhouden van absentie / presentie";
	}
}
