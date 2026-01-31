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

import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een herhalende absentieMelding geeft aan dat een absentieMelding zichzelf om
 * de X weken herhaalt. Alle instanties van de herhalende absentieMelding
 * verwijzen naar dit object. Wanneer een instantie aangepast wordt, kan de
 * gebruiker ervoor kiezen om alleen de instantie aan te passen, of alle (nog
 * niet uitgevoerde) instanties aan te passen.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class HerhalendeAbsentieMelding extends InstellingEntiteit {
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date beginDatum;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date eindDatum;

	/**
	 * Het aantal weken tussen elke absentieMelding.
	 */
	@Column(nullable = false)
	private int weekCyclus;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "herhalendeAbsentieMelding")
	private List<AbsentieMelding> absentieMeldingen;

	public HerhalendeAbsentieMelding() {
	}

	public Date getBeginDatum() {
		return beginDatum;
	}

	public void setBeginDatum(Date beginDatum) {
		this.beginDatum = beginDatum;
	}

	public Date getEindDatum() {
		return eindDatum;
	}

	public void setEindDatum(Date eindDatum) {
		this.eindDatum = eindDatum;
	}

	public int getWeekCyclus() {
		return weekCyclus;
	}

	public void setWeekCyclus(int weekCyclus) {
		this.weekCyclus = weekCyclus;
	}

	public List<AbsentieMelding> getAbsentieMeldingen() {
		return absentieMeldingen;
	}

	public void setAbsentieMeldingen(List<AbsentieMelding> absentieMeldingen) {
		this.absentieMeldingen = absentieMeldingen;
	}

}
