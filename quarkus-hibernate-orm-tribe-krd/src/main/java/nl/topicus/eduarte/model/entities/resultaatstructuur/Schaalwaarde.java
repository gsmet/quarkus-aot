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

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een tekstuele schaalwaarde van een tekstuele schaal.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "schaal", "interneWaarde" }) })
public class Schaalwaarde extends InstellingEntiteit {

	/**
	 * De schaal waarvoor deze waarde geldt.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "schaal")
	private Schaal schaal;

	@Column(nullable = false, length = 10)
	private String interneWaarde;

	@Column(nullable = false, length = 10)
	private String externeWaarde;

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = false)
	private int volgnummer;

	/**
	 * Is de toets behaald met dit niveau?
	 */
	@Column(nullable = false)
	private boolean behaald;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal vanafCijfer;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal totCijfer;

	@Column(nullable = false, scale = 10, precision = 20)
	private BigDecimal nominaleWaarde;

	public Schaalwaarde() {
	}

	public Schaalwaarde(Schaal schaal) {
		setSchaal(schaal);
		setVolgnummer(schaal.getNextVolgnummer());
	}

	public Schaal getSchaal() {
		return schaal;
	}

	public void setSchaal(Schaal schaal) {
		this.schaal = schaal;
	}

	public String getInterneWaarde() {
		return interneWaarde;
	}

	public void setInterneWaarde(String interneWaarde) {
		this.interneWaarde = interneWaarde;
	}

	public String getExterneWaarde() {
		return externeWaarde;
	}

	public void setExterneWaarde(String externeWaarde) {
		this.externeWaarde = externeWaarde;
	}

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

	public boolean isBehaald() {
		return behaald;
	}

	public void setBehaald(boolean behaald) {
		this.behaald = behaald;
	}

	public BigDecimal getVanafCijfer() {
		return vanafCijfer;
	}

	public void setVanafCijfer(BigDecimal vanafCijfer) {
		this.vanafCijfer = vanafCijfer;
	}

	public BigDecimal getTotCijfer() {
		return totCijfer;
	}

	public void setTotCijfer(BigDecimal totCijfer) {
		this.totCijfer = totCijfer;
	}

	@Override
	public String toString() {
		return getInterneWaarde();
	}

	public BigDecimal getNominaleWaarde() {
		return nominaleWaarde;
	}

	public void setNominaleWaarde(BigDecimal nominaleWaarde) {
		this.nominaleWaarde = nominaleWaarde;
	}

	public boolean bevat(BigDecimal cijfer, int divisor) {
		if (getVanafCijfer() == null || getTotCijfer() == null)
			return false;
		var vanaf = getVanafCijfer().multiply(BigDecimal.valueOf(divisor));
		var tot = getTotCijfer().multiply(BigDecimal.valueOf(divisor));
		return vanaf.compareTo(cijfer) <= 0 && tot.compareTo(cijfer) >= 0;
	}
}
