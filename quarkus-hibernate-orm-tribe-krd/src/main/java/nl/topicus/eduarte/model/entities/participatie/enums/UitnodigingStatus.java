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

/**
 * Status van een uitnodiging bij een afspraak.
 * 
 */
public enum UitnodigingStatus
{
	/**
	 * Participant is direct geplaatst.
	 */
	DIRECTE_PLAATSING("Direct geplaatst", true),
	/**
	 * Participant is uitgenodigd
	 */
	UITGENODIGD("Uitgenodigd", false),
	/**
	 * Participant heeft de uitnodiging geaccepteerd
	 */
	GEACCEPTEERD("Uitnodiging geaccepteerd", true),
	/**
	 * Participant heeft de uitnodiging geweigerd.
	 */
	GEWEIGERD("Uitnodiging geweigerd", false),
	/**
	 * Participant heeft zich ingeschreven voor een inloopcollege.
	 */
	INGETEKEND("Ingetekend voor het college", true);

	private String naam;

	/**
	 * Geeft aan of aanwezigheidsregistratie mogelijk is bij deze status.
	 */
	private boolean aanwezigheidsregistratieMogelijk;

	/**
	 * Constructor
	 * 
	 * @param naam
	 */
	UitnodigingStatus(String naam, boolean aanwezigheidsregistratieMogelijk)
	{
		this.naam = naam;
		this.aanwezigheidsregistratieMogelijk = aanwezigheidsregistratieMogelijk;
	}

	@Override
	public String toString()
	{
		return naam;
	}

	/**
	 * @return Returns the aanwezigheidsregistratieMogelijk.
	 */
	public boolean isAanwezigheidsregistratieMogelijk()
	{
		return aanwezigheidsregistratieMogelijk;
	}
}
