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
package nl.topicus.eduarte.model.entities.hogeronderwijs;

public enum Hoofdfase implements KeyValue
{
	PropBach("D", "Propedeuse bachelor"),
	Bachelor("B"),
	Propedeuse("P"),
	Master("M"),
	Vervolgopl("V", "Vervolgopleiding"),
	Kandidaats("K"),
	Initieel("I"),
	AssDegree("A", "Associate Degree");

	private String key;

	private String value;

	@Override
	public String getKey()
	{
		return key;
	}

	@Override
	public String getValue()
	{
		return value;
	}

	private Hoofdfase(String key)
	{
		this.key = key;
		this.value = name();
	}

	private Hoofdfase(String key, String value)
	{
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString()
	{
		return getValue();
	}

	public static Hoofdfase get(String key)
	{
		for (Hoofdfase fase : values())
			if (fase.key.equals(key))
				return fase;
		return null;
	}
}
