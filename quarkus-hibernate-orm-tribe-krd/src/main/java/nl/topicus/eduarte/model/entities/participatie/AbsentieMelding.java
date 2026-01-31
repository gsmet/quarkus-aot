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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.participatie.enums.IParticipatieBlokObject;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 * Een absentiemelding voor een deelnemer. Een absentiemelding geeft aan of een
 * deelnemer in een bepaalde periode afwezig is geweest of zal zijn. Een
 * absentiemelding is niet gekoppeld aan het rooster of aan een afspraak, maar
 * is puur een indicatie waarom een deelnemer in een bepaalde periode niet
 * aanwezig is. Waarnemingen kunnen vervolgens gekoppeld worden aan
 * absentiemeldingen om op die manier afgehandeld te worden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class AbsentieMelding extends InstellingEntiteit implements IParticipatieBlokObject {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "absentieReden", nullable = false)
	private AbsentieReden absentieReden;

	/**
	 * Als een absentieMelding niet eenmalig is, maar elke X weken terugkeert wordt
	 * een HerhalendeAbsentieMelding aangemaakt. Alle absentieMeldingen die het
	 * resultaat zijn van de herhalende absentieMelding verwijzen naar dezelfde
	 * herhalende absentieMelding. Op deze manier kan bij het wijzigen van een
	 * herhalende absentieMelding eventueel ook alle andere bijbehorende
	 * absentieMeldingen gewijzigd worden.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "herhalendeAbsentieMelding", nullable = true)
	private HerhalendeAbsentieMelding herhalendeAbsentieMelding;

	/**
	 * beginDatumTijd bevat zowel de begindatum als de begintijd van de melding. De
	 * begintijd moet in veel gevallen gehaald worden uit het beginlesuur dat door
	 * de gebruiker ingevuld wordt. Als de melding voor een gehele dag is, of voor
	 * meerdere dagen, is de begintijd gelijk aan 00:00:00.
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date beginDatumTijd;

	/**
	 * eindDatumTijd bevat zowel de einddatum als de eindtijd van de melding. De
	 * eindtijd moet in veel gevallen gehaald worden uit het eindlesuur dat door de
	 * gebruiker ingevuld wordt. Als de melding voor een gehele dag is, of voor
	 * meerdere dagen, is de eindtijd gelijk aan 23:59:59. De eindDatumTijd is dus
	 * inclusief.
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date eindDatumTijd;

	/**
	 * Het beginlesuur waarop de absentiemelding ingaat. Dit is tot op zekere hoogte
	 * redundant met de begintijd, maar is toch handige informatie; de gebruikers
	 * willen dit vaak kunnen zien en het terugrekenen is lastig. Als beginLesuur
	 * null is, is eindLesuur ook per definitie null, en is de absentiemelding voor
	 * een gehele dag of voor meerdere dagen. Als begin- en eindlesuur wel ingevuld
	 * zijn, moet de datum van de begin- en einddatumtijd gelijk zijn aan elkaar.
	 */
	@Column(nullable = true)
	private Integer beginLesuur;

	@Column(nullable = true)
	private Integer eindLesuur;

	/**
	 * Indicatie of de absentiemelding afgehandeld is. Als de melding nog niet
	 * afgehandeld is, is de melding nog 'open' en wordt deze standaard getoond op
	 * het invoerscherm voor deelnemers.
	 */
	@Column(nullable = false)
	private boolean afgehandeld;

	/**
	 * Eventuele opmerkingen die specifiek over deze absentiemelding gaan.
	 */
	@Column(length = 1024, nullable = true)
	private String opmerkingen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "absentieMelding")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<Waarneming> waarnemingen = new ArrayList<>();

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public AbsentieReden getAbsentieReden() {
		return absentieReden;
	}

	public void setAbsentieReden(AbsentieReden absentieReden) {
		this.absentieReden = absentieReden;
	}

	public HerhalendeAbsentieMelding getHerhalendeAbsentieMelding() {
		return herhalendeAbsentieMelding;
	}

	public void setHerhalendeAbsentieMelding(HerhalendeAbsentieMelding herhalendeAbsentieMelding) {
		this.herhalendeAbsentieMelding = herhalendeAbsentieMelding;
	}

	@Override
	public Date getBeginDatumTijd() {
		return beginDatumTijd;
	}

	public void setBeginDatumTijd(Date beginDatumTijd) {
		this.beginDatumTijd = beginDatumTijd;
	}

	@Override
	public Date getEindDatumTijd() {
		return eindDatumTijd;
	}

	public void setEindDatumTijd(Date eindDatumTijd) {
		this.eindDatumTijd = eindDatumTijd;
	}

	@Override
	public Integer getBeginLesuur() {
		return beginLesuur;
	}

	public void setBeginLesuur(Integer beginLesuur) {
		this.beginLesuur = beginLesuur;
	}

	@Override
	public Integer getEindLesuur() {
		return eindLesuur;
	}

	public void setEindLesuur(Integer eindLesuur) {
		this.eindLesuur = eindLesuur;
	}

	public boolean isAfgehandeld() {
		return afgehandeld;
	}

	public void setAfgehandeld(boolean afgehandeld) {
		this.afgehandeld = afgehandeld;
	}

	public String getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}

	public List<Waarneming> getWaarnemingen() {
		return waarnemingen;
	}

	public void setWaarnemingen(List<Waarneming> waarnemingen) {
		this.waarnemingen = waarnemingen;
	}

	@Override
	public boolean isActiefOpDatum(Date datum) {
		return false;
	}

	@Override
	public String getCssClass() {
		return null;
	}

	@Override
	public String getTitle() {
		return null;
	}
}
