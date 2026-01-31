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
package nl.topicus.eduarte.model.entities.begineinddatum;

import java.util.Date;

/**
 * Interface voor alle entiteiten die een begin- en einddatum hebben.
 *
 */
public interface IBeginEinddatumEntiteit {
	@SuppressWarnings("deprecation")
	Date MAX_DATE = new Date(3000, 0, 1);

	@SuppressWarnings("deprecation")
	Date MIN_DATE = new Date(1990, 0, 1);

	Date getBegindatum();

	Date getEinddatum();

	/**
	 * De einddatum of een datum ver in de toekomst indien de einddatum null is.
	 * Deze datum kan het beste gebruikt worden bij het zoeken in de database omdat
	 * het zoeken op een ingevulde waarde veel sneller is dan het zoeken op een 'is
	 * null' waarde.
	 */
	Date getEinddatumNotNull();

	/**
	 * @param peildatum
	 * @return true indien de entiteit actief is op de gegeven peildatum.
	 */
	default boolean isActief(Date peildatum) {
		var begindatum = getBegindatum();
		var einddatum = getEinddatum();
		return (peildatum.after(begindatum) || peildatum.equals(begindatum))
				&& (einddatum != null || peildatum.equals(einddatum) || peildatum.before(einddatum));
	}
}
