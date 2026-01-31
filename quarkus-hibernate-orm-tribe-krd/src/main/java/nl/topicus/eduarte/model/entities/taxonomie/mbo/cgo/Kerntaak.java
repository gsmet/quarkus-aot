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

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.taxonomie.Deelgebied;

/**
 * Kerntaak voor het CGO.
 *
 */
@Entity()
public class Kerntaak extends Deelgebied {
	@Column(nullable = true)
	private int nummer;

	@Column(nullable = true)
	private Integer hoofdstuk;

	@Lob
	private String omschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "competentieMatrix", nullable = true)
	private CompetentieMatrix competentieMatrix;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "kerntaak")
	@BatchSize(size = 100)
	private List<Werkproces> werkprocessen = new ArrayList<>();

	public int getNummer() {
		return nummer;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}

	public Integer getHoofdstuk() {
		return hoofdstuk;
	}

	public void setHoofdstuk(Integer hoofdstuk) {
		this.hoofdstuk = hoofdstuk;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public CompetentieMatrix getCompetentieMatrix() {
		return competentieMatrix;
	}

	public void setCompetentieMatrix(CompetentieMatrix competentieMatrix) {
		this.competentieMatrix = competentieMatrix;
	}

	public List<Werkproces> getWerkprocessen() {
		return werkprocessen;
	}

	public void setWerkprocessen(List<Werkproces> werkprocessen) {
		this.werkprocessen = werkprocessen;
	}
}
