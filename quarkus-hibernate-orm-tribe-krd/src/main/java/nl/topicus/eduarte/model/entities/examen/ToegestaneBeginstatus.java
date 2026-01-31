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
package nl.topicus.eduarte.model.entities.examen;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Een toegestane examenstatusovergang kan meerdere geldige beginstatussen. Zo kan de
 * statusovergang 'Uitslag bepalen' opgestart worden vanuit Aangemeld en Gespreid examen.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
public class ToegestaneBeginstatus extends LandelijkOfInstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "examenstatus")
	private Examenstatus examenstatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "toegestaneExamenstatusOvergang")
	private ToegestaneExamenstatusOvergang toegestaneExamenstatusOvergang;

	public Examenstatus getExamenstatus() {
		return examenstatus;
	}

	public void setExamenstatus(Examenstatus examenstatus) {
		this.examenstatus = examenstatus;
	}

	public ToegestaneExamenstatusOvergang getToegestaneExamenstatusOvergang() {
		return toegestaneExamenstatusOvergang;
	}

	public void setToegestaneExamenstatusOvergang(ToegestaneExamenstatusOvergang toegestaneExamenstatusOvergang) {
		this.toegestaneExamenstatusOvergang = toegestaneExamenstatusOvergang;
	}

}
