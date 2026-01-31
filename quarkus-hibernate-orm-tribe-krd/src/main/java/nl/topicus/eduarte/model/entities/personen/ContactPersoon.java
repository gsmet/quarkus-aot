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
package nl.topicus.eduarte.model.entities.personen;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ContactPersoon extends BeginEinddatumInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voorOrganisatieEenheid", nullable = true)
	private OrganisatieEenheid voorOrganisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = false)
	private Persoon persoon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bijOrganisatieEenheid", nullable = true)
	private OrganisatieEenheid bijOrganisatieEenheid;

	/**
	 * Default constructor voor Hibernate.
	 */
	public ContactPersoon() {
	}

	/**
	 * @return Returns the voorOrganisatieEenheid.
	 */
	public OrganisatieEenheid getVoorOrganisatieEenheid() {
		return voorOrganisatieEenheid;
	}

	/**
	 * @param voorOrganisatieEenheid The voorOrganisatieEenheid to set.
	 */
	public void setVoorOrganisatieEenheid(OrganisatieEenheid voorOrganisatieEenheid) {
		this.voorOrganisatieEenheid = voorOrganisatieEenheid;
	}

	/**
	 * @return Returns the persoon.
	 */
	public Persoon getPersoon() {
		return persoon;
	}

	/**
	 * @param persoon The persoon to set.
	 */
	public void setPersoon(Persoon persoon) {
		this.persoon = persoon;
	}

	/**
	 * @return Returns the bijOrganisatieEenheid.
	 */
	public OrganisatieEenheid getBijOrganisatieEenheid() {
		return bijOrganisatieEenheid;
	}

	/**
	 * @param bijOrganisatieEenheid The bijOrganisatieEenheid to set.
	 */
	public void setBijOrganisatieEenheid(OrganisatieEenheid bijOrganisatieEenheid) {
		this.bijOrganisatieEenheid = bijOrganisatieEenheid;
	}

}
