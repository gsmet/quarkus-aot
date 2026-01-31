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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 * ContractVerplichting
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ContractVerplichting extends BeginEinddatumInstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "contract")
	private Contract contract;

	@Column(nullable = false, length = 100)
	private String omschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	@Column(nullable = false)
	private boolean uitgevoerd;

	@Column(nullable = true)
	private Date datumUitgevoerd;

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public boolean isUitgevoerd() {
		return uitgevoerd;
	}

	public void setUitgevoerd(boolean uitgevoerd) {
		this.uitgevoerd = uitgevoerd;
	}

	public Date getDatumUitgevoerd() {
		return datumUitgevoerd;
	}

	public void setDatumUitgevoerd(Date datumUitgevoerd) {
		this.datumUitgevoerd = datumUitgevoerd;
	}

	@Override
	public boolean isActief(Date peildatum) {
		return false;
	}
}