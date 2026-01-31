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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Een lesdagindeling verwijst naar een lesuurindeling. Een lesuurindeling bevat
 * een lijst met lesuren. Op deze manier wordt het mogelijk om de lesuren per
 * weekdag te varieren.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class LesuurIndeling extends InstellingEntiteit {
	@Column(name = "lesuur", length = 2, nullable = false)
	private int lesuur;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "lesdagIndeling", nullable = false)
	private LesdagIndeling lesdagIndeling;

	@Column(name = "beginTijd", nullable = false)
	@Temporal(value = TemporalType.TIME)
	private Date beginTijd;

	@Column(name = "eindTijd", nullable = false)
	@Temporal(value = TemporalType.TIME)
	private Date eindTijd;

	/**
	 * Default constructor voor Hibernate.
	 */
	public LesuurIndeling() {
	}

	public void setLesuur(int lesuur) {
		this.lesuur = lesuur;
	}

	public int getLesuur() {
		return lesuur;
	}

	public void setBeginTijd(Date beginTijd) {
		this.beginTijd = beginTijd;
	}

	public Date getBeginTijd() {
		return beginTijd;
	}

	public void setEindTijd(Date eindTijd) {
		this.eindTijd = eindTijd;
	}

	public Date getEindTijd() {
		return eindTijd;
	}

	public void setLesdagIndeling(LesdagIndeling lesdagIndeling) {
		this.lesdagIndeling = lesdagIndeling;
	}

	public LesdagIndeling getLesdagIndeling() {
		return lesdagIndeling;
	}

	public String getNaam() {
		return lesdagIndeling.getNaam();
	}

}
