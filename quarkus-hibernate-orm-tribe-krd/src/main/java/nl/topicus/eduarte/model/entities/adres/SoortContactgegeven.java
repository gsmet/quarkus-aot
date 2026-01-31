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
package nl.topicus.eduarte.model.entities.adres;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
	"organisatie"})})
@IsViewWhenOnNoise
public class SoortContactgegeven extends CodeNaamActiefInstellingEntiteit
{
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private TypeContactgegeven typeContactgegeven;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private StandaardContactgegeven standaardContactgegeven;

	public StandaardContactgegeven getStandaardContactgegeven() {
		return standaardContactgegeven;
	}

	public void setStandaardContactgegeven(StandaardContactgegeven standaardContactgegeven) {
		this.standaardContactgegeven = standaardContactgegeven;
	}

	public TypeContactgegeven getTypeContactgegeven() {
		return typeContactgegeven;
	}

	public void setTypeContactgegeven(TypeContactgegeven typeContactgegeven) {
		this.typeContactgegeven = typeContactgegeven;
	}
}
