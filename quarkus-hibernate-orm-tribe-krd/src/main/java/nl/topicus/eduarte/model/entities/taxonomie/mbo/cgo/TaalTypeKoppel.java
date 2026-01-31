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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class TaalTypeKoppel extends LandelijkOfInstellingEntiteit {
	@ManyToOne(optional = false)
	@JoinColumn(name = "type", nullable = false)
	private TaalType type;

	@ManyToOne(optional = false)
	@JoinColumn(name = "taal", nullable = false)
	private ModerneTaal taal;

	public TaalType getType() {
		return type;
	}

	public void setType(TaalType type) {
		this.type = type;
	}

	public ModerneTaal getTaal() {
		return taal;
	}

	public void setTaal(ModerneTaal taal) {
		this.taal = taal;
	}
}
