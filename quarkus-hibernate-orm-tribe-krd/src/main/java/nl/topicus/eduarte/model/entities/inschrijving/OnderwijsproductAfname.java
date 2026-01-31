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
package nl.topicus.eduarte.model.entities.inschrijving;

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
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.bpv.BPVInschrijving;
import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.onderwijsproduct.OnderwijsproductAfnameContext;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 * Afname van een onderwijsproduct door een deelnemer.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "deelnemer", "onderwijsproduct", "cohort" }) })
public class OnderwijsproductAfname extends BeginEinddatumInstellingEntiteit {
	/**
	 * Het onderwijsproduct dat is afgenomen.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "onderwijsproduct")
	@Bron
	private Onderwijsproduct onderwijsproduct;

	/**
	 * Is het onderwijsproduct echt afgenomen (VrijstellingType.Geen), behaald met
	 * een EVC of vervallen. Als een onderwijsproduct als EVC is afgenomen of is
	 * vervallen, is het onderwijsproduct per definitie behaald. Het kan ook zijn
	 * dat het onderwijsproduct dan niet op de onderwijsovereenkomst opgenomen moet
	 * worden. Is het onderwijsproduct vervallen, dan tellen de bijbehorende credits
	 * niet mee en verschijnt het onderwijsproduct niet op de cijferlijst.
	 */
	@Enumerated(EnumType.STRING)
	@Column(length = 15, nullable = false)
	private VrijstellingType vrijstellingType = VrijstellingType.Geen;

	/**
	 * Titel van het werkstuk dat een deelnemer heeft gemaakt. Kan alleen ingevuld
	 * worden indien bij het onderwijsproduct dat afgenomen wordt het property
	 * heeftWerkstuktitel op true is gezet.
	 */
	@Column(nullable = true, length = 200)
	@Bron
	private String werkstuktitel;

	/**
	 * De deelnemer die het onderwijsproduct afneemt.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "deelnemer")
	private Deelnemer deelnemer;

	/**
	 * Een eventuele externe organisatie waar de deelnemer dit onderwijsproduct
	 * heeft afgenomen
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "externeOrganisatie")
	private ExterneOrganisatie externeOrganisatie;

	/**
	 * Het cohort waarin de deelnemer het onderwijsproduct afneemt. Dit komt normaal
	 * gesproken overeen met het cohort waarop de deelnemer is ingeschreven, maar
	 * zou ook kunnen verschillen. Hiermee wordt bepaald welke resultatenstructuur
	 * voor de deelnemer geldt.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "cohort")
	private Cohort cohort;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "onderwijsproductAfname")
	// @Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<OnderwijsproductAfnameContext> afnameContexten = new ArrayList<>();

	/**
	 * Het aantal credits dat de student verdient met het behalen van het
	 * onderwijsproduct. Indien null, dan geldt het aantal credits van het
	 * onderwijsproduct (default).
	 */
	@Column(nullable = true)
	private Integer credits;

	/**
	 * De onderwijsproduct afname kan gevuld worden met een stage, de
	 * stageinschrijving die als vulling fungeerd is gekoppeld
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "bpvInschrijving")
	private BPVInschrijving bpvInschrijving;

	public Onderwijsproduct getOnderwijsproduct() {
		return onderwijsproduct;
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct) {
		this.onderwijsproduct = onderwijsproduct;
	}

	public VrijstellingType getVrijstellingType() {
		return vrijstellingType;
	}

	public void setVrijstellingType(VrijstellingType vrijstellingType) {
		this.vrijstellingType = vrijstellingType;
	}

	public String getWerkstuktitel() {
		return werkstuktitel;
	}

	public void setWerkstuktitel(String werkstuktitel) {
		this.werkstuktitel = werkstuktitel;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public Cohort getCohort() {
		return cohort;
	}

	public void setCohort(Cohort cohort) {
		this.cohort = cohort;
	}

	public List<OnderwijsproductAfnameContext> getAfnameContexten() {
		return afnameContexten;
	}

	public void setAfnameContexten(List<OnderwijsproductAfnameContext> afnameContexten) {
		this.afnameContexten = afnameContexten;
	}

	public Integer getCredits() {
		return credits;
	}

	public void setCredits(Integer credits) {
		this.credits = credits;
	}

	public BPVInschrijving getBpvInschrijving() {
		return bpvInschrijving;
	}

	public void setBpvInschrijving(BPVInschrijving bpvInschrijving) {
		this.bpvInschrijving = bpvInschrijving;
	}
}
