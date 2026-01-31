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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 * Koppeltabel tussen organisatie-eenheid, locatie en ToetsCodeFilter. Wordt
 * gebruikt om te bepalen bij welke organisatie-eenheden en locaties een
 * ToetsCodeFilter hoort.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "ToetsCodeFilterOrgEhdLoc")
public class ToetsCodeFilterOrganisatieEenheidLocatie extends InstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelEntiteit<ToetsCodeFilterOrganisatieEenheidLocatie> {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = false)
	private Locatie locatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "toetsCodeFilter")
	private ToetsCodeFilter toetsCodeFilter;

	public ToetsCodeFilterOrganisatieEenheidLocatie() {
	}

	public ToetsCodeFilterOrganisatieEenheidLocatie(OrganisatieEenheid organisatieEenheid, Locatie locatie) {
		setOrganisatieEenheid(organisatieEenheid);
		setLocatie(locatie);
	}

	public ToetsCodeFilterOrganisatieEenheidLocatie(ToetsCodeFilter filter) {
		setToetsCodeFilter(filter);
	}

	@Override
	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	@Override
	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	@Override
	public Locatie getLocatie() {
		return locatie;
	}

	@Override
	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public void setToetsCodeFilter(ToetsCodeFilter toetsCodeFilter) {
		this.toetsCodeFilter = toetsCodeFilter;
	}

	public ToetsCodeFilter getToetsCodeFilter() {
		return toetsCodeFilter;
	}

	@Override
	public ToetsCodeFilter getEntiteit() {
		return getToetsCodeFilter();
	}

	public boolean isActief(Date peildatum) {
		return true;
	}
}
