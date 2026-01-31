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
package nl.topicus.eduarte.model.entities.contract;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

/**
 * ContractOnderdeel
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ContractOnderdeel extends BeginEinddatumInstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "contract")
	private Contract contract;

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = true)
	private Integer minimumAantalDeelnemers;

	@Column(nullable = true)
	private Integer maximumAantalDeelnemers;

	@Column(nullable = true, scale = 2, precision = 19)
	private BigDecimal prijs;

	@Column(nullable = true, length = 25)
	private String frequentieAanwezigheid;

	@Column(nullable = true, length = 25)
	private String groepsgrootte;

	@Column(nullable = true, length = 25)
	private String begeleidingsintensiteit;

	@Column(nullable = true, length = 25)
	private String studiebelasting;

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Integer getMinimumAantalDeelnemers() {
		return minimumAantalDeelnemers;
	}

	public void setMinimumAantalDeelnemers(Integer minimumAantalDeelnemers) {
		this.minimumAantalDeelnemers = minimumAantalDeelnemers;
	}

	public Integer getMaximumAantalDeelnemers() {
		return maximumAantalDeelnemers;
	}

	public void setMaximumAantalDeelnemers(Integer maximumAantalDeelnemers) {
		this.maximumAantalDeelnemers = maximumAantalDeelnemers;
	}

	public BigDecimal getPrijs() {
		return prijs;
	}

	public void setPrijs(BigDecimal prijs) {
		this.prijs = prijs;
	}

	public String getFrequentieAanwezigheid() {
		return frequentieAanwezigheid;
	}

	public void setFrequentieAanwezigheid(String frequentieAanwezigheid) {
		this.frequentieAanwezigheid = frequentieAanwezigheid;
	}

	public String getGroepsgrootte() {
		return groepsgrootte;
	}

	public void setGroepsgrootte(String groepsgrootte) {
		this.groepsgrootte = groepsgrootte;
	}

	public String getBegeleidingsintensiteit() {
		return begeleidingsintensiteit;
	}

	public void setBegeleidingsintensiteit(String begeleidingsintensiteit) {
		this.begeleidingsintensiteit = begeleidingsintensiteit;
	}

	public String getStudiebelasting() {
		return studiebelasting;
	}

	public void setStudiebelasting(String studiebelasting) {
		this.studiebelasting = studiebelasting;
	}
}