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

import java.util.regex.Pattern;

/**
 * De herkanbare taxonomien voor de applicatie.
 *
 */
public enum TaxonomieEnum {
	/**
	 * Competentiegericht onderwijs voor het MBO.
	 */
	CGO("1"),
	/**
	 * MBO kwalificatiestructuur.
	 */
	MBO("2"),
	/**
	 * Voortgezet onderwijs en VAVO.
	 */
	VO("3") {
		@Override
		public boolean heeftLWOO() {
			return true;
		}
	},
	/**
	 * Educatie
	 */
	Educatie("4"), Inburgering("5"), HO("8"),
	/**
	 * Overige taxonomien die door de onderwijsinstellingen zijn aangemaakt;
	 */
	Anders(null);

	// de taxonomiecodes t/m 19 zijn gereserveerd voor toekomstig gebruik
	public final static int EERSTE_VRIJE_CODE = 20;

	/** De code van de taxonomie. */
	private final String code;

	TaxonomieEnum(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	/**
	 * @return true als de gegeven taxonomie overeenkomt met deze taxonomie enum.
	 */
	public boolean isTaxonomieEnum(Taxonomie taxonomie) {
		return taxonomie.getCode() != null && getCode() != null && taxonomie.getCode().equals(getCode());
	}

	/**
	 * @return true indien deze taxonomie lwoo-opleidingen heeft (alleen van
	 *         toepassing voor het vo).
	 */
	public boolean heeftLWOO() {
		return false;
	}

	public static boolean isGereserveerd(String code) {
		try {
			if (TaxonomieEnum.valueOf(code) != null)
				return true;
		} catch (IllegalArgumentException e) {
			// doe niets
		}

		if (Pattern.matches("\\d+", code)) {
			return Integer.valueOf(code) < EERSTE_VRIJE_CODE;
		}

		return false;
	}
}
