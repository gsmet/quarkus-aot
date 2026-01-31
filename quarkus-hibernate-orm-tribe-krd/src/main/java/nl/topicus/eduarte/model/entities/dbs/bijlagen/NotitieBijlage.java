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
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Notitie;
import nl.topicus.eduarte.model.entities.personen.DeelnemerBijlage;

/**
 * Bijlage die gekoppeld is aan een notitie en een deelnemer.
 * 
 */
@Entity()
public class NotitieBijlage extends DeelnemerBijlage
{
	@ManyToOne(fetch = FetchType.LAZY)
	@Basic(optional = false)
	@JoinColumn(name = "notitie", nullable = true)
	private Notitie notitie;

	public Notitie getNotitie()
	{
		return notitie;
	}

	public void setNotitie(Notitie notitie)
	{
		this.notitie = notitie;
	}

	@Override
	public IBijlageKoppelEntiteit<NotitieBijlage> getEntiteit()
	{
		return getNotitie();
	}
}
