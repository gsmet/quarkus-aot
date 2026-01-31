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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.Taxonomie;

/**
 * Productregels kunnen gegroepeerd worden per soort, bijvoorbeeld
 * Gemeenschappelijk, Profiel, Keuze.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "naam", "taxonomie", "organisatie" }),
		@UniqueConstraint(columnNames = { "volgnummer", "taxonomie", "organisatie" }) })
public class SoortProductregel extends LandelijkOfInstellingEntiteit {
	@Column(nullable = false, length = 30)
	private String naam;

	/**
	 * Volgorde van productregels (Gemeenschappelijk komt voor Profiel).
	 */
	@Column(nullable = false)
	private int volgnummer;

	@Column(nullable = false)
	private boolean actief;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "taxonomie")
	private Taxonomie taxonomie;

	@Column(nullable = false, length = 30)
	private String diplomanaam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public Taxonomie getTaxonomie() {
		return taxonomie;
	}

	public void setTaxonomie(Taxonomie taxonomie) {
		this.taxonomie = taxonomie;
	}

	public String getDiplomanaam() {
		return diplomanaam;
	}

	public void setDiplomanaam(String diplomanaam) {
		this.diplomanaam = diplomanaam;
	}

}
