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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;

/**
 * Resultaat voor een vervallen OnderwijsproductAfname. Soort 'dummy' resultaat.
 * Alleen te gebruiken in rapportages.
 *
 */
public class ResultaatVervallen extends Resultaat {
	private Onderwijsproduct onderwijsproduct;

	public ResultaatVervallen(Onderwijsproduct onderwijsproduct) {
		this.onderwijsproduct = onderwijsproduct;
	}

	public String getCijferAlsWoord() {
		return "vervallen";
	}

	public String getCijferOfSchaalwaarde() {
		return "--";
	}

	public String getFormattedDisplayCijfer() {
		return "--";
	}

	@Override
	public Toets getToets() {
		Toets toets = new Toets() {
			@Override
			public Resultaatstructuur getResultaatstructuur() {
				Resultaatstructuur resultaatStructuur = new Resultaatstructuur() {
					@Override
					public Onderwijsproduct getOnderwijsproduct() {
						return onderwijsproduct;
					}
				};
				return resultaatStructuur;
			}
		};
		return toets;
	}
}
