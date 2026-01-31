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
package nl.topicus.eduarte.model.entities.resultaatstructuur;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Koppeltabel tussen opleiding, cohort en ToetsCodeFilter. Wordt gebruikt om te
 * bepalen bij welke ToetsCodeFilter als standaard gebruikt moet worden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "StandaardToetsCodeFilter", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "opleiding", "cohort" }) })
public class StandaardToetsCodeFilter extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "opleiding", nullable = false)
	private Opleiding opleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cohort", nullable = false)
	private Cohort cohort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "toetsCodeFilter", nullable = false)
	private ToetsCodeFilter toetsCodeFilter;

	public StandaardToetsCodeFilter() {
	}

	public void setOpleiding(Opleiding opleiding) {
		this.opleiding = opleiding;
	}

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setToetsCodeFilter(ToetsCodeFilter toetsCodeFilter) {
		this.toetsCodeFilter = toetsCodeFilter;
	}

	public ToetsCodeFilter getToetsCodeFilter() {
		return toetsCodeFilter;
	}
}
