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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class StudielinkBericht extends InstellingEntiteit
{
	@Column(length = 50, nullable = false)
	private String type;

	@Lob
	@Column(nullable = true)
	private String xmlResponse;

	@Column(length = 4, nullable = false)
	private String verzender;

	@Column(length = 4, nullable = false)
	private String ontvanger;

	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inschrijvingsverzoek", nullable = true)
	private Inschrijvingsverzoek inschrijvingsverzoek;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	public String getType()
	{
		return type;
	}

	public void setType(String type)
	{
		this.type = type;
	}

	public String getXmlResponse()
	{
		return xmlResponse;
	}

	public void setXmlResponse(String xmlResponse)
	{
		this.xmlResponse = xmlResponse;
	}

	public String getVerzender()
	{
		return verzender;
	}

	public void setVerzender(String verzender)
	{
		this.verzender = verzender;
	}

	public String getOntvanger()
	{
		return ontvanger;
	}

	public void setOntvanger(String ontvanger)
	{
		this.ontvanger = ontvanger;
	}

	public Inschrijvingsverzoek getInschrijvingsverzoek()
	{
		return inschrijvingsverzoek;
	}

	public void setInschrijvingsverzoek(Inschrijvingsverzoek inschrijvingsverzoek)
	{
		this.inschrijvingsverzoek = inschrijvingsverzoek;
	}

	public Deelnemer getDeelnemer()
	{
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer)
	{
		this.deelnemer = deelnemer;
	}
}
