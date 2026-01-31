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
package nl.topicus.eduarte.model.entities.participatie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.participatie.enums.AbsentieSoort;

/**
 * Reden voor absentiemeldingen.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class AbsentieReden extends InstellingEntiteit {
	/**
	 * De afkorting van deze absentiereden. Kan gebruikt worden in overzichten.
	 */
	@Column(length = 2, nullable = false)
	private String afkorting;

	/**
	 * Omschrijving van de absentiereden.
	 */
	@Column(length = 30, nullable = false)
	private String omschrijving;

	/**
	 * @see AbsentieSoort
	 */
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AbsentieSoort absentieSoort;

	/**
	 * Is deze absentiereden wel/niet geoorloofd.
	 */
	@Column(nullable = false)
	private boolean geoorloofd;

	/**
	 * Deze boolean geeft aan of een nieuwe absentiemelding op basis van deze
	 * absentiereden wel/niet standaard op afgehandeld moet staan. De gebruiker kan
	 * altijd handmatig de afgehandeldstatus van de nieuwe melding aanpassen.
	 */
	@Column(nullable = false)
	private boolean standaardAfgehandeld;

	/**
	 * Deze boolean geeft aan of een absentiemelding wel/niet automatisch op
	 * afgehandeld gezet moet worden als er een eindatum door het systeem wordt
	 * ingevoerd
	 */
	private boolean automatichAfgehandeld;

	/**
	 * Een absentiemelding kan zonder einddatum zijn. Deze staat dan open totdat de
	 * deelnemer zich beter meldt. Een deelnemer kan maximaal 1 absentiemelding
	 * zonder einddatum hebben. Dit property geeft aan of een nieuwe absentiemelding
	 * op basis van deze reden wel/niet standaard zonder een einddatum aangemaakt
	 * moet worden.
	 */
	@Column(nullable = false)
	private boolean standaardZonderEinddatum;

	/**
	 * Moet deze reden ook ingevuld kunnen worden als waarneming
	 */
	@Column(nullable = false)
	private boolean tonenBijWaarnemingen;

	@Column(nullable = false)
	private boolean toegestaanVoorDeelnemers;

	@Column
	private boolean actief;

	/**
	 * De absentie kan per organisatie-eenheid ingericht worden, maar dit is niet
	 * verplicht. De absentieredenen die voor een deelnemer van toepassing zijn,
	 * zijn de absentieredenen die niet gekoppeld zijn aan een organisatie-eenheid,
	 * of die aan dezelfde organisatie-eenheid zijn gekoppeld als de inschrijving
	 * van de deelnemer.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public AbsentieSoort getAbsentieSoort() {
		return absentieSoort;
	}

	public void setAbsentieSoort(AbsentieSoort absentieSoort) {
		this.absentieSoort = absentieSoort;
	}

	public boolean isGeoorloofd() {
		return geoorloofd;
	}

	public void setGeoorloofd(boolean geoorloofd) {
		this.geoorloofd = geoorloofd;
	}

	public boolean isStandaardAfgehandeld() {
		return standaardAfgehandeld;
	}

	public void setStandaardAfgehandeld(boolean standaardAfgehandeld) {
		this.standaardAfgehandeld = standaardAfgehandeld;
	}

	public boolean isAutomatichAfgehandeld() {
		return automatichAfgehandeld;
	}

	public void setAutomatichAfgehandeld(boolean automatichAfgehandeld) {
		this.automatichAfgehandeld = automatichAfgehandeld;
	}

	public boolean isStandaardZonderEinddatum() {
		return standaardZonderEinddatum;
	}

	public void setStandaardZonderEinddatum(boolean standaardZonderEinddatum) {
		this.standaardZonderEinddatum = standaardZonderEinddatum;
	}

	public boolean isTonenBijWaarnemingen() {
		return tonenBijWaarnemingen;
	}

	public void setTonenBijWaarnemingen(boolean tonenBijWaarnemingen) {
		this.tonenBijWaarnemingen = tonenBijWaarnemingen;
	}

	public boolean isToegestaanVoorDeelnemers() {
		return toegestaanVoorDeelnemers;
	}

	public void setToegestaanVoorDeelnemers(boolean toegestaanVoorDeelnemers) {
		this.toegestaanVoorDeelnemers = toegestaanVoorDeelnemers;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}
}
