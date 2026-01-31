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
package nl.topicus.eduarte.model.entities.organisatie;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.MappedSuperclass;

import nl.topicus.eduarte.model.entities.Entiteit;

/**
 * Base class voor alle entiteiten die bij een organisatie horen. In de database
 * wordt automatisch een verwijzing naar de juiste organisatie opgenomen.
 *
 */
@MappedSuperclass()
public abstract class OrganisatieEntiteit extends Entiteit implements IOrganisatieEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatie", nullable = false)
	private Organisatie organisatie;

	public OrganisatieEntiteit() {
	}

	@Override
	public Organisatie getOrganisatie() {
		return organisatie;
	}

	public boolean isLandelijk() {
		return false;
	}
}
