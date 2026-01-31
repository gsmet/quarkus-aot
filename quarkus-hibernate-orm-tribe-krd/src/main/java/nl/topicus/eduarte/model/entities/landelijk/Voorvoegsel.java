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
package nl.topicus.eduarte.model.entities.landelijk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.LandelijkEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Landelijk")
public class Voorvoegsel extends LandelijkEntiteit {
	@Column(length = 50, nullable = false)
	private String naam;

	/**
	 * Default constructor voor Hibernate.
	 */
	public Voorvoegsel() {
	}

	/**
	 * @return Returns the naam.
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * @param naam The naam to set.
	 */
	public void setNaam(String naam) {
		this.naam = naam;
	}

	/**
	 * @see nl.topicus.eduarte.model.entities.Entiteit#toString()
	 */
	@Override
	public String toString() {
		return getNaam();
	}
}
