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
package nl.topicus.eduarte.model.entities.taxonomie.mbo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.taxonomie.MBONiveau;
import nl.topicus.eduarte.model.entities.taxonomie.MBOSoortOpleiding;
import nl.topicus.eduarte.model.entities.taxonomie.TaxonomieElementMBOLeerweg;
import nl.topicus.eduarte.model.entities.taxonomie.Verbintenisgebied;

/**
 * Abstracte superclass voor verbintenisgebieden in het MBO.
 *
 */
@Entity()
public abstract class AbstractMBOVerbintenisgebied extends Verbintenisgebied
{
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "taxonomieElement")
	private List<TaxonomieElementMBOLeerweg> leerwegen;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private MBOSoortOpleiding soortOpleiding;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private MBONiveau niveau;

	@Column(nullable = true, scale = 10, precision = 20)
	private BigDecimal prijsfactor;

	@Column(nullable = true)
	private Integer studiebelastingsuren;

	@Column(nullable = true)
	private Boolean wettelijkeEisen;

	@Column(nullable = true, length = 20)
	private String bronWettelijkeEisen;

	@Column(nullable = true, length = 4)
	private String brinKenniscentrum;

	@Column(nullable = true, length = 100)
	private String naamKenniscentrum;

	@Column(nullable = true, length = 20)
	private String codeCoordinatiepunt;

	public List<TaxonomieElementMBOLeerweg> getLeerwegen() {
		return leerwegen;
	}

	public void setLeerwegen(List<TaxonomieElementMBOLeerweg> leerwegen) {
		this.leerwegen = leerwegen;
	}

	public MBOSoortOpleiding getSoortOpleiding() {
		return soortOpleiding;
	}

	public void setSoortOpleiding(MBOSoortOpleiding soortOpleiding) {
		this.soortOpleiding = soortOpleiding;
	}

	public MBONiveau getNiveau() {
		return niveau;
	}

	public void setNiveau(MBONiveau niveau) {
		this.niveau = niveau;
	}

	public BigDecimal getPrijsfactor() {
		return prijsfactor;
	}

	public void setPrijsfactor(BigDecimal prijsfactor) {
		this.prijsfactor = prijsfactor;
	}

	public Integer getStudiebelastingsuren() {
		return studiebelastingsuren;
	}

	public void setStudiebelastingsuren(Integer studiebelastingsuren) {
		this.studiebelastingsuren = studiebelastingsuren;
	}

	public Boolean getWettelijkeEisen() {
		return wettelijkeEisen;
	}

	public void setWettelijkeEisen(Boolean wettelijkeEisen) {
		this.wettelijkeEisen = wettelijkeEisen;
	}

	public String getBronWettelijkeEisen() {
		return bronWettelijkeEisen;
	}

	public void setBronWettelijkeEisen(String bronWettelijkeEisen) {
		this.bronWettelijkeEisen = bronWettelijkeEisen;
	}

	public String getBrinKenniscentrum() {
		return brinKenniscentrum;
	}

	public void setBrinKenniscentrum(String brinKenniscentrum) {
		this.brinKenniscentrum = brinKenniscentrum;
	}

	public String getNaamKenniscentrum() {
		return naamKenniscentrum;
	}

	public void setNaamKenniscentrum(String naamKenniscentrum) {
		this.naamKenniscentrum = naamKenniscentrum;
	}

	public String getCodeCoordinatiepunt() {
		return codeCoordinatiepunt;
	}

	public void setCodeCoordinatiepunt(String codeCoordinatiepunt) {
		this.codeCoordinatiepunt = codeCoordinatiepunt;
	}
}
