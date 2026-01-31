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
package nl.topicus.eduarte.model.entities.settings;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEntiteit;

/**
 * Een instelling van een organisatie (instelling). De standaard setting geld
 * per organisatie maar subclasses kunnen dat verder uitsplitsen naar bv
 * organisatieeenheid, medewerker, etc. Vergeet niet een default waarde te
 * specificeren in {@link SettingsDataAccessHelper}
 *
 * @param <T> het type van de return waarde
 */
@Entity()
@DiscriminatorColumn(length = 255)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public abstract class OrganisatieSetting<T> extends OrganisatieEntiteit {
	public abstract String getOmschrijving();

	public abstract T getValue();

	public abstract void setValue(T value);
}
