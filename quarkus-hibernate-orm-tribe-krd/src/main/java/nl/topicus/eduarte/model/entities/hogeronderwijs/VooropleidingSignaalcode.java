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
package nl.topicus.eduarte.model.entities.hogeronderwijs;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.inschrijving.Vooropleiding;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class VooropleidingSignaalcode extends InstellingEntiteit
{
	public enum Signaalcode implements KeyValue
	{
		BrinNrOnglk("401", "Brin-nummer school vooropleiding niet gelijk"),
		DatumDimplomaOnglk("402", "Maand of dag diploma behaald niet gelijk");

		private String key;

		private String value;

		@Override
		public String getKey()
		{
			return key;
		}

		@Override
		public String getValue()
		{
			return value;
		}

		private Signaalcode(String key, String value)
		{
			this.key = key;
			this.value = value;
		}
	}

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private Signaalcode signaalcode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vooropleiding")
	private Vooropleiding vooropleiding;

	public Signaalcode getSignaalcode()
	{
		return signaalcode;
	}

	public void setSignaalcode(Signaalcode signaalcode)
	{
		this.signaalcode = signaalcode;
	}

	public Vooropleiding getVooropleiding()
	{
		return vooropleiding;
	}

	public void setVooropleiding(Vooropleiding vooropleiding)
	{
		this.vooropleiding = vooropleiding;
	}
}
