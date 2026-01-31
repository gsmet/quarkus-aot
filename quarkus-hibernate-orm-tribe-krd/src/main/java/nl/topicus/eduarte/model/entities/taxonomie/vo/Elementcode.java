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
package nl.topicus.eduarte.model.entities.taxonomie.vo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.taxonomie.TaxonomieElement;
import nl.topicus.eduarte.model.entities.taxonomie.Verbintenisgebied;

/**
 * Elementcode is het niveau waarop leerlingen in het VO worden ingeschreven.
 *
 */
@Entity()
public class Elementcode extends Verbintenisgebied {
	/**
	 * Profiel voor bovenbouw havo/vwo.
	 */
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Profiel profiel;

	/**
	 * Sector voor bovenbouw vmbo.
	 */
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Sector sector;

	/**
	 * Het taxonomie-element dat overeenkomt met de LWOO-versie van dit
	 * taxonomieelement.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "lwooTaxonomieElement")
	private TaxonomieElement lwooTaxonomieElement;

	/**
	 * Is dit een lwoo-taxonomie-element?
	 */
	@Column(nullable = true)
	private Boolean lwoo;

	/**
	 * @return Returns the profiel.
	 */
	public Profiel getProfiel() {
		return profiel;
	}

	/**
	 * @param profiel The profiel to set.
	 */
	public void setProfiel(Profiel profiel) {
		this.profiel = profiel;
	}

	/**
	 * @return Returns the sector.
	 */
	public Sector getSector() {
		return sector;
	}

	/**
	 * @param sector The sector to set.
	 */
	public void setSector(Sector sector) {
		this.sector = sector;
	}

	/**
	 * @return Returns the lwooTaxonomieElement.
	 */
	public TaxonomieElement getLwooTaxonomieElement() {
		return lwooTaxonomieElement;
	}

	/**
	 * @param lwooTaxonomieElement The lwooTaxonomieElement to set.
	 */
	public void setLwooTaxonomieElement(TaxonomieElement lwooTaxonomieElement) {
		this.lwooTaxonomieElement = lwooTaxonomieElement;
	}

	/**
	 * @return Returns the lwoo.
	 */
	public Boolean getLwoo() {
		return lwoo;
	}

	/**
	 * @param lwoo The lwoo to set.
	 */
	public void setLwoo(Boolean lwoo) {
		this.lwoo = lwoo;
	}

	/**
	 *
	 * @return true als dit een VAVO-elementcode is
	 */
	public boolean isVAVO() {
		return getExterneCode().startsWith("5");
	}

	public String getProfiel1() {
		if (getProfiel() == null)
			return null;
		if (getProfiel().getProfiel1() == null)
			return getProfiel().getNaam();
		return getProfiel().getProfiel1().getNaam();
	}

	public String getProfiel2() {
		if (getProfiel() == null)
			return null;
		if (getProfiel().getProfiel2() == null)
			return "xxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxxx";
		return getProfiel().getProfiel2().getNaam();
	}

	public String getSectornamen() {
		if (getSector() == null)
			return null;
		return getSector().toString();
	}
}
