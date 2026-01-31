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
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 * Entiteit welke een enkel VrijVeld bevat.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public abstract class VrijVeldEntiteit extends LandelijkOfInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vrijVeld", nullable = false)
	private VrijVeld vrijVeld;

	@Column(nullable = true)
	private Boolean checkWaarde;

	@Column(nullable = true)
	private Date dateWaarde;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "entiteit")
	@BatchSize(size = 100)
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Inrichting")
	private List<VrijVeldOptieKeuze> keuzes = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "keuze", nullable = true)
	private VrijVeldKeuzeOptie keuze;

	@Lob
	@Basic(optional = true)
	private String longTextWaarde;

	@Column(nullable = true)
	private Long numberWaarde;

	@Column(nullable = true)
	private String textWaarde;

	public VrijVeldEntiteit() {
	}

	public VrijVeld getVrijVeld() {
		return vrijVeld;
	}

	public void setVrijVeld(VrijVeld veld) {
		vrijVeld = veld;
	}

	/**
	 * @return de string waarde van het vrijveld
	 */
	public String getOmschrijving() {
		if (VrijVeldType.AANKRUISVAK.equals(getVrijVeld().getType()))
			return getCheckWaarde() == null ? null : getCheckWaarde() ? "Ja" : "Nee";
		// else if (getVrijVeld().getType().equals(VrijVeldType.DATUM))
		// return TimeUtil.getInstance().formatDate(getDateWaarde());
		else if (VrijVeldType.KEUZELIJST.equals(getVrijVeld().getType()))
			return getKeuze() != null ? getKeuze().getNaam() : "";
		else if (VrijVeldType.LANGETEKST.equals(getVrijVeld().getType()))
			return getLongTextWaarde();
		else if (VrijVeldType.MULTISELECTKEUZELIJST.equals(getVrijVeld().getType())) {
			var omschrijving = "";

			for (VrijVeldOptieKeuze optie : getKeuzes()) {
				omschrijving += optie.getOptie().getNaam() + ", ";
			}

			if (omschrijving.lastIndexOf(",") > 0)
				omschrijving = omschrijving.substring(0, omschrijving.lastIndexOf(","));

			if (omschrijving.length() > 40) {
				omschrijving = omschrijving.substring(0, 37);
				omschrijving += " ...";
			}

			return omschrijving;
		} else if (VrijVeldType.NUMERIEK.equals(getVrijVeld().getType()) && getNumberWaarde() != null)
			return getNumberWaarde().toString();
		else if (VrijVeldType.TEKST.equals(getVrijVeld().getType()))
			return getTextWaarde();

		return null;
	}

	public Boolean getCheckWaarde() {
		return checkWaarde;
	}

	public void setCheckWaarde(Boolean checkWaarde) {
		this.checkWaarde = checkWaarde;
	}

	public Date getDateWaarde() {
		return dateWaarde;
	}

	public void setDateWaarde(Date dateWaarde) {
		this.dateWaarde = dateWaarde;
	}

	public List<VrijVeldOptieKeuze> getKeuzes() {
		return keuzes;
	}

	public void setKeuzes(List<VrijVeldOptieKeuze> keuzes) {
		this.keuzes = keuzes;
	}

	public VrijVeldKeuzeOptie getKeuze() {
		return keuze;
	}

	public void setKeuze(VrijVeldKeuzeOptie keuze) {
		this.keuze = keuze;
	}

	public String getLongTextWaarde() {
		return longTextWaarde;
	}

	public void setLongTextWaarde(String longTextWaarde) {
		this.longTextWaarde = longTextWaarde;
	}

	public Long getNumberWaarde() {
		return numberWaarde;
	}

	public void setNumberWaarde(Long numberWaarde) {
		this.numberWaarde = numberWaarde;
	}

	public String getTextWaarde() {
		return textWaarde;
	}

	public void setTextWaarde(String textWaarde) {
		this.textWaarde = textWaarde;
	}

	/**
	 * @return indien van toepassing, het object waar deze implementatie
	 *         aangekoppeld is afgezien van {@link VrijVeld}.
	 */
	public abstract VrijVeldable<? extends VrijVeldEntiteit> getEntiteit();

	/**
	 * Stelt, indien van toepassing, het object in waar deze implementatie
	 * aangekoppeld is afgezien van {@link VrijVeld}.
	 *
	 * @param entiteit
	 */
	public abstract void setEntiteit(VrijVeldable<? extends VrijVeldEntiteit> entiteit);
}
