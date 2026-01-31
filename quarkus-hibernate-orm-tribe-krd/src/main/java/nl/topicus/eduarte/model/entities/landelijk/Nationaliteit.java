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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.ICodeNaamEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkEntiteit;

/**
 * Nationaliteittabel.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@IsViewWhenOnNoise
public class Nationaliteit extends BeginEinddatumLandelijkEntiteit implements ICodeNaamEntiteit {
	@Column(nullable = false)
	private String code;

	@Column(length = 100)
	private String naam;

	/**
	 * Europese Economische Ruimte (België, Bulgarije, Cyprus, Denemarken,
	 * Duitsland, Estland, Finland, Frankrijk, Griekenland, Groot-Brittannië,
	 * Hongarije, Ierland, Italië, Letland, Liechtenstein, Litouwen, Luxemburg,
	 * Malta, Nederland, Noorwegen, Oostenrijk, Polen, Portugal, Roemenië, Slovenië,
	 * Slowakije, Spanje, Tsjechië, IJsland en Zweden)
	 */
	private boolean eer;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	public boolean isEer() {
		return eer;
	}

	public void setEer(boolean eer) {
		this.eer = eer;
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public void setNaam(String naam) {
		this.naam = naam;
	}
}
