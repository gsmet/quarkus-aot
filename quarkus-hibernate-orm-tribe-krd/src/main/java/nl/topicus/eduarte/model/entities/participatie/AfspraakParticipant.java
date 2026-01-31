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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.contract.Contract;
import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.participatie.enums.UitnodigingStatus;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 * De personen die aan een afspraak mee moeten doen. Dit kan een groep zijn, of
 * individuele personen (dus ook medewerkers of verzorgers) zijn.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class AfspraakParticipant extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraak", nullable = false)
	private Afspraak afspraak;

	/**
	 * De noise Groep die meedoet aan de afspraak.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groep", nullable = true)
	private Groep groep;

	/**
	 * De PersoonlijkeGroep die meedoet aan de afspraak.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoonlijkeGroep", nullable = true)
	private PersoonlijkeGroep persoonlijkeGroep;

	/**
	 * De medewerker die meedoet aan de afspraak.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true)
	private Medewerker medewerker;

	/**
	 * De deelnemer die meedoet aan de afspraak.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = true)
	private Deelnemer deelnemer;

	/**
	 * De externe die meedoet aan de afspraak.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externe", nullable = true)
	private ExternPersoon externe;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UitnodigingStatus uitnodigingStatus;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contract", nullable = true)
	private Contract contract;

	@Column
	private boolean uitnodigingVerstuurd;

	public AfspraakParticipant() {
	}

	public Afspraak getAfspraak() {
		return afspraak;
	}

	public void setAfspraak(Afspraak afspraak) {
		this.afspraak = afspraak;
	}

	public Groep getGroep() {
		return groep;
	}

	public void setGroep(Groep groep) {
		this.groep = groep;
	}

	public PersoonlijkeGroep getPersoonlijkeGroep() {
		return persoonlijkeGroep;
	}

	public void setPersoonlijkeGroep(PersoonlijkeGroep persoonlijkeGroep) {
		this.persoonlijkeGroep = persoonlijkeGroep;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public void setExterne(ExternPersoon externe) {
		this.externe = externe;
	}

	public ExternPersoon getExterne() {
		return externe;
	}

	public boolean isAuteur() {
		var persoon = getPersoon();
		return persoon != null && persoon.equals(getAfspraak().getAuteur());
	}

	/**
	 * @return De persoon die aan deze afspraakdeelnemer hangt, of null als er een
	 *         noiseGroep aan deze deelnemer gekoppeld is.
	 */
	public Persoon getPersoon() {
		if (getMedewerker() != null)
			return getMedewerker().getPersoon();
		else if (getDeelnemer() != null)
			return getDeelnemer().getPersoon();
		return null;
	}

	public void setUitnodigingStatus(UitnodigingStatus uitnodigingStatus) {
		this.uitnodigingStatus = uitnodigingStatus;
	}

	public UitnodigingStatus getUitnodigingStatus() {
		return uitnodigingStatus;
	}

	public void setUitnodigingVerstuurd(boolean uitnodigingVerstuurd) {
		this.uitnodigingVerstuurd = uitnodigingVerstuurd;
	}

	public boolean isUitnodigingVerstuurd() {
		return uitnodigingVerstuurd;
	}

	public void resetUitnodigingVerstuurd(boolean handmatigeAfspraak) {
		if (getAfspraak().getAfspraakType() != null)
			setUitnodigingVerstuurd(
					!getAfspraak().getAfspraakType().getUitnodigingenVersturen().isEnabled(handmatigeAfspraak)
					&& UitnodigingStatus.DIRECTE_PLAATSING.equals(getUitnodigingStatus()));
	}

	public Contract getContract() {
		return contract;
	}

	public void setContract(Contract contract) {
		this.contract = contract;
	}
}
