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

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.bijlage.BijlageEntiteit;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;

/**
 * Koppeltabel tussen {@link ExterneOrganisatie} en bijlage
 *
 */
@Entity()
public class ExterneOrganisatieBijlage extends BijlageEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@Basic(optional = false)
	@JoinColumn(name = "externeOrganisatie", nullable = true)
	private ExterneOrganisatie externeOrganisatie;

	public ExterneOrganisatieBijlage() {
	}

	@Override
	public IBijlageKoppelEntiteit<ExterneOrganisatieBijlage> getEntiteit() {
		return getExterneOrganisatie();
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}
}
