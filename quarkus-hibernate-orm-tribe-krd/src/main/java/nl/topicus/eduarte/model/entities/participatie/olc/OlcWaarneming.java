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
package nl.topicus.eduarte.model.entities.participatie.olc;

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
import nl.topicus.eduarte.model.entities.participatie.AfspraakType;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
// "idx_OlcWaarneming_organisatie", columnNames = {"organisatie"})})
public class OlcWaarneming extends InstellingEntiteit {
	@ManyToOne(optional = false)
	@JoinColumn(name = "olcLocatie", nullable = false)
	private OlcLocatie olcLocatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraakType", nullable = false)
	private AfspraakType afspraakType;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date datum;

	@Temporal(value = TemporalType.TIME)
	@Column(nullable = false)
	private Date beginTijd;

	@Temporal(value = TemporalType.TIME)
	@Column(nullable = true)
	private Date eindTijd;

	@Column(nullable = true)
	private boolean verwerkt;

	public OlcWaarneming() {
	}

	public boolean isVerwerkt() {
		return verwerkt;
	}

	public void setVerwerkt(boolean verwerkt) {
		this.verwerkt = verwerkt;
	}

	public void setOlcLocatie(OlcLocatie olcLocatie) {
		this.olcLocatie = olcLocatie;
	}

	public OlcLocatie getOlcLocatie() {
		return olcLocatie;
	}

	public void setBeginTijd(Date beginTijd) {
		this.beginTijd = beginTijd;
	}

	public Date getBeginTijd() {
		return beginTijd;
	}

	public void setEindTijd(Date eindTijd) {
		this.eindTijd = eindTijd;
	}

	public Date getEindTijd() {
		return eindTijd;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public Date getDatum() {
		return datum;
	}

	public void setAfspraakType(AfspraakType afspraakType) {
		this.afspraakType = afspraakType;
	}

	public AfspraakType getAfspraakType() {
		return afspraakType;
	}
}
