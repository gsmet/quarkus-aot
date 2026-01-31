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
package nl.topicus.eduarte.model.entities.security.authentication.vasco;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.security.authentication.Account;

/**
 * Record voor het vasthouden van de gegevens van een Vasco token. Een token kan
 * aan één gebruiker uitgegeven worden.
 */
@Entity
@Table(name = "VASCO_TOKENS")
public class Token extends InstellingEntiteit {
	/**
	 * uniek identificerend nummer uitgegeven door Vasco dat een token
	 * identificeert.
	 */
	@Column(nullable = false, length = 32)
	private String serienummer;

	/**
	 * applicatienaam zoals door Vasco aangeleverd (zal waarschijnlijk altijd
	 * GO3DEFAULT zijn).
	 */
	@Column(nullable = false, length = 32)
	private String applicatie;

	/** Initiele data voor de digipass, hiermee kan de pas gereset worden. */
	@Column(nullable = false, length = 248)
	private String initieleData;

	/** Werk data voor de digipass, hiermee wordt de pas gevalideerd. */
	@Column(nullable = false, length = 248)
	private String digipassData;

	/** de status van het token. */
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TokenStatus status;

	/** de gebruiker waaraan dit token is uitgegeven, mag leeg zijn. */
	@ManyToOne(targetEntity = Account.class)
	@JoinColumn(name = "gebruiker", nullable = true)
	private Account gebruiker;

	public String getSerienummer() {
		return serienummer;
	}

	public void setSerienummer(String serienummer) {
		this.serienummer = serienummer;
	}

	public String getApplicatie() {
		return applicatie;
	}

	public void setApplicatie(String applicatie) {
		this.applicatie = applicatie;
	}

	public String getInitieleData() {
		return initieleData;
	}

	public void setInitieleData(String initieleData) {
		this.initieleData = initieleData;
	}

	public String getDigipassData() {
		return digipassData;
	}

	public void setDigipassData(String digipassData) {
		this.digipassData = digipassData;
	}

	public TokenStatus getStatus() {
		return status;
	}

	public void setStatus(TokenStatus status) {
		this.status = status;
	}

	public Account getGebruiker() {
		return gebruiker;
	}

	public void setGebruiker(Account gebruiker) {
		this.gebruiker = gebruiker;
	}
}
