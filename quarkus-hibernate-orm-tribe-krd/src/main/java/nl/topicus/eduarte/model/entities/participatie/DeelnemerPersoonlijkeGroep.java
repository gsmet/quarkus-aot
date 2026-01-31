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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.ViewEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 * DeelnemerPersoonlijkeGroep is een view die alle deelnemers oplevert die in
 * een persoonlijke groep zitten. Een deeelnemer kan direct in een persoonlijke
 * groep geplaatst zijn, of kan indirect via een andere persoonlijke groep in de
 * persoonlijke groep zitten.
 *
 */
@Entity
@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Instelling")
@Table(name = "DeelnemerPersoonlijkeGroep")
public class DeelnemerPersoonlijkeGroep extends ViewEntiteit {
	/**
	 * De parent van de relatie. Dit is de groep waarin de deelnemers zitten.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groep", nullable = false)
	private PersoonlijkeGroep groep;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date beginDatum;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date eindDatum;

	public DeelnemerPersoonlijkeGroep() {
	}

	public PersoonlijkeGroep getGroep() {
		return groep;
	}

	public void setGroep(PersoonlijkeGroep groep) {
		this.groep = groep;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
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
}
