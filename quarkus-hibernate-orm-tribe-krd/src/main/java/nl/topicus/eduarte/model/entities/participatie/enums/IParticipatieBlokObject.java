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

import java.util.Date;

/**
 */
public interface IParticipatieBlokObject
{
	/**
	 * @param datum
	 *            De datum waarop gecontroleerd moet worden
	 * @return true als dit object actief is op de gegeven datum.
	 */
	public boolean isActiefOpDatum(Date datum);

	/**
	 * @return De begintijd van dit blokobject.
	 */
	public Date getBeginDatumTijd();

	/**
	 * @return De eindtijd van dit blokobject.
	 */
	public Date getEindDatumTijd();

	/**
	 * @return het beginlesuur van dit blokobject
	 */
	public Integer getBeginLesuur();

	/**
	 * @return het eindlesuur van dit blokobject
	 */
	public Integer getEindLesuur();

	/**
	 * @return De css-class die gebruikt moet worden voor dit blokobject.
	 */
	public String getCssClass();

	/**
	 * @return De title (tool-tip) die getoond moet worden voor dit blokobject.
	 */
	public String getTitle();

}
