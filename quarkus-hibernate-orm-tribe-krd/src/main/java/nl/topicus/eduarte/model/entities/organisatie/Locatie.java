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
package nl.topicus.eduarte.model.entities.organisatie;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

/**
 * Locatie van een onderwijsinstelling. Dit is iets anders dan een
 * organisatie-eenheid. Een locatie is een fysiek gebouw, een
 * organisatie-eenheid is een administratieve eenheid binnen een instelling.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
@BatchSize(size = 100)
@IsViewWhenOnNoise
public class Locatie extends BeginEinddatumInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "code", nullable = true)
	private Brin brincode;

	@Column(nullable = false, length = 10)
	private String afkorting;

	@Column(nullable = false, length = 100)
	private String naam;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@OrderBy(value = "volgorde")
	private List<LocatieContactgegeven> contactgegevens;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "locatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@OrderBy(value = "begindatum DESC")
	private List<LocatieAdres> adressen = new ArrayList<>();

	public Brin getBrincode() {
		return brincode;
	}

	public void setBrincode(Brin brincode) {
		this.brincode = brincode;
	}

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public List<LocatieContactgegeven> getContactgegevens() {
		return contactgegevens;
	}

	public void setContactgegevens(List<LocatieContactgegeven> contactgegevens) {
		this.contactgegevens = contactgegevens;
	}

	public List<LocatieAdres> getAdressen() {
		return adressen;
	}

	public void setAdressen(List<LocatieAdres> adressen) {
		this.adressen = adressen;
	}
}
