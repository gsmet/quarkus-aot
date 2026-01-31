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
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.IContactgegevenEntiteit;
import nl.topicus.eduarte.model.entities.adres.SoortContactgegeven;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "OrganisatieEenheidCG")
public class OrganisatieEenheidContactgegeven extends InstellingEntiteit implements IContactgegevenEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = false)
	private OrganisatieEenheid organisatieEenheid;

	@Column(length = 60, nullable = false)
	private String contactgegeven;

	@Column(nullable = false)
	private boolean geheim;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortContactgegeven")
	private SoortContactgegeven soortContactgegeven;

	@Column(nullable = false)
	private int volgorde;

	public OrganisatieEenheidContactgegeven() {
	}

	/**
	 * @return Returns the organisatieEenheid.
	 */
	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	/**
	 * @param organisatieEenheid The organisatieEenheid to set.
	 */
	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	/**
	 * @return Returns the contactgegeven.
	 */
	@Override
	public String getContactgegeven() {
		return contactgegeven;
	}

	/**
	 * @param contactgegeven The contactgegeven to set.
	 */
	@Override
	public void setContactgegeven(String contactgegeven) {
		this.contactgegeven = contactgegeven;
	}

	/**
	 * @return Returns the geheim.
	 */
	@Override
	public boolean isGeheim() {
		return geheim;
	}

	/**
	 * @param geheim The geheim to set.
	 */
	@Override
	public void setGeheim(boolean geheim) {
		this.geheim = geheim;
	}

	/**
	 * @return Returns the volgorde.
	 */
	@Override
	public int getVolgorde() {
		return volgorde;
	}

	/**
	 * @param volgorde The volgorde to set.
	 */
	@Override
	public void setVolgorde(int volgorde) {
		this.volgorde = volgorde;
	}

	/**
	 * @return Het contactgegeven of '**********' als het contactgegeven geheim is.
	 */
	@Override
	public String getFormattedContactgegeven() {
		if (isGeheim()) {
			return "**********";
		}
		return getContactgegeven();
	}

	/**
	 * @return Het contactgegeven gevolgd door ' (Geheim)' indien het contactgegeven
	 *         geheim is, en anders gewoon het contactgegeven.
	 */
	public String getTelefoonnummerInclGeheim() {
		if (isGeheim()) {
			return getContactgegeven() + " (Geheim)";
		}
		return getContactgegeven();
	}

	/**
	 * @return Returns the soortContactgegeven.
	 */
	@Override
	public SoortContactgegeven getSoortContactgegeven() {
		return soortContactgegeven;
	}

	/**
	 * @param soortContactgegeven The soortContactgegeven to set.
	 */
	@Override
	public void setSoortContactgegeven(SoortContactgegeven soortContactgegeven) {
		this.soortContactgegeven = soortContactgegeven;
	}

}
