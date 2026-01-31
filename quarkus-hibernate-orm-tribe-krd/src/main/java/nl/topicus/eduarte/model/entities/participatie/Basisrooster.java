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
package nl.topicus.eduarte.model.entities.participatie;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 * Een basisrooster geeft aan wat de globale planning voor het gehele schooljaar
 * of voor een periode is.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Basisrooster extends InstellingEntiteit {
	@Column(length = 60, nullable = false)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	/**
	 * Het externe systeem waar dit rooster gedefinieerd is.
	 */
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private ExternSysteem externSysteem;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "basisrooster")
	private List<Vakantie> vakanties;

	public Basisrooster() {
	}

	public Basisrooster(OrganisatieEenheid organisatieEenheid, String naam) {
		setOrganisatieEenheid(organisatieEenheid);
		setNaam(naam);
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public ExternSysteem getExternSysteem() {
		return externSysteem;
	}

	public void setExternSysteem(ExternSysteem externSysteem) {
		this.externSysteem = externSysteem;
	}

	public List<Vakantie> getVakanties() {
		if (vakanties == null)
			vakanties = new ArrayList<>();
		return vakanties;
	}

	public void setVakanties(List<Vakantie> vakanties) {
		this.vakanties = vakanties;
	}

	/**
	 * @param vakantieNaam
	 * @return De vakantie met de gegeven naam.
	 */
	public Vakantie getVakantie(String vakantieNaam) {
		for (Vakantie vakantie : getVakanties()) {
			if (vakantie.getNaam().equalsIgnoreCase(vakantieNaam)) {
				return vakantie;
			}
		}
		return null;
	}
}
