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
package nl.topicus.eduarte.model.entities.organisatie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.LandelijkEntiteit;

/**
 * Afname van een servicemodule zoals Competentiemeter of Participatie door een
 * onderwijsinstelling.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(uniqueConstraints = @UniqueConstraint(columnNames = { "organisatie", "moduleName" }))
public class ModuleAfname extends LandelijkEntiteit {
	@Column(nullable = false, length = 100)
	private String moduleName;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatie", nullable = false)
	private Instelling organisatie;

	/**
	 * De naam van de organisatie wordt expliciet opgeslagen omdat dit meegaat in de
	 * checksum. Mocht de naam van de instelling veranderen, hoeft de checksum niet
	 * opnieuw berekend te worden.
	 */
	@Column(nullable = false, length = 100)
	private String organizationName;

	@Column(nullable = false, length = 100)
	private String checksum;

	@Column(nullable = false)
	private boolean actief = true;

	public String getModuleName() {
		return moduleName;
	}

	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}

	public Instelling getOrganisatie() {
		return organisatie;
	}

	public void setOrganisatie(Instelling organisatie) {
		this.organisatie = organisatie;
	}

	public String getOrganizationName() {
		return organizationName;
	}

	public void setOrganizationName(String organizationName) {
		this.organizationName = organizationName;
	}

	public String getChecksum() {
		return checksum;
	}

	public void setChecksum(String checksum) {
		this.checksum = checksum;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}
}
