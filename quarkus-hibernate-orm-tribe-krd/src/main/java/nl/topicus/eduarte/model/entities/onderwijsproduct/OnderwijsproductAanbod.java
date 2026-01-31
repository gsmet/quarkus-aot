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
package nl.topicus.eduarte.model.entities.onderwijsproduct;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 * Koppeltabel tussen onderwijsproduct en organisatie-eenheid die aangeeft op welke
 * organisatie-eenheden een onderwijsproduct aangeboden wordt.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {
		"organisatieEenheid", "locatie", "onderwijsproduct"})})
public class OnderwijsproductAanbod extends InstellingEntiteit implements
IOrganisatieEenheidLocatieKoppelEntiteit<OnderwijsproductAanbod>
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "organisatieEenheid")
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "locatie")
	private Locatie locatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "onderwijsproduct")
	private Onderwijsproduct onderwijsproduct;

	public OnderwijsproductAanbod()
	{
	}

	public OnderwijsproductAanbod(OrganisatieEenheid organisatieEenheid,
			Onderwijsproduct onderwijsproduct)
	{
		setOrganisatieEenheid(organisatieEenheid);
		setOnderwijsproduct(onderwijsproduct);
	}

	public OnderwijsproductAanbod(Onderwijsproduct onderwijsproduct)
	{
		setOnderwijsproduct(onderwijsproduct);
	}

	@Override
	public OrganisatieEenheid getOrganisatieEenheid()
	{
		return organisatieEenheid;
	}

	@Override
	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid)
	{
		this.organisatieEenheid = organisatieEenheid;
	}

	public Onderwijsproduct getOnderwijsproduct()
	{
		return onderwijsproduct;
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct)
	{
		this.onderwijsproduct = onderwijsproduct;
	}

	@Override
	public Locatie getLocatie()
	{
		return locatie;
	}

	@Override
	public void setLocatie(Locatie locatie)
	{
		this.locatie = locatie;
	}

	@Override
	public Onderwijsproduct getEntiteit()
	{
		return getOnderwijsproduct();
	}

	public boolean isActief(Date peildatum)
	{
		return true;
	}
}
