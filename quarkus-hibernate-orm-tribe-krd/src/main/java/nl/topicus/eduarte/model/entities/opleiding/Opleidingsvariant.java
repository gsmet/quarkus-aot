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
package nl.topicus.eduarte.model.entities.opleiding;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

/**
 * Een opleidingsvariant is een variant van een andere opleiding. Dit is
 * bijvoorbeeld het geval wanneer een student zich in eerste instantie voor een
 * opleiding aanmeldt en zich in een later stadium specialiseert in een bepaalde
 * richting. Er kunnen ook instroomvarianten zijn voor bijv. verschillende
 * vooropleidingen.
 *
 *
 * Opleidingsvariant is een subclass van opleiding. Hierdoor functioneert een
 * opleidingsvariant als een gewone opleiding, in de zin dat er studenten op
 * kunnen worden ingeschreven, onderwijsproducten voor kunnen worden afgenomen
 * en diploma’s kunnen worden uitgegeven. Een opleidingsvariant hoort daarnaast
 * ook bij een opleiding (de parent). De criteriumbank past de regels van zowel
 * de opleidingsvariant als zijn bovenliggende opleiding toe. Wanneer studenten
 * op opleiding worden geselecteerd, worden ook studenten geselecteerd die zijn
 * ingeschreven op de onderliggende opleidingsvarianten.
 * </p>
 *
 *
 * De parent van deze opleidingsvariant mag niet zelf een opleidingsvariant
 * zijn: de hiërarchie is max. 2 lagen diep. De setParent-methode dwingt dit af.
 * </p>
 *
 */
@Entity()
@BatchSize(size = 20)
public class Opleidingsvariant extends Opleiding {

	private boolean instroomvariant = true;

	private boolean uitstroomvariant = true;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "parent")
	private Opleiding parent;

	public boolean isInstroomvariant() {
		return instroomvariant;
	}

	public void setInstroomvariant(boolean instroomvariant) {
		this.instroomvariant = instroomvariant;
	}

	public boolean isUitstroomvariant() {
		return uitstroomvariant;
	}

	public void setUitstroomvariant(boolean uitstroomvariant) {
		this.uitstroomvariant = uitstroomvariant;
	}

	public Opleiding getParent() {
		return parent;
	}

	public void setParent(Opleiding parent) {
		this.parent = parent;
	}
}
