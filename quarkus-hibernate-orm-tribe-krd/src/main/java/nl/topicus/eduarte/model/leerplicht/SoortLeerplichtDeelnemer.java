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
package nl.topicus.eduarte.model.leerplicht;

public enum SoortLeerplichtDeelnemer {
	LEERPLICHTIG("Leerplichtigen"),
	KWALIFICATIE_PLICHTIG("Kwalificatieplichtigen"),
	VSV("Doorstroompunt verzuim 18+"),
	WTOS_WSF("WTOS / WSF2000"),
	VANAF_23_JAAR("23 jaar of ouder");

	private String naam;

	private SoortLeerplichtDeelnemer(String naam)
	{
		this.naam = naam;
	}

	@Override
	public String toString()
	{
		return naam;
	}
}
