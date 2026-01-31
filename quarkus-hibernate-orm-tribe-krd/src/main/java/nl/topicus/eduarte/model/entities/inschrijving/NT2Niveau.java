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
package nl.topicus.eduarte.model.entities.inschrijving;

public enum NT2Niveau {
	Nul {
		@Override
		public String toString() {
			return "0";
		}
	},
	A1, A2, B1, B2, C1, C2;

	/**
	 * @return de beschikbare niveaus voor het niveau taalvaardigheid van
	 *         inburgeraars
	 */
	public static NT2Niveau[] inburgeringsNiveaus() {
		return new NT2Niveau[] { Nul, A1, A2 };
	}

}
