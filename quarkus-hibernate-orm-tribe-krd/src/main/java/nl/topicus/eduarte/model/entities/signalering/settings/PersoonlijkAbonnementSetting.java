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
package nl.topicus.eduarte.model.entities.signalering.settings;

import jakarta.persistence.Basic;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 * Entiteit voor het vasthouden van de specifieke signaleringsinstellingen van een
 * persoon. Een persoon krijgt eventuele default settings vanuit
 * {@link GlobaalAbonnementSetting}, maar kan deze zelf overschrijven (zolang de
 * waarde op instellingsniveau niet op Verplicht gezet is).
 * 
 */
@Entity()
public class PersoonlijkAbonnementSetting extends EventAbonnementSetting
{
	@Basic(optional = false)
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = true)
	private Persoon persoon;

	public PersoonlijkAbonnementSetting()
	{
	}

	public PersoonlijkAbonnementSetting(Persoon persoon)
	{
		setPersoon(persoon);
	}

	public Persoon getPersoon()
	{
		return persoon;
	}

	public void setPersoon(Persoon persoon)
	{
		this.persoon = persoon;
	}
}
