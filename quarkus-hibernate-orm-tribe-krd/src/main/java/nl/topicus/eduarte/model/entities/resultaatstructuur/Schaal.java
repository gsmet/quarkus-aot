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

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.resultaatstructuur.Toets.BerekendResultaat;

/**
 * Een resultatenschaal (cijfers of tekstuele waarden).
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Schaal extends InstellingEntiteit {
	/**
	 */
	public enum Schaaltype {
		/**
		 * Cijferschaal
		 */
		Cijfer,
		/**
		 * Tekstuele schaal
		 */
		Tekstueel;
	}

	@Column(nullable = false)
	private boolean actief = true;

	@Column(length = 100, nullable = false)
	private String naam;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Schaaltype schaaltype;

	/**
	 * Moet ingevuld worden voor cijferschalen, maar niet voor tekstschalen.
	 */
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal minimumVoorBehaald;

	/**
	 * Alleen van toepassing voor cijferschalen.
	 */
	@Column(nullable = true)
	private Integer aantalDecimalen;

	/**
	 * De minimum waarde voor een cijferschaal.
	 */
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal minimum;

	/**
	 * De maximum waarde voor een cijferschaal.
	 */
	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal maximum;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "schaal")
	@OrderBy("volgnummer")
	private List<Schaalwaarde> schaalwaarden = new ArrayList<>();

	public Schaal() {
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isActief() {
		return actief;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Schaaltype getSchaaltype() {
		return schaaltype;
	}

	public void setSchaaltype(Schaaltype schaaltype) {
		this.schaaltype = schaaltype;
	}

	public BigDecimal getMinimumVoorBehaald() {
		return minimumVoorBehaald;
	}

	public void setMinimumVoorBehaald(BigDecimal minimumVoorBehaald) {
		this.minimumVoorBehaald = minimumVoorBehaald;
	}

	public Integer getAantalDecimalen() {
		return aantalDecimalen;
	}

	public void setAantalDecimalen(Integer aantalDecimalen) {
		this.aantalDecimalen = aantalDecimalen;
	}

	public BigDecimal getMinimum() {
		return minimum;
	}

	public void setMinimum(BigDecimal minimum) {
		this.minimum = minimum;
	}

	public BigDecimal getMaximum() {
		return maximum;
	}

	public void setMaximum(BigDecimal maximum) {
		this.maximum = maximum;
	}

	public List<Schaalwaarde> getSchaalwaarden() {
		return schaalwaarden;
	}

	public void setSchaalwaarden(List<Schaalwaarde> schaalwaarden) {
		this.schaalwaarden = schaalwaarden;
	}

	public int getNextVolgnummer() {
		var max = 0;
		for (Schaalwaarde curWaarde : getSchaalwaarden()) {
			if (curWaarde.getVolgnummer() > max) {
				max = curWaarde.getVolgnummer();
			}
		}
		return max + 1;
	}

	public boolean isGeldigCijfer(Object value) {
		if (value == null)
			return true;

		if (Schaaltype.Cijfer.equals(getSchaaltype())) {
			var decVal = (BigDecimal) value;
			return decVal.compareTo(getMinimum()) >= 0 && decVal.compareTo(getMaximum()) <= 0;
		}

		for (Schaalwaarde curWaarde : getSchaalwaarden()) {
			if (curWaarde.getInterneWaarde().equalsIgnoreCase(value.toString()))
				return true;
		}
		return false;
	}

	public boolean isJaNee() {
		return Schaaltype.Tekstueel.equals(getSchaaltype()) && getSchaalwaarden().size() == 2
				&& getSchaalwaarden().get(0).isBehaald() != getSchaalwaarden().get(1).isBehaald();
	}

	public Schaalwaarde findNee() {
		if (!isJaNee())
			throw new IllegalStateException("findNee kan alleen op een Ja/Nee schaal");

		if (getSchaalwaarden().get(0).isBehaald())
			return getSchaalwaarden().get(1);
		else
			return getSchaalwaarden().get(0);
	}

	public BerekendResultaat calculateCijferOfWaarde(BigDecimal value, int divisor) {
		var onafgerond = value.divide(BigDecimal.valueOf(divisor), 9, RoundingMode.HALF_UP);
		if (Schaaltype.Cijfer.equals(getSchaaltype())) {
			var ret = value.divide(BigDecimal.valueOf(divisor), getAantalDecimalen(), RoundingMode.HALF_UP);
			return isGeldigCijfer(ret) ? new BerekendResultaat(onafgerond, ret) : null;
		}

		for (Schaalwaarde curWaarde : getSchaalwaarden()) {
			if (curWaarde.bevat(value, divisor))
				return new BerekendResultaat(onafgerond, curWaarde);
		}
		return null;
	}

	public Schaalwaarde findWaarde(BigDecimal value) {
		if (!Schaaltype.Tekstueel.equals(getSchaaltype()))
			throw new IllegalStateException("findWaarde kan alleen op textuele schalen");
		for (Schaalwaarde curWaarde : getSchaalwaarden()) {
			if (curWaarde.bevat(value, 1))
				return curWaarde;
		}
		return null;
	}

	public void prepareForSave() {
		if (Schaaltype.Cijfer.equals(getSchaaltype())) {
			getSchaalwaarden().clear();
		} else {
			BigDecimal maxTotCijfer = null;
			BigDecimal minVanafCijfer = null;
			BigDecimal behaald = null;
			for (Schaalwaarde curWaarde : getSchaalwaarden()) {
				if (maxTotCijfer == null
						|| (curWaarde.getTotCijfer() != null && maxTotCijfer.compareTo(curWaarde.getTotCijfer()) < 0))
					maxTotCijfer = curWaarde.getTotCijfer();
				if (minVanafCijfer == null || (curWaarde.getVanafCijfer() != null
						&& minVanafCijfer.compareTo(curWaarde.getVanafCijfer()) > 0))
					minVanafCijfer = curWaarde.getVanafCijfer();
				if (behaald == null && curWaarde.isBehaald())
					behaald = curWaarde.getVanafCijfer();
			}
			setAantalDecimalen(null);
			setMinimumVoorBehaald(behaald);
			setMinimum(minVanafCijfer);
			setMaximum(maxTotCijfer);
		}
	}

	/**
	 * Geeft een hash terug die alle waarden bevat die bij verandering een
	 * herberekening noodzakelijk maken.
	 */
	public String computeHash() {
		var sb = new StringBuilder();
		sb.append(getAantalDecimalen());
		sb.append(";");
		sb.append(getMaximum());
		sb.append(";");
		sb.append(getMinimum());
		sb.append(";");
		sb.append(getMinimumVoorBehaald());
		sb.append(";");
		sb.append(getSchaaltype());
		sb.append(";");
		for (Schaalwaarde curWaarde : getSchaalwaarden()) {
			sb.append(curWaarde.getVanafCijfer());
			sb.append(":");
			sb.append(curWaarde.getTotCijfer());
			sb.append(":");
			sb.append(curWaarde.getNominaleWaarde());
			sb.append(":");
			sb.append(curWaarde.getVolgnummer());
			sb.append(";");
			sb.append(curWaarde.isBehaald());
			sb.append(";");
		}
		return sb.toString();
	}
}
