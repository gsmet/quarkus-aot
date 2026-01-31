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
package nl.topicus.eduarte.model.entities.signalering.settings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.signalering.EventAbonnementInstelling;
import nl.topicus.eduarte.model.signalering.EventAbonnementType;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class EventAbonnementSetting extends InstellingEntiteit {
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EventAbonnementInstelling waarde;

	@Column(nullable = false, length = 200)
	private String eventClassname;

	@Column(nullable = false, length = 200)
	private String transportClassname;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EventAbonnementType type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "configuratie", nullable = true)
	private AbstractEventAbonnementConfiguration<?> configuratie;

	public EventAbonnementSetting() {
	}

	public EventAbonnementInstelling getWaarde() {
		return waarde;
	}

	public void setWaarde(EventAbonnementInstelling waarde) {
		this.waarde = waarde;
	}

	public EventAbonnementType getType() {
		return type;
	}

	public void setType(EventAbonnementType type) {
		this.type = type;
	}

	public void setEventClassname(String eventClassname) {
		this.eventClassname = eventClassname;
	}

	public String getEventClassname() {
		return eventClassname;
	}

	public void setTransportClassname(String transportClassname) {
		this.transportClassname = transportClassname;
	}

	public String getTransportClassname() {
		return transportClassname;
	}

	public AbstractEventAbonnementConfiguration<?> getConfiguratie() {
		return configuratie;
	}

	public void setConfiguratie(AbstractEventAbonnementConfiguration<?> configuratie) {
		this.configuratie = configuratie;
	}
}
