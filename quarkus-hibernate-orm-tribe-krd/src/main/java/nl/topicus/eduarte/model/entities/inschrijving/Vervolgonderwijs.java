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
package nl.topicus.eduarte.model.entities.inschrijving;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.organisatie.Brin;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "Vervolgonderwijs")
public class Vervolgonderwijs extends InstellingEntiteit {
	public enum SoortVervolgonderwijs {
		Intern, BRIN, Overig, Onbekend;
	}

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private SoortVervolgonderwijs soortVervolgonderwijs;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "code", nullable = true)
	private Brin brincode;

	@Column(length = 100, nullable = true)
	private String naam;

	@Column(length = 100, nullable = true)
	private String plaats;

	/**
	 * Default constructor voor Hibernate.
	 */
	public Vervolgonderwijs() {
		this.soortVervolgonderwijs = SoortVervolgonderwijs.BRIN;
	}

	public void setSoortVervolgonderwijs(SoortVervolgonderwijs soortVervolgonderwijs) {
		this.soortVervolgonderwijs = soortVervolgonderwijs;
	}

	public SoortVervolgonderwijs getSoortVervolgonderwijs() {
		return soortVervolgonderwijs;
	}

	public Brin getBrincode() {
		return brincode;
	}

	public void setBrincode(Brin brincode) {
		this.brincode = brincode;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

}
