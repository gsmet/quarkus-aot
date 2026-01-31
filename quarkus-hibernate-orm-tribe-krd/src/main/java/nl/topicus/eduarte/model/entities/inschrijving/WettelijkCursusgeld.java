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

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

import nl.topicus.eduarte.model.duo.bron.bve.waardelijsten.Intensiteit;
import nl.topicus.eduarte.model.entities.landelijk.Schooljaar;
import nl.topicus.eduarte.model.entities.taxonomie.MBOLeerweg;
import nl.topicus.eduarte.model.entities.taxonomie.MBONiveau;

public class WettelijkCursusgeld
{
	private static final Map<Schooljaar, BigDecimal> BBL_OF_DEELTIJD_BOL_NIVO_1_2 =
			new HashMap<>();

	private static final Map<Schooljaar, BigDecimal> BBL_OF_DEELTIJD_BOL_NIVO_3_4 =
			new HashMap<>();

	private static final Map<Schooljaar, BigDecimal> VAVO_PRIJS_PER_45_MINUTEN =
			new HashMap<>();

	static
	{
		// bedragen 2008/2009
		BBL_OF_DEELTIJD_BOL_NIVO_1_2.put(Schooljaar.valueOf(2008), new BigDecimal("205.00"));
		BBL_OF_DEELTIJD_BOL_NIVO_3_4.put(Schooljaar.valueOf(2008), new BigDecimal("499.00"));
		VAVO_PRIJS_PER_45_MINUTEN.put(Schooljaar.valueOf(2008), new BigDecimal("0.64"));

		// bedragen 2009/2010
		BBL_OF_DEELTIJD_BOL_NIVO_1_2.put(Schooljaar.valueOf(2009), new BigDecimal("210.00"));
		BBL_OF_DEELTIJD_BOL_NIVO_3_4.put(Schooljaar.valueOf(2009), new BigDecimal("511.00"));
		VAVO_PRIJS_PER_45_MINUTEN.put(Schooljaar.valueOf(2009), new BigDecimal("0.65"));

		// bedragen 2010/2011
		BBL_OF_DEELTIJD_BOL_NIVO_1_2.put(Schooljaar.valueOf(2010), new BigDecimal("213.00"));
		BBL_OF_DEELTIJD_BOL_NIVO_3_4.put(Schooljaar.valueOf(2010), new BigDecimal("517.00"));
		VAVO_PRIJS_PER_45_MINUTEN.put(Schooljaar.valueOf(2010), new BigDecimal("0.67"));
	}

	public static boolean isVoltijdBOL(Verbintenis verbintenis)
	{
		var opleiding = verbintenis.getOpleiding();
		if (opleiding != null)
		{
			var leerweg = opleiding.getLeerweg();

			return ((MBOLeerweg.BOL.equals(leerweg) && Intensiteit.Voltijd.equals(verbintenis
					.getIntensiteit())));
		}
		return false;
	}

	public static boolean isBBLofDeeltijdBOL(Verbintenis verbintenis)
	{
		var opleiding = verbintenis.getOpleiding();
		if (opleiding != null)
		{
			var leerweg = opleiding.getLeerweg();

			return (MBOLeerweg.BBL.equals(leerweg) || (MBOLeerweg.BOL.equals(leerweg) && Intensiteit.Deeltijd
					.equals(verbintenis.getIntensiteit())));
		}
		return false;
	}

	/**
	 * Berekent het bedrag dat in rekening gebracht moet worden na aftrek van gemiste
	 * maanden aan het begin of het einde van de verbintenis.
	 */
	public static BigDecimal verrekenGemisteMaanden(Schooljaar schooljaar, Verbintenis verbintenis,
			BigDecimal bedrag)
	{
		if (verbintenis.getEinddatum() != null
				&& verbintenis.getEinddatum().before(schooljaar.getEenOktober()))
			return null;

		var result = bedrag;
		result = result.subtract(getKortingBegin(schooljaar, verbintenis, bedrag));
		result = result.subtract(getKortingEind(schooljaar, verbintenis, bedrag));

		return result;
	}

