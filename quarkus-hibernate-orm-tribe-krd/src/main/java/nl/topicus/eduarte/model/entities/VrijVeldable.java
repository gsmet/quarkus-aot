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
package nl.topicus.eduarte.model.entities;

import java.util.List;

import nl.topicus.eduarte.model.entities.organisatie.Instelling;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.personen.Persoon;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldEntiteit;

/**
 * Generieke facade voor het kunnen werken met vrijveldable entiteiten, zoals
 * {@link Persoon}, {@link Instelling} en {@link Locatie}.
 * 
 *         het vrijveld.
 */
public interface VrijVeldable<T extends VrijVeldEntiteit>
{
	/**
	 * @return de lijst van vrije velden van de vrijveldable.
	 */
	public List<T> getVrijVelden();

	/**
	 * @param vrijvelden
	 *            de lijst van vrije velden van de vrijveldable.
	 */
	public void setVrijVelden(List<T> vrijvelden);

	/**
	 * @return een nieuwe instantie van het VrijeVeld object.
	 */
	public T newVrijVeld();

	/**
	 * @param categorie
	 * @return alle vrije velden van deze vrijveldable van de gegeven categorie.
	 */
	public List<T> getVrijVelden(VrijVeldCategorie categorie);

	public String getVrijVeldWaarde(String naam);
}
