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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import nl.topicus.eduarte.model.entities.groep.Groep;

/**
 * Een beoordeling die voor een gehele groep in een keer wordt aangemaakt. Kan
 * van toepassing zijn op een uitstroom of LLB matrix. N.b., deze beoordeling
 * tonen/samenvoegen/bewerken bij deelnemers gaat o.b.v. de
 * GroepsBeoordelingOverschrijvingen, die standaard leeg worden aangemaakt.
 *
 */
@Entity
public class Groepsbeoordeling extends Beoordeling {
	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "groep", nullable = true)
	private Groep groep;

	@OneToMany(mappedBy = "groepsBeoordeling")
	private List<GroepsbeoordelingOverschrijving> groepsbeoordelingOverschrijvingen = new ArrayList<>();

	public Groepsbeoordeling() {
	}

	public Groep getGroep() {
		return groep;
	}

	public void setGroep(Groep groep) {
		this.groep = groep;
	}

	public List<GroepsbeoordelingOverschrijving> getGroepsbeoordelingOverschrijvingen() {
		return groepsbeoordelingOverschrijvingen;
	}

	public void setGroepsbeoordelingOverschrijvingen(
			List<GroepsbeoordelingOverschrijving> groepsbeoordelingOverschrijvingen) {
		this.groepsbeoordelingOverschrijvingen = groepsbeoordelingOverschrijvingen;
	}

	public void addGroepsbeoordelingOverschrijving(GroepsbeoordelingOverschrijving overschrijving) {
		this.groepsbeoordelingOverschrijvingen.add(overschrijving);
	}

	public boolean isOverschrijvingOpgenomen() {
		for (GroepsbeoordelingOverschrijving curOverschrijving : getGroepsbeoordelingOverschrijvingen()) {
			if (curOverschrijving.getOpgenomenIn() != null) {
				return true;
			}
		}
		return false;
	}
}
