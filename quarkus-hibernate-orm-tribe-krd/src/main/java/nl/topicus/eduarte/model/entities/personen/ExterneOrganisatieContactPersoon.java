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
package nl.topicus.eduarte.model.entities.personen;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.Geslacht;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "ExtOrgContactPersoon")
@IsViewWhenOnNoise
public class ExterneOrganisatieContactPersoon extends BeginEinddatumInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = false)
	private ExterneOrganisatie externeOrganisatie;

	@Column(length = 80, nullable = false)
	private String naam;

	@Column(length = 60, nullable = true)
	private String emailadres;

	@Column(length = 60, nullable = true)
	private String telefoon;

	@Column(length = 60, nullable = true)
	private String mobiel;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private Geslacht geslacht;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol", nullable = true)
	private ExterneOrganisatieContactPersoonRol rol;

	public ExterneOrganisatieContactPersoon() {
	}

	public ExterneOrganisatieContactPersoon(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public void setRol(ExterneOrganisatieContactPersoonRol rol) {
		this.rol = rol;
	}

	public ExterneOrganisatieContactPersoonRol getRol() {
		return rol;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public void setEmailadres(String emailadres) {
		this.emailadres = emailadres;
	}

	public String getEmailadres() {
		return emailadres;
	}

	public void setTelefoon(String telefoon) {
		this.telefoon = telefoon;
	}

	public String getTelefoon() {
		return telefoon;
	}

	public String getMobiel() {
		return mobiel;
	}

	public void setMobiel(String mobiel) {
		this.mobiel = mobiel;
	}

	@Override
	public String toString() {
		return getNaam();
	}

	public Geslacht getGeslacht() {
		return geslacht;
	}

	public void setGeslacht(Geslacht geslacht) {
		this.geslacht = geslacht;
	}
}
