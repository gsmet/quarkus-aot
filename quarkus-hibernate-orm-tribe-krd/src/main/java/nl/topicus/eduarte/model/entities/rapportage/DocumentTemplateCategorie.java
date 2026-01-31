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

public enum DocumentTemplateCategorie {
	Intake, Identiteit, Verbintenis, Brieven, Resultaten {
		@Override
		public DocumentTemplateContext getBeperkteContext() {
			return DocumentTemplateContext.Verbintenis;
		}
	},

	/**
	 * Een enum waarde welke alleen bestemd is voor de
	 * {@link OnderwijsDocumentTemplate}. Omdat we niet kunnen erven van een Enum
	 * moeten het maar zo.
	 */
	Examens,

	/**
	 * Een enum waarde welke alleen bestemd is voor de
	 * {@link OnderwijsDocumentTemplate}. Omdat we niet kunnen erven van een Enum
	 * moeten het maar zo.
	 */
	Onderwijsovereenkomst,

	/**
	 * Een enum waarde welke alleen bestemd is voor de
	 * {@link OnderwijsDocumentTemplate}. Omdat we niet kunnen erven van een Enum
	 * moeten het maar zo.
	 */
	BPVOvereenkomst,

	/**
	 * Een enum waarde welke alleen bestemd is voor templates in andere modules.
	 * Omdat we niet kunnen erven van een Enum moet het maar zo.
	 */
	Overig;

	/**
	 * Alternatief voor values(), dit geeft niet de
	 * {@link DocumentTemplateCategorie#Examens} en
	 * {@link DocumentTemplateCategorie#Onderwijsovereenkomst} en
	 * {@link DocumentTemplateCategorie#BPVOvereenkomst} waarde mee.
	 */
	public static DocumentTemplateCategorie[] getValues() {
		List<DocumentTemplateCategorie> values = new ArrayList<>();
		values.add(DocumentTemplateCategorie.Intake);
		values.add(DocumentTemplateCategorie.Identiteit);
		values.add(DocumentTemplateCategorie.Verbintenis);
		values.add(DocumentTemplateCategorie.Brieven);
		values.add(DocumentTemplateCategorie.Resultaten);
		values.add(DocumentTemplateCategorie.Overig);

		return values.toArray(new DocumentTemplateCategorie[0]);
	}

	public static DocumentTemplateCategorie[] getExamenValues() {
		List<DocumentTemplateCategorie> values = new ArrayList<>();
		values.add(DocumentTemplateCategorie.Examens);
		values.add(DocumentTemplateCategorie.Onderwijsovereenkomst);
		values.add(DocumentTemplateCategorie.BPVOvereenkomst);

		return values.toArray(new DocumentTemplateCategorie[0]);
	}

	public DocumentTemplateContext getBeperkteContext() {
		return null;
	}
}
