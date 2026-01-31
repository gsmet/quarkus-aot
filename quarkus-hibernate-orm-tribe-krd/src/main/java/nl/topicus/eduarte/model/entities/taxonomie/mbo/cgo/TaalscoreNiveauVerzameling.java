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
import java.util.Date;
import java.util.List;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.LandelijkEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
public abstract class TaalscoreNiveauVerzameling extends LandelijkEntiteit {
	@Temporal(value = TemporalType.DATE)
	private Date datum;

	@ManyToOne(optional = true)
	@JoinColumn(name = "taal", nullable = true)
	private ModerneTaal taal;

	@OneToMany(mappedBy = "taalscoreNiveauVerzameling")
	private List<Taalscore> taalscores = new ArrayList<>();

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "uitstroom", nullable = true)
	private Uitstroom uitstroom;

	@ManyToOne
	@Basic(optional = false)
	@JoinColumn(name = "meeteenheid", nullable = false)
	private Meeteenheid meeteenheid;

	public Meeteenheid getMeeteenheid() {
		return meeteenheid;
	}

	public void setMeeteenheid(Meeteenheid meeteenheid) {
		this.meeteenheid = meeteenheid;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public ModerneTaal getTaal() {
		return taal;
	}

	public void setTaal(ModerneTaal taal) {
		this.taal = taal;
	}

	public List<Taalscore> getTaalscores() {
		return taalscores;
	}

	public Taalscore getTaalscore(Taalvaardigheid vaardigheid) {
		for (Taalscore curScore : getTaalscores()) {
			if (curScore.getTaalvaardigheid().equals(vaardigheid)) {
				return curScore;
			}
		}
		return null;
	}

	public void setTaalscores(List<Taalscore> taalscores) {
		this.taalscores = taalscores;
	}

	public void addTaalscore(Taalscore taalscore) {
		taalscores.add(taalscore);
	}

	public Uitstroom getUitstroom() {
		return uitstroom;
	}

	public void setUitstroom(Uitstroom uitstroom) {
		this.uitstroom = uitstroom;
	}
}
