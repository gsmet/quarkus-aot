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
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import java.util.TreeSet;

import org.hibernate.annotations.BatchSize;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import nl.topicus.eduarte.model.entities.taxonomie.mbo.AbstractMBOVerbintenisgebied;

@Entity()
public abstract class CompetentieMatrix extends AbstractMBOVerbintenisgebied {
	@Column(nullable = true)
	private String titel;

	@OneToMany(mappedBy = "competentieMatrix", fetch = FetchType.LAZY)
	@BatchSize(size = 20)
	@OrderBy("volgnummer ASC")
	private List<Kerntaak> kerntaken = new ArrayList<>();

	public List<Kerntaak> getKerntaken() {
		return kerntaken;
	}

	public void setKerntaken(List<Kerntaak> kerntaken) {
		this.kerntaken = kerntaken;
	}

	public void addKerntaak(Kerntaak kerntaak) {
		getKerntaken().add(kerntaak);
	}

	public SortedSet<Competentie> getCompetenties() {
		SortedSet<Competentie> ret = new TreeSet<>((o1, o2) -> o1.equals(o2) ? 0 : o1.getCode().compareTo(o2.getCode()));

		for (Kerntaak kt : getKerntaken()) {
			for (Werkproces wp : kt.getWerkprocessen()) {
				for (Leerpunt curLp : wp.getLeerpunten()) {
					ret.add(curLp.getCompetentie());
				}
			}
		}
		return ret;
	}

	public List<Competentie> getCompetentiesAsList() {
		return new ArrayList<>(getCompetenties());
	}

	public List<Leerpunt> getLeerpunten(Kerntaak kerntaak) {
		List<Leerpunt> ret = new ArrayList<>();
		for (Kerntaak kt : getKerntaken()) {
			if (kt.equals(kerntaak)) {
				for (Werkproces wp : kt.getWerkprocessen()) {
					ret.addAll(wp.getLeerpunten());
				}
			}
		}
		return ret;
	}

	public List<Leerpunt> getLeerpunten(Kerntaak kerntaak, Competentie competentie) {
		List<Leerpunt> ret = new ArrayList<>();
		for (Kerntaak kt : getKerntaken()) {
			if (kt.equals(kerntaak)) {
				for (Werkproces wp : kt.getWerkprocessen()) {
					for (Leerpunt lp : wp.getLeerpunten()) {
						if (lp.getCompetentie().equals(competentie)) {
							ret.add(lp);
						}
					}
				}
			}
		}
		return ret;
	}

	public Map<Competentie, Leerpunt> getLeerpunten(Werkproces werkproces) {
		Map<Competentie, Leerpunt> ret = new HashMap<>();
		for (Kerntaak kt : getKerntaken()) {
			for (Werkproces wp : kt.getWerkprocessen()) {
				if (wp.equals(werkproces)) {
					for (Leerpunt lp : wp.getLeerpunten()) {
						ret.put(lp.getCompetentie(), lp);
					}
				}
			}
		}
		return ret;
	}

	abstract public String getType();

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}
}
