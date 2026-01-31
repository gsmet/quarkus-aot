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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import java.math.BigDecimal;
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

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Resultaat extends InstellingEntiteit {
	public enum Resultaatsoort {
		/**
		 * Door een docent ingevoerd
		 */
		Ingevoerd,
		/**
		 * Handmatig overschreven
		 */
		Overschreven,
		/**
		 * Het resultaat is via een toetsverwijzing geplaatst
		 */
		Verwezen,
		/**
		 * Automatisch berekend uit onderliggende resultaten
		 */
		Berekend,
		/**
		 * Geen geldig resultaat, omdat niet voldaan is aan de eisen van onderliggende
		 * resultaten
		 */
		Tijdelijk,
		/**
		 * Alternatief resultaat
		 */
		Alternatief;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "deelnemer")
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "toets")
	private Toets toets;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "waarde")
	@Bron
	private Schaalwaarde waarde;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "overschrijft")
	private Resultaat overschrijft;

	@Column(nullable = true)
	private Integer score;

	@Column(nullable = true, scale = 10, precision = 20)
	@Bron
	private BigDecimal cijfer;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal onafgerondCijfer;

	@Column(nullable = false)
	private int studiepunten;

	/**
	 * Het geldende resultaat is het resultaat dat voor de deelnemer voor deze toets
	 * geldt, oftewel na alle berekeningen met herkansingen, alternatieve resultaten
	 * etc. is dit het resultaat dat eruit komt. Een deelnemer heeft per toets max 1
	 * geldend resultaat.
	 */
	@Column(nullable = false)
	private boolean geldend;

	@Column(nullable = false)
	private int herkansingsnummer;

	/**
	 * Een deelnemer kan per resultaatsoort 1 actueel resultaat hebben. Dit is het
	 * laatst ingevoerde/berekende resultaat voor de resultaatsoort bij deze toets.
	 * Dit komt *NIET* altijd overeen met het geldende resultaat. Daarvan kan een
	 * deelnemer per toets max 1 hebben, en is het resultaat dat gebruikt moet
	 * worden in verdere berekeningen. De indicatie 'actueel' heeft dus alleen
	 * betekenis binnen de toets zelf.
	 */
	@Column(nullable = false)
	private boolean actueel;

	@Column(nullable = false)
	private boolean inSamengesteld = false;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Resultaatsoort soort;

	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date datumBehaald;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "ingevoerdDoor")
	private Medewerker ingevoerdDoor;

	@Column(nullable = true)
	@Lob
	private String notitie;

	@Column(nullable = true)
	@Lob
	private String berekening;

	@Column(nullable = true)
	private Integer weging;

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Toets getToets() {
		return toets;
	}

	public void setToets(Toets toets) {
		this.toets = toets;
	}

	public Schaalwaarde getWaarde() {
		return waarde;
	}

	public void setWaarde(Schaalwaarde waarde) {
		this.waarde = waarde;
	}

	public Resultaat getOverschrijft() {
		return overschrijft;
	}

	public void setOverschrijft(Resultaat overschrijft) {
		this.overschrijft = overschrijft;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public BigDecimal getCijfer() {
		return cijfer;
	}

	public void setCijfer(BigDecimal cijfer) {
		this.cijfer = cijfer;
	}

	public BigDecimal getOnafgerondCijfer() {
		return onafgerondCijfer;
	}

	public void setOnafgerondCijfer(BigDecimal onafgerondCijfer) {
		this.onafgerondCijfer = onafgerondCijfer;
	}

	public int getStudiepunten() {
		return studiepunten;
	}

	public void setStudiepunten(int studiepunten) {
		this.studiepunten = studiepunten;
	}

	public boolean isGeldend() {
		return geldend;
	}

	public void setGeldend(boolean geldend) {
		this.geldend = geldend;
	}

	public int getHerkansingsnummer() {
		return herkansingsnummer;
	}

	public void setHerkansingsnummer(int herkansingsnummer) {
		this.herkansingsnummer = herkansingsnummer;
	}

	public boolean isActueel() {
		return actueel;
	}

	public void setActueel(boolean actueel) {
		this.actueel = actueel;
	}

	public boolean isInSamengesteld() {
		return inSamengesteld;
	}

	public void setInSamengesteld(boolean inSamengesteld) {
		this.inSamengesteld = inSamengesteld;
	}

	public Resultaatsoort getSoort() {
		return soort;
	}

	public void setSoort(Resultaatsoort soort) {
		this.soort = soort;
	}

	public Date getDatumBehaald() {
		return datumBehaald;
	}

	public void setDatumBehaald(Date datumBehaald) {
		this.datumBehaald = datumBehaald;
	}

	public Medewerker getIngevoerdDoor() {
		return ingevoerdDoor;
	}

	public void setIngevoerdDoor(Medewerker ingevoerdDoor) {
		this.ingevoerdDoor = ingevoerdDoor;
	}

	public String getNotitie() {
		return notitie;
	}

	public void setNotitie(String notitie) {
		this.notitie = notitie;
	}

	public String getBerekening() {
		return berekening;
	}

	public void setBerekening(String berekening) {
		this.berekening = berekening;
	}

	public Integer getWeging() {
		return weging;
	}

	public void setWeging(Integer weging) {
		this.weging = weging;
	}

	public String getCijferAlsWoord() {
		return "";
	}

	public String getCijferOfSchaalwaarde() {
		return "";
	}

	public String getFormattedDisplayCijfer() {
		return "";
	}
}
