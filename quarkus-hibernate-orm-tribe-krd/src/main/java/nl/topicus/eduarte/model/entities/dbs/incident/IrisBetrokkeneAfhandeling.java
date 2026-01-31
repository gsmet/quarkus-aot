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
package nl.topicus.eduarte.model.entities.dbs.incident;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.Entiteit;
import nl.topicus.eduarte.model.iris.IrisAfhandeling;

/**
 * Koppeltabel tussen IrisBetrokkene en IrisAfhandeling
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class IrisBetrokkeneAfhandeling extends Entiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "betrokkene")
	private IrisBetrokkene betrokkene;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private IrisAfhandeling afhandeling;

	public void setBetrokkene(IrisBetrokkene betrokkene)
	{
		this.betrokkene = betrokkene;
	}

	public IrisBetrokkene getBetrokkene()
	{
		return betrokkene;
	}

	public void setAfhandeling(IrisAfhandeling afhandeling)
	{
		this.afhandeling = afhandeling;
	}

	public IrisAfhandeling getAfhandeling()
	{
		return afhandeling;
	}
}
