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
package nl.topicus.eduarte.model.entities.vrijevelden;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "VrijVeldKeuzeOptie")
public class VrijVeldKeuzeOptie extends InstellingEntiteit {
	@Column(nullable = false)
	private String naam;

	@Column(nullable = false)
	private boolean actief;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vrijveld", nullable = false)
	private VrijVeld vrijVeld;

	public VrijVeldKeuzeOptie() {
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public VrijVeld getVrijVeld() {
		return vrijVeld;
	}

	public void setVrijVeld(VrijVeld vrijVeld) {
		this.vrijVeld = vrijVeld;
	}
}
