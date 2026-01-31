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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een door een Deelnemer op een bepaalde datum behaald niveau van een
 * competentie.
 *
 */
@Entity
@BatchSize(size = 1000)
@Table(name = "CompetentieNiveau", uniqueConstraints = @UniqueConstraint(columnNames = { "leerpunt",
		"niveauVerzameling" }))
public class CompetentieNiveau extends InstellingEntiteit {
	@ManyToOne(optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "score", nullable = true)
	private MeeteenheidWaarde score;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "leerpunt", nullable = false)
	private Leerpunt leerpunt;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "niveauVerzameling", nullable = false)
	private CompetentieNiveauVerzameling niveauVerzameling;

	public MeeteenheidWaarde getScore() {
		return score;
	}

	public void setScore(MeeteenheidWaarde score) {
		this.score = score;
	}

	public Leerpunt getLeerpunt() {
		return leerpunt;
	}

	public void setLeerpunt(Leerpunt leerpunt) {
		this.leerpunt = leerpunt;
	}

	public CompetentieNiveauVerzameling getNiveauVerzameling() {
		return niveauVerzameling;
	}

	public void setNiveauVerzameling(CompetentieNiveauVerzameling niveauVerzameling) {
		this.niveauVerzameling = niveauVerzameling;
	}
}
