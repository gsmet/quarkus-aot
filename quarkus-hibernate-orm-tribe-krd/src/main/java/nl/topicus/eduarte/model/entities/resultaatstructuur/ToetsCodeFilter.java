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

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 * Een filter op 1 of meer toetscodes
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ToetsCodeFilter extends InstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelbaarEntiteit<ToetsCodeFilterOrganisatieEenheidLocatie> {
	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = false, length = 1000)
	private String toetsCodes;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "toetsCodeFilter")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ToetsCodeFilterOrganisatieEenheidLocatie> organisatieEenhedenLocaties = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "toetsCodeFilter")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<StandaardToetsCodeFilter> standaardSelelecties = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	public ToetsCodeFilter() {
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public void setToetsCodes(String toetsCodes) {
		this.toetsCodes = toetsCodes;
	}

	public String getToetsCodes() {
		return toetsCodes;
	}

	public SortedSet<String> getToetsCodesAsSet() {
		SortedSet<String> ret = new TreeSet<>();
		if (getToetsCodes() == null)
			return ret;

		for (String curCode : getToetsCodes().split(",")) {
			ret.add(curCode.trim());
		}
		return ret;
	}

	public void setToetsCodesAsSet(SortedSet<String> toetsCodesAsSet) {
		var newValue = new StringBuilder();
		var first = true;
		for (String curCode : toetsCodesAsSet) {
			if (!first)
				newValue.append(',');
			first = false;
			newValue.append(curCode);
		}
		setToetsCodes(newValue.toString());
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setOrganisatieEenhedenLocaties(
			List<ToetsCodeFilterOrganisatieEenheidLocatie> organisatieEenhedenLocaties) {
		this.organisatieEenhedenLocaties = organisatieEenhedenLocaties;
	}

	public List<ToetsCodeFilterOrganisatieEenheidLocatie> getOrganisatieEenhedenLocaties() {
		return organisatieEenhedenLocaties;
	}

	public void setStandaardSelelecties(List<StandaardToetsCodeFilter> standaardSelelecties) {
		this.standaardSelelecties = standaardSelelecties;
	}

	public List<StandaardToetsCodeFilter> getStandaardSelelecties() {
		return standaardSelelecties;
	}

	@Override
	public String toString() {
		var ret = new StringBuilder(getNaam());
		if (getMedewerker() != null)
			ret.append(" (pers.)");
		return ret.toString();
	}

	@Override
	public List<ToetsCodeFilterOrganisatieEenheidLocatie> getOrganisatieEenheidLocatieKoppelingen() {
		return getOrganisatieEenhedenLocaties();
	}
}
