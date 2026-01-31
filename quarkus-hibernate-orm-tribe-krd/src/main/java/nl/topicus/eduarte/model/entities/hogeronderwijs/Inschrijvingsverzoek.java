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
package nl.topicus.eduarte.model.entities.hogeronderwijs;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.inschrijving.Plaatsing;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.organisatie.Brin;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Inschrijvingsverzoek extends InstellingEntiteit
{
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private InschrijvingsverzoekStatus status;

	@Column(nullable = false)
	private boolean herinschrijving = false;

	@Column(nullable = false)
	private boolean duplicaat = false;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private GBAVerificatieStatus gbaVerificatieStatus;

	private Date gbaVerificatieDatum;

	@Column(length = 30)
	private String gbaVerificatieDocument;

	@Column(length = 15)
	private String gbaVerificatieDocumentNummer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gbaVerificatieBrin")
	private Brin gbaVerificatieDoor;

	@Column(length = 35)
	private String GBAVerificatieDoorMedewerker;

	@Column(length = 1000)
	private String gbaVerificatieOpmerking;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private EersteJaars eersteJaars;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private DeficientieStatus deficientieStatus;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Betaler betaler;

	@Column(nullable = false)
	private boolean betaald = false;

	@Column(nullable = true)
	private Date betalingDatum;

	@Column(nullable = true)
	private Boolean betalingTermijnen;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Betaalwijze betaalwijze;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AanvullendeEisenStatus aanvullendeEisenStatus;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private WerkzaamhedenStatus werkzaamhedenStatus;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TaaltoetsStatus taaltoetsStatus;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Lotingvorm lotingvorm;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private LotingStatus lotingStatus;

	@Column(nullable = true)
	private Date lotingStatusDatum;

	@Column(nullable = true)
	private Boolean toestemmingsverklaring = false;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "studielinkBericht", nullable = false)
	private StudielinkBericht studielinkBericht;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "plaatsing")
	private Plaatsing plaatsing;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis")
	private Verbintenis verbintenis;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inschrijvingsverzoek")
	@BatchSize(size = 20)
	private List<SpecifiekeVraag> specifiekeVragen = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "instroommoment")
	private Instroommoment instroommoment;

	public InschrijvingsverzoekStatus getStatus() {
		return status;
	}

	public void setStatus(InschrijvingsverzoekStatus status) {
		this.status = status;
	}

	public boolean isHerinschrijving() {
		return herinschrijving;
	}

	public void setHerinschrijving(boolean herinschrijving) {
		this.herinschrijving = herinschrijving;
	}

	public boolean isDuplicaat() {
		return duplicaat;
	}

	public void setDuplicaat(boolean duplicaat) {
		this.duplicaat = duplicaat;
	}

	public GBAVerificatieStatus getGbaVerificatieStatus() {
		return gbaVerificatieStatus;
	}

	public void setGbaVerificatieStatus(GBAVerificatieStatus gbaVerificatieStatus) {
		this.gbaVerificatieStatus = gbaVerificatieStatus;
	}

	public Date getGbaVerificatieDatum() {
		return gbaVerificatieDatum;
	}

	public void setGbaVerificatieDatum(Date gbaVerificatieDatum) {
		this.gbaVerificatieDatum = gbaVerificatieDatum;
	}

	public String getGbaVerificatieDocument() {
		return gbaVerificatieDocument;
	}

	public void setGbaVerificatieDocument(String gbaVerificatieDocument) {
		this.gbaVerificatieDocument = gbaVerificatieDocument;
	}

	public String getGbaVerificatieDocumentNummer() {
		return gbaVerificatieDocumentNummer;
	}

	public void setGbaVerificatieDocumentNummer(String gbaVerificatieDocumentNummer) {
		this.gbaVerificatieDocumentNummer = gbaVerificatieDocumentNummer;
	}

	public Brin getGbaVerificatieDoor() {
		return gbaVerificatieDoor;
	}

	public void setGbaVerificatieDoor(Brin gbaVerificatieDoor) {
		this.gbaVerificatieDoor = gbaVerificatieDoor;
	}

	public String getGBAVerificatieDoorMedewerker() {
		return GBAVerificatieDoorMedewerker;
	}

	public void setGBAVerificatieDoorMedewerker(String gBAVerificatieDoorMedewerker) {
		GBAVerificatieDoorMedewerker = gBAVerificatieDoorMedewerker;
	}

	public String getGbaVerificatieOpmerking() {
		return gbaVerificatieOpmerking;
	}

	public void setGbaVerificatieOpmerking(String gbaVerificatieOpmerking) {
		this.gbaVerificatieOpmerking = gbaVerificatieOpmerking;
	}

	public EersteJaars getEersteJaars() {
		return eersteJaars;
	}

	public void setEersteJaars(EersteJaars eersteJaars) {
		this.eersteJaars = eersteJaars;
	}

	public DeficientieStatus getDeficientieStatus() {
		return deficientieStatus;
	}

	public void setDeficientieStatus(DeficientieStatus deficientieStatus) {
		this.deficientieStatus = deficientieStatus;
	}

	public Betaler getBetaler() {
		return betaler;
	}

	public void setBetaler(Betaler betaler) {
		this.betaler = betaler;
	}

	public boolean isBetaald() {
		return betaald;
	}

	public void setBetaald(boolean betaald) {
		this.betaald = betaald;
	}

	public Date getBetalingDatum() {
		return betalingDatum;
	}

	public void setBetalingDatum(Date betalingDatum) {
		this.betalingDatum = betalingDatum;
	}

	public Boolean getBetalingTermijnen() {
		return betalingTermijnen;
	}

	public void setBetalingTermijnen(Boolean betalingTermijnen) {
		this.betalingTermijnen = betalingTermijnen;
	}

	public Betaalwijze getBetaalwijze() {
		return betaalwijze;
	}

	public void setBetaalwijze(Betaalwijze betaalwijze) {
		this.betaalwijze = betaalwijze;
	}

	public AanvullendeEisenStatus getAanvullendeEisenStatus() {
		return aanvullendeEisenStatus;
	}

	public void setAanvullendeEisenStatus(AanvullendeEisenStatus aanvullendeEisenStatus) {
		this.aanvullendeEisenStatus = aanvullendeEisenStatus;
	}

	public WerkzaamhedenStatus getWerkzaamhedenStatus() {
		return werkzaamhedenStatus;
	}

	public void setWerkzaamhedenStatus(WerkzaamhedenStatus werkzaamhedenStatus) {
		this.werkzaamhedenStatus = werkzaamhedenStatus;
	}

	public TaaltoetsStatus getTaaltoetsStatus() {
		return taaltoetsStatus;
	}

	public void setTaaltoetsStatus(TaaltoetsStatus taaltoetsStatus) {
		this.taaltoetsStatus = taaltoetsStatus;
	}

	public Lotingvorm getLotingvorm() {
		return lotingvorm;
	}

	public void setLotingvorm(Lotingvorm lotingvorm) {
		this.lotingvorm = lotingvorm;
	}

	public LotingStatus getLotingStatus() {
		return lotingStatus;
	}

	public void setLotingStatus(LotingStatus lotingStatus) {
		this.lotingStatus = lotingStatus;
	}

	public Date getLotingStatusDatum() {
		return lotingStatusDatum;
	}

	public void setLotingStatusDatum(Date lotingStatusDatum) {
		this.lotingStatusDatum = lotingStatusDatum;
	}

	public Boolean getToestemmingsverklaring() {
		return toestemmingsverklaring;
	}

	public void setToestemmingsverklaring(Boolean toestemmingsverklaring) {
		this.toestemmingsverklaring = toestemmingsverklaring;
	}

	public StudielinkBericht getStudielinkBericht() {
		return studielinkBericht;
	}

	public void setStudielinkBericht(StudielinkBericht studielinkBericht) {
		this.studielinkBericht = studielinkBericht;
	}

	public Plaatsing getPlaatsing() {
		return plaatsing;
	}

	public void setPlaatsing(Plaatsing plaatsing) {
		this.plaatsing = plaatsing;
	}

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public List<SpecifiekeVraag> getSpecifiekeVragen() {
		return specifiekeVragen;
	}

	public void setSpecifiekeVragen(List<SpecifiekeVraag> specifiekeVragen) {
		this.specifiekeVragen = specifiekeVragen;
	}

	public Instroommoment getInstroommoment() {
		return instroommoment;
	}

	public void setInstroommoment(Instroommoment instroommoment) {
		this.instroommoment = instroommoment;
	}

}