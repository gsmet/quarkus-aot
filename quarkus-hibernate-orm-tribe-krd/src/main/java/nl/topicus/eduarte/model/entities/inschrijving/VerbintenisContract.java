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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.contract.Contract;
import nl.topicus.eduarte.model.entities.contract.ContractOnderdeel;
import nl.topicus.eduarte.model.entities.personen.ExterneOrganisatieContactPersoon;

/**
 * Koppeling tussen {@link Verbintenis} en {@link Contract}/{@link ContractOnderdeel}.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class VerbintenisContract extends BeginEinddatumInstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "verbintenis")
	private Verbintenis verbintenis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "contract")
	private Contract contract;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "onderdeel")
	private ContractOnderdeel onderdeel;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumBeschikking;

	@Column(nullable = true)
	private String externNummer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "extOrgContactPersoon")
	private ExterneOrganisatieContactPersoon externeOrganisatieContactPersoon;

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

	public ContractOnderdeel getOnderdeel() {
		return onderdeel;
	}

	public void setOnderdeel(ContractOnderdeel onderdeel) {
		this.onderdeel = onderdeel;
	}

	public Date getDatumBeschikking() {
		return datumBeschikking;
	}

	public void setDatumBeschikking(Date datumBeschikking) {
		this.datumBeschikking = datumBeschikking;
	}

	public String getExternNummer() {
		return externNummer;
	}

	public void setExternNummer(String externNummer) {
		this.externNummer = externNummer;
	}

	public ExterneOrganisatieContactPersoon getExterneOrganisatieContactPersoon() {
		return externeOrganisatieContactPersoon;
	}

	public void setExterneOrganisatieContactPersoon(ExterneOrganisatieContactPersoon externeOrganisatieContactPersoon) {
		this.externeOrganisatieContactPersoon = externeOrganisatieContactPersoon;
	}
}