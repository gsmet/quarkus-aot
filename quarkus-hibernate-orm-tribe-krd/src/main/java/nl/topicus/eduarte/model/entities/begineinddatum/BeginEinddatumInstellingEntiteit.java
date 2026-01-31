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
package nl.topicus.eduarte.model.entities.begineinddatum;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.duo.criho.annot.Criho;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Basisentiteit voor alle instellingsentiteiten die een begin- en einddatum
 * hebben. Begindatum is not-nullable en einddatum is nullable.
 *
 */
@MappedSuperclass
public abstract class BeginEinddatumInstellingEntiteit extends InstellingEntiteit implements IBeginEinddatumEntiteit {
	/**
	 * De eerste dag waarop de entiteit geldig wordt. Is Bron veld voor onder andere
	 * {@link nl.topicus.eduarte.model.entities.inschrijving.Verbintenis} en
	 * {@link nl.topicus.eduarte.model.entities.bpv.BPVInschrijving}.
	 */
	@Temporal(value = TemporalType.DATE)
	@Bron
	@Criho
	@Column(nullable = false)
	private Date begindatum = new Date();

	/**
	 * De laatste dag waarop de entiteit geldig wordt. Is Bron veld voor onder
	 * andere {@link nl.topicus.eduarte.model.entities.inschrijving.Verbintenis}.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	@Bron
	@Criho
	private Date einddatum;

	/**
	 * Dit property wordt automatisch bijgehouden bij het setten van de echte
	 * einddatum, en wordt gebruikt bij zoekacties. Het is namelijk veel sneller om
	 * te zoeken op een not null datum dan op een mogelijke null-waarde.
	 */
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date einddatumNotNull = MAX_DATE;

	@Override
	public Date getBegindatum() {
		return begindatum;
	}

	public void setBegindatum(Date begindatum) {
		this.begindatum = begindatum;
	}

	@Override
	public Date getEinddatum() {
		return einddatum;
	}

	public void setEinddatum(Date einddatum) {
		this.einddatum = einddatum;
	}

	@Override
	public Date getEinddatumNotNull() {
		return einddatumNotNull;
	}

	public void setEinddatumNotNull(Date einddatumNotNull) {
		this.einddatumNotNull = einddatumNotNull;
	}
}
