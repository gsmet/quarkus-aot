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
package nl.topicus.eduarte.model.entities.dbs.testen;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.UniqueConstraint;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.participatie.AfspraakType;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "naam",
		"organisatie" }) })
public class TestDefinitie extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "categorie", foreignKey = @ForeignKey(name = "FK_Testdefinitie_categorie"))
	private TestCategorie categorie;

	@Column(length = 100, nullable = false)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraakType", nullable = false)
	private AfspraakType afspraakType;

	@Column(nullable = false)
	private boolean actief = true;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "testDefinitie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("volgnummer")
	private List<TestVeld> testVelden = new ArrayList<>();

	@Column(nullable = false)
	private boolean besprekenTonen;

	public TestCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(TestCategorie categorie) {
		this.categorie = categorie;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public AfspraakType getAfspraakType() {
		return afspraakType;
	}

	public void setAfspraakType(AfspraakType afspraakType) {
		this.afspraakType = afspraakType;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public List<TestVeld> getTestVelden() {
		return testVelden;
	}

	public void setTestVelden(List<TestVeld> testVelden) {
		this.testVelden = testVelden;
	}

	public boolean isBesprekenTonen() {
		return besprekenTonen;
	}

	public void setBesprekenTonen(boolean besprekenTonen) {
		this.besprekenTonen = besprekenTonen;
	}
}
