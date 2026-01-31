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
package nl.topicus.eduarte.model.entities.kenmerk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 *
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@BatchSize(size = 20)
public class DeelnemerKenmerk extends BeginEinddatumInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "deelnemer")
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "kenmerk")
	private Kenmerk kenmerk;

	@Column(nullable = true)
	@Lob
	private String toelichting;

	public DeelnemerKenmerk() {
	}

	public DeelnemerKenmerk(Deelnemer deelnemer) {
		setDeelnemer(deelnemer);
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Kenmerk getKenmerk() {
		return kenmerk;
	}

	public void setKenmerk(Kenmerk kenmerk) {
		this.kenmerk = kenmerk;
	}

	public String getToelichting() {
		return toelichting;
	}

	public void setToelichting(String toelichting) {
		this.toelichting = toelichting;
	}
}
