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
package nl.topicus.eduarte.model.entities.security.authorization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Hierarchy for Principals. This determines globally what you can do, add new
 * users, perform application maintenance, administrative tasks etc. The lower
 * your level the less you can do. Being super user however does not mean you
 * can do all the tasks.
 *
 */
@XmlType
@XmlEnum
public enum AuthorisatieNiveau {
	/**
	 * performs tasks on users with level APPLICATIE. Always at least 1 super user.
	 */
	@XmlEnumValue("super")
	SUPER(2),
	/**
	 * user management (not including SUPER users).
	 */
	@XmlEnumValue("applicatie")
	APPLICATIE(1),
	/**
	 * regular users.
	 */
	@XmlEnumValue("rest")
	REST(0);

	private int level;

	AuthorisatieNiveau(int level) {
		this.level = level;
	}

	/**
	 * Het niveau, hoe lager hoe minder rechten.
	 *
	 * @return het niveau
	 */
	public int niveau() {
		return level;
	}

	/**
	 * Returns a List of AuthorisatieNiveaus who's niveau/level is below this
	 * niveau/level
	 *
	 * @return list
	 */
	public List<AuthorisatieNiveau> implied() {
		List<AuthorisatieNiveau> all = Arrays.asList(AuthorisatieNiveau.values());
		List<AuthorisatieNiveau> implied = new ArrayList<>();
		for (AuthorisatieNiveau niveau2 : all) {
			if (niveau2.niveau() < niveau())
				implied.add(niveau2);
		}
		return implied;
	}

	/**
	 * Checks if this AuthorisatieNiveau implies the other. In effect this checks if
	 * the level of the other is smaller then this one.
	 *
	 * @param other
	 * @return true if this one implies the other
	 */
	public boolean implies(AuthorisatieNiveau other) {
		return other.level < level;
	}

	/**
	 * Returns a List of AuthorisatieNiveaus who's niveau/level is at or below this
	 * niveau/level
	 *
	 * @return list
	 */
	public List<AuthorisatieNiveau> sameNiveauAndLower() {
		List<AuthorisatieNiveau> all = Arrays.asList(AuthorisatieNiveau.values());
		List<AuthorisatieNiveau> implied = new ArrayList<>();
		for (AuthorisatieNiveau niveau2 : all) {
			if (niveau2.niveau() <= niveau())
				implied.add(niveau2);
		}
		return implied;
	}
}
