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

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

@Entity
@Table(name = "DeelnemerMatrix")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class DeelnemerMatrix extends InstellingEntiteit {
	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(optional = false, fetch = FetchType.EAGER)
	@JoinColumn(name = "matrix", nullable = false)
	private VrijeMatrix matrix;

	@ManyToOne
	@Basic(optional = true)
	@JoinColumn(name = "meeteenheid", nullable = true)
	private Meeteenheid meeteenheid;

	public Meeteenheid getMeeteenheid() {
		return meeteenheid;
	}

	public void setMeeteenheid(Meeteenheid meeteenheid) {
		this.meeteenheid = meeteenheid;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public String getNaam() {
		return matrix.getNaam();
	}

	public String getType() {
		return matrix.getType();
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public VrijeMatrix getMatrix() {
		return matrix;
	}

	public void setMatrix(VrijeMatrix matrix) {
		this.matrix = matrix;
	}
}
