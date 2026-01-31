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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
public class Taak extends BegeleidingsHandeling {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TaakSoort", nullable = true, foreignKey = @ForeignKey(name = "FK_Taak_soort"))
	@Basic(optional = false)
	private TaakSoort taakSoort;

	@Lob
	private String opmerkingen;

	public Taak() {
		soort = "Taak";
	}

	public Taak(Medewerker auteur, Traject traject) {
		this();
		setEigenaar(auteur);
		setTraject(traject);
	}

	public TaakSoort getTaakSoort() {
		return taakSoort;
	}

	public void setTaakSoort(TaakSoort taakSoort) {
		this.taakSoort = taakSoort;
	}

	public String getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}

	@Override
	public String handelingsSoort() {
		if (getTaakSoort() != null)
			return getTaakSoort().getNaam();
		return "";
	}
}
