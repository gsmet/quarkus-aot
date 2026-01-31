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

import nl.topicus.eduarte.model.entities.inschrijving.Vooropleiding;
import nl.topicus.eduarte.model.entities.inschrijving.VooropleidingVak;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class VooropleidingVakResultaat extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vooropleiding", nullable = false)
	private Vooropleiding vooropleiding;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "vak", nullable = false)
	private VooropleidingVak vak;

	@Column(nullable = true)
	private Integer score;

	@Column(nullable = true)
	private Character letter;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private VooropleidingVakVerificatieStatus status;

	public VooropleidingVakResultaat()
	{
	}

	public VooropleidingVakResultaat(Vooropleiding vooropleiding)
	{
		setVooropleiding(vooropleiding);
	}

	public Vooropleiding getVooropleiding()
	{
		return vooropleiding;
	}

	public void setVooropleiding(Vooropleiding vooropleiding)
	{
		this.vooropleiding = vooropleiding;
	}

	public VooropleidingVak getVak()
	{
		return vak;
	}

	public void setVak(VooropleidingVak vak)
	{
		this.vak = vak;
	}

	public Integer getScore()
	{
		return score;
	}

	public void setScore(Integer score)
	{
		this.score = score;
	}

	public Character getLetter()
	{
		return letter;
	}

	public void setLetter(Character letter)
	{
		this.letter = letter;
	}

	public VooropleidingVakVerificatieStatus getStatus()
	{
		return status;
	}

	public void setStatus(VooropleidingVakVerificatieStatus status)
	{
		this.status = status;
	}
}
