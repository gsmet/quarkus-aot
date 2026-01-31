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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import java.util.Date;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "BegHandStatOvrgang")
public class BegeleidingsHandelingStatusovergang extends InstellingEntiteit {
	@Column(nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date datumTijd;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private BegeleidingsHandelingsStatussoort vanStatus;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private BegeleidingsHandelingsStatussoort naarStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "begeleidingsHandeling", nullable = true, foreignKey = @ForeignKey(name = "FK_BHStatus_begHand"))
	private BegeleidingsHandeling begeleidingsHandeling;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = false, foreignKey = @ForeignKey(name = "FK_BHStatus_medewerker"))
	private Medewerker medewerker;

	public BegeleidingsHandelingStatusovergang() {
	}

	public Date getDatumTijd() {
		return datumTijd;
	}

	public void setDatumTijd(Date datumTijd) {
		this.datumTijd = datumTijd;
	}

	public BegeleidingsHandelingsStatussoort getVanStatus() {
		return vanStatus;
	}

	public void setVanStatus(BegeleidingsHandelingsStatussoort vanStatus) {
		this.vanStatus = vanStatus;
	}

	public BegeleidingsHandelingsStatussoort getNaarStatus() {
		return naarStatus;
	}

	public void setNaarStatus(BegeleidingsHandelingsStatussoort naarStatus) {
		this.naarStatus = naarStatus;
	}

	public BegeleidingsHandeling getBegeleidingsHandeling() {
		return begeleidingsHandeling;
	}

	public void setBegeleidingsHandeling(BegeleidingsHandeling begeleidingsHandeling) {
		this.begeleidingsHandeling = begeleidingsHandeling;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}
}
