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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een waarde in de scoretable bij een toets.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Scoreschaalwaarde extends InstellingEntiteit {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "toets")
	private Toets toets;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "waarde")
	private Schaalwaarde waarde;

	@Column(nullable = false)
	private int vanafScore;

	@Column(nullable = false)
	private int totScore;

	@Column(nullable = true, length = 1000)
	private String advies;

	public Scoreschaalwaarde() {
	}

	public Scoreschaalwaarde(Toets toets) {
		setToets(toets);
	}

	public Toets getToets() {
		return toets;
	}

	public void setToets(Toets toets) {
		this.toets = toets;
	}

	public Schaalwaarde getWaarde() {
		return waarde;
	}

	public void setWaarde(Schaalwaarde waarde) {
		this.waarde = waarde;
	}

	public int getVanafScore() {
		return vanafScore;
	}

	public void setVanafScore(int vanafScore) {
		this.vanafScore = vanafScore;
	}

	public int getTotScore() {
		return totScore;
	}

	public void setTotScore(int totScore) {
		this.totScore = totScore;
	}

	public String getAdvies() {
		return advies;
	}

	public void setAdvies(String advies) {
		this.advies = advies;
	}

	public boolean isScoreBinnenWaarde(int value) {
		return getVanafScore() <= value && getTotScore() > value;
	}
}
