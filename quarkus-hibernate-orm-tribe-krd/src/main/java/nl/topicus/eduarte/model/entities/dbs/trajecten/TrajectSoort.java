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

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.dbs.testen.TestDefinitie;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class TrajectSoort extends InstellingEntiteit {
	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isHandelingsplan() {
		return handelingsplan;
	}

	public void setHandelingsplan(boolean handelingsplan) {
		this.handelingsplan = handelingsplan;
	}

	public GesprekSoort getStandaardGesprekSoort() {
		return standaardGesprekSoort;
	}

	public void setStandaardGesprekSoort(GesprekSoort standaardGesprekSoort) {
		this.standaardGesprekSoort = standaardGesprekSoort;
	}

	public TaakSoort getStandaardTaakSoort() {
		return standaardTaakSoort;
	}

	public void setStandaardTaakSoort(TaakSoort standaardTaakSoort) {
		this.standaardTaakSoort = standaardTaakSoort;
	}

	public TestDefinitie getStandaardTestDefinitie() {
		return standaardTestDefinitie;
	}

	public void setStandaardTestDefinitie(TestDefinitie standaardTestDefinitie) {
		this.standaardTestDefinitie = standaardTestDefinitie;
	}

	public ZorgvierkantKwadrant getKwadrant() {
		return kwadrant;
	}

	public void setKwadrant(ZorgvierkantKwadrant kwadrant) {
		this.kwadrant = kwadrant;
	}

	public List<ToegestaneStatusSoort> getToegestaneStatussoorten() {
		return toegestaneStatussoorten;
	}

	public void setToegestaneStatussoorten(List<ToegestaneStatusSoort> toegestaneStatussoorten) {
		this.toegestaneStatussoorten = toegestaneStatussoorten;
	}

	public String getBeginSituatieTemplate() {
		return beginSituatieTemplate;
	}

	public void setBeginSituatieTemplate(String beginSituatieTemplate) {
		this.beginSituatieTemplate = beginSituatieTemplate;
	}

	public String getDoelenTemplate() {
		return doelenTemplate;
	}

	public void setDoelenTemplate(String doelenTemplate) {
		this.doelenTemplate = doelenTemplate;
	}

	public String getHandelingenTemplate() {
		return handelingenTemplate;
	}

	public void setHandelingenTemplate(String handelingenTemplate) {
		this.handelingenTemplate = handelingenTemplate;
	}

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@Column(nullable = false, length = 255)
	private String naam;

	@Column(nullable = false)
	private boolean actief = true;

	@Column(nullable = false)
	private boolean handelingsplan;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "defaultGesprekSoort", nullable = true)
	private GesprekSoort standaardGesprekSoort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "defaultTaakSoort", nullable = true)
	private TaakSoort standaardTaakSoort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "defaultTestDefinitie", nullable = true)
	private TestDefinitie standaardTestDefinitie;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private ZorgvierkantKwadrant kwadrant = ZorgvierkantKwadrant.Ontwikkeling;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectsoort")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ToegestaneStatusSoort> toegestaneStatussoorten = new ArrayList<>();

	@Lob
	@Column(nullable = true)
	private String beginSituatieTemplate;

	@Lob
	@Column(nullable = true)
	private String doelenTemplate;

	@Lob
	@Column(nullable = true)
	private String handelingenTemplate;

}
