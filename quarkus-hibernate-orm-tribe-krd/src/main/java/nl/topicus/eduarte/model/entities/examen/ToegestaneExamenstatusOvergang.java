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
package nl.topicus.eduarte.model.entities.examen;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Toegestane statusovergang tussen verschillende examenstatussen. Voor VO/VAVO
 * en CGO/MBO zijn deze landelijk gedefinieerd.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@jakarta.persistence.Table(name = "ToegExamenstatusOvergang")
public class ToegestaneExamenstatusOvergang extends LandelijkOfInstellingEntiteit {
	/**
	 * Volgnummer om de statusovergangen in een logische volgorde op het scherm te
	 * kunnen tonen.
	 */
	@Column(nullable = false)
	private int volgnummer;

	/**
	 * Omschrijving van de actie die uitgevoerd wordt bij de statusovergang,
	 * bijvoorbeeld 'Uitslag bepalen'.
	 */
	@Column(nullable = false, length = 100)
	private String actie;

	/**
	 * Omschrijving van de actie wanneer deze voor een individuele deelnemer wordt
	 * uitgevoerd.
	 */
	@Column(nullable = false, length = 100)
	private String actieIndividueel;

	/**
	 * Omschrijving van de actie wanneer deze voor een individuele deelnemer wordt
	 * uitgevoerd, en dan in het kort, zodat deze goed op de knoppen past
	 */
	@Column(nullable = true, length = 100)
	private String actieIndividueelKort;

	/**
	 * Boolean die aangeeft of bij deze statusovergang examennummers toegekend
	 * moeten worden. Dit is geen echte statusovergang omdat de status van de
	 * examendeelname niet wijzigt. Dit is ook de enige soort statusovergang waarbij
	 * de naarStatus niet verplicht is (mag niet ingevuld worden).
	 */
	@Column(nullable = false)
	private boolean examennummersToekennen;

	/**
	 * Boolean die aangeeft of bij deze statusovergang een tijdvak geselecteerd moet
	 * worden.
	 */
	@Column(nullable = false)
	private boolean tijdvakAangeven;

	/**
	 * Boolean die aangeeft of bij deze statusovergang opmerkingen handmatig
	 * ingevoerd moeten kunnen worden. Dit is vooral van belang van statusovergangen
	 * zoals Kandidaat -> Goedgekeurd door examencommisssie. Hierbij is het
	 * wenselijk om een opmerking in te kunnen voeren voor de deelnemers die
	 * uitvallen.
	 */
	@Column(nullable = false)
	private boolean handmatigOpmerkingenInvoeren;

	/**
	 * Boolean die aangeeft of deze statusovergang ook de statusovergang is die de
	 * standaard datum uitslag moet zetten.
	 */
	@Column(nullable = false)
	private boolean bepaaltDatumUitslag;

	/**
	 * De workflow waarvoor deze statusovergang geldt. Is in principe redundant
	 * omdat dit ook altijd te herleiden is uit de naarStatus.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "examenWorkflow")
	private ExamenWorkflow examenWorkflow;

	/**
	 * De toegestane beginstatussen voor deze statusovergang.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "toegestaneExamenstatusOvergang")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
	private List<ToegestaneBeginstatus> toegestaneBeginstatussen;

	/**
	 * De examenstatus waarnaar de examendeelnames overgezet moeten worden bij het
	 * uitvoeren van deze statusovergang. Dit is de doelstatus als de overgang
	 * gelukt is. Als de statusovergang voor een examendeelname mislukt, wordt de
	 * afgewezenStatus op de examendeelname gezet. De naarStatus mag alleen null
	 * zijn als de boolean examennummersToekennen op true gezet is. In dat geval
	 * *MOET* de naarStatus null zijn.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "naarExamenstatus")
	private Examenstatus naarExamenstatus;

	/**
	 * De status die gezet wordt op de examendeelname als de statusovergang mislukt.
	 * Het mislukken kan op twee manieren: Als bij de statusovergang een
	 * criteriumbankcontrole uitgevoerd moet worden, wordt de afgewezenstatus gezet
	 * op de examendeelnames die niet door de controle heen komen. Als het om een
	 * handmatige statusovergang gaat, kan de gebruiker zelf kiezen welke status de
	 * verschillende examendeelnames moeten krijgen.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "afgewezenExamenstatus")
	private Examenstatus afgewezenExamenstatus;

	public int getVolgnummer() {
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer) {
		this.volgnummer = volgnummer;
	}

	public String getActie() {
		return actie;
	}

	public void setActie(String actie) {
		this.actie = actie;
	}

	public String getActieIndividueel() {
		return actieIndividueel;
	}

	public void setActieIndividueel(String actieIndividueel) {
		this.actieIndividueel = actieIndividueel;
	}

	public String getActieIndividueelKort() {
		return actieIndividueelKort;
	}

	public void setActieIndividueelKort(String actieIndividueelKort) {
		this.actieIndividueelKort = actieIndividueelKort;
	}

	public boolean isExamennummersToekennen() {
		return examennummersToekennen;
	}

	public void setExamennummersToekennen(boolean examennummersToekennen) {
		this.examennummersToekennen = examennummersToekennen;
	}

	public boolean isTijdvakAangeven() {
		return tijdvakAangeven;
	}

	public void setTijdvakAangeven(boolean tijdvakAangeven) {
		this.tijdvakAangeven = tijdvakAangeven;
	}

	public boolean isHandmatigOpmerkingenInvoeren() {
		return handmatigOpmerkingenInvoeren;
	}

	public void setHandmatigOpmerkingenInvoeren(boolean handmatigOpmerkingenInvoeren) {
		this.handmatigOpmerkingenInvoeren = handmatigOpmerkingenInvoeren;
	}

	public boolean isBepaaltDatumUitslag() {
		return bepaaltDatumUitslag;
	}

	public void setBepaaltDatumUitslag(boolean bepaaltDatumUitslag) {
		this.bepaaltDatumUitslag = bepaaltDatumUitslag;
	}

	public ExamenWorkflow getExamenWorkflow() {
		return examenWorkflow;
	}

	public void setExamenWorkflow(ExamenWorkflow examenWorkflow) {
		this.examenWorkflow = examenWorkflow;
	}

	public List<ToegestaneBeginstatus> getToegestaneBeginstatussen() {
		return toegestaneBeginstatussen;
	}

	public void setToegestaneBeginstatussen(List<ToegestaneBeginstatus> toegestaneBeginstatussen) {
		this.toegestaneBeginstatussen = toegestaneBeginstatussen;
	}

	public Examenstatus getNaarExamenstatus() {
		return naarExamenstatus;
	}

	public void setNaarExamenstatus(Examenstatus naarExamenstatus) {
		this.naarExamenstatus = naarExamenstatus;
	}

	public Examenstatus getAfgewezenExamenstatus() {
		return afgewezenExamenstatus;
	}

	public void setAfgewezenExamenstatus(Examenstatus afgewezenExamenstatus) {
		this.afgewezenExamenstatus = afgewezenExamenstatus;
	}
}
