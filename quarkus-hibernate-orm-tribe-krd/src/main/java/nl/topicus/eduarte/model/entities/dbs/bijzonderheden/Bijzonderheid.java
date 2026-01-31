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
package nl.topicus.eduarte.model.entities.dbs.bijzonderheden;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.dbs.bijlagen.BijzonderheidBijlage;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Bijzonderheid extends InstellingEntiteit implements IBijlageKoppelEntiteit<BijzonderheidBijlage>
{
	public static final String BIJZONDERHEID = "BIJZONDERHEID";

	public static final String VERTROUWELIJKE_BIJZONDERHEID = "VERTROUWELIJKE_BIJZONDERHEID";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "auteur", nullable = false)
	private Medewerker auteur;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "categorie", nullable = false)
	private BijzonderheidCategorie categorie;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bijzonderheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<ToegekendHulpmiddel> toegekendHulpmiddel = new ArrayList<>();

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date datumInvoer;

	@Column(length = 50, nullable = false)
	private String titel;

	@Lob
	private String omschrijving;

	@Column(nullable = false)
	private boolean tonenOpDeelnemerkaart;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Column(nullable = true)
	private Integer zorglijn;

	/**
	 * Bijzonderheid tonen in zoeklijsten e.d. als waarschuwingsicoontje.
	 */
	@Column(nullable = false)
	private boolean tonenAlsWaarschuwing;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "handelingsinstructies", nullable = true)
	private Bijlage handelingsinstructies;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bijzonderheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BijzonderheidBijlage> bijlagen = new ArrayList<>();

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bijzonderheid")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BijzonderheidNietTonenInZorgvierkant> nietTonenInZorgvierkants =
	new ArrayList<>();

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Medewerker getAuteur() {
		return auteur;
	}

	public void setAuteur(Medewerker auteur) {
		this.auteur = auteur;
	}

	public BijzonderheidCategorie getCategorie() {
		return categorie;
	}

	public void setCategorie(BijzonderheidCategorie categorie) {
		this.categorie = categorie;
	}

	public List<ToegekendHulpmiddel> getToegekendHulpmiddel() {
		return toegekendHulpmiddel;
	}

	public void setToegekendHulpmiddel(List<ToegekendHulpmiddel> toegekendHulpmiddel) {
		this.toegekendHulpmiddel = toegekendHulpmiddel;
	}

	public Date getDatumInvoer() {
		return datumInvoer;
	}

	public void setDatumInvoer(Date datumInvoer) {
		this.datumInvoer = datumInvoer;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public boolean isTonenOpDeelnemerkaart() {
		return tonenOpDeelnemerkaart;
	}

	public void setTonenOpDeelnemerkaart(boolean tonenOpDeelnemerkaart) {
		this.tonenOpDeelnemerkaart = tonenOpDeelnemerkaart;
	}

	public boolean isVertrouwelijk() {
		return vertrouwelijk;
	}

	public void setVertrouwelijk(boolean vertrouwelijk) {
		this.vertrouwelijk = vertrouwelijk;
	}

	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	public boolean isTonenAlsWaarschuwing() {
		return tonenAlsWaarschuwing;
	}

	public void setTonenAlsWaarschuwing(boolean tonenAlsWaarschuwing) {
		this.tonenAlsWaarschuwing = tonenAlsWaarschuwing;
	}

	public Bijlage getHandelingsinstructies() {
		return handelingsinstructies;
	}

	public void setHandelingsinstructies(Bijlage handelingsinstructies) {
		this.handelingsinstructies = handelingsinstructies;
	}

	@Override
	public List<BijzonderheidBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<BijzonderheidBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<BijzonderheidNietTonenInZorgvierkant> getNietTonenInZorgvierkants() {
		return nietTonenInZorgvierkants;
	}

	public void setNietTonenInZorgvierkants(List<BijzonderheidNietTonenInZorgvierkant> nietTonenInZorgvierkants) {
		this.nietTonenInZorgvierkants = nietTonenInZorgvierkants;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public BijzonderheidBijlage addBijlage(Bijlage bijlage) {
		return null;
	}
}
