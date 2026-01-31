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
package nl.topicus.eduarte.model.entities.participatie;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class LesdagIndeling extends InstellingEntiteit {
	@Column(name = "dag", length = 2, nullable = false)
	private String dag;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lesweekIndeling", nullable = false)
	private LesweekIndeling lesweekIndeling;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lesdagIndeling")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("lesuur")
	private List<LesuurIndeling> lesuurIndeling;

	public LesdagIndeling() {
	}

	public String getDag() {
		return dag;
	}

	public void setDag(String dag) {
		this.dag = dag;
	}

	public LesweekIndeling getLesweekIndeling() {
		return lesweekIndeling;
	}

	public void setLesweekIndeling(LesweekIndeling lesweekIndeling) {
		this.lesweekIndeling = lesweekIndeling;
	}

	/**
	 * @return Het dagnummer van deze indeling, ZO=1,MA=2,DI=3 etc.
	 */
	public int getDagNummerVanafZondag() {
		var dagcode = getDag();
		if ("ZO".equals(dagcode))
			return 1;
		if ("MA".equals(dagcode))
			return 2;
		if ("DI".equals(dagcode))
			return 3;
		if ("WO".equals(dagcode))
			return 4;
		if ("DO".equals(dagcode))
			return 5;
		if ("VR".equals(dagcode))
			return 6;
		if ("ZA".equals(dagcode))
			return 7;
		return -1;

	}

	/**
	 * @return Het dagnummer van deze indeling, MA=1,DI=2 etc.
	 */
	public int getDagNummer() {
		var dagcode = getDag();
		if ("MA".equals(dagcode))
			return 1;
		if ("DI".equals(dagcode))
			return 2;
		if ("WO".equals(dagcode))
			return 3;
		if ("DO".equals(dagcode))
			return 4;
		if ("VR".equals(dagcode))
			return 5;
		if ("ZA".equals(dagcode))
			return 6;
		if ("ZO".equals(dagcode))
			return 7;
		return -1;
	}

	public void setLesuurIndeling(List<LesuurIndeling> lesuurIndeling) {
		this.lesuurIndeling = lesuurIndeling;
	}

	public List<LesuurIndeling> getLesuurIndeling() {
		if (lesuurIndeling == null)
			lesuurIndeling = new ArrayList<>();

		return lesuurIndeling;
	}

	public int getAantalLesuren() {
		return getLesuurIndeling().size();
	}

	public String getNaam() {
		var dagcode = getDag();
		if ("MA".equals(dagcode))
			return "Maandag";
		if ("DI".equals(dagcode))
			return "Dinsdag";
		if ("WO".equals(dagcode))
			return "Woensdag";
		if ("DO".equals(dagcode))
			return "Donderdag";
		if ("VR".equals(dagcode))
			return "Vrijdag";
		if ("ZA".equals(dagcode))
			return "Zaterdag";
		if ("ZO".equals(dagcode))
			return "Zondag";
		return "";
	}
}
