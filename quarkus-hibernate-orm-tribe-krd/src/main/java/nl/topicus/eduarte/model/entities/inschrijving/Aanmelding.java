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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@BatchSize(size = 20)
public class Aanmelding extends BeginEinddatumInstellingEntiteit {
	public enum AanmeldingStatus {
		Nieuw, NaderOnderzoek, Goedgekeurd, Geparkeerd;

		private String omschrijving;

		AanmeldingStatus() {
			this(null);
		}

		AanmeldingStatus(String omschrijving) {
			this.omschrijving = omschrijving;
		}

		@Override
		public String toString() {
			return omschrijving;
		}

		public AanmeldingStatus[] getVervolgEnHuidig() {
			switch (this) {
			case Nieuw:
				return new AanmeldingStatus[] { Nieuw, NaderOnderzoek, Goedgekeurd, Geparkeerd };
			case NaderOnderzoek:
				return new AanmeldingStatus[] { NaderOnderzoek, Goedgekeurd, Geparkeerd };
			case Goedgekeurd:
				return new AanmeldingStatus[] { Goedgekeurd };
			case Geparkeerd:
				return new AanmeldingStatus[] { Geparkeerd, NaderOnderzoek, Goedgekeurd };
			default:
			}
			return new AanmeldingStatus[] {};
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis", nullable = false)
	private Verbintenis verbintenis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "intakegesprek", nullable = false)
	private Intakegesprek intakegesprek;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AanmeldingStatus status = AanmeldingStatus.Nieuw;

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public Intakegesprek getIntakegesprek() {
		return intakegesprek;
	}

	public void setIntakegesprek(Intakegesprek intakegesprek) {
		this.intakegesprek = intakegesprek;
	}

	public AanmeldingStatus getStatus() {
		return status;
	}

	public void setStatus(AanmeldingStatus status) {
		this.status = status;
	}
}