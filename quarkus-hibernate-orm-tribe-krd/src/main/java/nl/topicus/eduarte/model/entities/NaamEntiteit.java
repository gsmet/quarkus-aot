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

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

/**
 * Entiteit met een naam. B.V. een organisatie of een groep. Het is niet de bedoeling dat
 * deze class misbruikt wordt voor b.v. leerlingen die een vornaam dan wel achternaam op
 * dit veld mappen.
 * 
 */
@MappedSuperclass()
public abstract class NaamEntiteit extends LandelijkEntiteit
{
	@Column(nullable = false, length = 100)
	private String naam;

	public NaamEntiteit()
	{
	}

	public NaamEntiteit(String naam)
	{
		setNaam(naam);
	}

	public String getNaam()
	{
		return naam;
	}

	public void setNaam(String naam)
	{
		this.naam = naam;
	}

	@Override
	public String toString()
	{
		return getNaam();
	}
}
