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
package nl.topicus.eduarte.model.entities.productregel;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.LandelijkEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.Deelgebied;

/**
 * Landelijke koppeltabel tussen landelijke productregels en deelgebieden die
 * aangeeft welke deelgebieden toegestaan zijn voor een bepaalde productregel.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
public class ToegestaanDeelgebied extends LandelijkEntiteit {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "productregel")
	private Productregel productregel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "deelgebied")
	private Deelgebied deelgebied;

	public ToegestaanDeelgebied() {
	}

	public Productregel getProductregel() {
		return productregel;
	}

	public void setProductregel(Productregel productregel) {
		this.productregel = productregel;
	}

	public Deelgebied getDeelgebied() {
		return deelgebied;
	}

	public void setDeelgebied(Deelgebied deelgebied) {
		this.deelgebied = deelgebied;
	}
}
