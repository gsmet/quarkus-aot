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
 */
public enum UitstroomType {
	/**
	 * Een gewone uitstroom.
	 */
	StandaardUitstroom("Standaard uitstroom"),

	/**
	 * Uitstroom die eigenlijk het dossier zelf representeert als "algemene
	 * uitstroom". Deelnemers zouden deze bijv. kunnen volgen alvorens een van de
	 * specifiekere standaard uitstromen bij het dossier te volgen. De
	 * dossieruitstroom wordt aangemaakt door de matrices van alle uitstromen bij
	 * het dossier over elkaar te leggen.
	 */
	DossierUitstroom("Dossier uitstroom");

	private String displayName;

	UitstroomType(String displayName) {
		this.displayName = displayName;
	}

	@Override
	public String toString() {
		return displayName;
	}
}
