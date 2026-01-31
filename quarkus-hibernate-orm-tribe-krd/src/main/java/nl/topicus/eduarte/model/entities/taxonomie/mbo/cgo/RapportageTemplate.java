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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import jakarta.persistence.Table;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkOfInstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;

@Entity
@Table(name = "RapportageTemplate")
public class RapportageTemplate extends BeginEinddatumLandelijkOfInstellingEntiteit {
	public enum OutputForm {
		HTML {
			@Override
			public String toString() {
				return "Interactieve HTML weergave";
			}
		},
		PDF {
			@Override
			public String toString() {
				return "PDF rapport";
			}
		}
	}

	public enum Purpose {
		HUIDIGE_STAND {
			@Override
			public String toString() {
				return "Overzicht huidige stand";
			}
		},
		SAMENVOEGEN {
			@Override
			public String toString() {
				return "Beoordelingen samenvoegen";
			}
		},
		DETAILS {
			@Override
			public String toString() {
				return "Matrix details inzien";
			}
		}
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private OutputForm outputForm;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Purpose purpose;

	@Column(nullable = false)
	private boolean includeUitstroom;

	@Column(nullable = false)
	private boolean includeLLB;

	@Column(nullable = false)
	private boolean includeVrijeMatrices;

	@Column(nullable = false)
	private boolean includeTaal;

	@Column(nullable = false)
	private String naam;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "voortgangHtmlConfig", nullable = false)
	private VoortgangHtmlConfig voortgangHtmlConfig;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "samenvoegenHtml", nullable = false)
	private SamenvoegenHtmlConfig samenvoegenHtmlConfig;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "samenvoegenPdfConfig", nullable = false)
	private SamenvoegenPdfConfig samenvoegenPdfConfig;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "voortgangPdfConfig", nullable = false)
	private VoortgangPdfConfig voortgangPdfConfig;

	@ManyToOne(optional = false, fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = false)
	private Medewerker medewerker;

	public OutputForm getOutputForm() {
		return outputForm;
	}

	public void setOutputForm(OutputForm outputForm) {
		this.outputForm = outputForm;
	}

	public Purpose getPurpose() {
		return purpose;
	}

	public void setPurpose(Purpose purpose) {
		this.purpose = purpose;
	}

	public boolean isIncludeUitstroom() {
		return includeUitstroom;
	}

	public void setIncludeUitstroom(boolean includeUitstroom) {
		this.includeUitstroom = includeUitstroom;
	}

	public boolean isIncludeLLB() {
		return includeLLB;
	}

	public void setIncludeLLB(boolean includeLLB) {
		this.includeLLB = includeLLB;
	}

	public boolean isIncludeVrijeMatrices() {
		return includeVrijeMatrices;
	}

	public void setIncludeVrijeMatrices(boolean includeVrijeMatrices) {
		this.includeVrijeMatrices = includeVrijeMatrices;
	}

	public boolean isIncludeTaal() {
		return includeTaal;
	}

	public void setIncludeTaal(boolean includeTaal) {
		this.includeTaal = includeTaal;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public VoortgangHtmlConfig getVoortgangHtmlConfig() {
		return voortgangHtmlConfig;
	}

	public void setVoortgangHtmlConfig(VoortgangHtmlConfig voortgangHtmlConfig) {
		this.voortgangHtmlConfig = voortgangHtmlConfig;
	}

	public SamenvoegenHtmlConfig getSamenvoegenHtmlConfig() {
		return samenvoegenHtmlConfig;
	}

	public void setSamenvoegenHtmlConfig(SamenvoegenHtmlConfig samenvoegenHtmlConfig) {
		this.samenvoegenHtmlConfig = samenvoegenHtmlConfig;
	}

	public SamenvoegenPdfConfig getSamenvoegenPdfConfig() {
		return samenvoegenPdfConfig;
	}

	public void setSamenvoegenPdfConfig(SamenvoegenPdfConfig samenvoegenPdfConfig) {
		this.samenvoegenPdfConfig = samenvoegenPdfConfig;
	}

	public VoortgangPdfConfig getVoortgangPdfConfig() {
		return voortgangPdfConfig;
	}

	public void setVoortgangPdfConfig(VoortgangPdfConfig voortgangPdfConfig) {
		this.voortgangPdfConfig = voortgangPdfConfig;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}
}
