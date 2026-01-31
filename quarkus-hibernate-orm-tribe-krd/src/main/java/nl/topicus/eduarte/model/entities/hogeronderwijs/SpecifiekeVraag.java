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
package nl.topicus.eduarte.model.entities.hogeronderwijs;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class SpecifiekeVraag extends InstellingEntiteit
{
	@Column(nullable = false, length = 15)
	private String vraagcode;

	@Column(nullable = false, length = 350)
	private String vraag;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "specifiekeVraag")
	@BatchSize(size = 20)
	private List<SpecifiekeVraagAntwoord> antwoorden = new ArrayList<SpecifiekeVraagAntwoord>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inschrijvingsverzoek")
	private Inschrijvingsverzoek inschrijvingsverzoek;

	public String getVraagcode()
	{
		return vraagcode;
	}

	public void setVraagcode(String vraagcode)
	{
		this.vraagcode = vraagcode;
	}

	public String getVraag()
	{
		return vraag;
	}

	public void setVraag(String vraag)
	{
		this.vraag = vraag;
	}

	public List<SpecifiekeVraagAntwoord> getAntwoorden()
	{
		return antwoorden;
	}

	public void setAntwoorden(List<SpecifiekeVraagAntwoord> antwoorden)
	{
		this.antwoorden = antwoorden;
	}

	public Inschrijvingsverzoek getInschrijvingsverzoek()
	{
		return inschrijvingsverzoek;
	}

	public void setInschrijvingsverzoek(Inschrijvingsverzoek inschrijvingsverzoek)
	{
		this.inschrijvingsverzoek = inschrijvingsverzoek;
	}

}
