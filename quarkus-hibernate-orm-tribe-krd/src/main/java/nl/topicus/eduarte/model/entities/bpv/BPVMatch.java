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
package nl.topicus.eduarte.model.entities.bpv;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"bpvKandidaat",
"keuzeVolgnummer"})})
public class BPVMatch extends InstellingEntiteit
{

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvKandidaat", nullable = false)
	private BPVKandidaat bpvKandidaat;

	// nullable moet niet false zijn, als je met colo ga matchen hang je hier nog geen
	// stageplaats aan.
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvPlaats", nullable = true)
	private BPVPlaats bpvPlaats;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvColoPlaats", nullable = true)
	private BPVColoPlaats bpvColoPlaats;

	@Column(nullable = false)
	private boolean matchAkkoord;

	/**
	 * Het hoogste keuzevolgnummer is de eerstekeuze, behalve als de keuze is vervallen
	 */
	@Column(nullable = false)
	private int keuzeVolgnummer;

	@Column(nullable = false)
	private boolean keuzeVervallen;

	public BPVKandidaat getBpvKandidaat() {
		return bpvKandidaat;
	}

	public void setBpvKandidaat(BPVKandidaat bpvKandidaat) {
		this.bpvKandidaat = bpvKandidaat;
	}

	public BPVPlaats getBpvPlaats() {
		return bpvPlaats;
	}

	public void setBpvPlaats(BPVPlaats bpvPlaats) {
		this.bpvPlaats = bpvPlaats;
	}

	public BPVColoPlaats getBpvColoPlaats() {
		return bpvColoPlaats;
	}

	public void setBpvColoPlaats(BPVColoPlaats bpvColoPlaats) {
		this.bpvColoPlaats = bpvColoPlaats;
	}

	public boolean isMatchAkkoord() {
		return matchAkkoord;
	}

	public void setMatchAkkoord(boolean matchAkkoord) {
		this.matchAkkoord = matchAkkoord;
	}

	public int getKeuzeVolgnummer() {
		return keuzeVolgnummer;
	}

	public void setKeuzeVolgnummer(int keuzeVolgnummer) {
		this.keuzeVolgnummer = keuzeVolgnummer;
	}

	public boolean isKeuzeVervallen() {
		return keuzeVervallen;
	}

	public void setKeuzeVervallen(boolean keuzeVervallen) {
		this.keuzeVervallen = keuzeVervallen;
	}
}
