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

import nl.topicus.eduarte.model.entities.personen.Medewerker;

/**
 *
 *         Vaste praktijkbegeleiders: een lijst van medewerkers van de
 *         onderwijsinstelling die standaard de BPV-deelnemers bij dit
 *         BPV-bedrijf begeleiden. Het is mogelijk om op deze plek een
 *         medewerker uit de lijst te verwijderen, maar het is niet mogelijk er
 *         een toe te voegen. Dat wordt namelijk gedaan bij het aanmaken van een
 *         BPV-verbintenis tussen een deelnemer en het bedrijf in kwestie. Onder
 *         het veld voor de praktijkbegeleider bij een (nieuwe) BPV-verbintenis
 *         wordt een vinkje ‘opslaan bij bedrijf’ toegevoegd. Deze staat
 *         standaard aan, maar kan uitgezet worden. Wanneer het vinkje aanstaat,
 *         wordt de gekozen medewerker opgeslagen in de lijst met vaste
 *         praktijkbegeleiders, tenzij de medewerker daar al in staat. Het veld
 *         ‘praktijkbegeleider’ bij een nieuwe BPV-verbintenis wordt standaard
 *         gevuld met de laatst gebruikte medewerker voor dat bedrijf. Het is
 *         mogelijk dit te wijzigen. Wanneer men op het ‘zoeken’ icoontje achter
 *         het veld klikt, wordt een zoeklijst voor medewerkers getoond in een
 *         popup. In eerste instantie worden alle medewerkers getoond. Deze zijn
 *         zo gegroepeerd dat bovenaan de lijst de medewerkers staan die in de
 *         lijst met vaste praktijkbegeleiders voorkomen en daaronder alle
 *         andere medewerkers.
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(name = "ExtOrgPraktijkBegeleider")
public class ExterneOrganisatiePraktijkbegeleider extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = false)
	private ExterneOrganisatie externeOrganisatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = false)
	private Medewerker medewerker;

	@Column(nullable = false)
	private boolean laatstGebruikteMedewerker;

	public ExterneOrganisatiePraktijkbegeleider() {
	}

	public ExterneOrganisatiePraktijkbegeleider(ExterneOrganisatie externeOrganisatie) {
		setExterneOrganisatie(externeOrganisatie);
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setLaatstGebruikteMedewerker(boolean laatstGebruikteMedewerker) {
		this.laatstGebruikteMedewerker = laatstGebruikteMedewerker;
	}

	public boolean isLaatstGebruikteMedewerker() {
		return laatstGebruikteMedewerker;
	}
}
