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
import nl.topicus.eduarte.model.iris.IrisLocatie;

/**
 * Koppeltabel tussen IrisIncident en IrisLocatie
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class IrisIncidentLocatie extends Entiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "incident")
	private IrisIncident incident;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private IrisLocatie locatie;

	public void setLocatie(IrisLocatie locatie)
	{
		this.locatie = locatie;
	}

	public IrisLocatie getLocatie()
	{
		return locatie;
	}

	public void setIncident(IrisIncident incident)
	{
		this.incident = incident;
	}

	public IrisIncident getIncident()
	{
		return incident;
	}
}
