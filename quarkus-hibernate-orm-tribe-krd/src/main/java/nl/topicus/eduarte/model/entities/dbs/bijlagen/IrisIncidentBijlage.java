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
package nl.topicus.eduarte.model.entities.dbs.bijlagen;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.bijlage.BijlageEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.incident.IrisIncident;

/**
 * Bijlage die gekoppeld is aan een irisincident.
 *
 */
@Entity()
public class IrisIncidentBijlage extends BijlageEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@Basic(optional = false)
	@JoinColumn(name = "irisIncident", nullable = true)
	private IrisIncident irisIncident;

	@Override
	public IBijlageKoppelEntiteit<IrisIncidentBijlage> getEntiteit()
	{
		return getIrisIncident();
	}

	public void setIrisIncident(IrisIncident irisIncident)
	{
		this.irisIncident = irisIncident;
	}

	public IrisIncident getIrisIncident()
	{
		return irisIncident;
	}
}
