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
package nl.topicus.eduarte.model.entities.security.authorization;

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
import nl.topicus.eduarte.model.entities.rapportage.DeelnemerZoekOpdrachtRecht;
import nl.topicus.eduarte.model.entities.rapportage.DocumentTemplateRecht;
import nl.topicus.eduarte.model.entities.security.authentication.AccountRol;
import nl.topicus.eduarte.model.security.RechtenSoort;

/**
 * Combines several RechtenSet in a logical group. Rol is organisation specific
 * and can thus be customized for each organisation. Default roles have no
 * organisation.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "naam", "organisatie" }) })
public class Rol extends OrganisatieEntiteit {
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
	@BatchSize(size = 20)
	private List<Recht> rechten = new ArrayList<>();

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = true)
	private Integer zorglijn;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private AuthorisatieNiveau authorisatieNiveau;

	@Column(nullable = false)
	@Enumerated(value = EnumType.STRING)
	private RechtenSoort rechtenSoort;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<AccountRol> accounts = new ArrayList<>();

	/**
	 * Voor indeling van rollen in groepen
	 */
	@Column(length = 50)
	private String categorie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
	@BatchSize(size = 20)
	private List<DocumentTemplateRecht> documentTemplates = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "rol")
	@BatchSize(size = 20)
	private List<DeelnemerZoekOpdrachtRecht> zoekOpdrachten = new ArrayList<>();

	public List<Recht> getRechten() {
		return rechten;
	}

	public void setRechten(List<Recht> rechten) {
		this.rechten = rechten;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public AuthorisatieNiveau getAuthorisatieNiveau() {
		return authorisatieNiveau;
	}

	public void setAuthorisatieNiveau(AuthorisatieNiveau authorisatieNiveau) {
		this.authorisatieNiveau = authorisatieNiveau;
	}

	public RechtenSoort getRechtenSoort() {
		return rechtenSoort;
	}

	public void setRechtenSoort(RechtenSoort rechtenSoort) {
		this.rechtenSoort = rechtenSoort;
	}

	public List<AccountRol> getAccounts() {
		return accounts;
	}

	public void setAccounts(List<AccountRol> accounts) {
		this.accounts = accounts;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	public List<DocumentTemplateRecht> getDocumentTemplates() {
		return documentTemplates;
	}

	public void setDocumentTemplates(List<DocumentTemplateRecht> documentTemplates) {
		this.documentTemplates = documentTemplates;
	}

	public List<DeelnemerZoekOpdrachtRecht> getZoekOpdrachten() {
		return zoekOpdrachten;
	}

	public void setZoekOpdrachten(List<DeelnemerZoekOpdrachtRecht> zoekOpdrachten) {
		this.zoekOpdrachten = zoekOpdrachten;
	}
}
