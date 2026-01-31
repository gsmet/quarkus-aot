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
package nl.topicus.eduarte.model.entities.dbs.incident;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.Geslacht;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Incident;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class IrisBetrokkene extends InstellingEntiteit
{

	/**
	 * EduArte versie van IrisRolOpSchool
	 *
	 * Het verschil is dat EduArte de termen 'deelnemer' en 'medewerker' gebruikt in
	 * plaats van 'leerling' en 'personeel'
	 *
	 */

	public enum EduArteRolOpSchool
	{
		Deelnemer("deelnemer", 1),
		Medewerker("medewerker", 2),
		Ouder("ouder/verzorger", 3),
		Anders("andere relatie", 4);

		String naam;

		int code;

		EduArteRolOpSchool(String naam, int code)
		{
			this.naam = naam;
			this.code = code;
		}

		public String getNaam()
		{
			return naam;
		}

		public int getCode()
		{
			return code;
		}
	}

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incident", nullable = true)
	private Incident incident;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "irisincident", nullable = false)
	private IrisIncident irisIncident;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "betrokkene")
	private List<IrisBetrokkeneAfhandeling> irisAfhandeling =
	new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "betrokkene")
	private List<IrisBetrokkeneMotief> irisMotief = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	@Column(nullable = false)
	private boolean letsel = false;

	@Column(nullable = false)
	private int rolOpSchoolCode;

	@Column(nullable = true)
	private int rolBijIncidentCode;

	@Column(nullable = true)
	private String toelichting;

	@Column(nullable = true)
	private String ingevoerdeNaam;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Geslacht ingevoerdGeslacht;

	public Incident getIncident() {
		return incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}

	public IrisIncident getIrisIncident() {
		return irisIncident;
	}

	public void setIrisIncident(IrisIncident irisIncident) {
		this.irisIncident = irisIncident;
	}

	public List<IrisBetrokkeneAfhandeling> getIrisAfhandeling() {
		return irisAfhandeling;
	}

	public void setIrisAfhandeling(List<IrisBetrokkeneAfhandeling> irisAfhandeling) {
		this.irisAfhandeling = irisAfhandeling;
	}

	public List<IrisBetrokkeneMotief> getIrisMotief() {
		return irisMotief;
	}

	public void setIrisMotief(List<IrisBetrokkeneMotief> irisMotief) {
		this.irisMotief = irisMotief;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public boolean isLetsel() {
		return letsel;
	}

	public void setLetsel(boolean letsel) {
		this.letsel = letsel;
	}

	public int getRolOpSchoolCode() {
		return rolOpSchoolCode;
	}

	public void setRolOpSchoolCode(int rolOpSchoolCode) {
		this.rolOpSchoolCode = rolOpSchoolCode;
	}

	public int getRolBijIncidentCode() {
		return rolBijIncidentCode;
	}

	public void setRolBijIncidentCode(int rolBijIncidentCode) {
		this.rolBijIncidentCode = rolBijIncidentCode;
	}

	public String getToelichting() {
		return toelichting;
	}

	public void setToelichting(String toelichting) {
		this.toelichting = toelichting;
	}

	public String getIngevoerdeNaam() {
		return ingevoerdeNaam;
	}

	public void setIngevoerdeNaam(String ingevoerdeNaam) {
		this.ingevoerdeNaam = ingevoerdeNaam;
	}

	public Geslacht getIngevoerdGeslacht() {
		return ingevoerdGeslacht;
	}

	public void setIngevoerdGeslacht(Geslacht ingevoerdGeslacht) {
		this.ingevoerdGeslacht = ingevoerdGeslacht;
	}

}
