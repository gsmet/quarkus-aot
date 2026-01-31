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
package nl.topicus.eduarte.model.entities.inschrijving;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.duo.criho.annot.Criho;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.groep.Groepsdeelname;
import nl.topicus.eduarte.model.entities.hogeronderwijs.Fase;
import nl.topicus.eduarte.model.entities.hogeronderwijs.InschrijvingsVorm;
import nl.topicus.eduarte.model.entities.hogeronderwijs.Inschrijvingsverzoek;
import nl.topicus.eduarte.model.entities.hogeronderwijs.OpleidingsVorm;
import nl.topicus.eduarte.model.entities.vrijevelden.PlaatsingVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Een plaatsing geeft aan in welke basisgroep een deelnemer zit, en eventueel
 * in welk leerjaar. Een plaatsing wordt binnen een verbintenis gedefinieerd, en
 * er is maar een actieve plaatsing binnen een verbintenis op een gegeven datum.
 *
 */
@Entity()
public class Plaatsing extends Groepsdeelname implements VrijVeldable<PlaatsingVrijVeld> {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "verbintenis")
	private Verbintenis verbintenis;

	@Bron
	@Column(nullable = true)
	private Integer leerjaar;

	@Bron
	@Column(nullable = true)
	private Integer jarenPraktijkonderwijs;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plaatsing")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<PlaatsingVrijVeld> vrijVelden;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "plaatsing")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<Inschrijvingsverzoek> inschrijvingsverzoeken = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "fase")
	@Criho
	private Fase fase;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	@Criho
	private InschrijvingsVorm inschrijvingsVorm;

	@Column(nullable = true)
	@Enumerated(value = EnumType.STRING)
	@Criho
	private OpleidingsVorm opleidingsVorm;

	/**
	 * Indicatie of deze plaatsing een lwoo-beschikking heeft. Dit property mag
	 * alleen op true gezet worden voor plaatsingen van verbintenissen die gekoppeld
	 * zijn aan verbintenisgebieden met een lwoo-verbintenisgebied.
	 */
	@Bron
	@Column(nullable = true)
	private boolean lwoo;

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public Integer getLeerjaar() {
		return leerjaar;
	}

	public void setLeerjaar(Integer leerjaar) {
		this.leerjaar = leerjaar;
	}

	public Integer getJarenPraktijkonderwijs() {
		return jarenPraktijkonderwijs;
	}

	public void setJarenPraktijkonderwijs(Integer jarenPraktijkonderwijs) {
		this.jarenPraktijkonderwijs = jarenPraktijkonderwijs;
	}

	@Override
	public List<PlaatsingVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<PlaatsingVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public List<Inschrijvingsverzoek> getInschrijvingsverzoeken() {
		return inschrijvingsverzoeken;
	}

	public void setInschrijvingsverzoeken(List<Inschrijvingsverzoek> inschrijvingsverzoeken) {
		this.inschrijvingsverzoeken = inschrijvingsverzoeken;
	}

	public Fase getFase() {
		return fase;
	}

	public void setFase(Fase fase) {
		this.fase = fase;
	}

	public InschrijvingsVorm getInschrijvingsVorm() {
		return inschrijvingsVorm;
	}

	public void setInschrijvingsVorm(InschrijvingsVorm inschrijvingsVorm) {
		this.inschrijvingsVorm = inschrijvingsVorm;
	}

	public OpleidingsVorm getOpleidingsVorm() {
		return opleidingsVorm;
	}

	public void setOpleidingsVorm(OpleidingsVorm opleidingsVorm) {
		this.opleidingsVorm = opleidingsVorm;
	}

	public boolean isLwoo() {
		return lwoo;
	}

	public void setLwoo(boolean lwoo) {
		this.lwoo = lwoo;
	}

	@Override
	public PlaatsingVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<PlaatsingVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}
}
