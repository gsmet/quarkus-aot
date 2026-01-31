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
package nl.topicus.eduarte.model.entities.participatie.settings;

/**
 * De verschillende manieren waarop absentie dan wel presentie bijgehouden worden.
 * 
 */
public enum AbsentiePresentie
{
	/**
	 * Er worden geen gegevens over absentie of presentie bijgehouden.
	 */
	Geen
	{

		@Override
		public String getHeader()
		{
			return "Presentie";
		}
	},
	/**
	 * Er worden alleen absentie gegevens bijgehouden.
	 */
	Absentie
	{

		@Override
		public String getHeader()
		{
			return "Absentie";
		}
	},
	/**
	 * Er worden alleen presentie gegevens bijgehouden.
	 */
	Presentie
	{

		@Override
		public String getHeader()
		{
			return "Presentie";
		}
	},
	/**
	 * Er worden zowel absentie als presentie gegevens bijgehouden.
	 */
	AbsentiePresentie
	{
		/**
		 * @see java.lang.Enum#toString()
		 */
		@Override
		public String toString()
		{
			return "Absentie en presentie";
		}

		@Override
		public String getHeader()
		{
			return "Presentie";
		}
	};

	/**
	 * @return Header voor gebruik op bijvoorbeeld de zorgvierkantpagina.
	 */
	public abstract String getHeader();
}
