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

import java.util.Date;
import java.util.List;

import nl.topicus.eduarte.model.entities.organisatie.Instelling;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 * <P>
 * Generieke facade voor het kunnen werken met adresseerbare entiteiten, zoals
 * {@link Persoon}, {@link Instelling} en {@link Locatie}.
 * </P>
 * <P>
 * Alle implementerende classes hebben een lijst van fysieke adressen en post adressen, er
 * zijn altijd evenveel fysieke adressen als post adressen. een controle op de size van
 * een van de 2 lijsten is voldoende om te weten of er adressen zijn.
 * </P>
 * 
 * @param <T>
 *            de specifieke koppeling entiteit tussen de adresseerbare en het adres.
 */
public interface Adresseerbaar<T extends AdresEntiteit<T>> 
{
	public List<T> getAdressen();

	public void setAdressen(List<T> adressen);

	/**
	 * @return de lijst van fysiekadressen van de adresseerbare.
	 */
	public List<T> getFysiekAdressen();

	/**
	 * @return de lijst van postadressen van de adresseerbare.
	 */
	public List<T> getPostAdressen();

	/**
	 * @return de lijst van factuuradressen van de adresseerbare.
	 */
	public List<T> getFactuurAdressen();

	/**
	 * @return de lijst van alle soort adressen van de adresseerbare op de gezette
	 *         peildatum
	 */
	public List<T> getAdressenOpPeildatum();

	/**
	 * @return de lijst van fysiekadressen van de adresseerbare op de gezette peildatum
	 */
	public List<T> getFysiekAdressenOpPeildatum();

	/**
	 * @return de lijst van postadressen van de adresseerbare op de gezette peildatum
	 */
	public List<T> getPostAdressenOpPeildatum();

	/**
	 * @return de lijst van factuuradressen van de adresseerbare op de gezette peildatum
	 */
	public List<T> getFactuurAdressenOpPeildatum();

	/**
	 * @return een nieuwe instantie van het adres object, welke reeds gelinked is aan dit
	 *         entiteit, reeds een {@link Adres} heeft, een begindatum heeft (vandaag) en
	 *         toegevoegd is aan de juiste lijst van dit entiteit.
	 */
	public T newAdres();

	/**
	 * @return het fysieke adres (woon- of bezoekadres) op de peildatum.
	 */
	public T getFysiekAdres();

	/**
	 * @return het fysieke adres (woon- of bezoekadres) op de gegeven peildatum.
	 */
	public T getFysiekAdres(Date peildatum);

	/**
	 * @return het postadres op de peildatum.
	 */
	public T getPostAdres();

	/**
	 * @return het postadres op de gegeven peildatum.
	 */
	public T getPostAdres(Date peildatum);

	/**
	 * @return het factuuradres op de peildatum.
	 */
	public T getFactuurAdres();

	/**
	 * @return het factuuradres op de gegeven peildatum.
	 */
	public T getFactuurAdres(Date peildatum);

	public String getFysiekAdresOmschrijving();

	public String getPostAdresOmschrijving();

	public String getFactuurAdresOmschrijving();
}
