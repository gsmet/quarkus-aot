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

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.OrganisatieEenheidContactPersoon;

/**
 * Een organisatie-eenheid van een onderwijsinstelling. Dit is geen fysieke
 * locatie (of hoeft dat niet te zijn), maar is eerder een organisatorische
 * eenheid, bijvoorbeeld een bepaalde afdeling.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
@BatchSize(size = 100)
@IsViewWhenOnNoise
public class OrganisatieEenheid extends BeginEinddatumInstellingEntiteit {

	@Column(length = 10, nullable = false)
	private String afkorting;

	@Column(length = 100, nullable = false)
	private String naam;

	@Column(length = 150, nullable = true)
	private String officieleNaam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "parent", nullable = true)
	private OrganisatieEenheid parent;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortOrganisatieEenheid", nullable = false)
	private SoortOrganisatieEenheid soortOrganisatieEenheid;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organisatieEenheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@OrderBy(value = "begindatum DESC")
	private List<OrganisatieEenheidAdres> adressen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organisatieEenheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@OrderBy(value = "volgorde")
	private List<OrganisatieEenheidContactgegeven> contactgegevens;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organisatieEenheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@BatchSize(size = 100)
	private List<OrganisatieEenheidLocatie> locaties;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "organisatieEenheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	@BatchSize(size = 100)
	private List<OrganisatieEenheidContactPersoon> contactpersonen;

	@Column(length = 11, nullable = true)
	private String bankrekeningnummer;

	@Column(nullable = false)
	@Comment("Indicatie die aangeeft of stap-3 van de intake wizard overgeslagen moet worden als deze organisatie-eenheid gekozen is")
	private boolean intakeWizardStap3Overslaan;

	@Column(nullable = false)
	@Comment("Indicatie die aangeeft of de organisatie-eenheid getoont moet worden als keuze bij digitaal aanmelden")
	private boolean tonenBijDigitaalAanmelden;

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

	public String getOfficieleNaam() {
		return officieleNaam;
	}

	public void setOfficieleNaam(String officieleNaam) {
		this.officieleNaam = officieleNaam;
	}

	public OrganisatieEenheid getParent() {
		return parent;
	}

	public void setParent(OrganisatieEenheid parent) {
		this.parent = parent;
	}

	public SoortOrganisatieEenheid getSoortOrganisatieEenheid() {
		return soortOrganisatieEenheid;
	}

	public void setSoortOrganisatieEenheid(SoortOrganisatieEenheid soortOrganisatieEenheid) {
		this.soortOrganisatieEenheid = soortOrganisatieEenheid;
	}

	public List<OrganisatieEenheidAdres> getAdressen() {
		return adressen;
	}

	public void setAdressen(List<OrganisatieEenheidAdres> adressen) {
		this.adressen = adressen;
	}

	public List<OrganisatieEenheidContactgegeven> getContactgegevens() {
		return contactgegevens;
	}

	public void setContactgegevens(List<OrganisatieEenheidContactgegeven> contactgegevens) {
		this.contactgegevens = contactgegevens;
	}

	public List<OrganisatieEenheidLocatie> getLocaties() {
		return locaties;
	}

	public void setLocaties(List<OrganisatieEenheidLocatie> locaties) {
		this.locaties = locaties;
	}

	public List<OrganisatieEenheidContactPersoon> getContactpersonen() {
		return contactpersonen;
	}

	public void setContactpersonen(List<OrganisatieEenheidContactPersoon> contactpersonen) {
		this.contactpersonen = contactpersonen;
	}

	public String getBankrekeningnummer() {
		return bankrekeningnummer;
	}

	public void setBankrekeningnummer(String bankrekeningnummer) {
		this.bankrekeningnummer = bankrekeningnummer;
	}

	public boolean isIntakeWizardStap3Overslaan() {
		return intakeWizardStap3Overslaan;
	}

	public void setIntakeWizardStap3Overslaan(boolean intakeWizardStap3Overslaan) {
		this.intakeWizardStap3Overslaan = intakeWizardStap3Overslaan;
	}

	public boolean isTonenBijDigitaalAanmelden() {
		return tonenBijDigitaalAanmelden;
	}

	public void setTonenBijDigitaalAanmelden(boolean tonenBijDigitaalAanmelden) {
		this.tonenBijDigitaalAanmelden = tonenBijDigitaalAanmelden;
	}

	public boolean isParentOf(OrganisatieEenheid organisatieEenheid) {
		return false;
	}
}
