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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.participatie.AfspraakType;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class GesprekSoort extends InstellingEntiteit {
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@Column(nullable = false, length = 41)
	private String naam;

	@Column(nullable = false)
	private boolean actief = true;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraakType", nullable = false)
	private AfspraakType afspraakType;

	@Column(nullable = false)
	private boolean standaardVerslagVersturen;

	@Column(nullable = false)
	private boolean oudersUitnodigen;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BegeleidingsHandelingsStatussoort standaardStatus;

	@Lob
	@Column(nullable = true)
	private String verslagTemplate;

	public GesprekSoort() {
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public boolean isStandaardVerslagVersturen() {
		return standaardVerslagVersturen;
	}

	public void setStandaardVerslagVersturen(boolean standaardVerslagVersturen) {
		this.standaardVerslagVersturen = standaardVerslagVersturen;
	}

	public boolean isOudersUitnodigen() {
		return oudersUitnodigen;
	}

	public void setOudersUitnodigen(boolean oudersUitnodigen) {
		this.oudersUitnodigen = oudersUitnodigen;
	}

	public String getVerslagTemplate() {
		return verslagTemplate;
	}

	public void setVerslagTemplate(String verslagTemplate) {
		this.verslagTemplate = verslagTemplate;
	}

	public BegeleidingsHandelingsStatussoort getStandaardStatus() {
		return standaardStatus;
	}

	public void setStandaardStatus(BegeleidingsHandelingsStatussoort standaardStatus) {
		this.standaardStatus = standaardStatus;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public AfspraakType getAfspraakType() {
		return afspraakType;
	}

	public void setAfspraakType(AfspraakType afspraakType) {
		this.afspraakType = afspraakType;
	}

	@Override
	public String toString() {
		return getNaam();
	}
}
