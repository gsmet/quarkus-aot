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
package nl.topicus.eduarte.model.entities.participatie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.ViewEntiteit;
import nl.topicus.eduarte.model.entities.contract.Contract;
import nl.topicus.eduarte.model.entities.participatie.enums.UitnodigingStatus;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 * AfspraakDeelnemer correspondeerd met de afspraak deelnemer view, die aangeeft
 * welke deelnemers aan welke afspraak gekoppeld zijn. Deze view houdt rekening
 * met koppelingen via groepen, persoonlijke groepen of die direct zijn. De
 * begin en eind datum van de groepen en deelnames wordt gematched met de datum
 * van de afspraak.
 *
 */
@Entity
@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Instelling")
@Table(name = "AfspraakDeelnemer")
public class AfspraakDeelnemer extends ViewEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraak", nullable = true)
	private Afspraak afspraak;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = true)
	private Deelnemer deelnemer;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UitnodigingStatus uitnodigingStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contract", nullable = true)
	private Contract contract;

	public AfspraakDeelnemer() {
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setAfspraak(Afspraak afspraak) {
		this.afspraak = afspraak;
	}

	public Afspraak getAfspraak() {
		return afspraak;
	}

	public UitnodigingStatus getUitnodigingStatus() {
		return uitnodigingStatus;
	}

	public void setUitnodigingStatus(UitnodigingStatus uitnodigingStatus) {
		this.uitnodigingStatus = uitnodigingStatus;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}

}
