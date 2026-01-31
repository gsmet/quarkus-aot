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

import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;

/**
 * Houd per organisatie bij wat de wachtwoordsterkte is. Dus of er een bepaalde
 * lengte verplicht is, leestekens, hoofd en kleineletters etc.
 *
 */
@Entity()
public class PasswordSetting extends OrganisatieSetting<PasswordConfiguration> {
	@Embedded
	private PasswordConfiguration value;

	public PasswordSetting() {
		value = new PasswordConfiguration();
	}

	@Override
	public String getOmschrijving() {
		return "Extra wachtwoord eisen";
	}

	@Override
	public PasswordConfiguration getValue() {
		return value;
	}

	@Override
	public void setValue(PasswordConfiguration value) {
		this.value = value;
	}
}
