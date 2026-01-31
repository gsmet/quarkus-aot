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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
	"organisatie"})})
public class SoortOnderwijsproduct extends CodeNaamActiefInstellingEntiteit
{
	/**
	 * Leiden onderwijsproducten van dit type tot een summatief resultaat?
	 */
	@Column(nullable = false)
	private boolean summatief = true;

	/**
	 * Is dit onderwijsproduct een BPV of Stage (e.g. kunnen er stages/bpv's gedaan worden
	 * voor dit onderwijsproduct)
	 */
	@Column(nullable = false)
	private boolean stage = false;

	public SoortOnderwijsproduct()
	{
	}

	public boolean isSummatief()
	{
		return summatief;
	}

	public void setSummatief(boolean summatief)
	{
		this.summatief = summatief;
	}

	public boolean isStage()
	{
		return stage;
	}

	public void setStage(boolean stage)
	{
		this.stage = stage;
	}
}
