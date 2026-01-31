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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "ExtOrgContPersRol")
@IsViewWhenOnNoise
public class ExterneOrganisatieContactPersoonRol extends InstellingEntiteit {
	@Column(length = 120, nullable = false)
	private String naam;

	@Column
	private Boolean praktijkopleiderBPV;

	@Column
	private Boolean contactpersoonBPV;

	@Column(nullable = false)
	private boolean actief = true;

	public ExterneOrganisatieContactPersoonRol() {
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	@Override
	public String toString() {
		return getNaam();
	}

	public Boolean getPraktijkopleiderBPV() {
		return praktijkopleiderBPV;
	}

	public void setPraktijkopleiderBPV(Boolean praktijkopleiderBPV) {
		this.praktijkopleiderBPV = praktijkopleiderBPV;
	}

	public Boolean getContactpersoonBPV() {
		return contactpersoonBPV;
	}

	public void setContactpersoonBPV(Boolean contactpersoonBPV) {
		this.contactpersoonBPV = contactpersoonBPV;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}
}
