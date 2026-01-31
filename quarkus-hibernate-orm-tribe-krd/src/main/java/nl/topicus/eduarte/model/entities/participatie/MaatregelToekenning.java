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
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class MaatregelToekenning extends InstellingEntiteit {
	/**
	 * De datum waarop de maatregel nagekomen/uitgevoerd moet worden.
	 */
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date maatregelDatum;

	@Column(nullable = true, length = 1024)
	private String opmerkingen;

	@Column(nullable = false)
	private boolean nagekomen;

	/**
	 * Een maatregel kan handmatig of automatisch toegekend worden. Handmatig is
	 * altijd een expliciete actie van een gebruiker. Automatisch is op basis van
	 * maatregel toekenningsregels die in het systeem ingevoerd kunnen worden.
	 */
	@Column(nullable = false)
	private boolean automatischToegekend;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "maatregel", nullable = false)
	private Maatregel maatregel;

	/**
	 * De medewerker die de maatregel heeft toegekend.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eigenaarmedewerker", nullable = true)
	private Medewerker eigenaarMedewerker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "eigenaardeelnemer", nullable = true)
	private Deelnemer eigenaarDeelnemer;

	/**
	 * De absentiemelding die ertoe leidde dat deze maatregel werd toegekend.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "veroorzaaktDoor", nullable = true)
	private AbsentieMelding veroorzaaktDoor;

	public Date getMaatregelDatum() {
		return maatregelDatum;
	}

	public void setMaatregelDatum(Date maatregelDatum) {
		this.maatregelDatum = maatregelDatum;
	}

	public String getOpmerkingen() {
		return opmerkingen;
	}

	public void setOpmerkingen(String opmerkingen) {
		this.opmerkingen = opmerkingen;
	}

	public boolean isNagekomen() {
		return nagekomen;
	}

	public void setNagekomen(boolean nagekomen) {
		this.nagekomen = nagekomen;
	}

	public boolean isAutomatischToegekend() {
		return automatischToegekend;
	}

	public void setAutomatischToegekend(boolean automatischToegekend) {
		this.automatischToegekend = automatischToegekend;
	}

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Maatregel getMaatregel() {
		return maatregel;
	}

	public void setMaatregel(Maatregel maatregel) {
		this.maatregel = maatregel;
	}

	public Medewerker getEigenaarMedewerker() {
		return eigenaarMedewerker;
	}

	public void setEigenaarMedewerker(Medewerker eigenaarMedewerker) {
		this.eigenaarMedewerker = eigenaarMedewerker;
	}

	public Deelnemer getEigenaarDeelnemer() {
		return eigenaarDeelnemer;
	}

	public void setEigenaarDeelnemer(Deelnemer eigenaarDeelnemer) {
		this.eigenaarDeelnemer = eigenaarDeelnemer;
	}

	public AbsentieMelding getVeroorzaaktDoor() {
		return veroorzaaktDoor;
	}

	public void setVeroorzaaktDoor(AbsentieMelding veroorzaaktDoor) {
		this.veroorzaaktDoor = veroorzaaktDoor;
	}
}
