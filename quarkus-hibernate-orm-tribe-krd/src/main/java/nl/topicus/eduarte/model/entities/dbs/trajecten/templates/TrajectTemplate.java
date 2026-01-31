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
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.trajecten.TrajectSoort;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class TrajectTemplate extends InstellingEntiteit implements IBijlageKoppelEntiteit<TrajectTemplateBijlage> {
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@Column(length = 128, nullable = false)
	private String naam;

	@Column(length = 512, nullable = false)
	private String omschrijving;

	@Column(nullable = false)
	private boolean actief = true;

	@Column(nullable = false)
	private Integer tijdsduurAantal;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TijdEenheid tijdsduurEenheid;

	@Column(nullable = false)
	private boolean opEersteDagSchooljaar;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trajectSoort", nullable = false, foreignKey = @ForeignKey(name = "FK_TrajTempl_soort"))
	private TrajectSoort trajectSoort;

	@Column(nullable = true)
	private Integer zorglijn;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplate")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@SQLRestriction("koppelingsRol = 'UITVOERENDE'")
	private List<GekoppeldeTemplate> uitvoerenden = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplate")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@SQLRestriction("koppelingsRol = 'VERANTWOORDELIJKE'")
	private List<GekoppeldeTemplate> verantwoordelijken = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplate")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TrajectBegeleidingsHandelingTemplate> handelingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplate")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<AanleidingTemplate> aanleidingen = new ArrayList<>();

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EindHandelingTemplate", nullable = true)
	private BegeleidingsHandelingTemplate eindHandelingTemplate;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "automatischeKoppeling", nullable = true)
	private TrajectTemplateAutomatischeKoppeling automatischeKoppeling;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectTemplate")
	private List<TrajectTemplateBijlage> bijlagen;

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

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public Integer getTijdsduurAantal() {
		return tijdsduurAantal;
	}

	public void setTijdsduurAantal(Integer tijdsduurAantal) {
		this.tijdsduurAantal = tijdsduurAantal;
	}

	public TijdEenheid getTijdsduurEenheid() {
		return tijdsduurEenheid;
	}

	public void setTijdsduurEenheid(TijdEenheid tijdsduurEenheid) {
		this.tijdsduurEenheid = tijdsduurEenheid;
	}

	public boolean isOpEersteDagSchooljaar() {
		return opEersteDagSchooljaar;
	}

	public void setOpEersteDagSchooljaar(boolean opEersteDagSchooljaar) {
		this.opEersteDagSchooljaar = opEersteDagSchooljaar;
	}

	public TrajectSoort getTrajectSoort() {
		return trajectSoort;
	}

	public void setTrajectSoort(TrajectSoort trajectSoort) {
		this.trajectSoort = trajectSoort;
	}

	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public List<GekoppeldeTemplate> getUitvoerenden() {
		return uitvoerenden;
	}

	public void setUitvoerenden(List<GekoppeldeTemplate> uitvoerenden) {
		this.uitvoerenden = uitvoerenden;
	}

	public List<GekoppeldeTemplate> getVerantwoordelijken() {
		return verantwoordelijken;
	}

	public void setVerantwoordelijken(List<GekoppeldeTemplate> verantwoordelijken) {
		this.verantwoordelijken = verantwoordelijken;
	}

	public List<TrajectBegeleidingsHandelingTemplate> getHandelingen() {
		return handelingen;
	}

	public void setHandelingen(List<TrajectBegeleidingsHandelingTemplate> handelingen) {
		this.handelingen = handelingen;
	}

	public List<AanleidingTemplate> getAanleidingen() {
		return aanleidingen;
	}

	public void setAanleidingen(List<AanleidingTemplate> aanleidingen) {
		this.aanleidingen = aanleidingen;
	}

	public BegeleidingsHandelingTemplate getEindHandelingTemplate() {
		return eindHandelingTemplate;
	}

	public void setEindHandelingTemplate(BegeleidingsHandelingTemplate eindHandelingTemplate) {
		this.eindHandelingTemplate = eindHandelingTemplate;
	}

	public TrajectTemplateAutomatischeKoppeling getAutomatischeKoppeling() {
		return automatischeKoppeling;
	}

	public void setAutomatischeKoppeling(TrajectTemplateAutomatischeKoppeling automatischeKoppeling) {
		this.automatischeKoppeling = automatischeKoppeling;
	}

	@Override
	public List<TrajectTemplateBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<TrajectTemplateBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public TrajectTemplateBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
