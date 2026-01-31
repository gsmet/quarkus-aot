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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import nl.topicus.eduarte.model.entities.settings.OrganisatieSetting;

/**
 * Houd per organisatie bij wat de termijn is waarop deelnemers nog absentiemeldingen
 * kunnen aanmaken, nadat de afsrpaak geweest is
 * 
 */
@Entity()
public class DeelnemerportaalMeldingstermijnSetting extends OrganisatieSetting<Integer>
{
	@Column(name = "intValue", nullable = true)
	private Integer value;

	/**
	 * Hibernate constructor
	 */
	public DeelnemerportaalMeldingstermijnSetting()
	{
		setValue(0);
	}

	@Override
	public String getOmschrijving()
	{
		return "Meldingstermijnsetting";
	}

	@Override
	public Integer getValue()
	{
		return value;
	}

	@Override
	public void setValue(Integer meldingstermijn)
	{
		this.value = meldingstermijn;
		// voor de veiligheid
		if (meldingstermijn != null && meldingstermijn < 0)
			this.value = 0;
	}

}
