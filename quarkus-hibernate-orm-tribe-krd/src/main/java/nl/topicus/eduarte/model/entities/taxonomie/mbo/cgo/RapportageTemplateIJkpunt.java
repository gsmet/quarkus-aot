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

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity
@Table(name = "RapportageTemplateIJkpunt")
public class RapportageTemplateIJkpunt extends InstellingEntiteit {
	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "ijkpunt", nullable = false)
	private IJkpunt ijkpunt;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "config", nullable = true)
	private VoortgangHtmlConfig config;

	@ManyToOne(optional = true, fetch = FetchType.LAZY)
	@JoinColumn(name = "configPdf", nullable = true)
	private VoortgangPdfConfig configPdf;

	public VoortgangPdfConfig getConfigPdf() {
		return configPdf;
	}

	public void setConfigPdf(VoortgangPdfConfig configPdf) {
		this.configPdf = configPdf;
	}

	protected RapportageTemplateIJkpunt() {
	}

	public RapportageTemplateIJkpunt(VoortgangPdfConfig configPdf, IJkpunt ijkpunt) {
		this.configPdf = configPdf;
		this.ijkpunt = ijkpunt;
	}

	public RapportageTemplateIJkpunt(VoortgangHtmlConfig config, IJkpunt ijkpunt) {
		this.config = config;
		this.ijkpunt = ijkpunt;
	}

	public VoortgangHtmlConfig getConfig() {
		return config;
	}

	public void setConfig(VoortgangHtmlConfig config) {
		this.config = config;
	}

	public IJkpunt getIjkpunt() {
		return ijkpunt;
	}

	public void setIjkpunt(IJkpunt ijkpunt) {
		this.ijkpunt = ijkpunt;
	}

}
