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
package nl.topicus.eduarte.model.entities.dbs.bijzonderheden;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ToegestaanHulpmiddel extends LandelijkOfInstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bijzonderheidCategorie", nullable = false, foreignKey = @ForeignKey(name = "fk_CategBijz_ToegestHulpm"))
	private BijzonderheidCategorie bijzonderheidCategorie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "hulpmiddel", nullable = false, foreignKey = @ForeignKey(name = "fk_Hulpmiddel_ToegestHulpm"))
	private Hulpmiddel hulpmiddel;

	public ToegestaanHulpmiddel() {
	}

	public ToegestaanHulpmiddel(BijzonderheidCategorie bijzonderheidCategorie, Hulpmiddel hulpmiddel) {
		setBijzonderheidCategorie(bijzonderheidCategorie);
		setHulpmiddel(hulpmiddel);
	}

	public Hulpmiddel getHulpmiddel() {
		return hulpmiddel;
	}

	public void setHulpmiddel(Hulpmiddel hulpmiddel) {
		this.hulpmiddel = hulpmiddel;
	}

	public BijzonderheidCategorie getBijzonderheidCategorie() {
		return bijzonderheidCategorie;
	}

	public void setBijzonderheidCategorie(BijzonderheidCategorie bijzonderheidCategorie) {
		this.bijzonderheidCategorie = bijzonderheidCategorie;
	}
}
