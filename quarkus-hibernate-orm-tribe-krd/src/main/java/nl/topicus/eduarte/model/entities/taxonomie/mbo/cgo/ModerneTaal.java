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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ModerneTaal extends LandelijkOfInstellingEntiteit {
	private String omschrijving;

	private String afkorting;

	private String code;

	@Column(nullable = false)
	private Boolean voorgedefinieerd = false;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taal")
	private List<TaalTypeKoppel> gekoppeldeTaalTypes = new ArrayList<>();

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getAfkorting() {
		return afkorting;
	}

	public void setAfkorting(String afkorting) {
		this.afkorting = afkorting;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<TaalTypeKoppel> getGekoppeldeTaalTypes() {
		return gekoppeldeTaalTypes;
	}

	public void setGekoppeldeTaalTypes(List<TaalTypeKoppel> gekoppeldeTaalTypes) {
		this.gekoppeldeTaalTypes = gekoppeldeTaalTypes;
	}

	public void addTaalTypeKoppel(TaalTypeKoppel type) {
		gekoppeldeTaalTypes.add(type);
	}

	public Boolean getVoorgedefinieerd() {
		return voorgedefinieerd;
	}

	public void setVoorgedefinieerd(Boolean voorgedefinieerd) {
		this.voorgedefinieerd = voorgedefinieerd;
	}
}
