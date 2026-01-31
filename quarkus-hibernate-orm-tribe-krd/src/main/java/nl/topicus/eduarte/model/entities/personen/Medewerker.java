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
package nl.topicus.eduarte.model.entities.personen;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.groep.GroepDocent;
import nl.topicus.eduarte.model.entities.kenmerk.MedewerkerKenmerk;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.vrijevelden.MedewerkerVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@IsViewWhenOnNoise
public class Medewerker extends BeginEinddatumInstellingEntiteit implements
IOrganisatieEenheidLocatieKoppelbaarEntiteit<OrganisatieMedewerker>, VrijVeldable<MedewerkerVrijVeld> {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = false)
	private Persoon persoon;

	/**
	 * Dit staat ook bekend als de roosterCode
	 */
	@Column(length = 10, nullable = false)
	private String afkorting;

	/**
	 * Collectie met alle organisatie-eenheden waarbij de medewerker hoort.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medewerker")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<OrganisatieMedewerker> organisatieMedewerkers;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "functie", nullable = true)
	private Functie functie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "redenUitDienst", nullable = true)
	private RedenUitDienst redenUitDienst;

	@Column(nullable = false, name = "uitgeslotenVanCorres")
	private boolean uitgeslotenVanCorrespondentie = false;

	@Column(length = 200, nullable = true, name = "redenUitgeslotenVanCorres")
	private String redenUitgeslotenVanCorrespondentie;

	/**
	 * Collectie van groepen waarvan deze medewerker de docent is.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medewerker")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private Collection<GroepDocent> groepenDocent;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medewerker")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<MedewerkerVrijVeld> vrijVelden = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "medewerker")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<MedewerkerKenmerk> kenmerken = new ArrayList<>();

	public Persoon getPersoon() {
		return persoon;
	}

	public void setPersoon(Persoon persoon) {
		this.persoon = persoon;
	}

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public List<OrganisatieMedewerker> getOrganisatieMedewerkers() {
		return organisatieMedewerkers;
	}

	public void setOrganisatieMedewerkers(List<OrganisatieMedewerker> organisatieMedewerkers) {
		this.organisatieMedewerkers = organisatieMedewerkers;
	}

	public Functie getFunctie() {
		return functie;
	}

	public void setFunctie(Functie functie) {
		this.functie = functie;
	}

	public RedenUitDienst getRedenUitDienst() {
		return redenUitDienst;
	}

	public void setRedenUitDienst(RedenUitDienst redenUitDienst) {
		this.redenUitDienst = redenUitDienst;
	}

	public boolean isUitgeslotenVanCorrespondentie() {
		return uitgeslotenVanCorrespondentie;
	}

	public void setUitgeslotenVanCorrespondentie(boolean uitgeslotenVanCorrespondentie) {
		this.uitgeslotenVanCorrespondentie = uitgeslotenVanCorrespondentie;
	}

	public String getRedenUitgeslotenVanCorrespondentie() {
		return redenUitgeslotenVanCorrespondentie;
	}

	public void setRedenUitgeslotenVanCorrespondentie(String redenUitgeslotenVanCorrespondentie) {
		this.redenUitgeslotenVanCorrespondentie = redenUitgeslotenVanCorrespondentie;
	}

	public Collection<GroepDocent> getGroepenDocent() {
		return groepenDocent;
	}

	public void setGroepenDocent(Collection<GroepDocent> groepenDocent) {
		this.groepenDocent = groepenDocent;
	}

	@Override
	public List<MedewerkerVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<MedewerkerVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	public List<MedewerkerKenmerk> getKenmerken() {
		return kenmerken;
	}

	public void setKenmerken(List<MedewerkerKenmerk> kenmerken) {
		this.kenmerken = kenmerken;
	}

	@Override
	public MedewerkerVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<MedewerkerVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

	@Override
	public List<OrganisatieMedewerker> getOrganisatieEenheidLocatieKoppelingen() {
		return null;
	}
}
