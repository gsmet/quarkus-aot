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
package nl.topicus.eduarte.model.entities.settings;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

/**
 * Manieren van aanmelden voor digitaal aanmelden, afhankelijk van de setting
 * kan een groep opleiding gekozen worden, of er kan niet aangemeld worden bij
 * die organisatie-eenheid
 *
 */
@Entity()
public class ManierVanAanmeldenSetting extends OrganisatieEenheidSetting<ManierVanAanmelden> {
	@Column(name = "ManierVanAanmelden", nullable = true)
	@Basic(optional = false)
	@Enumerated(EnumType.STRING)
	private ManierVanAanmelden value;

	@Override
	public ManierVanAanmelden getValue() {
		return value;
	}

	@Override
	public void setValue(ManierVanAanmelden value) {
		this.value = value;

	}

	@Override
	public final String getOmschrijving() {
		return "Manier van aanmelden";
	}
}
