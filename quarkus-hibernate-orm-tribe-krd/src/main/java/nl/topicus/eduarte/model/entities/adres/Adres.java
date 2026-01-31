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
package nl.topicus.eduarte.model.entities.adres;

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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.landelijk.Gemeente;
import nl.topicus.eduarte.model.entities.landelijk.Land;
import nl.topicus.eduarte.model.entities.landelijk.Provincie;
import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.PersoonAdres;

/**
 * Entiteit voor adresgegevens voor zowel Nederlandse als buitenlandse adressen. Er zijn
 * geen aparte velden voor adresgegevens van buitenlandse adressen (zoals buitenland1,
 * buitenland2, buitenland3). In plaats daarvan maken buitenlandse adressen ook gewoon
 * gebruik van de straat, huisnummer en postcodevelden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Adres extends LandelijkOfInstellingEntiteit
{
	@Column(length = 60, nullable = true)
	private String straat;

	@Column(length = 60, nullable = false)
	private String plaats;

	@Column(length = 12)
	@Bron(sleutel = true)
	private String postcode;

	@Column(length = 15)
	@Bron
	private String huisnummer;

	@Column(length = 5)
	@Bron
	private String huisnummerToevoeging;

	@Column(length = 35)
	@Bron
	private String locatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "gemeente", nullable = true)
	private Gemeente gemeente;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "provincie", nullable = true)
	private Provincie provincie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "land", nullable = false)
	@Bron(sleutel = true, verplicht = true)
	private Land land;

	@Column(nullable = false)
	private boolean geheim;

	/**
	 * Optioneel veld, alleen gevuld voor personen die bij een deelnemer horen. Wordt
	 * gebruikt om wijzigingen in personalia terug te kunnen voeren op de deelnemer voor
	 */
	@OneToMany(mappedBy = "adres", fetch = FetchType.LAZY, targetEntity = AdresEntiteit.class)
	private List<PersoonAdres> persoonAdressen = new ArrayList<>();

	/**
	 * Optioneel veld, alleen gevuld voor personen die bij een deelnemer horen. Wordt
	 * gebruikt om wijzigingen in personalia terug te kunnen voeren op de deelnemer voor
	 */
	@OneToMany(mappedBy = "adres", fetch = FetchType.LAZY)
	private List<AdresEntiteit< ? >> adresEntiteiten = new ArrayList<>();

	@Enumerated(EnumType.STRING)
	@Column(length = 30)
	private DuitseDeelstaat duitseDeelstaat;

	public String getStraat() {
		return straat;
	}

	public void setStraat(String straat) {
		this.straat = straat;
	}

	public String getPlaats() {
		return plaats;
	}

	public void setPlaats(String plaats) {
		this.plaats = plaats;
	}

	public String getPostcode() {
		return postcode;
	}

	public void setPostcode(String postcode) {
		this.postcode = postcode;
	}

	public String getHuisnummer() {
		return huisnummer;
	}

	public void setHuisnummer(String huisnummer) {
		this.huisnummer = huisnummer;
	}

	public String getHuisnummerToevoeging() {
		return huisnummerToevoeging;
	}

	public void setHuisnummerToevoeging(String huisnummerToevoeging) {
		this.huisnummerToevoeging = huisnummerToevoeging;
	}

	public String getLocatie() {
		return locatie;
	}

	public void setLocatie(String locatie) {
		this.locatie = locatie;
	}

	public Gemeente getGemeente() {
		return gemeente;
	}

	public void setGemeente(Gemeente gemeente) {
		this.gemeente = gemeente;
	}

	public Provincie getProvincie() {
		return provincie;
	}

	public void setProvincie(Provincie provincie) {
		this.provincie = provincie;
	}

	public Land getLand() {
		return land;
	}

	public void setLand(Land land) {
		this.land = land;
	}

	public boolean isGeheim() {
		return geheim;
	}

	public void setGeheim(boolean geheim) {
		this.geheim = geheim;
	}

	public List<PersoonAdres> getPersoonAdressen() {
		return persoonAdressen;
	}

	public void setPersoonAdressen(List<PersoonAdres> persoonAdressen) {
		this.persoonAdressen = persoonAdressen;
	}

	public List<AdresEntiteit<?>> getAdresEntiteiten() {
		return adresEntiteiten;
	}

	public void setAdresEntiteiten(List<AdresEntiteit<?>> adresEntiteiten) {
		this.adresEntiteiten = adresEntiteiten;
	}

	public DuitseDeelstaat getDuitseDeelstaat() {
		return duitseDeelstaat;
	}

	public void setDuitseDeelstaat(DuitseDeelstaat duitseDeelstaat) {
		this.duitseDeelstaat = duitseDeelstaat;
	}
}
