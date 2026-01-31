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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.entities.resultaatstructuur.Resultaatstructuur.Type;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ResultaatZoekFilterInstelling extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "medewerker")
	private Medewerker medewerker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "categorie")
	private ResultaatstructuurCategorie categorie;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Type type;

	@Column(nullable = true)
	private String codePath;

	@Column(nullable = false)
	private boolean gekoppeldAanVerbintenis;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "filterInstelling")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<GroepResultaatZoekFilterInstelling> groepInstellingen = new ArrayList<>();

	public ResultaatZoekFilterInstelling() {
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public ResultaatstructuurCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(ResultaatstructuurCategorie categorie) {
		this.categorie = categorie;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getCodePath() {
		return codePath;
	}

	public void setCodePath(String codePath) {
		this.codePath = codePath;
	}

	public boolean isGekoppeldAanVerbintenis() {
		return gekoppeldAanVerbintenis;
	}

	public void setGekoppeldAanVerbintenis(boolean gekoppeldAanVerbintenis) {
		this.gekoppeldAanVerbintenis = gekoppeldAanVerbintenis;
	}

	public List<GroepResultaatZoekFilterInstelling> getGroepInstellingen() {
		return groepInstellingen;
	}

	public void setGroepInstellingen(List<GroepResultaatZoekFilterInstelling> groepInstellingen) {
		this.groepInstellingen = groepInstellingen;
	}
}
