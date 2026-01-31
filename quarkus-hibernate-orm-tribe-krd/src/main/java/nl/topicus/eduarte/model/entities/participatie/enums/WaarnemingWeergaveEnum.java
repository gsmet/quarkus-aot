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

public enum WaarnemingWeergaveEnum
{

	/**
	 * Geoorloofd/Ongeoorloofd geeft een 'G' of een 'O' weer
	 */
	Geoorloofd_Ongeoorloofd
	{
		@Override
		public String toString()
		{
			return "Geoorloofd/Ongeoorloofd";
		}
	},
	/**
	 * Geeft de letter van de absentiemeling weer als deze aanwezig is bij de waarnemingm,
	 * anders de A van afwezig
	 */
	AbsentieMeldingOfWaarneming
	{
		@Override
		public String toString()
		{
			return "AbsentieMelding of Waarneming";
		}
	},
	/**
	 * Geeft alleen een P-Present 0f A-Aanwezig weer
	 */
	AlleenWaarneming
	{
		@Override
		public String toString()
		{
			return "Alleen waarneming";
		}
	};
}
