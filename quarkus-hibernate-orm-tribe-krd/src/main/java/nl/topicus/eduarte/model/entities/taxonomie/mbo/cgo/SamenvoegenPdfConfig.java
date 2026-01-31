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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;

/**
 */
@Entity
@Table(name = "SamenvoegenPdfConfig")
public class SamenvoegenPdfConfig extends BeginEinddatumInstellingEntiteit {
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private GraphType graphType;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CategoryProperty categoryProperty;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private CategoryAggregation categoryAggregation;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date samenvoegenVanaf;

	@Temporal(TemporalType.DATE)
	@Column(nullable = true)
	private Date samenvoegenTot;

	public SamenvoegenPdfConfig() {
	}

	public Date getSamenvoegenVanaf() {
		return samenvoegenVanaf;
	}

	public void setSamenvoegenVanaf(Date samenvoegenVanaf) {
		this.samenvoegenVanaf = samenvoegenVanaf;
	}

	public Date getSamenvoegenTot() {
		return samenvoegenTot;
	}

	public void setSamenvoegenTot(Date samenvoegenTot) {
		this.samenvoegenTot = samenvoegenTot;
	}

	public GraphType getGraphType() {
		return graphType;
	}

	public void setGraphType(GraphType graphType) {
		this.graphType = graphType;
	}

	public CategoryProperty getCategoryProperty() {
		return categoryProperty;
	}

	public void setCategoryProperty(CategoryProperty categoryProperty) {
		this.categoryProperty = categoryProperty;
	}

	public CategoryAggregation getCategoryAggregation() {
		return categoryAggregation;
	}

	public void setCategoryAggregation(CategoryAggregation categoryAggregation) {
		this.categoryAggregation = categoryAggregation;
	}

}
