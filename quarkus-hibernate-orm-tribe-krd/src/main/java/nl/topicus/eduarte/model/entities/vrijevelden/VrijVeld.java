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
package nl.topicus.eduarte.model.entities.vrijevelden;

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
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.taxonomie.Taxonomie;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "VrijVeld", uniqueConstraints = {
		@UniqueConstraint(columnNames = { "naam", "organisatie" }) })
public class VrijVeld extends InstellingEntiteit {
	@Column(nullable = false)
	private String naam;

	@Column(nullable = false)
	private boolean actief = true;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private VrijVeldType type;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private VrijVeldCategorie categorie;

	@Column(nullable = false)
	private boolean intakescherm;

	@Column(nullable = false)
	private boolean dossierscherm = true;

	@Column(nullable = false)
	private boolean uitgebreidzoeken;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vrijVeld")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<VrijVeldKeuzeOptie> vrijVeldKeuzeOpties = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "taxonomie", nullable = true)
	private Taxonomie taxonomie;

	public VrijVeld() {
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

	public VrijVeldType getType() {
		return type;
	}

	public void setType(VrijVeldType type) {
		this.type = type;
	}

	public VrijVeldCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(VrijVeldCategorie categorie) {
		this.categorie = categorie;
	}

	public boolean isIntakescherm() {
		return intakescherm;
	}

	public void setIntakescherm(boolean intakescherm) {
		this.intakescherm = intakescherm;
	}

	public boolean isDossierscherm() {
		return dossierscherm;
	}

	public void setDossierscherm(boolean dossierscherm) {
		this.dossierscherm = dossierscherm;
	}

	public boolean isUitgebreidzoeken() {
		return uitgebreidzoeken;
	}

	public void setUitgebreidzoeken(boolean uitgebreidzoeken) {
		this.uitgebreidzoeken = uitgebreidzoeken;
	}

	public List<VrijVeldKeuzeOptie> getVrijVeldKeuzeOpties() {
		if (vrijVeldKeuzeOpties == null)
			vrijVeldKeuzeOpties = new ArrayList<>();
		return vrijVeldKeuzeOpties;
	}

	public void setVrijVeldKeuzeOpties(List<VrijVeldKeuzeOptie> vrijVeldKeuzeOpties) {
		this.vrijVeldKeuzeOpties = vrijVeldKeuzeOpties;
	}

	public List<VrijVeldKeuzeOptie> getBeschikbareKeuzeOpties() {
		List<VrijVeldKeuzeOptie> ret = new ArrayList<>();
		for (VrijVeldKeuzeOptie curOptie : getVrijVeldKeuzeOpties())
			if (curOptie.isActief())
				ret.add(curOptie);
		return ret;
	}

	public void setTaxonomie(Taxonomie taxonomie) {
		this.taxonomie = taxonomie;
	}

	public Taxonomie getTaxonomie() {
		return taxonomie;
	}
}
