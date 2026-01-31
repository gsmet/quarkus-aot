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
package nl.topicus.eduarte.model.entities.inschrijving;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Index;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import nl.topicus.eduarte.model.entities.hogeronderwijs.Fase;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity
@Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"verbintenis", "fase"})},
		indexes = {@Index(name = "idx_VerbFaseCred_idInOudPakke", columnList = "idInOudPakket"),
			@Index(name = "idx_VerbFaseCred_organisatie", columnList = "organisatie"),
			@Index(name = "idx_VerbFaseCred_fase", columnList = "fase"),
			@Index(name = "idx_VerbFaseCred_gearchiveerd", columnList = "gearchiveerd"),
			@Index(name = "idx_VerbFaseCred_ver", columnList = "verbintenis")})
public class VerbintenisFaseCredits extends InstellingEntiteit
{
	private static final long serialVersionUID = 1L;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis", nullable = false)
	private Verbintenis verbintenis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "fase", nullable = false)
	private Fase fase;

	@Column(nullable = false, scale = 10, precision = 20)
	private BigDecimal credits;

	@Column(nullable = false)
	private boolean bevroren = false;

	public VerbintenisFaseCredits()
	{
	}

	public VerbintenisFaseCredits(Verbintenis verbintenis, Fase fase, BigDecimal credits)
	{
		setVerbintenis(verbintenis);
		setFase(fase);
		setCredits(credits);
	}

	public void setVerbintenis(Verbintenis verbintenis)
	{
		this.verbintenis = verbintenis;
	}

	public Verbintenis getVerbintenis()
	{
		return verbintenis;
	}

	public void setFase(Fase fase)
	{
		this.fase = fase;
	}

	public Fase getFase()
	{
		return fase;
	}

	public void setCredits(BigDecimal credits)
	{
		this.credits = credits;
	}

	public BigDecimal getCredits()
	{
		return credits;
	}

	public boolean heeftVrijstelling()
	{
		return credits.intValue() == 0;
	}

	public boolean isBevroren()
	{
		return bevroren;
	}

	public void setBevroren(boolean bevroren)
	{
		this.bevroren = bevroren;
	}
}