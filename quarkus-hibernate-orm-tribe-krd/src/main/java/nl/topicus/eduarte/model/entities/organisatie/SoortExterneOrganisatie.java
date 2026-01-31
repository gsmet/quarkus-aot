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
package nl.topicus.eduarte.model.entities.organisatie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefLandelijkOfInstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "code", "organisatie" }) })
@IsViewWhenOnNoise
public class SoortExterneOrganisatie extends CodeNaamActiefLandelijkOfInstellingEntiteit {
	@Column(nullable = false)
	private boolean brin;

	@Column(nullable = false)
	private boolean tonenBijVooropleiding;

	public SoortExterneOrganisatie() {
	}

	@Override
	public String toString() {
		return getNaam();
	}

	public boolean isBrin() {
		return brin;
	}

	public void setBrin(boolean brin) {
		this.brin = brin;
	}

	public boolean isTonenBijVooropleiding() {
		return tonenBijVooropleiding;
	}

	public void setTonenBijVooropleiding(boolean tonenBijVooropleiding) {
		this.tonenBijVooropleiding = tonenBijVooropleiding;
	}
}
