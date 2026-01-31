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
package nl.topicus.eduarte.model.entities.signalering.settings;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 * Koppeltabel waarmee een medewerker zelf relaties aan kan leggen met groepen waarvoor
 * hij/zij signalen wenst te ontvangen.
 * 
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class MedewerkerGroepAbonnering extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = false)
	private Medewerker medewerker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groep", nullable = false)
	private Groep groep;

	public MedewerkerGroepAbonnering()
	{
	}

	public Medewerker getMedewerker()
	{
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker)
	{
		this.medewerker = medewerker;
	}

	public Groep getGroep()
	{
		return groep;
	}

	public void setGroep(Groep groep)
	{
		this.groep = groep;
	}
}
