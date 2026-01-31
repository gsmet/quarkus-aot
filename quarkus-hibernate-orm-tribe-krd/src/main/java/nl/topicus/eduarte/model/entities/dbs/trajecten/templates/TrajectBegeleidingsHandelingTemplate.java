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
package nl.topicus.eduarte.model.entities.dbs.trajecten.templates;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Table(name = "TrajectBegHandelingTemplate")
public class TrajectBegeleidingsHandelingTemplate extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trajectTemplate", nullable = false, foreignKey = @ForeignKey(name = "FK_trajectBegHT_traject"))
	private TrajectTemplate trajectTemplate;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "begeleidingsHandeling", nullable = false, foreignKey = @ForeignKey(name = "FK_trajectBegHT_handeling"))
	private BegeleidingsHandelingTemplate begeleidingsHandeling;

	public TrajectBegeleidingsHandelingTemplate() {
	}

	public TrajectTemplate getTrajectTemplate() {
		return trajectTemplate;
	}

	public void setTrajectTemplate(TrajectTemplate trajectTemplate) {
		this.trajectTemplate = trajectTemplate;
	}

	public BegeleidingsHandelingTemplate getBegeleidingsHandeling() {
		return begeleidingsHandeling;
	}

	public void setBegeleidingsHandeling(BegeleidingsHandelingTemplate begeleidingsHandeling) {
		this.begeleidingsHandeling = begeleidingsHandeling;
	}
}
