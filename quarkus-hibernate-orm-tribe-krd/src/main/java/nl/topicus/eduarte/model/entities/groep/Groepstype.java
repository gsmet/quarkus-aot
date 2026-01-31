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
package nl.topicus.eduarte.model.entities.groep;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;

/**
 * Een instelling kan verschillende types groepen aanmaken.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "code", "organisatie" }) })
@IsViewWhenOnNoise
public class Groepstype extends CodeNaamActiefInstellingEntiteit {
	/**
	 * Geeft aan of dit een plaatsingsgroep (basisgroep, stamgroep) is. Zo ja,
	 * kunnen de deelnemers van deze groepen alleen via een plaatsing aan de groep
	 * gekoppeld worden. Omgekeerd kan aan groepen die geen plaatsingsgroep zijn,
	 * geen plaatsing gekoppeld worden.
	 */
	@Column(nullable = false)
	private boolean plaatsingsgroep;

	public Groepstype() {
	}

	@Override
	public String toString() {
		return getNaam();
	}

	public boolean isPlaatsingsgroep() {
		return plaatsingsgroep;
	}

	public void setPlaatsingsgroep(boolean plaatsingsgroep) {
		this.plaatsingsgroep = plaatsingsgroep;
	}
}
