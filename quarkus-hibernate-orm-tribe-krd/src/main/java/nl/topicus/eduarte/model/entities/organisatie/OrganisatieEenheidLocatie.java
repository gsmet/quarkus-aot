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
package nl.topicus.eduarte.model.entities.organisatie;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

/**
 * Een organisatie-eenheid-locatie.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
@BatchSize(size = 100)
@IsViewWhenOnNoise
public class OrganisatieEenheidLocatie extends BeginEinddatumInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = false)
	private Locatie locatie;

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}
}
