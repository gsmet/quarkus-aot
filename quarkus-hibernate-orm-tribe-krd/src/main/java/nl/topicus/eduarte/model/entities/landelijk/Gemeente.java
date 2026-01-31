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
package nl.topicus.eduarte.model.entities.landelijk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.ICodeNaamEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkEntiteit;

/**
 * Gemeentes van Nederland
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@IsViewWhenOnNoise
public class Gemeente extends BeginEinddatumLandelijkEntiteit implements ICodeNaamEntiteit {
	@Column(length = 10, nullable = false)
	private String code;

	@Column(length = 100, nullable = false)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "nieuweGemeente", nullable = true)
	private Gemeente nieuweGemeente;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Gemeente getNieuweGemeente() {
		return nieuweGemeente;
	}

	public void setNieuweGemeente(Gemeente nieuweGemeente) {
		this.nieuweGemeente = nieuweGemeente;
	}
}
