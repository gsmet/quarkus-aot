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
package nl.topicus.eduarte.model.entities.signalering;

import java.util.Date;

import jakarta.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Persoon;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class Signaal extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "event", nullable = false)
	private Event event;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ontvanger", nullable = false)
	private Persoon ontvanger;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date datumGelezen;

	public Signaal()
	{
	}

	public Signaal(Event event, Persoon ontvanger)
	{
		setEvent(event);
		setOntvanger(ontvanger);
	}

	public Date getDatumGelezen()
	{
		return datumGelezen;
	}

	public void setDatumGelezen(Date datumGelezen)
	{
		this.datumGelezen = datumGelezen;
	}

	public Event getEvent()
	{
		return event;
	}

	public void setEvent(Event event)
	{
		this.event = event;
	}

	public Persoon getOntvanger()
	{
		return ontvanger;
	}

	public void setOntvanger(Persoon ontvanger)
	{
		this.ontvanger = ontvanger;
	}
}
