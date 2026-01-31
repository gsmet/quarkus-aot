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

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een periode deze hoort bij een periodeIndeling
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Periode extends InstellingEntiteit {
	@Column(nullable = false)
	private int volgnummer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "periodeIndeling", nullable = false)
	private PeriodeIndeling periodeIndeling;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date datumBegin;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date datumEind;

	public Periode() {
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public PeriodeIndeling getPeriodeIndeling() {
		return periodeIndeling;
	}

	public void setPeriodeIndeling(PeriodeIndeling periodeIndeling) {
		this.periodeIndeling = periodeIndeling;
	}

	public Date getDatumBegin() {
		return datumBegin;
	}

	public void setDatumBegin(Date datumBegin) {
		this.datumBegin = datumBegin;
	}

	public Date getDatumEind() {
		return datumEind;
	}

	public void setDatumEind(Date datumEind) {
		this.datumEind = datumEind;
	}
}
