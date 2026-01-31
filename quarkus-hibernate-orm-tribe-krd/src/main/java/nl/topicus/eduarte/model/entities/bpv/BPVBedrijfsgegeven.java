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
package nl.topicus.eduarte.model.entities.bpv;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.organisatie.Brin;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Koppeltabel tussen ExterneOrganisatie en BPVGegevens.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@IsViewWhenOnNoise
public class BPVBedrijfsgegeven extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = false)
	private ExterneOrganisatie externeOrganisatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "brin", nullable = false)
	private Brin kenniscentrum;

	@Column(nullable = true, length = 20)
	private String relatienummer;

	@Bron
	@Column(nullable = true, length = 40)
	private String codeLeerbedrijf;

	public enum BPVCodeHerkomst
	{
		Invoer,
		Systeem,
		BRON,
		COLO;
	}

	@Enumerated(EnumType.STRING)
	@Column(nullable = true)
	private BPVCodeHerkomst herkomstCode;

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public Brin getKenniscentrum() {
		return kenniscentrum;
	}

	public void setKenniscentrum(Brin kenniscentrum) {
		this.kenniscentrum = kenniscentrum;
	}

	public String getRelatienummer() {
		return relatienummer;
	}

	public void setRelatienummer(String relatienummer) {
		this.relatienummer = relatienummer;
	}

	public String getCodeLeerbedrijf() {
		return codeLeerbedrijf;
	}

	public void setCodeLeerbedrijf(String codeLeerbedrijf) {
		this.codeLeerbedrijf = codeLeerbedrijf;
	}

	public BPVCodeHerkomst getHerkomstCode() {
		return herkomstCode;
	}

	public void setHerkomstCode(BPVCodeHerkomst herkomstCode) {
		this.herkomstCode = herkomstCode;
	}
}