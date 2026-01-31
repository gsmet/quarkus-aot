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
package nl.topicus.eduarte.model.entities.rapportage;

import java.util.ArrayList;
import java.util.List;

import nl.topicus.eduarte.model.entities.bijlage.BijlageEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.bpv.BPVInschrijving;
import nl.topicus.eduarte.model.entities.examen.Examendeelname;
import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

public enum DocumentTemplateContext {
	Verbintenis {
		@Override
		public String getModelName() {
			return "verbintenis";
		}

		@Override
		public Class<Verbintenis> getContextClass() {
			return Verbintenis.class;
		}
	},
	BPVVerbintenis {
		@Override
		public String getModelName() {
			return "bpvInschrijving";
		}

		@Override
		public Class<BPVInschrijving> getContextClass() {
			return BPVInschrijving.class;
		}
	},
	Groep {
		@Override
		public String getModelName() {
			return "groep";
		}

		@Override
		public Class<Groep> getContextClass() {
			return Groep.class;
		}
	},

	/**
	 * Een enum waarde welke alleen bestemd is voor de
	 * {@link OnderwijsDocumentTemplate}. Omdat we niet kunnen erven van een Enum
	 * moeten het maar zo.
	 */
	Examendeelname {
		@Override
		public String getModelName() {
			return "examendeelname";
		}

		@Override
		public Class<Examendeelname> getContextClass() {
			return Examendeelname.class;
		}
	},
	Opleiding {
		@Override
		public String getModelName() {
			return "opleiding";
		}

		@Override
		public Class<Opleiding> getContextClass() {
			return Opleiding.class;
		}
	},
	/**
	 * enums voor de financiele module
	 */
	Debiteur {
		@Override
		public String getModelName() {
			return "debiteur";
		}

		@SuppressWarnings({"unchecked", "rawtypes"})
		@Override
		public Class getContextClass() {
			return nl.topicus.eduarte.model.entities.Debiteur.class;
		}
	},
	Factuur {
		@Override
		public String getModelName() {
			return "factuur";
		}

		@SuppressWarnings({"unchecked", "rawtypes"})
		@Override
		/*
		 * Dit returned de Deelnemer class omdat gegenereerde facturen ook gekoppeld
		 * worden aan een deelnemer. Het systeem koppelde echter enkel bijlagen aan hun
		 * eigen context (Factuur aan Factuur), met deze uitbreiding kunnen bijlagen ook
		 * aan een andere context gehangen worden (Factuur aan Deelnemer).
		 */
		public Class getContextClass() {
			return Deelnemer.class;
		}
	};

	/**
	 * @return de naam van het begin entiteit waarmee de rapportage tooling het
	 *         model afstruint.
	 */
	public abstract String getModelName();

	/**
	 * @return de class van het context object.
	 */
	public abstract Class<? extends IBijlageKoppelEntiteit<? extends BijlageEntiteit>> getContextClass();

	/**
	 * Alternatief voor values(), dit geeft niet de {@link Examendeelname} waarde
	 * mee.
	 *
	 * @return de waarden waaruit geselecteerd kan worden bij het maken van een
	 *         generiek samenvoegdocument (en dus niet een examendocument).
	 */
	public static DocumentTemplateContext[] getValues() {
		List<DocumentTemplateContext> values = new ArrayList<>();
		values.add(DocumentTemplateContext.Verbintenis);
		values.add(DocumentTemplateContext.Groep);
		values.add(DocumentTemplateContext.BPVVerbintenis);
		values.add(DocumentTemplateContext.Opleiding);

		return values.toArray(new DocumentTemplateContext[0]);
	}
}
