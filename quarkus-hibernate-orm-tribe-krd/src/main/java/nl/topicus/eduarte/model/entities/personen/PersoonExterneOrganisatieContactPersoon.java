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

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "PersoonExtOrgContactPersoon")
public class PersoonExterneOrganisatieContactPersoon extends BeginEinddatumInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "persoonExterneOrganisatie")
	private PersoonExterneOrganisatie persoonExterneOrganisatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "extOrgContactPersoon")
	private ExterneOrganisatieContactPersoon externeOrganisatieContactPersoon;

	public PersoonExterneOrganisatieContactPersoon() {
	}

	public PersoonExterneOrganisatieContactPersoon(PersoonExterneOrganisatie persoonExterneOrganisatie) {
		this.persoonExterneOrganisatie = persoonExterneOrganisatie;
	}

	public PersoonExterneOrganisatie getPersoonExterneOrganisatie() {
		return persoonExterneOrganisatie;
	}

	public void setExterneOrganisatieContactPersoon(ExterneOrganisatieContactPersoon externeOrganisatieContactPersoon) {
		this.externeOrganisatieContactPersoon = externeOrganisatieContactPersoon;
	}

	public ExterneOrganisatieContactPersoon getExterneOrganisatieContactPersoon() {
		return externeOrganisatieContactPersoon;
	}

	public void setPersoonExterneOrganisatie(PersoonExterneOrganisatie persoonExterneOrganisatie) {
		this.persoonExterneOrganisatie = persoonExterneOrganisatie;
	}

}
