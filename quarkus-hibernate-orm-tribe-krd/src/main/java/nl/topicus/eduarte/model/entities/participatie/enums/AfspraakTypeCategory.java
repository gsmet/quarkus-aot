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

import java.awt.Color;

/**
 * Categorisering van afspraaktypes zodat het systeem default gedrag kan toekennen aan
 * afspraaktypes.
 * 
 */
public enum AfspraakTypeCategory
{

	/**
	 * Individuele afspraken aangemaakt door de medewerker zelf.
	 */
	INDIVIDUEEL(Color.PINK, "Individueel"),
	/**
	 * Afspraken die afkomstig zijn uit het rooster.
	 */
	ROOSTER(Color.GREEN, "Rooster"),
	/**
	 * Priveafspraken
	 */
	PRIVE(Color.BLUE, "Prive"),
	/**
	 * Priveafspraken
	 */
	BESCHERMD(Color.YELLOW.darker(), "Beschermd"),
	/**
	 * Afspraken die uit externe agenda's worden opgehaald.
	 */
	EXTERN(Color.RED, "Externe agenda");

	private Color standaardKleur;

	private String naam;

	AfspraakTypeCategory(Color standaardKleur, String naam)
	{
		this.standaardKleur = standaardKleur;
		this.naam = naam;
	}

	public Color getStandaardKleur()
	{
		return standaardKleur;
	}

	public String getNaam()
	{
		return naam;
	}

	@Override
	public String toString()
	{
		return naam;
	}
}
