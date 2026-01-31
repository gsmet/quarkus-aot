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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

@Entity
public class VrijeMatrix extends CompetentieMatrix implements IOrganisatieEntiteit
{
	@OneToMany(mappedBy = "matrix")
	private List<DeelnemerMatrix> deelnemerMatrices = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@Basic(optional = true)
	@JoinColumn(name = "deelnemer", nullable = true)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@Basic(optional = true)
	@JoinColumn(name = "meeteenheid", nullable = true)
	private Meeteenheid meeteenheid;

	public Meeteenheid getMeeteenheid()
	{
		return meeteenheid;
	}

	public void setMeeteenheid(Meeteenheid meeteenheid)
	{
		this.meeteenheid = meeteenheid;
	}

	public VrijeMatrix()
	{
	}

	public List<DeelnemerMatrix> getDeelnemerMatrices()
	{
		return deelnemerMatrices;
	}

	public void setDeelnemerMatrices(List<DeelnemerMatrix> deelnemerMatrices)
	{
		this.deelnemerMatrices = deelnemerMatrices;
	}

	public Deelnemer getDeelnemer()
	{
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer)
	{
		this.deelnemer = deelnemer;
	}

	@Override
	public String toString()
	{
		if (getDeelnemer() != null)
		{
			return getNaam() + " (individueel)";
		}
		return getNaam();
	}

	@Override
	public String getType()
	{
		return "Vrije matrix";
	}

}
