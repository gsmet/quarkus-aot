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
package nl.topicus.eduarte.model.entities.groep;

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

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.vrijevelden.GroepVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Een groep van deelnemers. Kan een klas, een lesgroep, een projectgroep, een
 * aanmeldgroep of wat dan ook voor groep zijn.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@IsViewWhenOnNoise
public class Groep extends BeginEinddatumInstellingEntiteit
implements IBijlageKoppelEntiteit<GroepBijlage>, VrijVeldable<GroepVrijVeld> {
	public static final String DEELNAME_REMOVE = "DEELNAME_REMOVE";

	public static final String GROEP_WRITE = "GROEP_WRITE";

	public static final String EDIT_DEELNAME = "EDIT_DEELNAME";

	@Column(length = 20, nullable = false)
	private String code;

	@Column(nullable = true)
	private Integer leerjaar;

	@Column(length = 100, nullable = false)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groepstype", nullable = false)
	private Groepstype groepstype;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	/**
	 * Lijst met alle mentoren voor deze groep.
	 */
	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groep")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, einddatum DESC")
	private List<GroepMentor> groepMentoren = new ArrayList<>();

	/**
	 * Lijst met alle docenten voor deze groep.
	 */
	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groep")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, einddatum DESC")
	private List<GroepDocent> groepDocenten = new ArrayList<>();

	/**
	 * Lijst met alle deelnemers voor deze groep.
	 */
	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groep")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("begindatum DESC, einddatum DESC")
	private List<Groepsdeelname> deelnemers = new ArrayList<>();

	/**
	 * Unordered, uncached, alleen voor joins.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groep")
	private List<Groepsdeelname> deelnamesUnordered;

	/**
	 * De bijlages van deze goep
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groep")
	private List<GroepBijlage> bijlagen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groep")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<GroepVrijVeld> vrijVelden;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getLeerjaar() {
		return leerjaar;
	}

	public void setLeerjaar(Integer leerjaar) {
		this.leerjaar = leerjaar;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Groepstype getGroepstype() {
		return groepstype;
	}

	public void setGroepstype(Groepstype groepstype) {
		this.groepstype = groepstype;
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

	public List<GroepMentor> getGroepMentoren() {
		return groepMentoren;
	}

	public void setGroepMentoren(List<GroepMentor> groepMentoren) {
		this.groepMentoren = groepMentoren;
	}

	public List<GroepDocent> getGroepDocenten() {
		return groepDocenten;
	}

	public void setGroepDocenten(List<GroepDocent> groepDocenten) {
		this.groepDocenten = groepDocenten;
	}

	public List<Groepsdeelname> getDeelnemers() {
		return deelnemers;
	}

	public void setDeelnemers(List<Groepsdeelname> deelnemers) {
		this.deelnemers = deelnemers;
	}

	public List<Groepsdeelname> getDeelnamesUnordered() {
		return deelnamesUnordered;
	}

	public void setDeelnamesUnordered(List<Groepsdeelname> deelnamesUnordered) {
		this.deelnamesUnordered = deelnamesUnordered;
	}

	@Override
	public List<GroepBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<GroepBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	@Override
	public List<GroepVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<GroepVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	@Override
	public GroepVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<GroepVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public GroepBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
