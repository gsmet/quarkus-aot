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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Typering van een taxonomie-element, bijvoorbeeld Kwalificatiedossier,
 * Uitstroom, Kerntaak, Onderwijssoort etc.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "taxonomie", "volgnummer" }) })
public class TaxonomieElementType extends LandelijkOfInstellingEntiteit {
	@Column(nullable = false, length = 5)
	private String afkorting;

	@Column(nullable = false, length = 100)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "parent")
	private TaxonomieElementType parent;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private SoortTaxonomieElement soort;

	@Column(nullable = false)
	private boolean inschrijfbaar;

	@Column(nullable = false)
	private boolean diplomeerbaar;

	/**
	 * Nullable alleen voor het speciale type 'Taxonomie'.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "taxonomie")
	private Taxonomie taxonomie;

	/**
	 * Volgnummer voor het sorteren van lijsten van elementtypes.
	 */
	@Column(nullable = false)
	private int volgnummer;

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

	public TaxonomieElementType getParent() {
		return parent;
	}

	public void setParent(TaxonomieElementType parent) {
		this.parent = parent;
	}

	public SoortTaxonomieElement getSoort() {
		return soort;
	}

	public void setSoort(SoortTaxonomieElement soort) {
		this.soort = soort;
	}

	public boolean isInschrijfbaar() {
		return inschrijfbaar;
	}

	public void setInschrijfbaar(boolean inschrijfbaar) {
		this.inschrijfbaar = inschrijfbaar;
	}

	public boolean isDiplomeerbaar() {
		return diplomeerbaar;
	}

	public void setDiplomeerbaar(boolean diplomeerbaar) {
		this.diplomeerbaar = diplomeerbaar;
	}

	public Taxonomie getTaxonomie() {
		return taxonomie;
	}

	public void setTaxonomie(Taxonomie taxonomie) {
		this.taxonomie = taxonomie;
	}

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}
}
