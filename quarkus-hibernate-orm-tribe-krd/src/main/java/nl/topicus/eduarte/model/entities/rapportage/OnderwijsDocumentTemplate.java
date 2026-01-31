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

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.taxonomie.Taxonomie;

/**
 * Document template voor onderwijs items.
 *
 */
@Entity()
public class OnderwijsDocumentTemplate extends DocumentTemplate {
	public enum ExamenDocumentTemplateType {
		Onderwijsovereenkomst {

			@Override
			public DocumentTemplateCategorie getTemplateCategorie() {
				return DocumentTemplateCategorie.Onderwijsovereenkomst;
			}

			@Override
			public DocumentTemplateContext getTemplateContext() {
				return DocumentTemplateContext.Verbintenis;
			}

		},
		BPVovereenkomst {
			@Override
			public String toString() {
				return "BPV-overeenkomst";
			}

			@Override
			public DocumentTemplateCategorie getTemplateCategorie() {
				return DocumentTemplateCategorie.BPVOvereenkomst;
			}

			@Override
			public DocumentTemplateContext getTemplateContext() {
				return DocumentTemplateContext.BPVVerbintenis;
			}
		},
		Diploma {
			@Override
			public DocumentTemplateCategorie getTemplateCategorie() {
				return DocumentTemplateCategorie.Examens;
			}

			@Override
			public DocumentTemplateContext getTemplateContext() {
				return DocumentTemplateContext.Examendeelname;
			}
		},
		Cijferlijst {
			@Override
			public DocumentTemplateCategorie getTemplateCategorie() {
				return DocumentTemplateCategorie.Examens;
			}

			@Override
			public DocumentTemplateContext getTemplateContext() {
				return DocumentTemplateContext.Examendeelname;
			}
		},
		Certificaat {
			@Override
			public DocumentTemplateCategorie getTemplateCategorie() {
				return DocumentTemplateCategorie.Examens;
			}

			@Override
			public DocumentTemplateContext getTemplateContext() {
				return DocumentTemplateContext.Examendeelname;
			}
		};

		public abstract DocumentTemplateCategorie getTemplateCategorie();

		public abstract DocumentTemplateContext getTemplateContext();
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxonomie", nullable = true)
	@Basic(optional = false)
	private Taxonomie taxonomie;

	@Column(nullable = true)
	@Enumerated(value = EnumType.STRING)
	private ExamenDocumentTemplateType examenDocumentType;

	public OnderwijsDocumentTemplate() {
	}

	public Taxonomie getTaxonomie() {
		return taxonomie;
	}

	public void setTaxonomie(Taxonomie taxonomie) {
		this.taxonomie = taxonomie;
	}

	public ExamenDocumentTemplateType getExamenDocumentType() {
		return examenDocumentType;
	}

	public void setExamenDocumentType(ExamenDocumentTemplateType examenDocumentType) {
		this.examenDocumentType = examenDocumentType;
	}
}
