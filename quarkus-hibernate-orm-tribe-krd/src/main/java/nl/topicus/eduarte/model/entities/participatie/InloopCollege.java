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
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Lob;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class InloopCollege extends InstellingEntiteit {
	@Column(nullable = false, length = 100)
	private String omschrijving;

	@Column(nullable = true)
	private Integer maxDeelnemers;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date inschrijfBeginDatum;

	@Temporal(TemporalType.DATE)
	@Column(nullable = false)
	private Date inschrijfEindDatum;

	@Column(nullable = false)
	private boolean heleHerhaling;

	@Column(nullable = true)
	@Lob
	private String opmerking;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inloopCollege")
	private List<Afspraak> afspraken = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inloopCollege")
	private List<InloopCollegeOpleiding> opleidingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "inloopCollege")
	private List<InloopCollegeGroep> groepen = new ArrayList<>();

	public InloopCollege() {
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public Integer getMaxDeelnemers() {
		return maxDeelnemers;
	}

	public void setMaxDeelnemers(Integer maxDeelnemers) {
		this.maxDeelnemers = maxDeelnemers;
	}

	public Date getInschrijfBeginDatum() {
		return inschrijfBeginDatum;
	}

	public void setInschrijfBeginDatum(Date inschrijfBeginDatum) {
		this.inschrijfBeginDatum = inschrijfBeginDatum;
	}

	public Date getInschrijfEindDatum() {
		return inschrijfEindDatum;
	}

	public void setInschrijfEindDatum(Date inschrijfEindDatum) {
		this.inschrijfEindDatum = inschrijfEindDatum;
	}

	public boolean isHeleHerhaling() {
		return heleHerhaling;
	}

	public void setHeleHerhaling(boolean heleHerhaling) {
		this.heleHerhaling = heleHerhaling;
	}

	public String getOpmerking() {
		return opmerking;
	}

	public void setOpmerking(String opmerking) {
		this.opmerking = opmerking;
	}

	public List<Afspraak> getAfspraken() {
		return afspraken;
	}

	public Afspraak getEersteAfspraak() {
		if (getAfspraken().isEmpty())
			return null;
		var geordendeAfspraken = getAfspraken();
		Collections.sort(geordendeAfspraken, (a1, a2) -> {
			if (a1.getBeginDatumTijd() == null || a2.getBeginDatumTijd() == null) {
				return 0;
			}
			return a1.getBeginDatumTijd().compareTo(a2.getBeginDatumTijd());
		});
		return geordendeAfspraken.get(0);
	}

	public void setAfspraken(List<Afspraak> afspraken) {
		this.afspraken = afspraken;
	}

	public List<InloopCollegeOpleiding> getOpleidingen() {
		return opleidingen;
	}

	public void setOpleidingen(List<InloopCollegeOpleiding> opleidingen) {
		this.opleidingen = opleidingen;
	}

	public List<InloopCollegeGroep> getGroepen() {
		return groepen;
	}

	public void setGroepen(List<InloopCollegeGroep> groepen) {
		this.groepen = groepen;
	}

	@Override
	public String toString() {
		var ret = "Inloop college";
		return ret;
	}

	public InloopCollege copy() {
		var copy = new InloopCollege();
		copy.setInschrijfBeginDatum(getInschrijfBeginDatum());
		copy.setInschrijfEindDatum(getInschrijfEindDatum());
		copy.setMaxDeelnemers(getMaxDeelnemers());
		copy.setOmschrijving(getOmschrijving());
		copy.setOpmerking(getOpmerking());
		copy.setHeleHerhaling(isHeleHerhaling());
		for (InloopCollegeGroep curGroep : getGroepen()) {
			var groepCopy = new InloopCollegeGroep();
			groepCopy.setInloopCollege(copy);
			groepCopy.setGroep(curGroep.getGroep());
			copy.getGroepen().add(groepCopy);
		}
		for (InloopCollegeOpleiding curOpleiding : getOpleidingen()) {
			var opleidingCopy = new InloopCollegeOpleiding();
			opleidingCopy.setInloopCollege(copy);
			opleidingCopy.setOpleiding(curOpleiding.getOpleiding());
			copy.getOpleidingen().add(opleidingCopy);
		}
		return copy;
	}
}