	/**
	 * Berekent de korting die men krijgt als men later in het schooljaar begint. Dit is
	 * 1/12 van het cursusbedrag voor iedere gemiste maand (na 1 augustus), mits de
	 * begindatum na 1 november van het schooljaar ligt.
	 */
	public static BigDecimal getKortingBegin(Schooljaar schooljaar, Verbintenis verbintenis,
			BigDecimal bedrag)
	{
		var kortingBegin = new BigDecimal("0.00");
		//		Date eenNovember = TimeUtil.getInstance().addMonths(schooljaar.getBegindatum(), 3);
		//		if (!verbintenis.getBegindatum().before(eenNovember))
		//		{
		//			var maandenGemist = 0;
		//			int beginMaand = TimeUtil.getInstance().getMonth(verbintenis.getBegindatum());
		//			if (beginMaand >= Calendar.AUGUST)
		//				maandenGemist = beginMaand - Calendar.AUGUST;
		//			else
		//				maandenGemist = 5 + beginMaand; // januari = 6e maand
		//
		//			kortingBegin =
		//					bedrag.multiply(new BigDecimal(maandenGemist).divide(new BigDecimal(12), 5,
		//							BigDecimal.ROUND_HALF_UP));
		//		}
		return kortingBegin;
	}

	/**
	 * Berekent de korting waar men recht op heeft als men eerder in het schooljaar slaagt
	 * voor de opleiding. Dit is 1/10 voor iedere gemiste maand (voor 1 juni).
	 */
	public static BigDecimal getKortingEind(Schooljaar schooljaar, Verbintenis verbintenis,
			BigDecimal bedrag)
	{
		var kortingEind = new BigDecimal("0.00");
		//		if (verbintenis.getEinddatum() != null
		//				&& verbintenis.getEinddatum().before(schooljaar.getEinddatum())
		//				&& verbintenis.getRedenUitschrijving() != null
		//				&& verbintenis.getRedenUitschrijving().isGeslaagd())
		//		{
		//			var maandenGemist = 0;
		//			int eindMaand = TimeUtil.getInstance().getMonth(verbintenis.getEinddatum());
		//			if (eindMaand >= Calendar.JANUARY && eindMaand < Calendar.MAY)
		//				maandenGemist = Calendar.MAY - eindMaand;
		//			else if (eindMaand >= Calendar.AUGUST)
		//				maandenGemist = 16 - eindMaand;
		//			if (maandenGemist > 0)
		//			{
		//				kortingEind =
		//						bedrag.multiply(new BigDecimal(maandenGemist).divide(new BigDecimal(10)));
		//			}
		//		}
		return kortingEind;
	}

	/**
	 * @return Het jaarbedrag dat bij deze opleiding hoort. Eventuele korting ivm gemiste
	 *         maanden moet nog verrekend worden. Retourneert null indien voor deze
	 *         verbintenis geen wettelijk cursusgeld hoeft te worden berekend of kan
	 *         worden berekend.
	 */
	@SuppressWarnings("deprecation")
	public static BigDecimal getOpleidingBedrag(Verbintenis verbintenis, Schooljaar schooljaar)
	{
		BigDecimal result = null;
		var opleiding = verbintenis.getOpleiding();
		if (opleiding != null)
		{
			if (isBBLofDeeltijdBOL(verbintenis))
			{
				var niveau = opleiding.getNiveau();
				if (MBONiveau.Niveau1.equals(niveau) || MBONiveau.Niveau2.equals(niveau))
				{
					result = BBL_OF_DEELTIJD_BOL_NIVO_1_2.get(schooljaar);
				}
				if (MBONiveau.Niveau3.equals(niveau) || MBONiveau.Niveau4.equals(niveau))
				{
					result = BBL_OF_DEELTIJD_BOL_NIVO_3_4.get(schooljaar);
				}
			}
			// VAVO bedragen ahv uurbedrag en contacturen per week
			if (opleiding.isVavo() && verbintenis.getContacturenPerWeek() != null)
			{
				// 40 weken per jaar, per 60 minuten (=4/3 * 45 min)
				var bedrag = VAVO_PRIJS_PER_45_MINUTEN.get(schooljaar);
				if (bedrag != null)
				{
					final var WEKEN_PER_JAAR = 40;
					final var MINUTEN_PER_UUR = 60;
					result =
							bedrag.multiply(
									new BigDecimal(WEKEN_PER_JAAR * MINUTEN_PER_UUR).multiply(verbintenis
											.getContacturenPerWeek())).divide(new BigDecimal(45),
													BigDecimal.ROUND_HALF_UP);
				}
			}
		}

		return result;
	}
}
