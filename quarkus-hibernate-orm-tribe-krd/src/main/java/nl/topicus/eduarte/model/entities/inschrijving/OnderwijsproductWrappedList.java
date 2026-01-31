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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import nl.topicus.eduarte.model.entities.onderwijsproduct.OnderwijsproductAfnameContext;
import nl.topicus.eduarte.model.entities.resultaatstructuur.Resultaat;

public class OnderwijsproductWrappedList {
	private Verbintenis verbintenis;

	public OnderwijsproductWrappedList(Verbintenis verbintenis, String arg0) {
		this.verbintenis = verbintenis;
	}

	public List<OnderwijsproductWrappedEntitity> getLijst() {
		Map<OnderwijsproductAfname, Resultaat> resultaten = new HashMap<>();

		List<OnderwijsproductAfname> onderwijsproductAfnames = new ArrayList<>();
		List<OnderwijsproductWrappedEntitity> list = new ArrayList<>();
		for (OnderwijsproductAfnameContext context : verbintenis.getAfnameContexten()) {
			onderwijsproductAfnames.add(context.getOnderwijsproductAfname());
		}

		//		resultaten =
		//				DataAccessRegistry.getHelper(ResultaatDataAccessHelper.class).getEindresultaten(
		//						verbintenis.getDeelnemer(), onderwijsproductAfnames);

		for (OnderwijsproductAfname afname : resultaten.keySet()) {
			list.add(new OnderwijsproductWrappedEntitity(afname.getOnderwijsproduct(), resultaten.get(afname)));
		}

		return list;
	}
}