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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.IOrganisatieEenheidLocatieKoppelbaarEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Indelingen lesweken. Verschillende lesweekindelingen kunnen verschillende
 * weekdagen bevatten en verschillende lesuren. Een lesweekindeling bevat een
 * lijst met lesdagindelingen. Een lesdagindeling bevat weer een verwijzing naar
 * de indeling van lesuren op die dag.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class LesweekIndeling extends InstellingEntiteit
implements IOrganisatieEenheidLocatieKoppelbaarEntiteit<LesweekIndelingOrganisatieEenheidLocatie> {

	@Column(name = "naam", length = 25, nullable = false)
	private String naam;

	@Column(name = "actief", length = 25)
	private boolean actief;

	@Column(name = "omschrijving", length = 60)
	private String omschrijving;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lesweekIndeling")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<LesdagIndeling> lesdagIndelingen = new ArrayList<>();

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lesweekIndeling")
	private List<LesweekIndelingOrganisatieEenheidLocatie> LesweekIndelingOrganisatieEenheidLocatie;

	public LesweekIndeling() {
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

	public List<LesdagIndeling> getLesdagIndelingen() {
		return lesdagIndelingen;
	}

	public List<LesdagIndeling> getLesdagIndelingenOrderedByDay() {
		List<LesdagIndeling> lesDagen = new ArrayList<>();
		lesDagen.addAll(lesdagIndelingen);
		Collections.sort(lesDagen, (lesdag1, lesdag2) -> {
			if (lesdag1.getDagNummer() > lesdag2.getDagNummer()) {
				return 1;
			}
			return 0;
		});
		return lesDagen;
	}

	public void addLesdagIndeling(LesdagIndeling lesdag) {
		lesdagIndelingen.add(lesdag);
	}

	/**
	 * @return de lesdagindeling met de meeste lestijden, als er geen
	 *         lesdagindelingen zijn null
	 */
	public LesdagIndeling getIndelingMetMeesteLestijden() {
		var meesteLestijden = -1;
		LesdagIndeling indelingMetMeesteLestijden = null;
		for (LesdagIndeling lesdag : getLesdagIndelingen()) {
			if (lesdag.getLesuurIndeling().size() > meesteLestijden) {
				meesteLestijden = lesdag.getLesuurIndeling().size();
				indelingMetMeesteLestijden = lesdag;
			}
		}
		if (indelingMetMeesteLestijden != null)
			return indelingMetMeesteLestijden;
		return null;
	}

	public void setLesdagIndelingen(List<LesdagIndeling> lesdagIndelingen) {
		this.lesdagIndelingen = lesdagIndelingen;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public boolean isActief() {
		return actief;
	}

	public String getActiefOmschrijving() {
		return isActief() ? "Ja" : "Nee";
	}

	@Override
	public List<LesweekIndelingOrganisatieEenheidLocatie> getOrganisatieEenheidLocatieKoppelingen() {
		return getLesweekIndelingOrganisatieEenheidLocatie();
	}

	public void setLesweekIndelingOrganisatieEenheidLocatie(
			List<LesweekIndelingOrganisatieEenheidLocatie> lesweekIndelingOrganisatieEenheidLocatie) {
		LesweekIndelingOrganisatieEenheidLocatie = lesweekIndelingOrganisatieEenheidLocatie;
	}

	public List<LesweekIndelingOrganisatieEenheidLocatie> getLesweekIndelingOrganisatieEenheidLocatie() {
		return LesweekIndelingOrganisatieEenheidLocatie;
	}

	@Override
	public String toString() {
		return naam;
	}
}
