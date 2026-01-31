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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 * Koppelt een deelnemer of groep aan een formatieve resultaatstructuur. Als een
 * deelnemer (al dan niet via een groep) gekoppeld is, kunnen op de structuur
 * resultaten ingevoerd worden voor de deelnemer.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
public class ResultaatstructuurDeelnemer extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "deelnemer")
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "groep")
	private Groep groep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "resultaatstructuur")
	private Resultaatstructuur resultaatstructuur;

	public ResultaatstructuurDeelnemer() {
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Groep getGroep() {
		return groep;
	}

	public void setGroep(Groep groep) {
		this.groep = groep;
	}

	public Resultaatstructuur getResultaatstructuur() {
		return resultaatstructuur;
	}

	public void setResultaatstructuur(Resultaatstructuur resultaatstructuur) {
		this.resultaatstructuur = resultaatstructuur;
	}

	public String getDeelnemerOfGroep() {
		return getDeelnemer() == null ? getGroep().toString() : getDeelnemer().toString();
	}
}
