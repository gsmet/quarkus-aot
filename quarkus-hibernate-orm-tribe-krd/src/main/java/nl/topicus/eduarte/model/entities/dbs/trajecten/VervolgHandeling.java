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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class VervolgHandeling extends InstellingEntiteit {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vervolg", nullable = false, foreignKey = @ForeignKey(name = "FK_VervHand_vervolg"))
	private BegeleidingsHandeling vervolg;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "voorafgaand", nullable = false, foreignKey = @ForeignKey(name = "FK_VervHand_vooraf"))
	private BegeleidingsHandeling voorafgaand;

	public VervolgHandeling() {

	}

	public BegeleidingsHandeling getVervolg() {
		return vervolg;
	}

	public void setVervolg(BegeleidingsHandeling vervolg) {
		this.vervolg = vervolg;
	}

	public BegeleidingsHandeling getVoorafgaand() {
		return voorafgaand;
	}

	public void setVoorafgaand(BegeleidingsHandeling voorafgaand) {
		this.voorafgaand = voorafgaand;
	}
}
