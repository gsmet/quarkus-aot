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
package nl.topicus.eduarte.model.entities.vrijevelden;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "VrijVeldOptieKeuze")
public class VrijVeldOptieKeuze extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "optie", nullable = false)
	private VrijVeldKeuzeOptie optie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "entiteit", nullable = false)
	private VrijVeldEntiteit entiteit;

	public VrijVeldOptieKeuze() {
	}

	public VrijVeldKeuzeOptie getOptie() {
		return optie;
	}

	public void setOptie(VrijVeldKeuzeOptie optie) {
		this.optie = optie;
	}

	public VrijVeldEntiteit getEntiteit() {
		return entiteit;
	}

	public void setEntiteit(VrijVeldEntiteit entiteit) {
		this.entiteit = entiteit;
	}
}
