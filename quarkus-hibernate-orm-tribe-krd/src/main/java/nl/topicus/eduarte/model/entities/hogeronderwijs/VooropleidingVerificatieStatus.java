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

public enum VooropleidingVerificatieStatus implements KeyValue
{
	Afmelden("A"),
	CentrGeverifrd("GD", "Centraal geverifieerd"),
	StudVolgtOpl("GV", "Student volgt vooropleiding"),
	NietGeverifrdIB("NG", "Niet geverifieerd o.b.v IB-groep"),
	GeenToest("NT", "Geen toestemming"),
	NietMogelijk("NV", "Niet mogelijk"),
	ToestOnbekend("NX", "Toestemming onbekend"),
	DecentrlGeverifrdInst("DD", "Decentraal geverifieerd bij instelling"),
	DecentrlGeverifrdIB("ID", "Decentraal geverifieerd bij IB-Groep"),
	NietGeverifrdIBInst("N", "Niet geverifieerd door IB en instelling");

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

	private VooropleidingVerificatieStatus(String key)
	{
		this.key = key;
		this.value = name();
	}

	private VooropleidingVerificatieStatus(String key, String value)
	{
		this.key = key;
		this.value = value;
	}

	public boolean isOK()
	{
		return this.equals(CentrGeverifrd) || this.equals(DecentrlGeverifrdIB)
			|| this.equals(DecentrlGeverifrdInst);
	}

	public boolean kanAfgemeldWorden()
	{
		return this.equals(DecentrlGeverifrdInst);
	}

	@Override
	public String toString()
	{
		return value;
	}
}
