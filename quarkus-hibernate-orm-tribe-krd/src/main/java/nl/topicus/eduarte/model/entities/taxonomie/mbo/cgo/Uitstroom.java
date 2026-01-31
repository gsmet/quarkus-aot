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
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

/**
 * Uitstroom in het CGO.
 *
 */
@Entity()
public class Uitstroom extends CompetentieMatrix {
	@ManyToOne
	@Basic(optional = false)
	@JoinColumn(name = "dossier", nullable = true)
	private Kwalificatiedossier dossier;

	@OneToMany
	@JoinColumn(name = "uitstroom")
	private List<Taalvaardigheidseis> taalvaardigheidseisen = new ArrayList<>();

	@Column(nullable = true)
	private Integer hoofdstuk;

	@Column(nullable = true)
	private int nummer;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private UitstroomType uitstroomType;

	public void setUitstroomType(UitstroomType type) {
		this.uitstroomType = type;
	}

	public UitstroomType getUitstroomType() {
		return uitstroomType;
	}

	public Kwalificatiedossier getDossier() {
		return dossier;
	}

	public void setDossier(Kwalificatiedossier dossier) {
		this.dossier = dossier;
	}

	public List<Taalvaardigheidseis> getTaalvaardigheidseisen() {
		return taalvaardigheidseisen;
	}

	public void addTaalvaardigheidseis(Taalvaardigheidseis eis) {
		taalvaardigheidseisen.add(eis);
	}

	public Integer getHoofdstuk() {
		return hoofdstuk;
	}

	public void setHoofdstuk(Integer hoofdstuk) {
		this.hoofdstuk = hoofdstuk;
	}

	public Integer getNummer() {
		return nummer;
	}

	public void setNummer(Integer nummer) {
		this.nummer = nummer;
	}

	@Override
	public String getType() {
		return uitstroomType.toString();
	}

	public void setTaalvaardigheidseisen(List<Taalvaardigheidseis> taalvaardigheidseisen) {
		this.taalvaardigheidseisen = taalvaardigheidseisen;
	}

	public void setNummer(int nummer) {
		this.nummer = nummer;
	}
}
