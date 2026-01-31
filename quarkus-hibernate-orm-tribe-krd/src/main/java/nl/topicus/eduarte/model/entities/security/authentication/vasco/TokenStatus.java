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
package nl.topicus.eduarte.model.entities.security.authentication.vasco;

/**
 * De status van een authenticatie token.
 *
 * Met behulp van beheerfunctionaliteit op landelijk niveau kan worden aangegeven welke
 * tokens uitgegeven zijn aan welke instelling. Naast het uitgeven van tokens moet het ook
 * mogelijk zijn om deze weer in te trekken. Een token moet ook kunnen worden geblokkeerd
 * als een gebruiker te vaak verkeerde passwords heeft ingevoerd en tenslotte kan een
 * token ook defect raken.
 *
 * In totaal zijn er landelijk vier statussen mogelijk met betrekking tot een token:
 * <ul>
 * <li>beschikbaar</li>
 * <li>uitgegeven</li>
 * <li>geblokkeerd of</li>
 * <li>defect</li>
 * </ul>
 * 
 */
public enum TokenStatus
{
	Beschikbaar,
	Uitgegeven,
	Geblokkeerd,
	Defect;

	@Override
	public String toString()
	{
		return name().toLowerCase();
	}
}
