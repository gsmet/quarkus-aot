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

import java.util.Date;

import nl.topicus.eduarte.model.entities.inschrijving.SoortVooropleiding.SoortOnderwijs;

/**
 * Een vooropleiding of een eerdere verbintenis.
 *
 */
public interface IVooropleiding
{
	/**
	 * @return Het {@link SoortOnderwijs} dat hoort bij deze vooropleiding of verbintenis.
	 *         Hangt af van de opleiding en of een diploma is behaald.
	 */
	SoortOnderwijs getSoortOnderwijs();

	String getOmschrijving();

	String getBrincode();

	String getOrganisatieOmschrijving();

	String getNaamVooropleiding();

	boolean isDiplomaBehaald();

	Date getEinddatum();

	Schooladvies getSchooladvies();

	Integer getCitoscore();
}
