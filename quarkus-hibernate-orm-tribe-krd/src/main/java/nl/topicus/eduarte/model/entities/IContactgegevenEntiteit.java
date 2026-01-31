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

import nl.topicus.eduarte.model.entities.adres.SoortContactgegeven;

/**
 * Entiteit welke een enkel contactgegeven bevat.
 *
 */
public interface IContactgegevenEntiteit {
	/**
	 * @return Returns the contactgegeven.
	 */
	String getContactgegeven();

	/**
	 * @param contactgegeven The contactgegeven to set.
	 */
	void setContactgegeven(String contactgegeven);

	/**
	 * @return Returns the geheim.
	 */
	boolean isGeheim();

	/**
	 * @param geheim The geheim to set.
	 */
	void setGeheim(boolean geheim);

	/**
	 * @return Returns the soortContactgegeven.
	 */
	SoortContactgegeven getSoortContactgegeven();

	/**
	 * @param soortContactgegeven The soortContactgegeven to set.
	 */
	void setSoortContactgegeven(SoortContactgegeven soortContactgegeven);

	/**
	 * @return Returns the volgorde.
	 */
	int getVolgorde();

	/**
	 * @param volgorde The volgorde to set.
	 */
	void setVolgorde(int volgorde);

	/**
	 * @return Het contactgegeven of '**********' als het geheim is.
	 */
	String getFormattedContactgegeven();
}
