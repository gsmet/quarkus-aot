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
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 * Koppeltabel tussen organisatie-eenheid, locatie en medewerker. Wordt gebruikt
 * om te bepalen bij welke organisatie-eenheden en locaties een medewerker (en
 * dus account) hoort.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "OrganisatieMedewerker", uniqueConstraints = @UniqueConstraint(columnNames = {
		"organisatieEenheid", "locatie", "medewerker" }))
@IsViewWhenOnNoise
public class OrganisatieMedewerker extends BeginEinddatumInstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelEntiteit<OrganisatieMedewerker> {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker")
	private Medewerker medewerker;

	public OrganisatieMedewerker() {
	}

	public OrganisatieMedewerker(Medewerker medewerker) {
		setMedewerker(medewerker);
	}

	public OrganisatieMedewerker(OrganisatieEenheid organisatieEenheid, Locatie locatie) {
		setOrganisatieEenheid(organisatieEenheid);
		setLocatie(locatie);
	}

	@Override
	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	@Override
	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;

	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	@Override
	public Locatie getLocatie() {
		return locatie;
	}

	@Override
	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	@Override
	public Medewerker getEntiteit() {
		return getMedewerker();
	}
}
