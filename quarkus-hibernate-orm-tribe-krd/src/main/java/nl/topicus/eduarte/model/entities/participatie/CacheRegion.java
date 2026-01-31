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
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class CacheRegion extends InstellingEntiteit {
	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date lastUpdate;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date regionStartDate;

	@Temporal(value = TemporalType.DATE)
	@Column(nullable = false)
	private Date regionEndDate;

	@Column(nullable = false)
	private boolean dirty;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "cacheRegion")
	private List<Afspraak> afspraken = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeAgenda", nullable = false)
	private ExterneAgenda externeAgenda;

	public CacheRegion() {
	}

	public void setAfspraken(List<Afspraak> afspraken) {
		this.afspraken = afspraken;
	}

	public List<Afspraak> getAfspraken() {
		return afspraken;
	}

	public void setExterneAgenda(ExterneAgenda externeAgenda) {
		this.externeAgenda = externeAgenda;
	}

	public ExterneAgenda getExterneAgenda() {
		return externeAgenda;
	}

	public void setLastUpdate(Date lastUpdate) {
		this.lastUpdate = lastUpdate;
	}

	public Date getLastUpdate() {
		return lastUpdate;
	}

	public void setDirty(boolean dirty) {
		this.dirty = dirty;
	}

	public boolean isDirty() {
		return dirty;
	}

	public Date getRegionStartDate() {
		return regionStartDate;
	}

	public void setRegionStartDate(Date regionStartDate) {
		this.regionStartDate = regionStartDate;
	}

	public Date getRegionEndDate() {
		return regionEndDate;
	}

	public void setRegionEndDate(Date regionEndDate) {
		this.regionEndDate = regionEndDate;
	}

	public boolean isValid() {
		return !dirty && System.currentTimeMillis()
				- getExterneAgenda().getKoppeling().getGeldigheidsduur() * 60000 < getLastUpdate().getTime();
	}
}
