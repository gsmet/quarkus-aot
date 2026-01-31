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
package nl.topicus.eduarte.model.entities;

import java.util.ArrayList;
import java.util.List;

public enum BronMeldingOnderdeel
{
	Sleutel(306),
	Persoon(310),
	GBA,
	Inschrijving(320, 325, 330),
	Periode(321),
	BPV(322),
	Examen(323, 331),
	Resultaat(326),
	Vak(332, 327),
	NT2Onderdelen(328)
	{
		@Override
		public String toString()
		{
			return "NT2 Onderdelen";
		}
	},
	VOInschrijving(110)
	{
		@Override
		public String toString()
		{
			return "VO-inschrijving";
		}
	},
	VOExamen(120)
	{
		@Override
		public String toString()
		{
			return "VO-examen";
		}
	};
	private List<Integer> recordTypes = new ArrayList<Integer>();

	private BronMeldingOnderdeel(Integer... recordTypes)
	{
		for (Integer recordType : recordTypes)
		{
			this.recordTypes.add(recordType);
		}
	}

	public List<Integer> getRecordTypes()
	{
		return recordTypes;
	}
}