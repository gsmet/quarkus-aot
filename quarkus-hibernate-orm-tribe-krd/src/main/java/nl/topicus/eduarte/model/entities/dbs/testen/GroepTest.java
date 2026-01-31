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
import java.util.Date;
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
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.entities.groep.Groep;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class GroepTest extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groep", nullable = false, foreignKey = @ForeignKey(name = "FK_GroepTest_groep"))
	private Groep groep;

	@Column
	@Temporal(TemporalType.DATE)
	private Date afnameDatum;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testDefinitie", nullable = false, foreignKey = @ForeignKey(name = "FK_GroepTest_testdef"))
	private TestDefinitie testDefinitie;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Column(nullable = true)
	private Integer zorglijn;

	@Column(nullable = false)
	private boolean tonen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "groepTest")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<DeelnemerTest> deelnemerTesten = new ArrayList<>();

	public GroepTest() {
	}

	public Groep getGroep() {
		return groep;
	}

	public void setGroep(Groep groep) {
		this.groep = groep;
	}

	public Date getAfnameDatum() {
		return afnameDatum;
	}

	public void setAfnameDatum(Date afnameDatum) {
		this.afnameDatum = afnameDatum;
	}

	public TestDefinitie getTestDefinitie() {
		return testDefinitie;
	}

	public void setTestDefinitie(TestDefinitie testDefinitie) {
		this.testDefinitie = testDefinitie;
	}

	public List<DeelnemerTest> getDeelnemerTesten() {
		return deelnemerTesten;
	}

	public void setDeelnemerTesten(List<DeelnemerTest> deenemerTesten) {
		this.deelnemerTesten = deenemerTesten;
	}

	public boolean isVertrouwelijk() {
		return vertrouwelijk;
	}

	public void setVertrouwelijk(boolean vertrouwelijk) {
		this.vertrouwelijk = vertrouwelijk;
	}

	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public boolean isTonen() {
		return tonen;
	}

	public void setTonen(boolean tonen) {
		this.tonen = tonen;
	}
}
