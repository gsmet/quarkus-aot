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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class InloopCollegeGroep extends InstellingEntiteit implements IInloopCollegeKoppeling<Groep> {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "inloopCollege")
	private InloopCollege inloopCollege;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groep", nullable = false)
	private Groep groep;

	public InloopCollegeGroep() {
	}

	@Override
	public InloopCollege getInloopCollege() {
		return inloopCollege;
	}

	@Override
	public void setInloopCollege(InloopCollege inloopCollege) {
		this.inloopCollege = inloopCollege;
	}

	public void setGroep(Groep groep) {
		this.groep = groep;
	}

	public Groep getGroep() {
		return groep;
	}

	@Override
	public void setKoppeling(Groep entiteit) {
		setGroep(entiteit);
	}

	@Override
	public Groep getKoppeling() {
		return getGroep();
	}
}
