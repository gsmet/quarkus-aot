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
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.opleiding.Opleiding;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Legt vast in welke hoofdfases de opleiding wordt aangeboden en voor hoeveel credits
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class OpleidingFase extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "opleiding")
	private Opleiding opleiding;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private OpleidingsVorm opleidingsvorm;

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Hoofdfase hoofdfase;

	@Column(nullable = true)
	private Integer credits;

	public OpleidingFase()
	{
	}

	public OpleidingFase(Opleiding opleiding, OpleidingsVorm opleidingsvorm, Hoofdfase hoofdfase)
	{
		this.opleiding = opleiding;
		this.opleidingsvorm = opleidingsvorm;
		this.hoofdfase = hoofdfase;
	}

	public void setOpleiding(Opleiding opleiding)
	{
		this.opleiding = opleiding;
	}

	public Opleiding getOpleiding()
	{
		return opleiding;
	}

	public void setHoofdfase(Hoofdfase hoofdfase)
	{
		this.hoofdfase = hoofdfase;
	}

	public Hoofdfase getHoofdfase()
	{
		return hoofdfase;
	}

	public void setCredits(Integer credits)
	{
		this.credits = credits;
	}

	public Integer getCredits()
	{
		return credits;
	}

	public void setOpleidingsvorm(OpleidingsVorm opleidingsvorm)
	{
		this.opleidingsvorm = opleidingsvorm;
	}

	public OpleidingsVorm getOpleidingsvorm()
	{
		return opleidingsvorm;
	}
}
