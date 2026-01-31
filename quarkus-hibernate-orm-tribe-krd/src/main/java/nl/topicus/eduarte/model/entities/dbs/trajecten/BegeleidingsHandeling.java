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

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.BegeleidingsBijlage;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public abstract class BegeleidingsHandeling extends InstellingEntiteit
		implements ZorgvierkantObject, IBijlageKoppelEntiteit<BegeleidingsBijlage> {
	@Column(nullable = true, length = 255)
	private String omschrijving;

	@Column(nullable = true)
	@Temporal(TemporalType.DATE)
	private Date deadlineStatusovergang;

	@Column(nullable = false)
	private boolean gelezen;

	@Column(nullable = false)
	private boolean geweigerd;

	@Column(nullable = true, length = 512)
	private String aanleiding;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "voorafgaand")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<VervolgHandeling> vervolgHandelingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "vervolg")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<VervolgHandeling> voorgaandeHandelingen = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Traject", nullable = false, foreignKey = @ForeignKey(name = "FK_BegHand_traject"))
	private Traject traject;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Eigenaar", nullable = false, foreignKey = @ForeignKey(name = "FK_BegHand_Eig"))
	private Medewerker eigenaar;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "Verantwoordelijke", nullable = true, foreignKey = @ForeignKey(name = "FK_BegHand_toeg"))
	private Medewerker toegekendAan;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "begeleidingsHandeling")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BegeleidingsBijlage> bijlagen = new ArrayList<>();

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private BegeleidingsHandelingsStatussoort status;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "begeleidingsHandeling")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy("datumTijd desc")
	private List<BegeleidingsHandelingStatusovergang> statusOvergangen = new ArrayList<>();

	// // 3=Voltooid, 4=Geannuleerd
	// @Formula(value =
	// "CASE WHEN STATUS IN ('Voltooid','Geannuleerd') THEN NULL ELSE
	// DEADLINESTATUSOVERGANG END")
	// private Date deadline;

	/**
	 * De lijst met aanleidingen die naar deze handeling verwijzen. Dit zijn niet de
	 * aanleidingen van deze handeling, maar juist objecten die aangeven dat deze
	 * handeling de aanleiding is van een traject.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "begeleidingsHandeling")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<Aanleiding> trajectAanleidingen;

	@Column(nullable = true)
	private boolean eindHandeling;

	// overnemen soort handeling omdat hierop gesorteerd moet worden in de database.
	@Column(nullable = false, length = 32)
	protected String soort;

	public BegeleidingsHandeling() {
	}

	public String getSoortHandeling() {
		return soort;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Date getDeadlineStatusovergang() {
		return deadlineStatusovergang;
	}

	public void setDeadlineStatusovergang(Date deadlineStatusovergang) {
		this.deadlineStatusovergang = deadlineStatusovergang;
	}

	public boolean isGelezen() {
		return gelezen;
	}

	public void setGelezen(boolean gelezen) {
		this.gelezen = gelezen;
	}

	public boolean isGeweigerd() {
		return geweigerd;
	}

	public void setGeweigerd(boolean geweigerd) {
		this.geweigerd = geweigerd;
	}

	public String getAanleiding() {
		return aanleiding;
	}

	public void setAanleiding(String aanleiding) {
		this.aanleiding = aanleiding;
	}

	public Traject getTraject() {
		return traject;
	}

	public void setTraject(Traject traject) {
		this.traject = traject;
	}

	@Override
	public List<BegeleidingsBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<BegeleidingsBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public Medewerker getEigenaar() {
		return eigenaar;
	}

	public void setEigenaar(Medewerker eigenaar) {
		this.eigenaar = eigenaar;
	}

	public Medewerker getToegekendAan() {
		return toegekendAan;
	}

	public void setToegekendAan(Medewerker toegekendAan) {
		this.toegekendAan = toegekendAan;
	}

	public BegeleidingsHandelingsStatussoort getStatus() {
		return status;
	}

	public void setStatus(BegeleidingsHandelingsStatussoort status) {
		this.status = status;
	}

	public List<VervolgHandeling> getVervolgHandelingen() {
		return vervolgHandelingen;
	}

	public void setVervolgHandelingen(List<VervolgHandeling> vervolgHandelingen) {
		this.vervolgHandelingen = vervolgHandelingen;
	}

	public List<VervolgHandeling> getVoorgaandeHandelingen() {
		return voorgaandeHandelingen;
	}

	public void setVoorgaandeHandelingen(List<VervolgHandeling> voorgaandeHandelingen) {
		this.voorgaandeHandelingen = voorgaandeHandelingen;
	}

	public List<BegeleidingsHandelingStatusovergang> getStatusOvergangen() {
		return statusOvergangen;
	}

	public void setStatusOvergangen(List<BegeleidingsHandelingStatusovergang> statusOvergangen) {
		this.statusOvergangen = statusOvergangen;
	}

	@Override
	public String toString() {
		return getOmschrijving();
	}

	/**
	 * @return De deadline voor de volgende statusovergang als de status van deze
	 *         handeling niet al een eindstatus bereikt heeft. Als de handeling al
	 *         een eindstatus bereikt heeft, wordt null teruggegeven.
	 */
	public Date getDeadline() {

		if (BegeleidingsHandelingsStatussoort.getEindStatussen().contains(getStatus()))
			return null;
		else
			return deadlineStatusovergang;
	}

	public void setDeadline(Date deadline) {
		setDeadlineStatusovergang(deadline);
	}

	public Date getSorteerDatum() {
		return getDeadline();
	}

	public List<Aanleiding> getTrajectAanleidingen() {
		return trajectAanleidingen;
	}

	public void setTrajectAanleidingen(List<Aanleiding> trajectAanleidingen) {
		this.trajectAanleidingen = trajectAanleidingen;
	}

	public void setEindHandeling(boolean eindHandeling) {
		this.eindHandeling = eindHandeling;
	}

	public boolean isEindHandeling() {
		return eindHandeling;
	}

	public Deelnemer getDeelnemer() {
		return getTraject().getDeelnemer();
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		for (BegeleidingsBijlage bijlageEntiteit : getBijlagen()) {
			if (bijlageEntiteit.getBijlage().equals(bijlage))
				return true;
		}
		return false;
	}

	@Override
	public BegeleidingsBijlage addBijlage(Bijlage bijlage) {
		var newBijlage = new BegeleidingsBijlage();
		newBijlage.setBijlage(bijlage);
		newBijlage.setDeelnemer(getDeelnemer());
		newBijlage.setBegeleidingsHandeling(this);

		getBijlagen().add(newBijlage);

		return newBijlage;
	}

	@Override
	public Integer getZorglijn() {
		return getTraject().getZorglijn();
	}

	@Override
	public boolean isVertrouwelijk() {
		return getTraject().isVertrouwelijk();
	}

	@Override
	public String getSecurityId() {
		return getTraject().getSecurityId();
	}

	@Override
	public String getVertrouwelijkSecurityId() {
		return getTraject().getVertrouwelijkSecurityId();
	}

	@Override
	public boolean isTonenInZorgvierkant() {
		return getTraject().isTonenInZorgvierkant();
	}

	public boolean isToekenningAanVisible() {
		if (getStatus() != null) {
			if (BegeleidingsHandelingsStatussoort.Inplannen.equals(getStatus()))
				return true;
			if (BegeleidingsHandelingsStatussoort.Uitvoeren.equals(getStatus()))
				return true;
		}
		return false;
	}

	public String getSoort() {
		return soort;
	}

	public abstract String handelingsSoort();
}
