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
 * Geeft aan wat op welke dag de maatregel moet worden toegekend
 *
 */
public enum MaatregelToekennenOp {
	/**
	 * Maatregel moet op dezelfde dag als de absentiemelding toegekend worden
	 */
	Dezelfde_Dag {
		@Override
		public String toString() {
			return "Dezelfde dag als de absentiemelding";
		}

	},
	/**
	 * De volgende schooldag van de deelnemer. Hierbij wordt rekening gehouden met
	 * het rooster van de deelnemer. Als er geen rooster voor de deelnemer gevonden
	 * kan worden, wordt de volgende schooldag gebruikt.
	 */
	Volgende_Schooldag {
		@Override
		public String toString() {
			return "Volgende schooldag";
		}
	},
	/**
	 * Niet een speciale datum
	 */
	Ongedefinieerd {
		@Override
		public String toString() {
			return "ongedefinieerd";
		}
	};
}
