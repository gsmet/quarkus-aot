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

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.ExterneOrganisatieContactPersoon;

@Entity
public class BPVPlaats extends InstellingEntiteit
{
	public enum BPVType
	{
		AfstudeerStage,
		Tussenstage
	}

	@Enumerated(EnumType.STRING)
	private BPVType type;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvPlaats")
	private List<BPVCriteriaBPVPlaats> bpvCriteria = new ArrayList<>();

	private int aantalPlaatsen;

	private int aantalStudenten;

	private int begeleidingsUren;

	/**
	 * Deze moet gekoppeld zijn aan de externe organisatie bpvBedrijf
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contactPersoonBPVBedrijf", nullable = true)
	private ExterneOrganisatieContactPersoon contactPersoonBPVBedrijf;

	private Date begindatum;

	private Date einddatum;

	private boolean matchingDoorInstelling = true;

	private boolean matchingDoorStudenten = true;

	private String opdrachtOmschrijving;

	@Column(scale = 10, precision = 20)
	private BigDecimal vergoeding;

	@Column(nullable = true, scale = 2, precision = 12)
	private BigDecimal urenPerWeek;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = false)
	private ExterneOrganisatie bedrijf;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvPlaats")
	private List<BPVPlaatsOpleiding> geschikteOpleidingen = new ArrayList<>();

	@Column(nullable = true, length = 4)
	private Integer dagenPerWeek;

	public BPVType getType() {
		return type;
	}

	public void setType(BPVType type) {
		this.type = type;
	}

	public List<BPVCriteriaBPVPlaats> getBpvCriteria() {
		return bpvCriteria;
	}

	public void setBpvCriteria(List<BPVCriteriaBPVPlaats> bpvCriteria) {
		this.bpvCriteria = bpvCriteria;
	}

	public int getAantalPlaatsen() {
		return aantalPlaatsen;
	}

	public void setAantalPlaatsen(int aantalPlaatsen) {
		this.aantalPlaatsen = aantalPlaatsen;
	}

	public int getAantalStudenten() {
		return aantalStudenten;
	}

	public void setAantalStudenten(int aantalStudenten) {
		this.aantalStudenten = aantalStudenten;
	}

	public int getBegeleidingsUren() {
		return begeleidingsUren;
	}

	public void setBegeleidingsUren(int begeleidingsUren) {
		this.begeleidingsUren = begeleidingsUren;
	}

	public ExterneOrganisatieContactPersoon getContactPersoonBPVBedrijf() {
		return contactPersoonBPVBedrijf;
	}

	public void setContactPersoonBPVBedrijf(ExterneOrganisatieContactPersoon contactPersoonBPVBedrijf) {
		this.contactPersoonBPVBedrijf = contactPersoonBPVBedrijf;
	}

	public Date getBegindatum() {
		return begindatum;
	}

	public void setBegindatum(Date begindatum) {
		this.begindatum = begindatum;
	}

	public Date getEinddatum() {
		return einddatum;
	}

	public void setEinddatum(Date einddatum) {
		this.einddatum = einddatum;
	}

	public boolean isMatchingDoorInstelling() {
		return matchingDoorInstelling;
	}

	public void setMatchingDoorInstelling(boolean matchingDoorInstelling) {
		this.matchingDoorInstelling = matchingDoorInstelling;
	}

	public boolean isMatchingDoorStudenten() {
		return matchingDoorStudenten;
	}

	public void setMatchingDoorStudenten(boolean matchingDoorStudenten) {
		this.matchingDoorStudenten = matchingDoorStudenten;
	}

	public String getOpdrachtOmschrijving() {
		return opdrachtOmschrijving;
	}

	public void setOpdrachtOmschrijving(String opdrachtOmschrijving) {
		this.opdrachtOmschrijving = opdrachtOmschrijving;
	}

	public BigDecimal getVergoeding() {
		return vergoeding;
	}

	public void setVergoeding(BigDecimal vergoeding) {
		this.vergoeding = vergoeding;
	}

	public BigDecimal getUrenPerWeek() {
		return urenPerWeek;
	}

	public void setUrenPerWeek(BigDecimal urenPerWeek) {
		this.urenPerWeek = urenPerWeek;
	}

	public ExterneOrganisatie getBedrijf() {
		return bedrijf;
	}

	public void setBedrijf(ExterneOrganisatie bedrijf) {
		this.bedrijf = bedrijf;
	}

	public List<BPVPlaatsOpleiding> getGeschikteOpleidingen() {
		return geschikteOpleidingen;
	}

	public void setGeschikteOpleidingen(List<BPVPlaatsOpleiding> geschikteOpleidingen) {
		this.geschikteOpleidingen = geschikteOpleidingen;
	}

	public Integer getDagenPerWeek() {
		return dagenPerWeek;
	}

	public void setDagenPerWeek(Integer dagenPerWeek) {
		this.dagenPerWeek = dagenPerWeek;
	}
}
