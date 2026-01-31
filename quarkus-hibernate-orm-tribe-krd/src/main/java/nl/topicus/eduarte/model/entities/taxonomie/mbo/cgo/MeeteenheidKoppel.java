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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 * Koppelt een meeteenheid aan een organisatie-eenheid of opleiding, per cohort
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class MeeteenheidKoppel extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "cohort")
	private Cohort cohort;

	@ManyToOne(optional = false)
	@JoinColumn(name = "meeteenheid", nullable = false)
	private Meeteenheid meeteenheid;

	@ManyToOne(optional = true)
	@JoinColumn(name = "organisatieEenheid", nullable = true)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(optional = true)
	@JoinColumn(name = "opleiding", nullable = true)
	private Opleiding opleiding;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MeeteenheidKoppelType type;

	@Column(nullable = false)
	private Boolean vastgezet = false;

	@Column(nullable = false)
	private Boolean automatischAangemaakt = false;

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public Meeteenheid getMeeteenheid() {
		return meeteenheid;
	}

	public void setMeeteenheid(Meeteenheid meeteenheid) {
		this.meeteenheid = meeteenheid;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Opleiding getOpleiding() {
		return opleiding;
	}

	public void setOpleiding(Opleiding opleiding) {
		this.opleiding = opleiding;
	}

	public MeeteenheidKoppelType getType() {
		return type;
	}

	public void setType(MeeteenheidKoppelType type) {
		this.type = type;
	}

	public Boolean getVastgezet() {
		return vastgezet;
	}

	public void setVastgezet(Boolean vastgezet) {
		this.vastgezet = vastgezet;
	}

	public Boolean getAutomatischAangemaakt() {
		return automatischAangemaakt;
	}

	public void setAutomatischAangemaakt(Boolean automatischAangemaakt) {
		this.automatischAangemaakt = automatischAangemaakt;
	}
}
