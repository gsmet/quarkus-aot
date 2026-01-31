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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.LandelijkEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.mbo.AbstractMBOVerbintenisgebied;

/**
 * Koppeltabel tussen taxonomie-element en MBO Leerweg.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "taxonomieElement", "mboLeerweg" }) })
public class TaxonomieElementMBOLeerweg extends LandelijkEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "taxonomieElement")
	private AbstractMBOVerbintenisgebied taxonomieElement;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private MBOLeerweg mboLeerweg;

	/**
	 * Default constructor voor Hibernate.
	 */
	public TaxonomieElementMBOLeerweg() {
	}

	/**
	 * @return Returns the taxonomieElement.
	 */
	public AbstractMBOVerbintenisgebied getTaxonomieElement() {
		return taxonomieElement;
	}

	/**
	 * @param taxonomieElement The taxonomieElement to set.
	 */
	public void setTaxonomieElement(AbstractMBOVerbintenisgebied taxonomieElement) {
		this.taxonomieElement = taxonomieElement;
	}

	/**
	 * @return Returns the mboLeerweg.
	 */
	public MBOLeerweg getMboLeerweg() {
		return mboLeerweg;
	}

	/**
	 * @param mboLeerweg The mboLeerweg to set.
	 */
	public void setMboLeerweg(MBOLeerweg mboLeerweg) {
		this.mboLeerweg = mboLeerweg;
	}

}
