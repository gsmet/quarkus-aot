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
package nl.topicus.eduarte.model.entities.dbs.testen;

/**
 */
public enum Veldtype
{
	/**
	 * Een tekstveld voor een test
	 */
	Tekst
	{
		@Override
		public Veldwaarde createWaarde()
		{
			return new TekstueleVeldwaarde();
		}
	},
	/**
	 * Een numeriek scoreveld voor een test
	 */
	Numeriek
	{
		@Override
		public Veldwaarde createWaarde()
		{
			return new NumeriekeVeldwaarde();
		}
	};

	public abstract Veldwaarde createWaarde();
}
