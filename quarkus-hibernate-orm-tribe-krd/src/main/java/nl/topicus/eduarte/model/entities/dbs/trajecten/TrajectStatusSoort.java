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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class TrajectStatusSoort extends InstellingEntiteit {
	@Column(nullable = false, length = 255)
	private String omschrijving;

	@Column(nullable = false)
	private boolean actief = true;

	@Column(nullable = false)
	private boolean trajectAfgesloten;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "trajectStatusSoort")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ToegestaneStatusSoort> toegestaneStatusSoorten = new ArrayList<>();

	public TrajectStatusSoort() {
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isTrajectAfgesloten() {
		return trajectAfgesloten;
	}

	public void setTrajectAfgesloten(boolean trajectAfgesloten) {
		this.trajectAfgesloten = trajectAfgesloten;
	}

	public List<ToegestaneStatusSoort> getToegestaneStatusSoorten() {
		return toegestaneStatusSoorten;
	}

	public void setToegestaneStatusSoorten(List<ToegestaneStatusSoort> toegestaneStatusSoorten) {
		this.toegestaneStatusSoorten = toegestaneStatusSoorten;
	}

	@Override
	public String toString() {
		return getOmschrijving();
	}
}
