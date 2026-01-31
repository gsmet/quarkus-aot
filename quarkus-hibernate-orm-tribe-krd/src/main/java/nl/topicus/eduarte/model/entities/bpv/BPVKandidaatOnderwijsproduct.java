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
package nl.topicus.eduarte.model.entities.bpv;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;


@Entity
public class BPVKandidaatOnderwijsproduct extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "onderwijsproduct", nullable = false)
	private Onderwijsproduct onderwijsproduct;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvKandidaat", nullable = false)
	private BPVKandidaat bpvKandidaat;

	public BPVKandidaatOnderwijsproduct()
	{
	}

	public BPVKandidaatOnderwijsproduct(BPVKandidaat bpvKandidaat)
	{
		setBpvKandidaat(bpvKandidaat);
	}

	public BPVKandidaatOnderwijsproduct(BPVKandidaat bpvKandidaat, Onderwijsproduct onderwijsproduct)
	{
		setOnderwijsproduct(onderwijsproduct);
		setBpvKandidaat(bpvKandidaat);
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct)
	{
		this.onderwijsproduct = onderwijsproduct;
	}

	public Onderwijsproduct getOnderwijsproduct()
	{
		return onderwijsproduct;
	}

	public void setBpvKandidaat(BPVKandidaat bpvKandidaat)
	{
		this.bpvKandidaat = bpvKandidaat;
	}

	public BPVKandidaat getBpvKandidaat()
	{
		return bpvKandidaat;
	}

	@Override
	public BPVKandidaatOnderwijsproduct clone()
	{
		return new BPVKandidaatOnderwijsproduct(getBpvKandidaat(), getOnderwijsproduct());
	}
}