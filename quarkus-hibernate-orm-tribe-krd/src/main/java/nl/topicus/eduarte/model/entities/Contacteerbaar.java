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

import nl.topicus.eduarte.model.entities.adres.SoortContactgegeven;
import nl.topicus.eduarte.model.entities.organisatie.Instelling;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 * Generieke facade voor het kunnen werken met contacteerbare entiteiten, zoals
 * {@link Persoon}, {@link Instelling} en {@link Locatie}.
 * 
 * @param <T>
 *            de specifieke koppeling entiteit tussen de contacteerbare en het
 *            contactgegeven.
 */
public interface Contacteerbaar<T extends IContactgegevenEntiteit>
{
	/**
	 * @return de lijst van contactgegevens van de contacteerbare.
	 */
	public List<T> getContactgegevens();

	/**
	 * @param contactgegevens
	 *            de lijst van contactgegevens van de contacteerbare.
	 */
	public void setContactgegevens(List<T> contactgegevens);

	/**
	 * @return een nieuwe instantie van het contactgegeven object.
	 */
	public T newContactgegeven();

	public List<T> getContactgegevens(SoortContactgegeven soort);

	public T getEersteEmailAdres();

	public T getEersteHomepage();

	public T getEersteMobieltelefoon();

	public T getEersteOverig();

	public T getEersteTelefoon();
}
