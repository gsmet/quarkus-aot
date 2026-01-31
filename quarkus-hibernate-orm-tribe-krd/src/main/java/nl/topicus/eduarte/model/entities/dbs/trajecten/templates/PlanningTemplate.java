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
package nl.topicus.eduarte.model.entities.dbs.trajecten.templates;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class PlanningTemplate extends InstellingEntiteit
{
	@Column(nullable = false)
	private int aantalEenhedenNaAanvang;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TijdEenheid tijdEenheid;

	@Column(nullable = true)
	private Integer aantalEenhedenTussenHerhaling;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private TijdEenheid eenheidTussenHerhaling;

	@Column(nullable = true)
	private Integer stoptNaAantalEenheden;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private TijdEenheid stoptNaEenheid;

	@Column(nullable = false)
	private int stoptNaAantalKeer = 100;

	public PlanningTemplate()
	{
	}

	public int getAantalEenhedenNaAanvang()
	{
		return aantalEenhedenNaAanvang;
	}

	public void setAantalEenhedenNaAanvang(int aantalEenhedenNaAanvang)
	{
		this.aantalEenhedenNaAanvang = aantalEenhedenNaAanvang;
	}

	public TijdEenheid getTijdEenheid()
	{
		return tijdEenheid;
	}

	public void setTijdEenheid(TijdEenheid tijdEenheid)
	{
		this.tijdEenheid = tijdEenheid;
	}

	@Override
	public String toString()
	{
		if (getAantalEenhedenTussenHerhaling() == null)
			return "Eenmalig:" + getAantalEenhedenNaAanvang() + " " + getTijdEenheid();

		return "Periodiek: elke " + getAantalEenhedenTussenHerhaling() + " "
		+ getEenheidTussenHerhaling();
	}

	public Integer getAantalEenhedenTussenHerhaling()
	{
		return aantalEenhedenTussenHerhaling;
	}

	public void setAantalEenhedenTussenHerhaling(Integer aantalEenhedenTussenHerhaling)
	{
		this.aantalEenhedenTussenHerhaling = aantalEenhedenTussenHerhaling;
	}

	public TijdEenheid getEenheidTussenHerhaling()
	{
		return eenheidTussenHerhaling;
	}

	public void setEenheidTussenHerhaling(TijdEenheid eenheidTussenHerhaling)
	{
		this.eenheidTussenHerhaling = eenheidTussenHerhaling;
	}

	public Integer getStoptNaAantalEenheden()
	{
		return stoptNaAantalEenheden;
	}

	public void setStoptNaAantalEenheden(Integer stoptNaAantalEenheden)
	{
		this.stoptNaAantalEenheden = stoptNaAantalEenheden;
	}

	public TijdEenheid getStoptNaEenheid()
	{
		return stoptNaEenheid;
	}

	public void setStoptNaEenheid(TijdEenheid stoptNaEenheid)
	{
		this.stoptNaEenheid = stoptNaEenheid;
	}

	public int getStoptNaAantalKeer()
	{
		return stoptNaAantalKeer;
	}

	public void setStoptNaAantalKeer(int stoptNaAantalKeer)
	{
		this.stoptNaAantalKeer = stoptNaAantalKeer;
	}
}
