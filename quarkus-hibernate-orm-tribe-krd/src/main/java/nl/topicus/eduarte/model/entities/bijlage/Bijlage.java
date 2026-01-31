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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Algemene bijlage entiteit, Als er een bijlage gekoppeld moet worden aan bijvoorbeeld
 * een deelnemer, maak dan een Koppeltabel DeelnemerBijlage
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Bijlage extends InstellingEntiteit implements IDownloadable
{
	/**
	 * Wel nullable voor technische bijlage's, zoals bijvoorbeeld foto's.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "documentType")
	private DocumentType documentType;

	@Column(nullable = true, length = 200)
	private String omschrijving;

	@Column(length = 200, nullable = true)
	private String documentnummer;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date ontvangstdatum;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date geldigTot;

	@Column(length = 200, nullable = true)
	private String locatie;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private TypeBijlage typeBijlage;

	@Column(length = 200, nullable = true)
	private String bestandsnaam;

	@Lob()
	private byte[] bestand;

	@Column(nullable = true)
	private Long bestandSize;

	@Column(length = 1000, nullable = true)
	private String link;

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getDocumentnummer() {
		return documentnummer;
	}

	public void setDocumentnummer(String documentnummer) {
		this.documentnummer = documentnummer;
	}

	public Date getOntvangstdatum() {
		return ontvangstdatum;
	}

	public void setOntvangstdatum(Date ontvangstdatum) {
		this.ontvangstdatum = ontvangstdatum;
	}

	public Date getGeldigTot() {
		return geldigTot;
	}

	public void setGeldigTot(Date geldigTot) {
		this.geldigTot = geldigTot;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public TypeBijlage getTypeBijlage() {
		return typeBijlage;
	}

	public void setTypeBijlage(TypeBijlage typeBijlage) {
		this.typeBijlage = typeBijlage;
	}

	@Override
	public String getBestandsnaam() {
		return bestandsnaam;
	}

	public void setBestandsnaam(String bestandsnaam) {
		this.bestandsnaam = bestandsnaam;
	}

	@Override
	public byte[] getBestand() {
		return bestand;
	}

	public void setBestand(byte[] bestand) {
		this.bestand = bestand;
	}

	public Long getBestandSize() {
		return bestandSize;
	}

	public void setBestandSize(Long bestandSize) {
		this.bestandSize = bestandSize;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
}
