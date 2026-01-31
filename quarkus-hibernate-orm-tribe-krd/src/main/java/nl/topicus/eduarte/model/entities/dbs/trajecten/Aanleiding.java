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

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijzonderheden.Bijzonderheid;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Incident;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Notitie;
import nl.topicus.eduarte.model.entities.dbs.testen.DeelnemerTest;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Aanleiding extends InstellingEntiteit implements ZorgvierkantObject {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "incident", nullable = true, foreignKey = @ForeignKey(name = "FK_Aanleiding_incident"))
	private Incident incident;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "notitie", nullable = true, foreignKey = @ForeignKey(name = "FK_Aanleiding_notitie"))
	private Notitie notitie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemerTest", nullable = true, foreignKey = @ForeignKey(name = "FK_Aanleiding_test"))
	private DeelnemerTest deelnemerTest;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Bijzonderheid", nullable = true, foreignKey = @ForeignKey(name = "FK_Aanleiding_bijzheid"))
	private Bijzonderheid bijzonderheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "begeleidingsHandeling", nullable = true, foreignKey = @ForeignKey(name = "FK_Aanleiding_begHand"))
	private BegeleidingsHandeling begeleidingsHandeling;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Traject", nullable = false, foreignKey = @ForeignKey(name = "FK_Aanleiding_traject"))
	private Traject traject;

	public Incident getIncident() {
		return incident;
	}

	public void setIncident(Incident incident) {
		this.incident = incident;
	}

	public Notitie getNotitie() {
		return notitie;
	}

	public void setNotitie(Notitie notitie) {
		this.notitie = notitie;
	}

	public DeelnemerTest getDeelnemerTest() {
		return deelnemerTest;
	}

	public void setDeelnemerTest(DeelnemerTest deelnemerTest) {
		this.deelnemerTest = deelnemerTest;
	}

	public Bijzonderheid getBijzonderheid() {
		return bijzonderheid;
	}

	public void setBijzonderheid(Bijzonderheid bijzonderheid) {
		this.bijzonderheid = bijzonderheid;
	}

	public BegeleidingsHandeling getBegeleidingsHandeling() {
		return begeleidingsHandeling;
	}

	public void setBegeleidingsHandeling(BegeleidingsHandeling begeleidingsHandeling) {
		this.begeleidingsHandeling = begeleidingsHandeling;
	}

	public Traject getTraject() {
		return traject;
	}

	public void setTraject(Traject traject) {
		this.traject = traject;
	}

	@Override
	public boolean isVertrouwelijk() {
		return false;
	}

	@Override
	public Integer getZorglijn() {
		return null;
	}

	@Override
	public String getSecurityId() {
		return null;
	}

	@Override
	public String getVertrouwelijkSecurityId() {
		return null;
	}

	@Override
	public boolean isTonenInZorgvierkant() {
		return false;
	}
}
