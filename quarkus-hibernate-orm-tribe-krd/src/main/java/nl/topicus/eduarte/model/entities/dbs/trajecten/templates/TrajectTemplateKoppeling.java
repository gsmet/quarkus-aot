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
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public abstract class TrajectTemplateKoppeling extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trajTemplAutoKopp", nullable = false, foreignKey = @ForeignKey(name = "FK_TrajTemplKopp_TTAutoKopp"))
	private TrajectTemplateAutomatischeKoppeling trajectTemplateAutomatischeKoppeling;

	public TrajectTemplateAutomatischeKoppeling getTrajectTemplateAutomatischeKoppeling() {
		return trajectTemplateAutomatischeKoppeling;
	}

	public void setTrajectTemplateAutomatischeKoppeling(
			TrajectTemplateAutomatischeKoppeling trajectTemplateAutomatischeKoppeling) {
		this.trajectTemplateAutomatischeKoppeling = trajectTemplateAutomatischeKoppeling;
	}
}
