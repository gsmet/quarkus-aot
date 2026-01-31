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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 */
@Entity()
public class PersoonlijkeGroep extends Groep {
	@Column(nullable = false, length = 240)
	private String omschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = true)
	private Deelnemer deelnemer;

	/**
	 * Geeft aan of deze groep gedeeld wordt met andere medewerkers binnen dezelfde
	 * instelling.
	 */
	@Column(nullable = false)
	private boolean gedeeld;

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public boolean isGedeeld() {
		return gedeeld;
	}

	public void setGedeeld(boolean gedeeld) {
		this.gedeeld = gedeeld;
	}
}
