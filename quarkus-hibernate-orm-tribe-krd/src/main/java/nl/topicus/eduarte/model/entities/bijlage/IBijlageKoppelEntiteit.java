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
package nl.topicus.eduarte.model.entities.bijlage;

import java.util.List;

import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.onderwijsproduct.OnderwijsproductBijlage;

/**
 * Entiteit welke 0 of meer {@link Bijlage} koppel objecten kan hebben.
 * Voorbeeld: {@link Onderwijsproduct} met koppel object
 * {@link OnderwijsproductBijlage}.
 *
 */
public interface IBijlageKoppelEntiteit<T extends BijlageEntiteit> {
	List<T> getBijlagen();

	void setBijlagen(List<T> bijlagen);

	boolean bestaatBijlage(Bijlage bijlage);

	/**
	 * Linkt de bijlage aan deze entiteit. Er wordt echter geen begindatum/einddatum
	 * opgegeven en het object wordt niet opgeslagen.
	 */
	T addBijlage(Bijlage bijlage);
}
