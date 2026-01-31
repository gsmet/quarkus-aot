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
package nl.topicus.eduarte.model.entities.onderwijsproduct;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.duo.bron.bve.waardelijsten.ToepassingResultaatExamenvak;
import nl.topicus.eduarte.model.duo.bron.data.waardelijsten.examen.ToepassingResultaat;
import nl.topicus.eduarte.model.entities.BronEntiteitStatus;
import nl.topicus.eduarte.model.entities.IBronStatusEntiteit;
import nl.topicus.eduarte.model.entities.inschrijving.OnderwijsproductAfname;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.productregel.Productregel;

/**
 * Koppeltabel productregel, onderwijsproductafname, en verbintenis
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {
		@UniqueConstraint(columnNames = { "onderwijsproductAfname", "verbintenis" }),
		@UniqueConstraint(columnNames = { "productregel", "verbintenis" }) })
public class OnderwijsproductAfnameContext extends InstellingEntiteit implements IBronStatusEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "productregel")
	private Productregel productregel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "onderwijsproductAfname")
	@Bron
	private OnderwijsproductAfname onderwijsproductAfname;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "verbintenis")
	private Verbintenis verbintenis;

	/**
	 * De indicatie die aangeeft of het cijfer op de cijferlijst of de beoordeling
	 * voor het schoolexamen voor het betreffende vak is meegenomen bij de
	 * vaststelling van de uitslag van het examen. Default true.
	 */
	@Bron
	private boolean diplomavak = true;

	/**
	 * Geeft aan of het resultaat van een vak afgedrukt moet worden op de
	 * cijferlijst. Default true.
	 */
	@Column(nullable = false)
	private boolean toonOpCijferlijst = true;

	/**
	 * De aanduiding die aangeeft of het resultaat voor het betreffende vak is
	 * behaald in het examenjaar dan wel de reden waarom dit niet het geval
	 * is.(Alleen gebruiken voor BVE). Default: GeexamineerdInJaarMelding
	 */
	@Enumerated(EnumType.STRING)
	private ToepassingResultaatExamenvak toepassingResultaatExamenvak = ToepassingResultaatExamenvak.GeexamineerdInJaarMelding;

	/**
	 * De aanduiding die aangeeft of het resultaat voor het betreffende vak is
	 * behaald in het examenjaar dan wel de reden waarom dit niet het geval
	 * is.(Alleen gebruiken voor VO). Default: GeexamineerdInJaarVanMelding
	 */
	@Enumerated(EnumType.STRING)
	@Bron
	private ToepassingResultaat toepassingResultaat = ToepassingResultaat.GeexamineerdInJaarVanMelding;

	/**
	 * De indicatie die aangeeft of het bij het betreffende examen behorende
	 * werkstuk betrekking heeft op het betreffende examenvak.
	 */
	@Bron
	private boolean werkstukHoortBijProduct;

	/**
	 * De indicatie die aangeeft of de deelnemer voor het betreffende examenvak
	 * nogmaals een examen gaat afleggen tijdens het volgende tijdvak.
	 */
	@Bron
	private boolean verwezenNaarVolgendTijdvak;

	/**
	 * De indicatie die aangeeft of de deelnemer voor het betreffende examenvak een
	 * certificaat heeft behaald tijdens het betreffende examenjaar van het
	 * betreffende examen.
	 */
	@Bron
	private boolean certificaatBehaald;

	/**
	 * Vakvolgnummer, voor communicatie met BRON.
	 */
	@Bron(verplicht = true)
	private Integer volgnummer = null;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BronEntiteitStatus bronStatus = BronEntiteitStatus.Geen;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date bronDatum;

	public Productregel getProductregel() {
		return productregel;
	}

	public void setProductregel(Productregel productregel) {
		this.productregel = productregel;
	}

	public OnderwijsproductAfname getOnderwijsproductAfname() {
		return onderwijsproductAfname;
	}

	public void setOnderwijsproductAfname(OnderwijsproductAfname onderwijsproductAfname) {
		this.onderwijsproductAfname = onderwijsproductAfname;
	}

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public boolean isDiplomavak() {
		return diplomavak;
	}

	public void setDiplomavak(boolean diplomavak) {
		this.diplomavak = diplomavak;
	}

	public boolean isToonOpCijferlijst() {
		return toonOpCijferlijst;
	}

	public void setToonOpCijferlijst(boolean toonOpCijferlijst) {
		this.toonOpCijferlijst = toonOpCijferlijst;
	}

	public ToepassingResultaatExamenvak getToepassingResultaatExamenvak() {
		return toepassingResultaatExamenvak;
	}

	public void setToepassingResultaatExamenvak(ToepassingResultaatExamenvak toepassingResultaatExamenvak) {
		this.toepassingResultaatExamenvak = toepassingResultaatExamenvak;
	}

	public ToepassingResultaat getToepassingResultaat() {
		return toepassingResultaat;
	}

	public void setToepassingResultaat(ToepassingResultaat toepassingResultaat) {
		this.toepassingResultaat = toepassingResultaat;
	}

	public boolean isWerkstukHoortBijProduct() {
		return werkstukHoortBijProduct;
	}

	public void setWerkstukHoortBijProduct(boolean werkstukHoortBijProduct) {
		this.werkstukHoortBijProduct = werkstukHoortBijProduct;
	}

	public boolean isVerwezenNaarVolgendTijdvak() {
		return verwezenNaarVolgendTijdvak;
	}

	public void setVerwezenNaarVolgendTijdvak(boolean verwezenNaarVolgendTijdvak) {
		this.verwezenNaarVolgendTijdvak = verwezenNaarVolgendTijdvak;
	}

	public boolean isCertificaatBehaald() {
		return certificaatBehaald;
	}

	public void setCertificaatBehaald(boolean certificaatBehaald) {
		this.certificaatBehaald = certificaatBehaald;
	}

	public Integer getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(Integer volgnummer) {
		this.volgnummer = volgnummer;
	}

	@Override
	public BronEntiteitStatus getBronStatus() {
		return bronStatus;
	}

	@Override
	public void setBronStatus(BronEntiteitStatus bronStatus) {
		this.bronStatus = bronStatus;
	}

	@Override
	public Date getBronDatum() {
		return bronDatum;
	}

	@Override
	public void setBronDatum(Date bronDatum) {
		this.bronDatum = bronDatum;
	}
}
