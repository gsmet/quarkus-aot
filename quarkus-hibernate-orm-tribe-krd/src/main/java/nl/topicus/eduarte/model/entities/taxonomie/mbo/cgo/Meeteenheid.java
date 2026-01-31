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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Meeteenheid omschrijft hoe competenties gemeten kunnen worden
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Meeteenheid extends LandelijkOfInstellingEntiteit {
	@Column(length = 128, nullable = false)
	private String naam;

	@Column(length = 128, nullable = false)
	private String omschrijving;

	@OneToMany(mappedBy = "meeteenheid")
	@OrderBy("waarde asc")
	private List<MeeteenheidWaarde> meeteenheidWaardes = new ArrayList<>();

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public List<MeeteenheidWaarde> getMeeteenheidWaardes() {
		return meeteenheidWaardes;
	}

	public void setMeeteenheidWaardes(List<MeeteenheidWaarde> meeteenheidWaardes) {
		this.meeteenheidWaardes = meeteenheidWaardes;
	}
}
