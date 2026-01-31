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
package nl.topicus.eduarte.model.entities.security.authentication;

/**
 */
public enum AccountType
{
	/**
	 * Alle type accounts.
	 */
	All("Alle types")
	{
		/**
		 * @see nl.topicus.eduarte.model.entities.security.authentication.AccountType#getType()
		 */
		@Override
		public Class< ? extends Account> getType()
		{
			return Account.class;
		}
	},
	/**
	 * Account type voor medewerkers.
	 */
	Medewerker("Medewerkers")
	{
		/**
		 * @see nl.topicus.eduarte.model.entities.security.authentication.AccountType#getType()
		 */
		@Override
		public Class< ? extends Account> getType()
		{
			return MedewerkerAccount.class;
		}
	},
	/**
	 * Account type voor deelnemers.
	 */
	Deelnemer("Deelnemers")
	{
		/**
		 * @see nl.topicus.eduarte.model.entities.security.authentication.AccountType#getType()
		 */
		@Override
		public Class< ? extends Account> getType()
		{
			return DeelnemerAccount.class;
		}
	};

	private final String label;

	private AccountType(String label)
	{
		this.label = label;

	}

	/**
	 * De class van de specifieke subclass van dit type {@link Account}.
	 * 
	 * @return subclass
	 */
	public abstract Class< ? extends Account> getType();

	/**
	 * @see java.lang.Enum#toString()
	 */
	@Override
	public String toString()
	{
		return label;
	}
}
