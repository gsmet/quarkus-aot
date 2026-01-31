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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.entities.bijlage.DocumentType;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.templates.DocumentTemplateType;

/**
 * Document template. Bevat de inhoud van een RTF-bestand als LOB.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class DocumentTemplate extends InstellingEntiteit {
	@Column(nullable = false, length = 200)
	private String omschrijving;

	@Column(length = 200, nullable = false)
	private String bestandsnaam;

	@Column(nullable = false)
	private boolean valid;

	@Column(nullable = false)
	private boolean actief = true;

	@Column(nullable = false)
	private boolean kopieBijContext;

	@Column(nullable = false)
	private boolean sectiePerElement = true;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private DocumentTemplateContext context;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private DocumentTemplateCategorie categorie;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private DocumentTemplateType type;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	@Comment("Selecteer hier een andere waarde wanneer het "
			+ "niet gewenst is om het gegenereerde document in het orginele formaat te downloaden.")
	private DocumentTemplateType forceerType;

	@Column(nullable = false)
	private boolean beperkAutorisatie = false;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "documentType")
	@Comment("Het documenttype dat aan de gegenereerde documenten gekoppeld moet worden")
	private DocumentType documentType;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentTemplate")
	@BatchSize(size = 20)
	private List<DocumentTemplateRecht> rechten = new ArrayList<>();

	/**
	 * Dit heet zzzbestand vanwege ORA-24816. Deze variabele moet zover mogelijk
	 * achterin de insert komen.
	 */
	@Lob()
	private byte[] zzzBestand;

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getBestandsnaam() {
		return bestandsnaam;
	}

	public void setBestandsnaam(String bestandsnaam) {
		this.bestandsnaam = bestandsnaam;
	}

	public boolean isValid() {
		return valid;
	}

	public void setValid(boolean valid) {
		this.valid = valid;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isKopieBijContext() {
		return kopieBijContext;
	}

	public void setKopieBijContext(boolean kopieBijContext) {
		this.kopieBijContext = kopieBijContext;
	}

	public boolean isSectiePerElement() {
		return sectiePerElement;
	}

	public void setSectiePerElement(boolean sectiePerElement) {
		this.sectiePerElement = sectiePerElement;
	}

	public DocumentTemplateContext getContext() {
		return context;
	}

	public void setContext(DocumentTemplateContext context) {
		this.context = context;
	}

	public DocumentTemplateCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(DocumentTemplateCategorie categorie) {
		this.categorie = categorie;
	}

	public DocumentTemplateType getType() {
		return type;
	}

	public void setType(DocumentTemplateType type) {
		this.type = type;
	}

	public DocumentTemplateType getForceerType() {
		return forceerType;
	}

	public void setForceerType(DocumentTemplateType forceerType) {
		this.forceerType = forceerType;
	}

	public boolean isBeperkAutorisatie() {
		return beperkAutorisatie;
	}

	public void setBeperkAutorisatie(boolean beperkAutorisatie) {
		this.beperkAutorisatie = beperkAutorisatie;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public List<DocumentTemplateRecht> getRechten() {
		return rechten;
	}

	public void setRechten(List<DocumentTemplateRecht> rechten) {
		this.rechten = rechten;
	}

	public byte[] getZzzBestand() {
		return zzzBestand;
	}

	public void setZzzBestand(byte[] zzzBestand) {
		this.zzzBestand = zzzBestand;
	}
}
