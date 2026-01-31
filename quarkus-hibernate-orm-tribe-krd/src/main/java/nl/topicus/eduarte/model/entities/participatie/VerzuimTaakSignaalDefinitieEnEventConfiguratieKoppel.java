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
package nl.topicus.eduarte.model.entities.participatie;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.signalering.VerzuimTaakSignaalDefinitie;
import nl.topicus.eduarte.model.entities.signalering.settings.VerzuimTaakEventAbonnementConfiguration;

@Entity()
@Table(name = "VerTaSigDefEvConKoppel")
public class VerzuimTaakSignaalDefinitieEnEventConfiguratieKoppel extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "signaalDefinitie", nullable = false)
	private VerzuimTaakSignaalDefinitie signaalDefinitie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "abonnementConfiguration", nullable = false)
	private VerzuimTaakEventAbonnementConfiguration abonnementConfiguration;

	public VerzuimTaakSignaalDefinitieEnEventConfiguratieKoppel() {

	}

	public void setSignaalDefinitie(VerzuimTaakSignaalDefinitie signaalDefinitie) {
		this.signaalDefinitie = signaalDefinitie;
	}

	public VerzuimTaakSignaalDefinitie getSignaalDefinitie() {
		return signaalDefinitie;
	}

	public void setAbonnementConfiguration(VerzuimTaakEventAbonnementConfiguration abonnementConfiguration) {
		this.abonnementConfiguration = abonnementConfiguration;
	}

	public VerzuimTaakEventAbonnementConfiguration getAbonnementConfiguration() {
		return abonnementConfiguration;
	}

	@Override
	public String toString() {
		return signaalDefinitie.getSignaalNaam();
	}
}
