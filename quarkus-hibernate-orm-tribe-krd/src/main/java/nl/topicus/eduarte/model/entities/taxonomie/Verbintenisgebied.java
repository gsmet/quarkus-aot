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
package nl.topicus.eduarte.model.entities.taxonomie;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.annotations.SQLRestriction;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import nl.topicus.eduarte.model.entities.criteriumbank.Criterium;
import nl.topicus.eduarte.model.entities.inschrijving.SoortVooropleiding.SoortOnderwijs;
import nl.topicus.eduarte.model.entities.landelijk.Cohort;
import nl.topicus.eduarte.model.entities.productregel.Productregel;
import nl.topicus.eduarte.model.entities.productregel.SoortProductregel;
import nl.topicus.eduarte.model.entities.taxonomie.mbo.AbstractMBOVerbintenisgebied;

/**
 */
@Entity()
public class Verbintenisgebied extends TaxonomieElement {
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "parent")
	private List<VerbintenisgebiedOnderdeel> onderdelen;

	/**
	 * De landelijke productregels die aan dit verbintenisgebied zijn gekoppeld. Let
	 * op: Deze lijst bevat dus niet de productregels die aan dit verbintenisgebied
	 * via een opleiding zijn gekoppeld!
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenisgebied")
	@SQLRestriction( "opleiding is null")
	private List<Productregel> productregels;

	/**
	 * De landelijke criteria die aan dit verbintenisgebied zijn gekoppeld.
	 */
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verbintenisgebied")
	@SQLRestriction( "opleiding is null")
	private List<Criterium> criteria;

	public List<VerbintenisgebiedOnderdeel> getOnderdelen() {
		if (onderdelen == null)
			onderdelen = new ArrayList<>();
		return onderdelen;
	}

	public void setOnderdelen(List<VerbintenisgebiedOnderdeel> onderdelen) {
		this.onderdelen = onderdelen;
	}

	/**
	 * @return Returns the productregels. Let op: Deze lijst bevat alleen landelijke
	 *         productregels. Je mag dus ook geen niet-landelijke productregels aan
	 *         deze lijst toevoegen!
	 */
	public List<Productregel> getProductregels() {
		if (productregels == null)
			productregels = new ArrayList<>();
		return productregels;
	}

	public void setProductregels(List<Productregel> productregels) {
		this.productregels = productregels;
	}

	/**
	 *
	 * @param soort
	 * @param cohort
	 * @return Een lijst van alle productregels van de gegeven soort bij dit
	 *         verbintenisgebied.
	 */
	public List<Productregel> getProductregels(SoortProductregel soort, Cohort cohort) {
		List<Productregel> res = new ArrayList<>(getProductregels().size());
		for (Productregel regel : getProductregels()) {
			if (regel.getSoortProductregel().equals(soort) && regel.getCohort().equals(cohort)) {
				res.add(regel);
			}
		}
		return res;
	}

	/**
	 *
	 * @param naam
	 * @return Een lijst van alle productregels waarvan de naam overeenkomt met
	 *         parameter 'naam'
	 */
	public List<Productregel> getProductregels(String naam) {
		List<Productregel> res = new ArrayList<>();
		for (Productregel regel : getProductregels()) {
			if (regel.getNaam().contains(naam)) {
				res.add(regel);
			}
		}
		return res;
	}

	public List<Criterium> getCriteria() {
		if (criteria == null)
			criteria = new ArrayList<>();
		return criteria;
	}

	public void setCriteria(List<Criterium> criteria) {
		this.criteria = criteria;
	}

	/**
	 *
	 * @return Het soort onderwijs (als vooropleiding) van dit verbintenisgebied.
	 */
	public SoortOnderwijs getSoortOnderwijs() {
		var taxonomie = getTaxonomie();
		if (taxonomie.isMBO() || taxonomie.isCGO()) {
			if (AbstractMBOVerbintenisgebied.class.isAssignableFrom(getClass())) {
				var mbo = (AbstractMBOVerbintenisgebied) this;
				if (mbo.getNiveau() == MBONiveau.Niveau1 || mbo.getNiveau() == MBONiveau.Niveau2) {
					return SoortOnderwijs.MBO12;
				} else if (mbo.getNiveau() == MBONiveau.Niveau3 || mbo.getNiveau() == MBONiveau.Niveau4) {
					return SoortOnderwijs.MBO34;
				}
			}
		}
		if (taxonomie.isVO()) {
			var code = getTaxonomiecode();
			if (code.startsWith("3.1")) {
				return SoortOnderwijs.Basisvorming;
			}
			if (code.startsWith("3.2.1")) {
				return SoortOnderwijs.VWO;
			}
			if (code.startsWith("3.2.2")) {
				return SoortOnderwijs.HAVO;
			}
			if (code.startsWith("3.2.3.1")) {
				return SoortOnderwijs.VMBOTL;
			}
			if (code.startsWith("3.2.3.2") || code.startsWith("3.2.4") || code.startsWith("3.2.5")) {
				return SoortOnderwijs.VMBO;
			}
		}
		return null;
	}
}
