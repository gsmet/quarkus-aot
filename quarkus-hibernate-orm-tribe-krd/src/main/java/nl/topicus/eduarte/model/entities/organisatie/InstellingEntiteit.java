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

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import nl.topicus.eduarte.model.entities.Entiteit;

/**
 */
@MappedSuperclass()
public abstract class InstellingEntiteit extends Entiteit implements IInstellingEntiteit {
	@Column(name = "organisatie", nullable = false)
	private Long organisatie;

	/**
	 * Het id van deze entiteit in het oude pakket (bijvoorbeeld nOISe). Wordt
	 * vooral gebruikt tijdens de conversie.
	 */
	@Column(nullable = true)
	private Long idInOudPakket;

	@Override
	public Instelling getOrganisatie() {
		// geeft organisatie terug natuurlijk
		return null;
	}

	public void setOrganisatie(Instelling organisatie) {
		this.organisatie = organisatie.getId();
	}

	public Long getIdInOudPakket() {
		return idInOudPakket;
	}

	public void setIdInOudPakket(Long idInOudPakket) {
		this.idInOudPakket = idInOudPakket;
	}
}
