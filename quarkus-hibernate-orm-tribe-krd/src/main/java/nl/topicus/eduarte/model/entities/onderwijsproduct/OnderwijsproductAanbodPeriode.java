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
package nl.topicus.eduarte.model.entities.onderwijsproduct;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

/**
 * Periode waarin een onderwijsaanbod geldt. Een onderwijsproduct kan meerdere malen per
 * jaar worden aangeboden.
 * 
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class OnderwijsproductAanbodPeriode extends BeginEinddatumInstellingEntiteit
{

	private Date begindatumInschrijving;

	private Date begindatumLesperiode;

	private Date einddatumInschrijving;

	private Date einddatumLesperiode;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "onderwijsproductaanbod")
	private OnderwijsproductAanbod aanbod;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "aanbodperiode")
	private AanbodPeriode aanbodperiode;

	private int minimaalAantalInschrijvingen;

	public OnderwijsproductAanbodPeriode()
	{

	}

	public Date getBegindatumInschrijving()
	{
		return begindatumInschrijving;
	}

	public void setBegindatumInschrijving(Date begindatumInschrijving)
	{
		this.begindatumInschrijving = begindatumInschrijving;
	}

	public Date getBegindatumLesperiode()
	{
		return begindatumLesperiode;
	}

	public void setBegindatumLesperiode(Date begindatumLesperiode)
	{
		this.begindatumLesperiode = begindatumLesperiode;
	}

	public Date getEinddatumInschrijving()
	{
		return einddatumInschrijving;
	}

	public void setEinddatumInschrijving(Date einddatumInschrijving)
	{
		this.einddatumInschrijving = einddatumInschrijving;
	}

	public Date getEinddatumLesperiode()
	{
		return einddatumLesperiode;
	}

	public void setEinddatumLesperiode(Date einddatumLesperiode)
	{
		this.einddatumLesperiode = einddatumLesperiode;
	}

	public OnderwijsproductAanbod getAanbod()
	{
		return aanbod;
	}

	public void setAanbod(OnderwijsproductAanbod aanbod)
	{
		this.aanbod = aanbod;
	}

	public int getMinimaalAantalInschrijvingen()
	{
		return minimaalAantalInschrijvingen;
	}

	public void setMinimaalAantalInschrijvingen(int minimaalAantalInschrijvingen)
	{
		this.minimaalAantalInschrijvingen = minimaalAantalInschrijvingen;
	}

	public AanbodPeriode getAanbodperiode()
	{
		return aanbodperiode;
	}

	public void setAanbodperiode(AanbodPeriode aanbodperiode)
	{
		this.aanbodperiode = aanbodperiode;
	}

}
