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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

public final class FormuleBerekening {
	// public static BigDecimal bereken(Map<Toets, Resultaat> deeltoetsen, Toets
	// samengesteldeToets)
	// throws EvaluationException {
	// Evaluator eval = new Evaluator();
	// for (Map.Entry<Toets, Resultaat> curEntry : deeltoetsen.entrySet()) {
	// Toets toets = curEntry.getKey();
	// Resultaat resultaat = curEntry.getValue();
	// String afkorting = toets.getCode();
	// try {
	// eval.isValidName(afkorting);
	// if (resultaat == null || resultaat.isNullResultaat()) {
	// if (toets.getSchaal().getSchaaltype() == Schaaltype.Tekstueel)
	// eval.putVariable(afkorting, "''");
	// else
	// eval.putVariable(afkorting, "0");
	// eval.putVariable(afkorting + "_cijfer", "0");
	// eval.putVariable(afkorting + "_behaald", "0");
	// } else {
	// if (toets.getSchaal().getSchaaltype() == Schaaltype.Tekstueel)
	// eval.putVariable(afkorting, "'" + resultaat.getFormattedDisplayCijfer() +
	// "'");
	// else
	// eval.putVariable(afkorting, resultaat.getCijfer().toPlainString());
	// eval.putVariable(afkorting + "_cijfer",
	// resultaat.getCijfer().toPlainString());
	// eval.putVariable(afkorting + "_behaald", resultaat.isBehaald() ? "1" : "0");
	// eval.putVariable(afkorting + "_weging",
	// Integer.toString(resultaat.getWegingVoorBerekening()));
	// }
	// eval.putVariable(afkorting + "_volgnummer",
	// Integer.toString(toets.getVolgnummer()));
	// } catch (IllegalArgumentException e) {
	// }
	// }
	// eval.putFunction(AantalKleinerDan.INSTANCE);
	// eval.putFunction(AantalGroterDan.INSTANCE);
	// eval.putFunction(Gemiddeld.INSTANCE);
	// eval.putFunction(Als.INSTANCE);
	//
	// try {
	// eval.parse(samengesteldeToets.getFormule());
	// return new BigDecimal(eval.evaluate());
	// } catch (NumberFormatException e) {
	// throw new EvaluationException(e);
	// }
	// }
}
