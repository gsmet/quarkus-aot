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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"volgnummer", "testDefinitie"})})
public class TestVeld extends LandelijkOfInstellingEntiteit implements Comparable<TestVeld>
{
	@Column(nullable = false)
	private int volgnummer;

	@Column(nullable = false, length = 100)
	private String naam;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Veldtype type;

	@Column(nullable = false)
	private boolean verplicht;

	@Column(nullable = true)
	private Integer minimumWaarde;

	@Column(nullable = true)
	private Integer maximumWaarde;

	@Column(nullable = false)
	private boolean hoofdscoreVeld;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "testDefinitie")
	private TestDefinitie testDefinitie;

	public TestVeld()
	{

	}

	public TestVeld(TestDefinitie definitie)
	{
		setTestDefinitie(definitie);
	}

	public boolean isVerplicht()
	{
		return verplicht;
	}

	public void setVerplicht(boolean verplicht)
	{
		this.verplicht = verplicht;
	}

	public Integer getMinimumWaarde()
	{
		return minimumWaarde;
	}

	public void setMinimumWaarde(Integer minimumWaarde)
	{
		this.minimumWaarde = minimumWaarde;
	}

	public Integer getMaximumWaarde()
	{
		return maximumWaarde;
	}

	public void setMaximumWaarde(Integer maximumWaarde)
	{
		this.maximumWaarde = maximumWaarde;
	}

	public int getVolgnummer()
	{
		return volgnummer;
	}

	public void setVolgnummer(int volgnummer)
	{
		this.volgnummer = volgnummer;
	}

	public boolean isHoofdscoreVeld()
	{
		return hoofdscoreVeld;
	}

	public void setHoofdscoreVeld(boolean hoofdscoreVeld)
	{
		this.hoofdscoreVeld = hoofdscoreVeld;
	}

	public Veldtype getType()
	{
		return type;
	}

	public void setType(Veldtype type)
	{
		this.type = type;
	}

	public TestDefinitie getTestDefinitie()
	{
		return testDefinitie;
	}

	public void setTestDefinitie(TestDefinitie testDefinitie)
	{
		this.testDefinitie = testDefinitie;
	}

	public String getNaam()
	{
		return naam;
	}

	public void setNaam(String naam)
	{
		this.naam = naam;
	}

	public Veldwaarde createWaarde()
	{
		var ret = getType().createWaarde();
		ret.setTestVeld(this);
		return ret;
	}

	@Override
	public int compareTo(TestVeld o)
	{
		return getVolgnummer() - o.getVolgnummer();
	}

	public boolean isVolgnummerInGebruik(int value)
	{
		for (TestVeld curVeld : getTestDefinitie().getTestVelden())
		{
			if (!this.equals(curVeld) && curVeld.getVolgnummer() == value)
				return true;
		}
		return false;
	}
}
