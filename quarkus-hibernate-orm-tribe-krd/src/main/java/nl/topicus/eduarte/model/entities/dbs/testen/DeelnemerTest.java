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
import java.util.SortedSet;
import java.util.TreeSet;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.SortNatural;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.TestBijlage;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class DeelnemerTest extends InstellingEntiteit
implements ZorgvierkantObject, IBijlageKoppelEntiteit<TestBijlage> {
	public static final String DEELNEMERTEST = "DEELNEMERTEST";

	public static final String VERTROUWELIJKE_DEELNEMERTEST = "VERTROUWELIJKE_DEELNEMERTEST";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false, foreignKey = @ForeignKey(name = "FK_DeelnemerTest_deelnemer"))
	private Deelnemer deelnemer;

	@Column(nullable = false)
	@Temporal(TemporalType.DATE)
	private Date afnameDatum;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "testDefinitie", nullable = false, foreignKey = @ForeignKey(name = "FK_DeelnemerTest_testdef"))
	private TestDefinitie testDefinitie;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Column(nullable = true)
	private Integer zorglijn;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@SortNatural
	private SortedSet<Veldwaarde> veldwaarden = new TreeSet<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<TestBijlage> bijlagen = new ArrayList<>();

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "test")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<DeelnemerTestNietTonenInZorgvierkant> nietTonenInZorgvierkants = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "groepTest", nullable = true, foreignKey = @ForeignKey(name = "FK_DeelnemerTest_groeptest"))
	private GroepTest groepTest;

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
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

	@Override
	public boolean isVertrouwelijk() {
		return vertrouwelijk;
	}

	public void setVertrouwelijk(boolean vertrouwelijk) {
		this.vertrouwelijk = vertrouwelijk;
	}

	@Override
	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public SortedSet<Veldwaarde> getVeldwaarden() {
		return veldwaarden;
	}

	public void setVeldwaarden(SortedSet<Veldwaarde> veldwaarden) {
		this.veldwaarden = veldwaarden;
	}

	@Override
	public List<TestBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<TestBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<DeelnemerTestNietTonenInZorgvierkant> getNietTonenInZorgvierkants() {
		return nietTonenInZorgvierkants;
	}

	public void setNietTonenInZorgvierkants(List<DeelnemerTestNietTonenInZorgvierkant> nietTonenInZorgvierkants) {
		this.nietTonenInZorgvierkants = nietTonenInZorgvierkants;
	}

	public GroepTest getGroepTest() {
		return groepTest;
	}

	public void setGroepTest(GroepTest groepTest) {
		this.groepTest = groepTest;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public TestBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public String getSecurityId() {
		return null;
	}

	@Override
	public String getVertrouwelijkSecurityId() {
		return null;
	}

	@Override
	public boolean isTonenInZorgvierkant() {
		return false;
	}
}
