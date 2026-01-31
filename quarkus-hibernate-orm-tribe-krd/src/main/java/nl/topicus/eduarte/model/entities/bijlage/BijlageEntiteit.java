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
package nl.topicus.eduarte.model.entities.bijlage;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

/**
 * Entiteit welke een enkel bijlage bevat.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "BijlageEntiteit")
public abstract class BijlageEntiteit extends BeginEinddatumInstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "bijlage")
	private Bijlage bijlage;

	public BijlageEntiteit()
	{
	}

	public Bijlage getBijlage()
	{
		return bijlage;
	}

	public void setBijlage(Bijlage bijlage)
	{
		this.bijlage = bijlage;
	}

	public abstract IBijlageKoppelEntiteit< ? extends BijlageEntiteit> getEntiteit();
}
