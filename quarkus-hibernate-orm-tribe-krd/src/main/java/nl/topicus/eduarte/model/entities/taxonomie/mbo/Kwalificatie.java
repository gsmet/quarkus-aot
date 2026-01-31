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
package nl.topicus.eduarte.model.entities.taxonomie.mbo;

import jakarta.persistence.Entity;

/**
 * Kwalificatie in de oude MBO-structuur
 *
 */
@Entity()
public class Kwalificatie extends AbstractMBOVerbintenisgebied {
	/**
	 * Geeft aan of deze kwalificatie van LNV is of niet. Bij LNV-kwalificaties
	 * moeten ook de deelkwalificaties verstuurd worden.
	 */
	public boolean isLnv() {
		// LNV-kwalificaties beginnen allemaal met '11' of '12' OCW-kwalificaties
		// beginnen
		// met
		// '10'.
		if (getExterneCode() != null && getExterneCode().startsWith("11") || getExterneCode().startsWith("12"))
			return true;
		return false;
	}
}
