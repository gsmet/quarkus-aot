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
package nl.topicus.eduarte.model.entities.dbs.bijzonderheden;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefLandelijkOfInstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
"organisatie"})})
public class BijzonderheidCategorie extends CodeNaamActiefLandelijkOfInstellingEntiteit
{
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bijzonderheidCategorie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ToegestaanHulpmiddel> toegestaneHulpmiddelen =
	new ArrayList<>();

	public BijzonderheidCategorie()
	{
	}

	public List<ToegestaanHulpmiddel> getToegestaneHulpmiddelen()
	{
		return toegestaneHulpmiddelen;
	}

	public void setToegestaneHulpmiddelen(List<ToegestaanHulpmiddel> toegestaneHulpmiddelen)
	{
		this.toegestaneHulpmiddelen = toegestaneHulpmiddelen;
	}

	@Override
	public String toString()
	{
		return getCode() + " - " + getNaam();
	}

	public boolean isHulpmiddelToegestaan(Hulpmiddel hulpmiddel)
	{
		for (ToegestaanHulpmiddel curHulpmiddel : getToegestaneHulpmiddelen())
		{
			if (curHulpmiddel.getHulpmiddel().equals(hulpmiddel))
				return true;
		}
		return false;
	}
}
