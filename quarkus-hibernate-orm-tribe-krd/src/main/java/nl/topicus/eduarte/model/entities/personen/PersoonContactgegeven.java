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
package nl.topicus.eduarte.model.entities.personen;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.adres.SoortContactgegeven;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@IsViewWhenOnNoise
public class PersoonContactgegeven extends InstellingEntiteit {
	/**
	 * Lazy omdat lijst met telefoonnummers vanuit de persoon wordt opgevraagd,
	 * oftewel de persoon zal in het algemeen al aanwezig zijn in de 1st of 2nd
	 * level cache.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = false)
	private Persoon persoon;

	/**
	 * Email: 64 chars + 1 @ sign + 255 chars = 320 characters
	 */
	@Column(length = 320, nullable = false)
	private String contactgegeven;

	@Column(nullable = false)
	private boolean geheim;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortContactgegeven", nullable = false)
	private SoortContactgegeven soortContactgegeven;

	@Column(nullable = false)
	private int volgorde;

	public Persoon getPersoon() {
		return persoon;
	}

	public void setPersoon(Persoon persoon) {
		this.persoon = persoon;
	}

	public String getContactgegeven() {
		return contactgegeven;
	}

	public void setContactgegeven(String contactgegeven) {
		this.contactgegeven = contactgegeven;
	}

	public boolean isGeheim() {
		return geheim;
	}

	public void setGeheim(boolean geheim) {
		this.geheim = geheim;
	}

	public SoortContactgegeven getSoortContactgegeven() {
		return soortContactgegeven;
	}

	public void setSoortContactgegeven(SoortContactgegeven soortContactgegeven) {
		this.soortContactgegeven = soortContactgegeven;
	}

	public int getVolgorde() {
		return volgorde;
	}

	public void setVolgorde(int volgorde) {
		this.volgorde = volgorde;
	}
}
