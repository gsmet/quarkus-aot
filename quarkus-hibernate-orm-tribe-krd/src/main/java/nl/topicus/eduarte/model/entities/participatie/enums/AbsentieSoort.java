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
package nl.topicus.eduarte.model.entities.participatie.enums;

/**
 * Geeft aan wat voor absentiesoort een absentiereden is.
 * 
 */
public enum AbsentieSoort
{
	/**
	 * Absent, dus zal niet aanwezig zijn in de les.
	 */
	Absent,
	/**
	 * Te laat, dus wel aanwezig in de les. De begintijd van de melding zou gelijk moeten
	 * zijn aan de begintijd van de les/afpraak waarvoor de deelnemer te laat is, en de
	 * eindtijd zou gelijk moeten zijn aan de tijd dat de deelnemer wel komt opdagen.
	 */
	Telaat,
	/**
	 * Uit de les verwijderd, dus wel aanwezig in de les. De begintijd van de melding zou
	 * gelijk moeten zijn aan de tijd dat de deelnemer uit de les verwijderd werd, en de
	 * eindtijd zou gelijk moeten zijn aan de tijd dat de deelnemer weer toegelaten werd
	 * tot de les, of gelijk aan de eindtijd van de les.
	 */
	Verwijderd;

}
