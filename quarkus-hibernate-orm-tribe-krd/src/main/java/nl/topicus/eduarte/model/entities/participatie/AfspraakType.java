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

import java.awt.Color;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.participatie.enums.AfspraakTypeCategory;
import nl.topicus.eduarte.model.entities.participatie.enums.DeelnemerPresentieRegistratie;
import nl.topicus.eduarte.model.entities.participatie.enums.OnderwijsproductGebruik;
import nl.topicus.eduarte.model.entities.participatie.enums.StandaardUitnodigingenVersturen;

/**
 * Afspraken kunnen getypeerd worden om verschillend default gedrag aan
 * verschillende soorten afspraken te kunnen koppelen.
 *
 */
@Entity()
@jakarta.persistence.Table(uniqueConstraints = @UniqueConstraint(columnNames = { "naam", "organisatieEenheid" }))
public class AfspraakType extends InstellingEntiteit {
	public static final String SECURITY = "SECURITY";

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@Column(nullable = false, length = 30)
	private String naam;

	@Column(nullable = false, length = 1000)
	private String omschrijving;

	@Column(nullable = false)
	private int standaardKleur;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AfspraakTypeCategory category;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private StandaardUitnodigingenVersturen uitnodigingenVersturen = StandaardUitnodigingenVersturen.ALLE;

	@Column(nullable = false)
	private boolean medewerkerOnly;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private OnderwijsproductGebruik onderwijsproductGebruik;

	@Column(nullable = false)
	private int percentageIIVO;

	@Column(nullable = false)
	private boolean presentieRegistratieDefault;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private DeelnemerPresentieRegistratie presentieRegistratie;

	@Column(nullable = false)
	private boolean actief;

	public AfspraakType() {
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public int getStandaardKleur() {
		return standaardKleur;
	}

	public void setStandaardKleur(int standaardKleur) {
		this.standaardKleur = standaardKleur;
	}

	public Color getStandaardKleurObj() {
		return new Color(standaardKleur);
	}

	public void setStandaardKleurObj(Color standaardKleur) {
		this.standaardKleur = standaardKleur.getRGB();
	}

	public AfspraakTypeCategory getCategory() {
		return category;
	}

	public void setCategory(AfspraakTypeCategory category) {
		this.category = category;
	}

	public StandaardUitnodigingenVersturen getUitnodigingenVersturen() {
		return uitnodigingenVersturen;
	}

	public void setUitnodigingenVersturen(StandaardUitnodigingenVersturen uitnodigingenVersturen) {
		this.uitnodigingenVersturen = uitnodigingenVersturen;
	}

	@Override
	public String toString() {
		return getNaam();
	}

	public void setMedewerkerOnly(boolean medewerkerOnly) {
		this.medewerkerOnly = medewerkerOnly;
	}

	public boolean isMedewerkerOnly() {
		return medewerkerOnly;
	}

	public void setOnderwijsproductGebruik(OnderwijsproductGebruik onderwijsproductGebruik) {
		this.onderwijsproductGebruik = onderwijsproductGebruik;
	}

	public OnderwijsproductGebruik getOnderwijsproductGebruik() {
		return onderwijsproductGebruik;
	}

	public void setPercentageIIVO(int percentageIIVO) {
		this.percentageIIVO = percentageIIVO;
	}

	public int getPercentageIIVO() {
		return percentageIIVO;
	}

	public void setPresentieRegistratie(DeelnemerPresentieRegistratie presentieRegistratie) {
		this.presentieRegistratie = presentieRegistratie;
	}

	public DeelnemerPresentieRegistratie getPresentieRegistratie() {
		return presentieRegistratie;
	}

	public void setPresentieRegistratieDefault(boolean presentieRegistratieDefault) {
		this.presentieRegistratieDefault = presentieRegistratieDefault;
	}

	public boolean isPresentieRegistratieDefault() {
		return presentieRegistratieDefault;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public Locatie getLocatie() {
		return locatie;
	}
}
