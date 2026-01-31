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
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.LandelijkEntiteit;

/**
 * Plaatsnamen van Nederland
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
public class Plaats extends LandelijkEntiteit {
	@Column(length = 100, nullable = false)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gemeente", nullable = true)
	private Gemeente gemeente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provincie", nullable = true)
	private Provincie provincie;

	@Column(length = 100, nullable = false)
	private String sorteerNaam;

	@Column(nullable = false)
	private boolean uniek = true;

	@Column(nullable = false)
	private boolean uniekMetProvincie = true;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	@Override
	public String toString() {
		return naam;
	}

	public boolean isUniek() {
		return uniek;
	}

	public void setUniek(boolean uniek) {
		this.uniek = uniek;
	}

	public boolean isUniekMetProvincie() {
		return uniekMetProvincie;
	}

	public void setUniekMetProvincie(boolean uniekMetProvincie) {
		this.uniekMetProvincie = uniekMetProvincie;
	}

	public void setGemeente(Gemeente gemeente) {
		this.gemeente = gemeente;
	}

	public Gemeente getGemeente() {
		return gemeente;
	}

	public void setProvincie(Provincie provincie) {
		this.provincie = provincie;
	}

	public Provincie getProvincie() {
		return provincie;
	}

	public void setSorteerNaam(String sorteerNaam) {
		this.sorteerNaam = sorteerNaam;
	}

	public String getSorteerNaam() {
		return sorteerNaam;
	}
}
