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

/**
 * De verschillende manieren waarop een meeteenheid aan een organisatie-eenheid
 * of onderwijsaanbod gekoppeld kan zijn.
 *
 */
public enum MeeteenheidKoppelType {
	/**
	 * Algemene meeteenheid voor competenties
	 */
	Algemeen("Opleidingsmatrix"),

	/**
	 * Meeteenheid voor de Leren, Loopbaan en Burgerschap matrix
	 */
	LLB("LLB matrix"),

	/**
	 * Meeteenheid voor moderne talen
	 */
	Taal("Taal"),

	/**
	 * Meeteenheid voor in de vrije matrix
	 */
	Vrij("Vrije matrix");

	private String displayName;

	MeeteenheidKoppelType(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
