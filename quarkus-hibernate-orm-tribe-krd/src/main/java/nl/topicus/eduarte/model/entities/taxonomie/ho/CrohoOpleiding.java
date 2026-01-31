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
package nl.topicus.eduarte.model.entities.taxonomie.ho;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.taxonomie.Verbintenisgebied;

@Entity()
public class CrohoOpleiding extends Verbintenisgebied {
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "crohoOpleiding")
	// @OrderBy(value = "brin")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<CrohoOpleidingAanbod> aanbod = new ArrayList<>();

	public List<CrohoOpleidingAanbod> getAanbod() {
		return aanbod;
	}

	public void setAanbod(List<CrohoOpleidingAanbod> aanbod) {
		this.aanbod = aanbod;
	}
}
