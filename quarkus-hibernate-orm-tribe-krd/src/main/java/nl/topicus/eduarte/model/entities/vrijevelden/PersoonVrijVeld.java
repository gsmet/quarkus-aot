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
package nl.topicus.eduarte.model.entities.vrijevelden;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 */
@Entity()
public class PersoonVrijVeld extends VrijVeldEntiteit
{
	/**
	 * Lazy omdat lijst met telefoonnummers vanuit de persoon wordt opgevraagd, oftewel de
	 * persoon zal in het algemeen al aanwezig zijn in de 1st of 2nd level cache.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = true)
	private Persoon persoon;

	public PersoonVrijVeld()
	{
	}

	/**
	 * @return Returns the persoon.
	 */
	public Persoon getPersoon()
	{
		return persoon;
	}

	/**
	 * @param persoon
	 *            The persoon to set.
	 */
	public void setPersoon(Persoon persoon)
	{
		this.persoon = persoon;
	}

	@Override
	public VrijVeldable< ? extends VrijVeldEntiteit> getEntiteit()
	{
		return getPersoon();
	}

	@Override
	public void setEntiteit(VrijVeldable< ? extends VrijVeldEntiteit> entiteit)
	{
		setPersoon((Persoon) entiteit);
	}
}
