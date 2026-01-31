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
package nl.topicus.eduarte.model.entities.adres;

/**
 * Enum om aan te geven waar men het Contactgegeven standaard moet tonen op edit pages.
 * Voor deze contactgegevens wordt al direct een leeg veld aangemaakt, zodat je hem niet
 * met de hand hoeft toe te voegen.
 * 
 */
public enum StandaardContactgegeven
{
	StandaardTonenBijPersoon("Standaard tonen bij personen"),
	StandaardTonenBijOrganisatie("Standaard tonen bij organisaties"),
	StandaardTonen("Overal standaard tonen");

	private String label = "";

	private StandaardContactgegeven(String label)
	{
		this.label = label;
	}

	@Override
	public String toString()
	{
		return label;
	}
}
