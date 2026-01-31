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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Vanuit deze tabel kunnen waarnemingen worden geimporteerd. een extern
 * waarnemingensysteem kan hier eventueel direct waarnemingen in plaatsen zodat
 * de waarnemingen automatisch door een batchjob omgezet kunnen worden naar
 * echte waarnemingen. Bij het importeren via CSV worden de waarnemingen ook
 * eerst in deze tabel aangemaakt
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ExterneWaarneming extends InstellingEntiteit {
	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date datum;

	/**
	 * waarneming soort kan afwezig, aanwezig of nvt zijn
	 */
	@Column(nullable = false)
	private String waarnemingSoort;

	@Column(nullable = false)
	private Long deelnemerNummer;

	@Temporal(value = TemporalType.TIME)
	@Column(nullable = true)
	private Date beginTijd;

	@Temporal(value = TemporalType.TIME)
	@Column(nullable = true)
	private Date eindTijd;

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

	@Column(nullable = true, length = 10)
	private String roosterCode;

	@Column(nullable = true, length = 10)
	private String lokaalCode;

	@Column(nullable = true)
	private Boolean verwerkt;

	@Column(nullable = true)
	private Long organisatieNummer;

	/**
	 * Default constructor voor Hibernate.
	 */
	public ExterneWaarneming() {
	}

	/**
	 * @return Returns the beginLesuur.
	 */
	public Integer getBeginLesuur() {
		return beginLesuur;
	}

	/**
	 * @param beginLesuur The beginLesuur to set.
	 */
	public void setBeginLesuur(Integer beginLesuur) {
		this.beginLesuur = beginLesuur;
	}

	/**
	 * @return Returns the eindLesuur.
	 */
	public Integer getEindLesuur() {
		return eindLesuur;
	}

	/**
	 * @param eindLesuur The eindLesuur to set.
	 */
	public void setEindLesuur(Integer eindLesuur) {
		this.eindLesuur = eindLesuur;
	}

	/**
	 * @return Returns the waarnemingSoort.
	 */
	public String getWaarnemingSoort() {
		return waarnemingSoort;
	}

	/**
	 * @param waarnemingSoort The waarnemingSoort to set.
	 */
	public void setWaarnemingSoort(String waarnemingSoort) {
		this.waarnemingSoort = waarnemingSoort;
	}

	/**
	 * @return Returns the deelnemerNummer.
	 */
	public Long getDeelnemerNummer() {
		return deelnemerNummer;
	}

	/**
	 * @return Returns the datum.
	 */
	public Date getDatum() {
		return datum;
	}

	/**
	 * @param datum The datum to set.
	 */
	public void setDatum(Date datum) {
		this.datum = datum;
	}

	/**
	 * @return Returns the beginTijd.
	 */
	public Date getBeginTijd() {
		return beginTijd;
	}

	/**
	 * @param beginTijd The beginTijd to set.
	 */
	public void setBeginTijd(Date beginTijd) {
		this.beginTijd = beginTijd;
	}

	/**
	 * @return Returns the eindTijd.
	 */
	public Date getEindTijd() {
		return eindTijd;
	}

	/**
	 * @param eindTijd The eindTijd to set.
	 */
	public void setEindTijd(Date eindTijd) {
		this.eindTijd = eindTijd;
	}

	/**
	 * @param deelnemerNummer The deelnemerNummer to set.
	 */
	public void setDeelnemerNummer(Long deelnemerNummer) {
		this.deelnemerNummer = deelnemerNummer;
	}

	/**
	 * @return Returns the roosterCode.
	 */
	public String getRoosterCode() {
		return roosterCode;
	}

	/**
	 * @param roosterCode The roosterCode to set.
	 */
	public void setRoosterCode(String roosterCode) {
		this.roosterCode = roosterCode;
	}

	/**
	 * @return Returns the lokaalCode.
	 */
	public String getLokaalCode() {
		return lokaalCode;
	}

	/**
	 * @param lokaalCode The lokaalCode to set.
	 */
	public void setLokaalCode(String lokaalCode) {
		this.lokaalCode = lokaalCode;
	}

	/**
	 * @return Returns the verwerkt.
	 */
	public Boolean getVerwerkt() {
		if (verwerkt == null)
			return false;
		return verwerkt;
	}

	/**
	 * @param verwerkt The verwerkt to set.
	 */
	public void setVerwerkt(Boolean verwerkt) {
		this.verwerkt = verwerkt;
	}

	/**
	 * @return Returns the organisatieNummer.
	 */
	public Long getOrganisatieNummer() {
		return organisatieNummer;
	}

	/**
	 * @param organisatieNummer The organisatieNummer to set.
	 */
	public void setOrganisatieNummer(Long organisatieNummer) {
		this.organisatieNummer = organisatieNummer;
	}
}
