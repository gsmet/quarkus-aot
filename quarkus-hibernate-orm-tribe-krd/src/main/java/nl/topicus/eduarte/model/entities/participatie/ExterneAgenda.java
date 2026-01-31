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

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Persoon;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ExterneAgenda extends InstellingEntiteit {
	@Column(length = 50, nullable = false)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private ExterneAgendaKoppeling koppeling;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private Persoon eigenaar;

	@Column(length = 100)
	private String gebruikersNaam;

	@Column(length = 100)
	private String wachtwoord;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "externeAgenda")
	private List<CacheRegion> cacheRegions = new ArrayList<>();

	public ExterneAgenda() {
	}

	public void setEigenaar(Persoon eigenaar) {
		this.eigenaar = eigenaar;
	}

	public Persoon getEigenaar() {
		return eigenaar;
	}

	public void setKoppeling(ExterneAgendaKoppeling koppeling) {
		this.koppeling = koppeling;
	}

	public ExterneAgendaKoppeling getKoppeling() {
		return koppeling;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public List<CacheRegion> getCacheRegions() {
		return cacheRegions;
	}

	public void setCacheRegions(List<CacheRegion> cacheRegions) {
		this.cacheRegions = cacheRegions;
	}

	public void setGebruikersNaam(String gebruikersNaam) {
		this.gebruikersNaam = gebruikersNaam;
	}

	public String getGebruikersNaam() {
		return gebruikersNaam;
	}

	public void setWachtwoord(String wachtwoord) {
		this.wachtwoord = wachtwoord;
	}

	public String getWachtwoord() {
		return wachtwoord;
	}
}
