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
package nl.topicus.eduarte.model.entities.bpv;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity
public class BPVCriteria extends InstellingEntiteit
{
	public enum BPVCriteriaStatus
	{
		Nieuw,
		Goedgekeurd,
		Afgekeurd
	}

	@Column(nullable = false)
	private Boolean actief;

	@Column(nullable = false)
	private String naam;

	@Column(nullable = false)
	private String omschrijving;

	@Column(nullable = false, name = "toegestaanKoppelExtOrg")
	private boolean toegestaanKoppelenMetExterneOrganisatie = true;

	@Column(nullable = false, name = "toegestaanKoppelStagePlaats")
	private boolean toegestaanKoppelenMetStagePlaats = true;

	@Column(nullable = false, name = "toegestaanKoppelOP")
	private boolean toegestaanKoppelenMetOnderwijsproduct = true;

	@Column(nullable = false, name = "toegestaanKoppelStageProfiel")
	private boolean toegestaanKoppelenMetStageProfiel = true;

	@Column(nullable = false, name = "toegestaanKoppelStageKandidaat")
	private boolean toegestaanKoppelenMetStageKandidaat = true;

	public Boolean getActief() {
		return actief;
	}

	public void setActief(Boolean actief) {
		this.actief = actief;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public boolean isToegestaanKoppelenMetExterneOrganisatie() {
		return toegestaanKoppelenMetExterneOrganisatie;
	}

	public void setToegestaanKoppelenMetExterneOrganisatie(boolean toegestaanKoppelenMetExterneOrganisatie) {
		this.toegestaanKoppelenMetExterneOrganisatie = toegestaanKoppelenMetExterneOrganisatie;
	}

	public boolean isToegestaanKoppelenMetStagePlaats() {
		return toegestaanKoppelenMetStagePlaats;
	}

	public void setToegestaanKoppelenMetStagePlaats(boolean toegestaanKoppelenMetStagePlaats) {
		this.toegestaanKoppelenMetStagePlaats = toegestaanKoppelenMetStagePlaats;
	}

	public boolean isToegestaanKoppelenMetOnderwijsproduct() {
		return toegestaanKoppelenMetOnderwijsproduct;
	}

	public void setToegestaanKoppelenMetOnderwijsproduct(boolean toegestaanKoppelenMetOnderwijsproduct) {
		this.toegestaanKoppelenMetOnderwijsproduct = toegestaanKoppelenMetOnderwijsproduct;
	}

	public boolean isToegestaanKoppelenMetStageProfiel() {
		return toegestaanKoppelenMetStageProfiel;
	}

	public void setToegestaanKoppelenMetStageProfiel(boolean toegestaanKoppelenMetStageProfiel) {
		this.toegestaanKoppelenMetStageProfiel = toegestaanKoppelenMetStageProfiel;
	}

	public boolean isToegestaanKoppelenMetStageKandidaat() {
		return toegestaanKoppelenMetStageKandidaat;
	}

	public void setToegestaanKoppelenMetStageKandidaat(boolean toegestaanKoppelenMetStageKandidaat) {
		this.toegestaanKoppelenMetStageKandidaat = toegestaanKoppelenMetStageKandidaat;
	}
}
