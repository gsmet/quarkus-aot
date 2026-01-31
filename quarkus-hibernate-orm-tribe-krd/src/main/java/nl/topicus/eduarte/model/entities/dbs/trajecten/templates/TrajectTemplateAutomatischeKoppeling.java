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
package nl.topicus.eduarte.model.entities.dbs.trajecten.templates;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity(name = "trajTemplAutoKopp")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class TrajectTemplateAutomatischeKoppeling extends InstellingEntiteit {
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplateAutomatischeKoppeling", targetEntity = TrajectTemplateKoppeling.class)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@SQLRestriction( "DTYPE='TTKoppelingOpleiding'")
	private List<TrajectTemplateKoppelingOpleiding> opleidingKoppelingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplateAutomatischeKoppeling", targetEntity = TrajectTemplateKoppeling.class)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@SQLRestriction("DTYPE='TTKoppelingOrganisatie'")
	private List<TrajectTemplateKoppelingOrganisatie> organisatieKoppelingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplateAutomatischeKoppeling", targetEntity = TrajectTemplateKoppeling.class)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@SQLRestriction("DTYPE='TTKoppelingKenmerk'")
	private List<TrajectTemplateKoppelingKenmerk> kenmerkKoppelingen = new ArrayList<>();

	@Column(nullable = true)
	private Boolean indicatieLWOO;

	@Column(nullable = true)
	private Boolean indicatieGehandicapt;

	@Column(nullable = true)
	private Boolean alleenNieuweDeelnemers;

	@Column(nullable = true)
	private Boolean alleenIntakeStatussen;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date datumBeschikbaar;

	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date datumEindeBeschikbaar;

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "automatischeKoppeling")
	private TrajectTemplate trajectTemplate;

	public List<TrajectTemplateKoppelingOpleiding> getOpleidingKoppelingen() {
		return opleidingKoppelingen;
	}

	public void setOpleidingKoppelingen(List<TrajectTemplateKoppelingOpleiding> opleidingKoppelingen) {
		this.opleidingKoppelingen = opleidingKoppelingen;
	}

	public List<TrajectTemplateKoppelingOrganisatie> getOrganisatieKoppelingen() {
		return organisatieKoppelingen;
	}

	public void setOrganisatieKoppelingen(List<TrajectTemplateKoppelingOrganisatie> organisatieKoppelingen) {
		this.organisatieKoppelingen = organisatieKoppelingen;
	}

	public List<TrajectTemplateKoppelingKenmerk> getKenmerkKoppelingen() {
		return kenmerkKoppelingen;
	}

	public void setKenmerkKoppelingen(List<TrajectTemplateKoppelingKenmerk> kenmerkKoppelingen) {
		this.kenmerkKoppelingen = kenmerkKoppelingen;
	}

	public Boolean getIndicatieLWOO() {
		return indicatieLWOO;
	}

	public void setIndicatieLWOO(Boolean indicatieLWOO) {
		this.indicatieLWOO = indicatieLWOO;
	}

	public Boolean getIndicatieGehandicapt() {
		return indicatieGehandicapt;
	}

	public void setIndicatieGehandicapt(Boolean indicatieGehandicapt) {
		this.indicatieGehandicapt = indicatieGehandicapt;
	}

	public Boolean getAlleenNieuweDeelnemers() {
		return alleenNieuweDeelnemers;
	}

	public void setAlleenNieuweDeelnemers(Boolean alleenNieuweDeelnemers) {
		this.alleenNieuweDeelnemers = alleenNieuweDeelnemers;
	}

	public Boolean getAlleenIntakeStatussen() {
		return alleenIntakeStatussen;
	}

	public void setAlleenIntakeStatussen(Boolean alleenIntakeStatussen) {
		this.alleenIntakeStatussen = alleenIntakeStatussen;
	}

	public Date getDatumBeschikbaar() {
		return datumBeschikbaar;
	}

	public void setDatumBeschikbaar(Date datumBeschikbaar) {
		this.datumBeschikbaar = datumBeschikbaar;
	}

	public Date getDatumEindeBeschikbaar() {
		return datumEindeBeschikbaar;
	}

	public void setDatumEindeBeschikbaar(Date datumEindeBeschikbaar) {
		this.datumEindeBeschikbaar = datumEindeBeschikbaar;
	}

	public TrajectTemplate getTrajectTemplate() {
		return trajectTemplate;
	}

	public void setTrajectTemplate(TrajectTemplate trajectTemplate) {
		this.trajectTemplate = trajectTemplate;
	}
}
