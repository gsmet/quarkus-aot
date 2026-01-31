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

import jakarta.persistence.Entity;

/**
 */
@Entity()
public class Deelgebied extends TaxonomieElement {
	/**
	 *
	 * @return De taxonomiecode van dit deelgebied zonder de code van het
	 *         verbintenisgebied waarbij het deelgebied hoort (dus zonder alles voor
	 *         de underscore).
	 */
	public String getTaxonomiecodeZonderVerbintenisgebied() {
		var res = getTaxonomiecode();
		var index = res.indexOf("_");
		if (index > -1) {
			res = res.substring(index + 1);
		}
		return res;
	}

	/**
	 * @return Het verbintenisgebied-gedeelte van de taxonomiecode van dit
	 *         deelgebied.
	 */
	public String getTaxonomiecodeZonderDeelgebied() {
		var res = getTaxonomiecode();
		var index = res.indexOf("_");
		if (index > -1) {
			res = res.substring(0, index);
		}
		return res;
	}

	public String getTaxonomiecodeNaam() {
		return getTaxonomiecodeZonderVerbintenisgebied() + " " + getNaam();
	}
}
