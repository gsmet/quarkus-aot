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
package nl.topicus.eduarte.model.signalering;

public enum EventAbonnementType {
	/**
	 * Stuur signalen naar de medewerker indien deze mentor is van de deelnemer waar het signaal
	 * over gaat.
	 */
	Mentor,

	/**
	 * Stuur signalen naar de medewerker indien deze docent is van de deelnemer waar het signaal
	 * over gaat.
	 */
	Docent,

	/**
	 * Stuur signalen naar de medewerker indien deze als uitvoerende staat van de deelnemer waar het
	 * signaal over gaat.
	 */
	Uitvoerende,

	/**
	 * Stuur signalen naar de medewerker indien deze als verantwoordelijke staat van de deelnemer
	 * waar het signaal over gaat.
	 */
	Verantwoordelijke,

	/**
	 * Stuur signalen naar de medewerker indien de deelnemer waar het signaal over gaat in een groep
	 * zit die expliciet door de medewerker geselecteerd is.
	 */
	GeselecteerdeGroepen,

	/**
	 * Stuur signalen naar de medewerker indien de deelnemer waar het signaal over gaat expliciet
	 * door de medewerker geselecteerd is.
	 */
	GeselecteerdeDeelnemers,

	/**
	 * Stuur een taakgerelateerd signaal aan een medewerker indien deze onderdeel is van de taak.
	 */
	TaakGerelateerd,

	/**
	 * Stuur een signaal aan een deelnemer voor het self-service portaal.
	 */
	SelfService,

	/**
	 * Stuur een signaal aan een contactpersoon/praktijkbegeleider voor het bedrijfs portaal.
	 */
	ExterneOrganisatieContactpersoon;
}
