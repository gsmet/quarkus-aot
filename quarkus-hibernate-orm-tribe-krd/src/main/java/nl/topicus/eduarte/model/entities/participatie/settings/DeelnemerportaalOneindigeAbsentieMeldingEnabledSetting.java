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
import nl.topicus.eduarte.model.entities.settings.OrganisatieSetting;

/**
 * Setting om per organisatie de OneindigeAbsentieMeldingen toe te staan.
 * 
 */
@Entity(name = "DpOneindigeMeldingSetting")
public class DeelnemerportaalOneindigeAbsentieMeldingEnabledSetting extends
		OrganisatieSetting<Boolean>
{
	@Basic(optional = false)
	@Column(name = "booleanValue", nullable = true)
	private Boolean value = false;

	/**
	 * 
	 */
	public DeelnemerportaalOneindigeAbsentieMeldingEnabledSetting()
	{
	}

	@Override
	public String getOmschrijving()
	{
		return "Sta voor deelnemers oneindige absentiemeldingen toe";
	}

	@Override
	public Boolean getValue()
	{
		return value;
	}

	@Override
	public void setValue(Boolean value)
	{
		this.value = value;
	}

}
