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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Statusovergang voor een examendeelname van een status naar een andere. De
 * beginstatus kan null zijn als het om de beginstatus gaat.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ExamenstatusOvergang extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "examendeelname")
	private Examendeelname examendeelname;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "vanStatus")
	private Examenstatus vanStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "naarStatus")
	private Examenstatus naarStatus;

	/**
	 * Datum/tijd dat de statusovergang uitgevoerd is.
	 */
	@Column(nullable = false)
	@Temporal(value = TemporalType.TIMESTAMP)
	private Date datumTijd;

	/**
	 * Opmerkingen bij de statusovergang, bijvoorbeeld waarom de statusovergang
	 * mislukt is.
	 */
	@Column(nullable = true, length = 4000)
	private String opmerkingen;

	public Examendeelname getExamendeelname() {
		return examendeelname;
	}

	public void setExamendeelname(Examendeelname examendeelname) {
		this.examendeelname = examendeelname;
	}

	public Examenstatus getVanStatus() {
		return vanStatus;
	}

	public void setVanStatus(Examenstatus vanStatus) {
		this.vanStatus = vanStatus;
	}

	public Examenstatus getNaarStatus() {
		return naarStatus;
	}

	public void setNaarStatus(Examenstatus naarStatus) {
		this.naarStatus = naarStatus;
	}

	public Date getDatumTijd() {
		return datumTijd;
	}

	public void setDatumTijd(Date datumTijd) {
		this.datumTijd = datumTijd;
	}

	public String getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}
}
