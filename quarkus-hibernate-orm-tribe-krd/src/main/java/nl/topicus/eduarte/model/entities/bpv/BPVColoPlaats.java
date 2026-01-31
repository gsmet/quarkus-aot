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
package nl.topicus.eduarte.model.entities.bpv;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class BPVColoPlaats extends InstellingEntiteit
{
	@Column(nullable = false)
	private String codeLeerbedrijf;

	@Column(nullable = true)
	private Long leerplaatsId;

	@Column(nullable = true)
	private String leerplaatsSoort;

	@Column(nullable = true)
	private String leerbedrijfNaam;

	@Column(nullable = true)
	private String vacatureLeerplaatsOmschrijving;

	@Column(nullable = true)
	private String leerweg;

	@Column(nullable = true)
	private Integer aantalGeregistreerdeLeerlingen;

	@Column(nullable = true)
	private Integer leerplaatsAantal;

	@Column(nullable = true)
	private String straat;

	@Column(nullable = true)
	private String postcode;

	@Column(nullable = true)
	private String plaats;

	@Column(nullable = true)
	private String land;

	public String getCodeLeerbedrijf() {
		return codeLeerbedrijf;
	}

	public void setCodeLeerbedrijf(String codeLeerbedrijf) {
		this.codeLeerbedrijf = codeLeerbedrijf;
	}

	public Long getLeerplaatsId() {
		return leerplaatsId;
	}

	public void setLeerplaatsId(Long leerplaatsId) {
		this.leerplaatsId = leerplaatsId;
	}

	public String getLeerplaatsSoort() {
		return leerplaatsSoort;
	}

	public void setLeerplaatsSoort(String leerplaatsSoort) {
		this.leerplaatsSoort = leerplaatsSoort;
	}

	public String getLeerbedrijfNaam() {
		return leerbedrijfNaam;
	}

	public void setLeerbedrijfNaam(String leerbedrijfNaam) {
		this.leerbedrijfNaam = leerbedrijfNaam;
	}

	public String getVacatureLeerplaatsOmschrijving() {
		return vacatureLeerplaatsOmschrijving;
	}

	public void setVacatureLeerplaatsOmschrijving(String vacatureLeerplaatsOmschrijving) {
		this.vacatureLeerplaatsOmschrijving = vacatureLeerplaatsOmschrijving;
	}

	public String getLeerweg() {
		return leerweg;
	}

	public void setLeerweg(String leerweg) {
		this.leerweg = leerweg;
	}

	public Integer getAantalGeregistreerdeLeerlingen() {
		return aantalGeregistreerdeLeerlingen;
	}

	public void setAantalGeregistreerdeLeerlingen(Integer aantalGeregistreerdeLeerlingen) {
		this.aantalGeregistreerdeLeerlingen = aantalGeregistreerdeLeerlingen;
	}

	public Integer getLeerplaatsAantal() {
		return leerplaatsAantal;
	}

	public void setLeerplaatsAantal(Integer leerplaatsAantal) {
		this.leerplaatsAantal = leerplaatsAantal;
	}

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String getLand() {
		return land;
	}

	public void setLand(String land) {
		this.land = land;
	}

}