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
package nl.topicus.eduarte.model.entities.adres;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlType;

/**
 * Een onderwijsinstelling kan zelf allerlei soorten contactgegevens vastleggen, zoals
 * bijvoorbeeld thuistelefoon, mobieltelefoon etc. Het systeem kent zelf ook een aantal
 * 'globale' types. Deze worden gebruikt om op bepaalde plekken in de applicatie relevante
 * informatie te kunnen tonen.
 * 
 */
@XmlType
@XmlEnum(String.class)
public enum TypeContactgegeven
{
	/**
	 * Overig (onbekend)
	 */
	Overig,
	/**
	 */
	Telefoon,
	/**
	 * Faxnummer
	 */
	Fax,
	/**
	 * Mobieltelefoon
	 */
	Mobieltelefoon,
	/**
	 * Emailadres
	 */
	Email
	{
		@Override
		public String toString()
		{
			return "E-mail";
		}
	},
	/**
	 * Homepage
	 */
	Homepage;

}
