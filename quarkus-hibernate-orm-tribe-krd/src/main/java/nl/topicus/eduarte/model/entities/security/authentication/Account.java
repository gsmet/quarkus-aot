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
package nl.topicus.eduarte.model.entities.security.authentication;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEntiteit;
import nl.topicus.eduarte.model.entities.security.authorization.AuthorisatieNiveau;

/**
 * Basis classe voor accounts. Normaliter dient er altijd een subclass gebruikt
 * te worden die de account aan bv een medewerker of deelnemer koppeld. Alleen
 * in uitzonderlijke gevallen (het root account) kan deze class direct gebruikt
 * worden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "gebruikersnaam", "organisatie" }) })
public abstract class Account extends OrganisatieEntiteit {
	@Column(nullable = false, length = 50)
	private String gebruikersnaam;

	@Column(nullable = false, length = 50, name = "wachtwoord")
	private String encryptedWachtwoord;

	@Column(nullable = false)
	private boolean actief = true;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<AccountRol> roles = new ArrayList<>();

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private AuthorisatieNiveau authorisatieNiveau;

	/**
	 * Een eventuele white list van ip-adressen waarvandaan dit account mag
	 * inloggen. Als de string leeg is, mag de gebruiker van overal vandaan
	 * inloggen.
	 */
	@Column(nullable = true, length = 200)
	private String ipAdressen;

	public String getGebruikersnaam() {
		return gebruikersnaam;
	}

	public void setGebruikersnaam(String gebruikersnaam) {
		this.gebruikersnaam = gebruikersnaam;
	}

	public String getEncryptedWachtwoord() {
		return encryptedWachtwoord;
	}

	public void setEncryptedWachtwoord(String encryptedWachtwoord) {
		this.encryptedWachtwoord = encryptedWachtwoord;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public List<AccountRol> getRoles() {
		return roles;
	}

	public void setRoles(List<AccountRol> roles) {
		this.roles = roles;
	}

	public AuthorisatieNiveau getAuthorisatieNiveau() {
		return authorisatieNiveau;
	}

	public void setAuthorisatieNiveau(AuthorisatieNiveau authorisatieNiveau) {
		this.authorisatieNiveau = authorisatieNiveau;
	}

	public String getIpAdressen() {
		return ipAdressen;
	}

	public void setIpAdressen(String ipAdressen) {
		this.ipAdressen = ipAdressen;
	}
}
