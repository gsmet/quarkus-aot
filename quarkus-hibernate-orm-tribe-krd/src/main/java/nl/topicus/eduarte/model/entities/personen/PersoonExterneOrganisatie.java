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

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;

/**
 */
@Entity()
@DiscriminatorValue("O")
public class PersoonExterneOrganisatie extends AbstractRelatie {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "instelling", nullable = true)
	private ExterneOrganisatie relatie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "persoonExterneOrganisatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<PersoonExterneOrganisatieContactPersoon> persoonExterneOrganisatieContactPersonen = new ArrayList<>();

	public ExterneOrganisatie getRelatie() {
		return relatie;
	}

	public void setRelatie(ExterneOrganisatie relatie) {
		this.relatie = relatie;
	}

	public List<PersoonExterneOrganisatieContactPersoon> getPersoonExterneOrganisatieContactPersonen() {
		return persoonExterneOrganisatieContactPersonen;
	}

	public void setPersoonExterneOrganisatieContactPersonen(
			List<PersoonExterneOrganisatieContactPersoon> persoonExterneOrganisatieContactPersonen) {
		this.persoonExterneOrganisatieContactPersonen = persoonExterneOrganisatieContactPersonen;
	}
}
