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
 * Koppeling tussen een Competentie en een Werkproces. Correspondeert met een
 * cel uit een competentiematrix.
 */
@Entity()
@BatchSize(size = 1000)
public class Leerpunt extends Deelgebied {
	@Lob
	@Column(nullable = true)
	private String indicator;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "werkproces", nullable = true)
	private Werkproces werkproces;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "competentie", nullable = true)
	private Competentie competentie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leerpunt")
	private List<LeerpuntVaardigheid> leerpuntVaardigheden = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leerpunt")
	private List<LeerpuntComponent> leerpuntComponenten = new ArrayList<>();

	public String getIndicator() {
		return indicator;
	}

	public void setIndicator(String indicator) {
		this.indicator = indicator;
	}

	public Werkproces getWerkproces() {
		return werkproces;
	}

	public void setWerkproces(Werkproces werkproces) {
		this.werkproces = werkproces;
	}

	public Competentie getCompetentie() {
		return competentie;
	}

	public void setCompetentie(Competentie competentie) {
		this.competentie = competentie;
	}

	public List<LeerpuntVaardigheid> getLeerpuntVaardigheden() {
		return leerpuntVaardigheden;
	}

	public void setLeerpuntVaardigheden(List<LeerpuntVaardigheid> leerpuntVaardigheden) {
		this.leerpuntVaardigheden = leerpuntVaardigheden;
	}

	public List<LeerpuntComponent> getLeerpuntComponenten() {
		return leerpuntComponenten;
	}

	public void setLeerpuntComponenten(List<LeerpuntComponent> leerpuntComponenten) {
		this.leerpuntComponenten = leerpuntComponenten;
	}
}
