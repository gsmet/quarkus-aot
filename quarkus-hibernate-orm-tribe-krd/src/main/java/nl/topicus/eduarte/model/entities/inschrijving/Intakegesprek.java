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

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.entities.vrijevelden.IntakegesprekVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Intakegesprek extends InstellingEntiteit implements VrijVeldable<IntakegesprekVrijVeld> {

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "verbintenis")
	private Verbintenis verbintenis;

	@Column(nullable = true)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date datumTijd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "intaker", nullable = true)
	private Medewerker intaker;

	@Column(nullable = true)
	private String intakerOverig;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@Column(nullable = true)
	private String kamer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gewensteOpleiding", nullable = true)
	private Opleiding gewensteOpleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gewensteGroep", nullable = true)
	private Groep gewensteGroep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gewensteLocatie", nullable = true)
	private Locatie gewensteLocatie;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date gewensteBegindatum;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date gewensteEinddatum;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gewensteBPV", nullable = true)
	private ExterneOrganisatie gewensteBPV;

	/**
	 * Veld is toegevoegd voor digitaal aanmelden als deelnemer een BBL opleiding
	 * kiest moet dit ingevuld kunnen worden, dit moet door medewerker worden
	 * omgezet in BPV.
	 */
	@Column(nullable = true, length = 100)
	private String plaatsWerkgever;

	/**
	 * Veld is toegevoegd voor digitaal aanmelden als deelnemer een BBL opleiding
	 * kiest moet dit ingevuld kunnen worden, dit moet door medewerker worden
	 * omgezet in BPV.
	 */
	@Column(nullable = true, length = 100)
	private String naamWerkgever;

	/**
	 * Veld is toegevoegd voor digitaal aanmelden als deelnemer een BBL opleiding
	 * kiest moet dit ingevuld kunnen worden, dit moet door medewerker worden
	 * omgezet in BPV.
	 */
	@Column(nullable = true, length = 100)
	private String contactpersoonWerkgever;

	public enum IntakegesprekStatus {
		/**
		 * Gesprek moet nog worden gepland
		 */
		NogNietGepland,
		/**
		 * Gesprek moet nog worden uitgevoerd
		 */
		Uitvoeren,

		/**
		 * Gesprek is uitgevoerd
		 */
		Uitgevoerd,

		/**
		 * Gesprek vindt niet meer plaats
		 */
		Geannuleerd;
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private IntakegesprekStatus status = IntakegesprekStatus.NogNietGepland;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "uitkomstIntakegesprek", nullable = true)
	private UitkomstIntakegesprek uitkomst;

	@Lob
	@Column(nullable = true)
	private String opmerking;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "intakegesprek")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<IntakegesprekVrijVeld> vrijVelden;

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public Date getDatumTijd() {
		return datumTijd;
	}

	public void setDatumTijd(Date datumTijd) {
		this.datumTijd = datumTijd;
	}

	public Medewerker getIntaker() {
		return intaker;
	}

	public void setIntaker(Medewerker intaker) {
		this.intaker = intaker;
	}

	public String getIntakerOverig() {
		return intakerOverig;
	}

	public void setIntakerOverig(String intakerOverig) {
		this.intakerOverig = intakerOverig;
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

	public String getKamer() {
		return kamer;
	}

	public void setKamer(String kamer) {
		this.kamer = kamer;
	}

	public Opleiding getGewensteOpleiding() {
		return gewensteOpleiding;
	}

	public void setGewensteOpleiding(Opleiding gewensteOpleiding) {
		this.gewensteOpleiding = gewensteOpleiding;
	}

	public Groep getGewensteGroep() {
		return gewensteGroep;
	}

	public void setGewensteGroep(Groep gewensteGroep) {
		this.gewensteGroep = gewensteGroep;
	}

	public Locatie getGewensteLocatie() {
		return gewensteLocatie;
	}

	public void setGewensteLocatie(Locatie gewensteLocatie) {
		this.gewensteLocatie = gewensteLocatie;
	}

	public Date getGewensteBegindatum() {
		return gewensteBegindatum;
	}

	public void setGewensteBegindatum(Date gewensteBegindatum) {
		this.gewensteBegindatum = gewensteBegindatum;
	}

	public Date getGewensteEinddatum() {
		return gewensteEinddatum;
	}

	public void setGewensteEinddatum(Date gewensteEinddatum) {
		this.gewensteEinddatum = gewensteEinddatum;
	}

	public ExterneOrganisatie getGewensteBPV() {
		return gewensteBPV;
	}

	public void setGewensteBPV(ExterneOrganisatie gewensteBPV) {
		this.gewensteBPV = gewensteBPV;
	}

	public String getPlaatsWerkgever() {
		return plaatsWerkgever;
	}

	public void setPlaatsWerkgever(String plaatsWerkgever) {
		this.plaatsWerkgever = plaatsWerkgever;
	}

	public String getNaamWerkgever() {
		return naamWerkgever;
	}

	public void setNaamWerkgever(String naamWerkgever) {
		this.naamWerkgever = naamWerkgever;
	}

	public String getContactpersoonWerkgever() {
		return contactpersoonWerkgever;
	}

	public void setContactpersoonWerkgever(String contactpersoonWerkgever) {
		this.contactpersoonWerkgever = contactpersoonWerkgever;
	}

	public IntakegesprekStatus getStatus() {
		return status;
	}

	public void setStatus(IntakegesprekStatus status) {
		this.status = status;
	}

	public UitkomstIntakegesprek getUitkomst() {
		return uitkomst;
	}

	public void setUitkomst(UitkomstIntakegesprek uitkomst) {
		this.uitkomst = uitkomst;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}

	@Override
	public List<IntakegesprekVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<IntakegesprekVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	@Override
	public IntakegesprekVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<IntakegesprekVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}
}