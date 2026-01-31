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
package nl.topicus.eduarte.model.entities.taxonomie;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Een verbintenisgebied kan onderdeel zijn van een ander verbintenisgebied,
 * zoals LLB een onderdeel is van elke uitstroom.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "parent", "child" }) })
public class VerbintenisgebiedOnderdeel extends LandelijkOfInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent", nullable = false)
	private Verbintenisgebied parent;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "child", nullable = false)
	private Verbintenisgebied child;

	public Verbintenisgebied getParent() {
		return parent;
	}

	public void setParent(Verbintenisgebied parent) {
		this.parent = parent;
	}

	public Verbintenisgebied getChild() {
		return child;
	}

	public void setChild(Verbintenisgebied child) {
		this.child = child;
	}
}
