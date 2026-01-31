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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Legt een mogelijke waarde van een Meeteenheid vast. Deze bestaat uit een
 * label (String) en een bijbehorende numerieke waarde.
 *
 */
@Entity
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "meeteenheid", "waarde" }),
		@UniqueConstraint(columnNames = { "meeteenheid", "label" }) })
public class MeeteenheidWaarde extends LandelijkOfInstellingEntiteit {
	@Column(nullable = false)
	private Integer waarde;

	/**
	 * Het label dat getoond wordt in een matrixcel (leerpunt e.d.). Mag maximaal 2
	 * karakters zijn.
	 */
	@Column(length = 2, nullable = false)
	private String label;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "meeteenheid", nullable = false)
	private Meeteenheid meeteenheid;

	/**
	 * @return de numerieke waarde van een MeeteenheidWaarde, correspondeert met de
	 *         scores/niveaus die in andere objecten , bv. CompetentieNiveau worden
	 *         opgeslagen
	 */
	public Integer getWaarde() {
		return waarde;
	}

	/**
	 * @param waarde
	 */
	public void setWaarde(Integer waarde) {
		this.waarde = waarde;
	}

	/**
	 * @return het tekstuele label bij een MeeteenheidWaarde
	 */
	public String getLabel() {
		return label;
	}

	/**
	 * @param label
	 */
	public void setLabel(String label) {
		this.label = label;
	}

	/**
	 * @return de bijbehorende meeteenheid
	 */
	public Meeteenheid getMeeteenheid() {
		return meeteenheid;
	}

	/**
	 * @param meeteenheid
	 */
	public void setMeeteenheid(Meeteenheid meeteenheid) {
		this.meeteenheid = meeteenheid;
	}

	@Override
	public String toString() {
		return getLabel();
	}
}
