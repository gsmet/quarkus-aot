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

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Maatregel extends InstellingEntiteit {
	@Column(length = 50, nullable = false)
	private String omschrijving;

	@Column(nullable = false)
	private boolean actief;

	/**
	 * Boolean die aangeeft of automatisch aangemaakte maatregelen getoond moeten
	 * worden na het aanmaken. Dit betekent dat er een scherm 'tussenkomt' op het
	 * moment dat een gebruiker een absentiemelding invoert die een maatregel
	 * veroorzaakt.
	 */
	@Column(nullable = false)
	private boolean automatischeMaatregelTonen;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "maatregel")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<MaatregelToekenningsRegel> maatregelToekenningsRegels;

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isAutomatischeMaatregelTonen() {
		return automatischeMaatregelTonen;
	}

	public void setAutomatischeMaatregelTonen(boolean automatischeMaatregelTonen) {
		this.automatischeMaatregelTonen = automatischeMaatregelTonen;
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

	public List<MaatregelToekenningsRegel> getMaatregelToekenningsRegels() {
		return maatregelToekenningsRegels;
	}

	public void setMaatregelToekenningsRegels(List<MaatregelToekenningsRegel> maatregelToekenningsRegels) {
		this.maatregelToekenningsRegels = maatregelToekenningsRegels;
	}
}
