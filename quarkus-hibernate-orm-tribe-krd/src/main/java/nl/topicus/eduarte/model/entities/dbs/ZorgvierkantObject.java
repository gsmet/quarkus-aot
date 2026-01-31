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
package nl.topicus.eduarte.model.entities.dbs;

/**
 */
public interface ZorgvierkantObject {
	/**
	 * Geeft aan of dit object vertrouwelijk is. vertrouwlijke objecten worden
	 * alleen getoond aan medewerkers met voldoende rechten.
	 *
	 * @return true als dit object vertrouwelijk behandeld moet worden, anders false
	 */
	boolean isVertrouwelijk();

	/**
	 * Geeft de eventuele zorglijn aan van dit object. mbv de zorglijn word bepaald
	 * of iemand voldoende is geauthoriseerd om dit object in te zien.
	 *
	 * @return zorglijn of null als deze er niet is
	 */
	Integer getZorglijn();

	String getSecurityId();

	String getVertrouwelijkSecurityId();

	boolean isTonenInZorgvierkant();
}
