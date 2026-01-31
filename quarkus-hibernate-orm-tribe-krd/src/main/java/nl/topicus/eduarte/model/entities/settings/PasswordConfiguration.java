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
package nl.topicus.eduarte.model.entities.settings;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class PasswordConfiguration implements Serializable {
	@Column(name = "lengte", nullable = true)
	private int lengte;

	@Column(name = "hoofdletters", nullable = true)
	private boolean hoofdletters;

	@Column(name = "leestekens", nullable = true)
	private boolean leestekens;

	public PasswordConfiguration() {
	}

	public int getLengte() {
		return lengte;
	}

	public void setLengte(int lengte) {
		this.lengte = lengte;
	}

	public boolean getHoofdletters() {
		return hoofdletters;
	}

	public void setHoofdletters(boolean hoofdletters) {
		this.hoofdletters = hoofdletters;
	}

	public boolean getLeestekens() {
		return leestekens;
	}

	public void setLeestekens(boolean leestekens) {
		this.leestekens = leestekens;
	}

	/**
	 * Contreleerd of het wachtwoord aan alle eisen voldoet
	 *
	 * @param password het plaintext wachtwoord
	 * @return true als het wachtwoord voldoet, anders false.
	 */
	public boolean validatePassword(String password) {
		var validateMe = password;
		if (validateMe == null)
			validateMe = "";
		validateMe = validateMe.trim(); // strip whitespace

		if (validateMe.length() < getLengte())
			return false;

		var letters = false;
		var otherChars = false;
		var upperCase = false;
		var lowerCase = false;
		int cp;
		for (var i = 0; i < validateMe.length(); i++) {
			cp = validateMe.codePointAt(i);
			if (Character.isUpperCase(cp))
				upperCase = true;
			else if (Character.isLowerCase(cp))
				lowerCase = true;
			if (Character.isLetter(cp))
				letters = true;
			else
				otherChars = true;
		}

		if (getHoofdletters()) {
			if (!(upperCase && lowerCase))
				return false;
		}
		if (getLeestekens()) {
			if (!(letters && otherChars))
				return false;
		}
		return true;
	}

	@Override
	public String toString() {
		var sb = new StringBuilder();
		if (getLengte() > 0)
			sb.append("minimaal " + lengte + " tekens");
		if (getHoofdletters()) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append("minimaal een hoofd- en kleine letter");
		}
		if (getLeestekens()) {
			if (sb.length() > 0)
				sb.append(", ");
			sb.append("minimaal een leesteken");
		}
		return sb.length() == 0 ? "Geen eisen" : sb.toString();
	}
}
