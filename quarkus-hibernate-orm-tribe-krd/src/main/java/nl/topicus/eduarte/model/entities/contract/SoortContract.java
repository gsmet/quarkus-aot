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
package nl.topicus.eduarte.model.entities.contract;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
"organisatie"})})
public class SoortContract extends CodeNaamActiefInstellingEntiteit implements
Comparable<SoortContract>
{
	@Column(nullable = true)
	@Comment("Geeft aan of contracten van deze soort inburgeringscontracten zijn. Inburgeringscontracten hebben extra velden t.b.v. het Kermerk Inburgeren.")
	private Boolean inburgering = false;

	public SoortContract()
	{
	}

	@Override
	public String toString()
	{
		return getNaam();
	}

	@Override
	public int compareTo(SoortContract o)
	{
		return getCode().compareTo(o.getCode());
	}

	public void setInburgering(Boolean inburgering)
	{
		this.inburgering = inburgering;
	}

	public Boolean getInburgering()
	{
		return inburgering;
	}
}
