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
package nl.topicus.eduarte.model.entities.participatie.enums;

public enum StandaardUitnodigingenVersturen
{
	NIET("Niet", false, false),
	HANDMATIGE_AFSPRAKEN("Alleen bij handmatig gemaakte afspraken", true, false),
	AUTOMATISCH_AFSPRAKEN("Alleen bij automatisch gemaakte afspraken", false, true),
	ALLE("Bij alle afspraken", true, true);

	private String naam;

	private boolean handmatig;

	private boolean automatisch;

	StandaardUitnodigingenVersturen(String naam, boolean handmatig, boolean automatisch)
	{
		this.naam = naam;
		this.handmatig = handmatig;
		this.automatisch = automatisch;
	}

	public String getNaam()
	{
		return naam;
	}

	public boolean isHandmatig()
	{
		return handmatig;
	}

	public boolean isAutomatisch()
	{
		return automatisch;
	}

	public boolean isEnabled(boolean handmatigeAfspraak)
	{
		return handmatigeAfspraak ? isHandmatig() : isAutomatisch();
	}

	@Override
	public String toString()
	{
		return naam;
	}

}
