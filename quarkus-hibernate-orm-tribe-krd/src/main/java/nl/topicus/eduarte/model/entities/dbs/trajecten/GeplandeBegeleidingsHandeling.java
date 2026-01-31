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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import java.util.Date;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.participatie.Afspraak;

/**
 */
@Entity()
public abstract class GeplandeBegeleidingsHandeling extends BegeleidingsHandeling {
	@Column(nullable = true)
	@Basic(optional = false)
	private boolean uitnodigingenVersturen;

	@Column(nullable = true)
	@Basic(optional = false)
	private boolean verslagVersturen;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "afspraak", nullable = true, foreignKey = @ForeignKey(name = "FK_handeling_afspraak"))
	@Basic(optional = false)
	private Afspraak afspraak;

	public GeplandeBegeleidingsHandeling() {
	}

	public boolean isUitnodigingenVersturen() {
		return uitnodigingenVersturen;
	}

	public void setUitnodigingenVersturen(boolean uitnodigingenVersturen) {
		this.uitnodigingenVersturen = uitnodigingenVersturen;
	}

	public boolean isVerslagVersturen() {
		return verslagVersturen;
	}

	public void setVerslagVersturen(boolean verslagVersturen) {
		this.verslagVersturen = verslagVersturen;
	}

	public Afspraak getAfspraak() {
		return afspraak;
	}

	public void setAfspraak(Afspraak afspraak) {
		this.afspraak = afspraak;
	}

	public boolean isAfspraakVeldenEditable() {
		if (getStatus() != null) {
			if (BegeleidingsHandelingsStatussoort.Uitvoeren.equals(getStatus()))
				return true;
			else if (BegeleidingsHandelingsStatussoort.Bespreken.equals(getStatus()))
				return true;
			else if (BegeleidingsHandelingsStatussoort.Voltooid.equals(getStatus()))
				return true;
		}
		return false;
	}

	@Override
	public Date getSorteerDatum() {
		if (getAfspraak().getBeginDatumTijd() != null)
			return getAfspraak().getBeginDatumTijd();
		else
			return getDeadline();
	}

	public boolean isDeadlineVisible() {
		if (getStatus() != null)
			if (BegeleidingsHandelingsStatussoort.Inplannen.equals(getStatus())) {
				return true;
			} else {
				setDeadlineStatusovergang(null);
				return false;
			}
		return false;
	}
}
