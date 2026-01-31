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
package nl.topicus.eduarte.model.entities.adres;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkOfInstellingEntiteit;

/**
 * Entiteit welke een enkel adres bevat.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "AdresEntiteit")
@IsViewWhenOnNoise
public abstract class AdresEntiteit<T extends AdresEntiteit<T>> extends
BeginEinddatumLandelijkOfInstellingEntiteit
{
	/**
	 * Eager omdat vanuit persoon een lijst met alle adressen opgevraagd wordt. De
	 * adressen zijn dus in het algemeen niet beschikbaar in de cache.
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "adres", nullable = false)
	@Bron
	private Adres adres;

	@Column(nullable = false)
	@Bron
	private boolean postadres;

	@Column(nullable = false)
	@Bron
	private boolean fysiekadres;

	@Column(nullable = false)
	private boolean factuuradres;

	public Adres getAdres() {
		return adres;
	}

	public void setAdres(Adres adres) {
		this.adres = adres;
	}

	public boolean isPostadres() {
		return postadres;
	}

	public void setPostadres(boolean postadres) {
		this.postadres = postadres;
	}

	public boolean isFysiekadres() {
		return fysiekadres;
	}

	public void setFysiekadres(boolean fysiekadres) {
		this.fysiekadres = fysiekadres;
	}

	public boolean isFactuuradres() {
		return factuuradres;
	}

	public void setFactuuradres(boolean factuuradres) {
		this.factuuradres = factuuradres;
	}
}
