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
package nl.topicus.eduarte.model.entities.landelijk;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.ICodeNaamEntiteit;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkEntiteit;

/**
 * Landentabel uit de basisadministratie Persoonsgegevens en Reisdocumenten van
 * het Ministerie van Binnenlandse Zaken en Koninkrijksrelaties. Dit betreft
 * tabel 34 van het GBA te vinden op <a href=
 * "http://www.bprbzk.nl/GBA/Informatiebank/Procedures/Landelijke_tabellen/Landelijke_Tabellen_32_t_m_56_excl_35"
 * >bprbzk.nl</a>
 *
 */
@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@IsViewWhenOnNoise
public class Land extends BeginEinddatumLandelijkEntiteit implements ICodeNaamEntiteit {
	public static final String CODE_NEDERLAND = "6030";

	public static final String CODE_BELGIE = "5010";

	public static final String CODE_LUXEMBURG = "6018";

	public static final String CODE_DUITSLAND = "9089";

	@Column(length = 4, nullable = false)
	private String code;

	@Column(length = 100, nullable = false)
	private String naam;

	@Column(length = 2, nullable = true)
	private String isoCode;

	@Override
	public String getCode() {
		return code;
	}

	@Override
	public void setCode(String code) {
		this.code = code;
	}

	@Override
	public String getNaam() {
		return naam;
	}

	@Override
	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getIsoCode() {
		return isoCode;
	}

	public void setIsoCode(String isoCode) {
		this.isoCode = isoCode;
	}
}
