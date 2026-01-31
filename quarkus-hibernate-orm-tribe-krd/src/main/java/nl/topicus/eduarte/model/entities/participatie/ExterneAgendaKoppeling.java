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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.participatie.enums.ExterneAgendaConnection;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class ExterneAgendaKoppeling extends InstellingEntiteit {
	@Column(length = 50, nullable = false)
	private String naam;

	private boolean actief;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private AfspraakType afspraakType;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true)
	private Locatie locatie;

	private boolean automatisch;

	private int geldigheidsduur;

	public ExterneAgendaKoppeling() {
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isActief() {
		return actief;
	}

	public void setAfspraakType(AfspraakType afspraakType) {
		this.afspraakType = afspraakType;
	}

	public AfspraakType getAfspraakType() {
		return afspraakType;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public void setGeldigheidsduur(int geldigheidsduur) {
		this.geldigheidsduur = geldigheidsduur;
	}

	public int getGeldigheidsduur() {
		return geldigheidsduur;
	}

	abstract public ExterneAgendaConnection connect(ExterneAgenda agenda) throws ExterneAgendaException;

	abstract public String getBeschrijving();

	public void selectDefaults() {
		geldigheidsduur = 60;
		actief = true;
	}

	@Override
	public String toString() {
		return getNaam();
	}

	public void setAutomatisch(boolean automatisch) {
		this.automatisch = automatisch;
	}

	public boolean isAutomatisch() {
		return automatisch;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public Locatie getLocatie() {
		return locatie;
	}
}
