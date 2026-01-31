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
 *
 */
@Entity()
public class Werkproces extends Deelgebied {
	@Column(nullable = true)
	private Integer nummer;

	@Lob
	@Column(nullable = true)
	private String omschrijving;

	@Lob
	@Column(nullable = true)
	private String resultaat;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "kerntaak", nullable = true)
	private Kerntaak kerntaak;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "werkproces")
	@BatchSize(size = 100)
	private List<Leerpunt> leerpunten = new ArrayList<>();

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer(Integer nummer) {
		this.nummer = nummer;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getResultaat() {
		return resultaat;
	}

	public void setResultaat(String resultaat) {
		this.resultaat = resultaat;
	}

	public Kerntaak getKerntaak() {
		return kerntaak;
	}

	public void setKerntaak(Kerntaak kerntaak) {
		this.kerntaak = kerntaak;
	}

	public List<Leerpunt> getLeerpunten() {
		return leerpunten;
	}

	public void setLeerpunten(List<Leerpunt> leerpunten) {
		this.leerpunten = leerpunten;
	}
}
