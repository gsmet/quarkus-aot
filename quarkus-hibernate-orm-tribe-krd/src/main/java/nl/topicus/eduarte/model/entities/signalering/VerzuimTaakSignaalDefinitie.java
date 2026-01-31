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
package nl.topicus.eduarte.model.entities.signalering;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.participatie.VerzuimTaakSignaalDefinitieEnEventConfiguratieKoppel;
import nl.topicus.eduarte.model.leerplicht.SoortLeerplichtDeelnemer;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class VerzuimTaakSignaalDefinitie extends InstellingEntiteit {
	private String signaalNaam;

	private String omschrijving;

	@Enumerated(EnumType.STRING)
	private SoortLeerplichtDeelnemer soortDeelnemer;

	private int aantalklokuren;

	private int aantalWeken;

	private int aantalWekenAanEen;

	private boolean ongeoorlooft;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "signaalDefinitie")
	private List<VerzuimTaakSignaalDefinitieEnEventConfiguratieKoppel> koppelingen;

	public void setSignaalNaam(String signaalNaam) {
		this.signaalNaam = signaalNaam;
	}

	public String getSignaalNaam() {
		return signaalNaam;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setSoortDeelnemer(SoortLeerplichtDeelnemer soortDeelnemer) {
		this.soortDeelnemer = soortDeelnemer;
	}

	public SoortLeerplichtDeelnemer getSoortDeelnemer() {
		return soortDeelnemer;
	}

	public void setAantalklokuren(int aantalklokuren) {
		this.aantalklokuren = aantalklokuren;
	}

	public int getAantalklokuren() {
		return aantalklokuren;
	}

	public void setAantalWeken(int aantalWeken) {
		this.aantalWeken = aantalWeken;
	}

	public int getAantalWeken() {
		return aantalWeken;
	}

	public void setAantalWekenAanEen(int aantalWekenAchtereenvolgendAfwezig) {
		this.aantalWekenAanEen = aantalWekenAchtereenvolgendAfwezig;
	}

	public int getAantalWekenAanEen() {
		return aantalWekenAanEen;
	}

	public void setOngeoorlooft(boolean ongeoorlooft) {
		this.ongeoorlooft = ongeoorlooft;
	}

	public boolean isOngeoorlooft() {
		return ongeoorlooft;
	}

	public void setKoppelingen(List<VerzuimTaakSignaalDefinitieEnEventConfiguratieKoppel> koppelingen) {
		this.koppelingen = koppelingen;
	}

	public List<VerzuimTaakSignaalDefinitieEnEventConfiguratieKoppel> getKoppelingen() {
		return koppelingen;
	}

	@Override
	public String toString() {
		return signaalNaam;
	}

}
