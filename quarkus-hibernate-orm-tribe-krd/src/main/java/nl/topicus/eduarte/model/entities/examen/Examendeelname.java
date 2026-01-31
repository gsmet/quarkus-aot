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
import jakarta.persistence.OrderBy;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.BronEntiteitStatus;
import nl.topicus.eduarte.model.entities.IBronStatusEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Deelname aan het examenproces voor een deelnemer. Een Examendeelname is
 * gekoppeld aan een verbintenis en heeft als uiteindelijke doel het uitdelen
 * van een diploma aan de deelnemer voor de opleiding waarop hij/zij is
 * ingeschreven volgens de verbintenis waaraan de examendeelname is gekoppeld.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@IsViewWhenOnNoise
public class Examendeelname extends InstellingEntiteit
implements IBijlageKoppelEntiteit<ExamendeelnameBijlage>, IBronStatusEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis", nullable = false)
	private Verbintenis verbintenis;

	@Bron
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "examenstatus", nullable = false)
	private Examenstatus examenstatus;

	@Column(nullable = true)
	private Integer examennummer;

	@Bron
	@Column(nullable = true)
	private Integer examenjaar;

	@Column(nullable = true)
	private Integer tijdvak;

	@Column(nullable = true, length = 20)
	private String examennummerPrefix;

	@Bron
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = true)
	private Date datumUitslag;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date datumLaatsteStatusovergang;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examendeelname")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "datumTijd")
	private List<ExamenstatusOvergang> statusovergangen;

	/**
	 * De bijlages van deze examendeelname
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "examendeelname")
	private List<ExamendeelnameBijlage> bijlagen;

	@Column(nullable = false)
	private boolean meenemenInVolgendeBronBatch;

	/**
	 * Dit is een property die automatisch gezet wordt door de broncontroller als
	 * een wijzing van de resultaten of iets dergelijks resulteert in het
	 * (opnieuw)verzenden van deze examendeelname naar BRON
	 */
	@Column(nullable = false)
	private boolean gewijzigd;

	@Bron
	private boolean bekostigd;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BronEntiteitStatus bronStatus = BronEntiteitStatus.Geen;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date bronDatum;

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public Examenstatus getExamenstatus() {
		return examenstatus;
	}

	public void setExamenstatus(Examenstatus examenstatus) {
		this.examenstatus = examenstatus;
	}

	public Integer getExamennummer() {
		return examennummer;
	}

	public void setExamennummer(Integer examennummer) {
		this.examennummer = examennummer;
	}

	public Integer getExamenjaar() {
		return examenjaar;
	}

	public void setExamenjaar(Integer examenjaar) {
		this.examenjaar = examenjaar;
	}

	public Integer getTijdvak() {
		return tijdvak;
	}

	public void setTijdvak(Integer tijdvak) {
		this.tijdvak = tijdvak;
	}

	public String getExamennummerPrefix() {
		return examennummerPrefix;
	}

	public void setExamennummerPrefix(String examennummerPrefix) {
		this.examennummerPrefix = examennummerPrefix;
	}

	public Date getDatumUitslag() {
		return datumUitslag;
	}

	public void setDatumUitslag(Date datumUitslag) {
		this.datumUitslag = datumUitslag;
	}

	public Date getDatumLaatsteStatusovergang() {
		return datumLaatsteStatusovergang;
	}

	public void setDatumLaatsteStatusovergang(Date datumLaatsteStatusovergang) {
		this.datumLaatsteStatusovergang = datumLaatsteStatusovergang;
	}

	public List<ExamenstatusOvergang> getStatusovergangen() {
		return statusovergangen;
	}

	public void setStatusovergangen(List<ExamenstatusOvergang> statusovergangen) {
		this.statusovergangen = statusovergangen;
	}

	@Override
	public List<ExamendeelnameBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<ExamendeelnameBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public boolean isMeenemenInVolgendeBronBatch() {
		return meenemenInVolgendeBronBatch;
	}

	public void setMeenemenInVolgendeBronBatch(boolean meenemenInVolgendeBronBatch) {
		this.meenemenInVolgendeBronBatch = meenemenInVolgendeBronBatch;
	}

	public boolean isGewijzigd() {
		return gewijzigd;
	}

	public void setGewijzigd(boolean gewijzigd) {
		this.gewijzigd = gewijzigd;
	}

	public boolean isBekostigd() {
		return bekostigd;
	}

	public void setBekostigd(boolean bekostigd) {
		this.bekostigd = bekostigd;
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

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public ExamendeelnameBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
