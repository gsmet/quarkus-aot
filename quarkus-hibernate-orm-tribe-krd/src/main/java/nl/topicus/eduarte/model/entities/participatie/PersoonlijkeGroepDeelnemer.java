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

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.contract.Contract;
import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.groep.Groepsdeelname;

/**
 * Lid van een persoonlijke groep. Een lid kan een deelnemer, een noise-groep of
 * een andere persoonlijke groep zijn. Voor het ophalen van alle deelnemers
 * (leerlingen) die in een persoonlijke groep zitten, kan gebruik gemaakt worden
 * van de entiteit DeelnemerPersoonlijkeGroep. Deze verwijst naar een view die
 * de geneste relaties ook ophaalt.
 *
 */

@Entity()
public class PersoonlijkeGroepDeelnemer extends Groepsdeelname {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bevatGroep", nullable = true)
	private Groep bevatGroep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contract", nullable = true)
	private Contract contract;

	public Groep getBevatGroep() {
		return bevatGroep;
	}

	public void setBevatGroep(Groep bevatGroep) {
		this.bevatGroep = bevatGroep;
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
