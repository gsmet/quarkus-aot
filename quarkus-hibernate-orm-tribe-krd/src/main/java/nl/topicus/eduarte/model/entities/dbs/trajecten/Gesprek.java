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

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;

/**
 */
@Entity()
public class Gesprek extends GeplandeBegeleidingsHandeling {
	public static final String GESPREK = "GESPREK";

	@Lob()
	private String samenvatting;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "GesprekSoort", nullable = true, foreignKey = @ForeignKey(name = "FK_Gesprek_soort"))
	@Basic(optional = false)
	private GesprekSoort gesprekSoort;

	public Gesprek() {
		soort = "Gesprek";
	}

	public String getSamenvatting() {
		return samenvatting;
	}

	public void setSamenvatting(String samenvatting) {
		this.samenvatting = samenvatting;
	}

	public GesprekSoort getGesprekSoort() {
		return gesprekSoort;
	}

	public void setGesprekSoort(GesprekSoort gesprekSoort) {
		this.gesprekSoort = gesprekSoort;
	}

	@Override
	public String handelingsSoort() {
		return null;
	}
}
