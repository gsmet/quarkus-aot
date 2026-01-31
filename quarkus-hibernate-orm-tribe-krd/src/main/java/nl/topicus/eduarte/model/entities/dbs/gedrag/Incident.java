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
package nl.topicus.eduarte.model.entities.dbs.gedrag;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.IncidentBijlage;
import nl.topicus.eduarte.model.entities.dbs.incident.IrisBetrokkene;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Incident extends InstellingEntiteit implements
IBijlageKoppelEntiteit<IncidentBijlage>, ZorgvierkantObject
{
	public static final String INCIDENT = "INCIDENT";

	public static final String VERTROUWELIJK_INCIDENT = "VERTROUWELIJK_INCIDENT";

	@Column(nullable = true)
	@Lob
	private String consequenties;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "incident")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<IncidentBijlage> bijlagen = new ArrayList<>();

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "incident")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BetrokkenMedewerker> betrokkenMedewerkers = new ArrayList<>();

	@OneToOne(fetch = FetchType.LAZY, mappedBy = "incident")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private IrisBetrokkene betrokkene;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	public String getConsequenties() {
		return consequenties;
	}

	public void setConsequenties(String consequenties) {
		this.consequenties = consequenties;
	}

	@Override
	public List<IncidentBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<IncidentBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<BetrokkenMedewerker> getBetrokkenMedewerkers() {
		return betrokkenMedewerkers;
	}

	public void setBetrokkenMedewerkers(List<BetrokkenMedewerker> betrokkenMedewerkers) {
		this.betrokkenMedewerkers = betrokkenMedewerkers;
	}

	public IrisBetrokkene getBetrokkene() {
		return betrokkene;
	}

	public void setBetrokkene(IrisBetrokkene betrokkene) {
		this.betrokkene = betrokkene;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	@Override
	public boolean isVertrouwelijk() {
		return false;
	}

	@Override
	public Integer getZorglijn() {
		return null;
	}

	@Override
	public String getSecurityId() {
		return null;
	}

	@Override
	public String getVertrouwelijkSecurityId() {
		return null;
	}

	@Override
	public boolean isTonenInZorgvierkant() {
		return false;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public IncidentBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
