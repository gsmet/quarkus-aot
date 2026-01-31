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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
public class ToetsVerwijzing extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "lezenUit")
	private Toets lezenUit;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "schrijvenIn")
	private Toets schrijvenIn;

	public ToetsVerwijzing() {
	}

	public Toets getLezenUit() {
		return lezenUit;
	}

	public void setLezenUit(Toets lezenUit) {
		this.lezenUit = lezenUit;
	}

	public Toets getSchrijvenIn() {
		return schrijvenIn;
	}

	public void setSchrijvenIn(Toets schrijvenIn) {
		this.schrijvenIn = schrijvenIn;
	}

	@Override
	public String toString() {
		return getLezenUit() + " -> " + getSchrijvenIn();
	}
}
