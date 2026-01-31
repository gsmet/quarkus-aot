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
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;

import nl.topicus.eduarte.model.entities.ViewEntiteit;
import nl.topicus.eduarte.model.entities.participatie.enums.DeelnemerMedewerkerGroepEnum;

@Entity
@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Instelling")
@Table(name = "DeelnemerMedewerkerGroepView")
public class DeelnemerMedewerkerGroep extends ViewEntiteit {
	@Column(nullable = false, length = 100)
	private String omschrijving;

	@Column(nullable = false, length = 100)
	private String code;

	@Column(nullable = false, length = 100)
	private String voorletters;

	@Column(nullable = false, length = 100)
	private String voornamen;

	@Column(nullable = false, length = 100)
	private String voorvoegsel;

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = false, length = 100)
	@Enumerated(EnumType.STRING)
	private DeelnemerMedewerkerGroepEnum type;

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setType(DeelnemerMedewerkerGroepEnum type) {
		this.type = type;
	}

	public DeelnemerMedewerkerGroepEnum getType() {
		return type;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getCode() {
		return code;
	}

	public void setVoorletters(String voorletters) {
		this.voorletters = voorletters;
	}

	public String getVoorletters() {
		return voorletters;
	}

	public void setVoornamen(String voornamen) {
		this.voornamen = voornamen;
	}

	public String getVoornamen() {
		return voornamen;
	}

	public void setVoorvoegsel(String voorvoegsel) {
		this.voorvoegsel = voorvoegsel;
	}

	public String getVoorvoegsel() {
		return voorvoegsel;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	@Override
	public String toString() {
		var str = "";

		if (getCode() != null)
			str = getCode() + " - ";

		if (DeelnemerMedewerkerGroepEnum.deelnemer.equals(getType()) && voornamen != null)
			str += getVoornamen() + " ";

		str += getOmschrijving();

		str += " (" + type + ") ";

		return str;
	}

}
