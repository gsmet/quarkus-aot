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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class AanwezigenTemplate extends InstellingEntiteit {
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private AanwezigeType type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = true, foreignKey = @ForeignKey(name = "FK_AanweTempl_persoon"))
	private Persoon persoon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "handelingTemplate", nullable = true, foreignKey = @ForeignKey(name = "FK_AanweTempl_handTempl"))
	private GeplandeBegeleidingsHandelingTemplate handeling;

	public AanwezigenTemplate() {
	}

	public Persoon getPersoon() {
		return persoon;
	}

	public void setPersoon(Persoon persoon) {
		this.persoon = persoon;
	}

	public GeplandeBegeleidingsHandelingTemplate getHandeling() {
		return handeling;
	}

	public void setHandeling(GeplandeBegeleidingsHandelingTemplate handeling) {
		this.handeling = handeling;
	}

	public AanwezigeType getType() {
		return type;
	}

	public void setType(AanwezigeType type) {
		this.type = type;
	}

	@Override
	public String toString() {
		if (AanwezigeType.GeselecteerdePersoon.equals(getType()))
			return getPersoon().getVolledigeNaam();

		return getType().toString();
	}
}
