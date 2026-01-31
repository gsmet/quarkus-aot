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
package nl.topicus.eduarte.model.entities.taxonomie;

import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkOfInstellingEntiteit;

/**
 * TaxonomieElementen kunnen verbintenisgebieden, deelgebieden of taxonomien
 * zijn. Deze kunnen zowel landelijk als instellingsspecifiek gedefinieerd zijn.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Taxonomie")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "taxonomiecode", "organisatie" }) })
public abstract class TaxonomieElement extends BeginEinddatumLandelijkOfInstellingEntiteit {
	/**
	 * De 'lokale' code van het element
	 */
	@Column(nullable = false, length = 5)
	private String code;

	@Column(nullable = false, length = 50)
	private String afkorting;

	@Column(nullable = false, length = 200)
	private String naam;

	@Column(nullable = true, length = 200)
	private String diplomanaam;

	@Column(nullable = true, length = 200)
	private String internationaleNaam;

	/**
	 * De externe code die gebruikt moet worden in communicatie met externen, zoals
	 * bijvoorbeeld de IB-Groep. Dit kan bijvoorbeeld de crebo-code of elementcode
	 * zijn.
	 */
	@Column(nullable = true, length = 20)
	private String externeCode;

	/**
	 * De volledige taxonomiecode van het element
	 */
	@Column(nullable = false, length = 200)
	private String taxonomiecode;

	@Column(nullable = false, length = 201)
	private String zoekParentCode;

	/**
	 * De volledige code van dit element maar dan in het formaat waarbij elk
	 * afzonderlijk deel van de taxonomiecode aangevuld is zodat deze allemaal uit 4
	 * posities bestaan. 1.1.10.5 wordt dus bijvoorbeeld 0001.0001.0010.0005.
	 */
	@Column(nullable = false, length = 1000)
	private String sorteercode;

	/**
	 * Het element dat 1 niveau boven dit element staat. Mag null zijn indien het
	 * een topelement is.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "parent")
	private TaxonomieElement parent;

	@Column(nullable = false)
	private int volgnummer;

	/**
	 * Nullable omdat het anders onmogelijk is om een insert te doen van een nieuwe
	 * taxonomie.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "taxonomie")
	private Taxonomie taxonomie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "taxonomieElementType")
	private TaxonomieElementType taxonomieElementType;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TaxonomieElement> children;

	/**
	 * een vrije matrix is een taxonomie element. Echter mag een vrije matrix nooit
	 * in de zoek resultaten van de taxonomieelementen voorkomen. Vrije matrix heeft
	 * een relatie met deelnemer. Dat heeft een taxonomieelement nooit.
	 * uitzonderlijk is dus false wanneer het geen vrije matrix is.
	 */
	@Column(nullable = false)
	private boolean uitzonderlijk = false;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getDiplomanaam() {
		return diplomanaam;
	}

	public void setDiplomanaam(String diplomanaam) {
		this.diplomanaam = diplomanaam;
	}

	public String getInternationaleNaam() {
		return internationaleNaam;
	}

	public void setInternationaleNaam(String internationaleNaam) {
		this.internationaleNaam = internationaleNaam;
	}

	public String getExterneCode() {
		return externeCode;
	}

	public void setExterneCode(String externeCode) {
		this.externeCode = externeCode;
	}

	public String getTaxonomiecode() {
		return taxonomiecode;
	}

	public void setTaxonomiecode(String taxonomiecode) {
		this.taxonomiecode = taxonomiecode;
	}

	public String getZoekParentCode() {
		return zoekParentCode;
	}

	public void setZoekParentCode(String zoekParentCode) {
		this.zoekParentCode = zoekParentCode;
	}

	public String getSorteercode() {
		return sorteercode;
	}

	public void setSorteercode(String sorteercode) {
		this.sorteercode = sorteercode;
	}

	public TaxonomieElement getParent() {
		return parent;
	}

	public void setParent(TaxonomieElement parent) {
		this.parent = parent;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public Taxonomie getTaxonomie() {
		return taxonomie;
	}

	public void setTaxonomie(Taxonomie taxonomie) {
		this.taxonomie = taxonomie;
	}

	public TaxonomieElementType getTaxonomieElementType() {
		return taxonomieElementType;
	}

	public void setTaxonomieElementType(TaxonomieElementType taxonomieElementType) {
		this.taxonomieElementType = taxonomieElementType;
	}

	public List<TaxonomieElement> getChildren() {
		return children;
	}

	public void setChildren(List<TaxonomieElement> children) {
		this.children = children;
	}

	public boolean isUitzonderlijk() {
		return uitzonderlijk;
	}

	public void setUitzonderlijk(boolean uitzonderlijk) {
		this.uitzonderlijk = uitzonderlijk;
	}
}
