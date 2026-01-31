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
package nl.topicus.eduarte.model.entities.organisatie;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ExterneOrganisatieOpmerking extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = false)
	private ExterneOrganisatie externeOrganisatie;

	/**
	 * Datum. Het is aan de gebruikers om af te spreken welke datum men hier
	 * bijhoudt: bijvoorbeeld de aanmaakdatum of de datum waarop de opmerking voor
	 * het laatst bewerkt is.
	 */
	@Column(nullable = true)
	private Date datum;

	/**
	 * De opmerking zelf (vrij tekstveld)
	 */
	@Column(nullable = false)
	@Lob
	private String opmerking;

	/**
	 * Auteur. Hier wordt automatisch de momenteel ingelogde gebruiker ingevuld,
	 * maar dit kan gewijzigd worden.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auteur", nullable = true)
	private Medewerker auteur;

	/**
	 * Tonen bij matching (checkbox). Wanneer deze checkbox aangevinkt wordt, wordt
	 * de betreffende opmerking getoond bij het matchen van deelnemers aan
	 * leerplaatsen van dit bedrijf. Er komt bij de leerplaats een icoontje te
	 * voorschijn, waar men met de muis boven kan hangen om de opmerking te zien.
	 */
	@Column(nullable = false)
	private boolean tonenBijMatching;

	public ExterneOrganisatieOpmerking() {
	}

	public ExterneOrganisatieOpmerking(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}

	public Medewerker getAuteur() {
		return auteur;
	}

	public void setAuteur(Medewerker auteur) {
		this.auteur = auteur;
	}

	public boolean isTonenBijMatching() {
		return tonenBijMatching;
	}

	public void setTonenBijMatching(boolean tonenBijMatching) {
		this.tonenBijMatching = tonenBijMatching;
	}
}
