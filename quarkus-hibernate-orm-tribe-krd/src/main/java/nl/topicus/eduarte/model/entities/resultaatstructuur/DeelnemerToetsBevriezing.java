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
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "deelnemer", "toets" }) })
public class DeelnemerToetsBevriezing extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "toets", nullable = false)
	private Toets toets;

	@Column(nullable = false)
	private long bevrorenPogingen;

	@Column(nullable = false)
	private boolean ingeleverd;

	public DeelnemerToetsBevriezing() {
	}

	public DeelnemerToetsBevriezing(Deelnemer deelnemer, Toets toets) {
		setDeelnemer(deelnemer);
		setToets(toets);
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Toets getToets() {
		return toets;
	}

	public void setToets(Toets toets) {
		this.toets = toets;
	}

	public long getBevrorenPogingen() {
		return bevrorenPogingen;
	}

	public void setBevrorenPogingen(long bevrorenPogingen) {
		this.bevrorenPogingen = bevrorenPogingen;
	}

	public boolean isIngeleverd() {
		return ingeleverd;
	}

	public void setIngeleverd(boolean ingeleverd) {
		this.ingeleverd = ingeleverd;
	}
}
