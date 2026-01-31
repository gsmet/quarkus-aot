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

import org.hibernate.annotations.Immutable;

import jakarta.persistence.Access;
import jakarta.persistence.AccessType;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Instelling;

/**
 * Class voor het mappen van views naar entiteiten. Een view kan bijvoorbeeld
 * geaggregeerde gegevens bevatten.
 * 
 */
@MappedSuperclass
@Immutable
public abstract class ViewEntiteit implements IOrganisatieEntiteit
{
	@Id
	@Access(AccessType.PROPERTY)
	private String id;

	/**
	 * De instelling waarbij deze entiteit hoort.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatie", nullable = false)
	private Instelling organisatie;

	public ViewEntiteit()
	{
	}

	public String getId()
	{
		return id;
	}

	public void setId(String id)
	{
		this.id = id;
	}

	@Override
	public Instelling getOrganisatie()
	{
		return organisatie;
	}

	/**
	 * <strong>Let op:</strong> Sets de INSTELLING
	 * 
	 * @param instelling
	 *            The instelling to set.
	 */
	public void setOrganisatie(Instelling instelling)
	{
		this.organisatie = instelling;
	}
}
