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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.participatie.enums.IParticipatieBlokObject;
import nl.topicus.eduarte.model.entities.participatie.enums.WaarnemingSoort;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 * Een waarneming geeft aan of een deelnemer op een gegeven moment wel/niet
 * aanwezig is geweest. Hierbij wordt geen reden opgegeven, alleen een indicatie
 * dat de deelnemer aan-/afwezig was.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Waarneming extends InstellingEntiteit implements IParticipatieBlokObject {
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date beginDatumTijd;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date eindDatumTijd;

	/**
	 * Het beginlesuur van de afspraak. Niet verplicht, wordt alleen gebruikt voor
	 * informatieve doeleinden.
	 */
	@Column(nullable = true)
	private Integer beginLesuur;

	/**
	 * Het eindlesuur van de afspraak. Niet verplicht, wordt alleen gebruikt voor
	 * informatieve doeleinden.
	 */
	@Column(nullable = true)
	private Integer eindLesuur;

	/**
	 * Geeft aan of de deelnemer aanwezig of afwezig was. Kan ook de speciale Nvt
	 * waarneming zijn. Dit betekent dat de deelnemer weliswaar was ingepland, maar
	 * hij/zij hoefde uiteindelijk toch niet op te komen dagen.
	 */
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private WaarnemingSoort waarnemingSoort;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	/**
	 * Als een absentiewaarneming gekoppeld is aan een absentiemelding, is de
	 * waarneming per definitie afgehandeld. De afhandeling van de waarneming loopt
	 * dan namelijk via de absentiemelding.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "absentieMelding", nullable = true)
	private AbsentieMelding absentieMelding;

	/**
	 * Een waarneming kan gekoppeld zijn aan een afspraak. Hiermee wordt aangegeven
	 * voor welke afspraak de waarneming geldt. De begin- en eindtijd van de
	 * waarneming moet dan binnen de begin- en eindtijd van de afspraak liggen (of
	 * gelijk zijn aan...)
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraak", nullable = true)
	private Afspraak afspraak;

	/**
	 * Het onderwijsproduct waarvoor de waarneming is. Dit zou overeen moeten komen
	 * met het onderwijsproduct van de afspraak, mits er een afspraak is.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "onderwijsproduct", nullable = true)
	private Onderwijsproduct onderwijsproduct;

	/**
	 * Een absentiewaarneming wordt standaard op afgehandeld=false gezet. Een
	 * presentiewaarneming of een nvt-waarneming gaat standaard op afgehandeld=true.
	 * Een absentiewaarneming die gekoppeld is aan een absentiemelding wordt daarmee
	 * standaard afgehandeld. Dit property blijft dan op afgehandeld=false staan,
	 * zodat als de absentiemelding aangepast wordt, de waarneming weer terugkomt in
	 * het bakje met openstaande waarnemingen.
	 */
	@Column(nullable = false)
	private boolean afgehandeld;

	@Override
	public Date getBeginDatumTijd() {
		return beginDatumTijd;
	}

	public void setBeginDatumTijd(Date beginDatumTijd) {
		this.beginDatumTijd = beginDatumTijd;
	}

	@Override
	public Date getEindDatumTijd() {
		return eindDatumTijd;
	}

	public void setEindDatumTijd(Date eindDatumTijd) {
		this.eindDatumTijd = eindDatumTijd;
	}

	@Override
	public Integer getBeginLesuur() {
		return beginLesuur;
	}

	public void setBeginLesuur(Integer beginLesuur) {
		this.beginLesuur = beginLesuur;
	}

	@Override
	public Integer getEindLesuur() {
		return eindLesuur;
	}

	public void setEindLesuur(Integer eindLesuur) {
		this.eindLesuur = eindLesuur;
	}

	public WaarnemingSoort getWaarnemingSoort() {
		return waarnemingSoort;
	}

	public void setWaarnemingSoort(WaarnemingSoort waarnemingSoort) {
		this.waarnemingSoort = waarnemingSoort;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public AbsentieMelding getAbsentieMelding() {
		return absentieMelding;
	}

	public void setAbsentieMelding(AbsentieMelding absentieMelding) {
		this.absentieMelding = absentieMelding;
	}

	public Afspraak getAfspraak() {
		return afspraak;
	}

	public void setAfspraak(Afspraak afspraak) {
		this.afspraak = afspraak;
	}

	public Onderwijsproduct getOnderwijsproduct() {
		return onderwijsproduct;
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct) {
		this.onderwijsproduct = onderwijsproduct;
	}

	public boolean isAfgehandeld() {
		return afgehandeld;
	}

	public void setAfgehandeld(boolean afgehandeld) {
		this.afgehandeld = afgehandeld;
	}

	@Override
	public boolean isActiefOpDatum(Date datum) {
		return false;
	}

	@Override
	public String getCssClass() {
		return null;
	}

	@Override
	public String getTitle() {
		return null;
	}
}
