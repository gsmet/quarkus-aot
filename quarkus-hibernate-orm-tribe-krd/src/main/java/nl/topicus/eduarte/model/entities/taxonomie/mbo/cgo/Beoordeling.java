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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity
public class Beoordeling extends CompetentieNiveauVerzameling {
	/**
	 * De medewerker die dit Competentieniveau invult
	 */
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "opgenomenIn", nullable = true)
	private Beoordeling opgenomenIn;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BeoordelingsType type;

	public Beoordeling() {
	}

	public BeoordelingsType getType() {
		return type;
	}

	public void setType(BeoordelingsType type) {
		this.type = type;
	}

	public Beoordeling getOpgenomenIn() {
		return opgenomenIn;
	}

	public void setOpgenomenIn(Beoordeling opgenomenIn) {
		this.opgenomenIn = opgenomenIn;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public String getTypeNaam() {
		// no NPE when type == null
		return new StringBuilder().append(type).toString();
	}
}
