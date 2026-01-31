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
@jakarta.persistence.Table(name = "ExtOrgContactgegeven")
public class ExterneOrganisatieContactgegeven extends LandelijkOfInstellingEntiteit implements IContactgegevenEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = false)
	private ExterneOrganisatie externeOrganisatie;

	@Column(length = 60, nullable = false)
	private String contactgegeven;

	@Column(nullable = false)
	private boolean geheim;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortContactgegeven")
	private SoortContactgegeven soortContactgegeven;

	@Column(nullable = false)
	private int volgorde;

	public ExterneOrganisatieContactgegeven() {
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	@Override
	public String getContactgegeven() {
		return contactgegeven;
	}

	@Override
	public void setContactgegeven(String contactgegeven) {
		this.contactgegeven = contactgegeven;
	}

	@Override
	public boolean isGeheim() {
		return geheim;
	}

	@Override
	public void setGeheim(boolean geheim) {
		this.geheim = geheim;
	}

	@Override
	public int getVolgorde() {
		return volgorde;
	}

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

	@Override
	public SoortContactgegeven getSoortContactgegeven() {
		return soortContactgegeven;
	}

	@Override
	public void setSoortContactgegeven(SoortContactgegeven soortContactgegeven) {
		this.soortContactgegeven = soortContactgegeven;
	}
}
