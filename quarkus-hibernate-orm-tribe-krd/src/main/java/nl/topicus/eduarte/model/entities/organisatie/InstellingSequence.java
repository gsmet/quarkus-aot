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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import jakarta.persistence.Table;

/**
 * Bewaart gegevens voor de custom SequenceGenerators per instelling.
 *
 */
@Entity()
@Table(name = "InstellingSequence", uniqueConstraints = { @UniqueConstraint(columnNames = { "naam", "organisatie" }) })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class InstellingSequence extends InstellingEntiteit {
	// Naam van de sequence.
	@Column(nullable = false)
	private String naam;

	// Maximale waarde voor de sequence.
	@Column(nullable = false)
	private Long maximum;

	// Startwaarde van de sequence.
	@Column(nullable = false)
	private Long startWaarde;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Long getMaximum() {
		return maximum;
	}

	public void setMaximum(Long maximum) {
		this.maximum = maximum;
	}

	public Long getStartWaarde() {
		return startWaarde;
	}

	public void setStartWaarde(Long startWaarde) {
		this.startWaarde = startWaarde;
	}
}
