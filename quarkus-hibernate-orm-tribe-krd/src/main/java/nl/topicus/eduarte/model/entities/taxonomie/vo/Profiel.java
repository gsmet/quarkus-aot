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
package nl.topicus.eduarte.model.entities.taxonomie.vo;

/**
 * Profiel in de bovenbouw havo/vwo
 *
 */
public enum Profiel {
	NT("Natuur en Techniek"), NG("Natuur en Gezondheid"), EM("Economie en Maatschappij"), CM("Cultuur en Maatschappij"),
	NTNG(NT, NG), NTEM(NT, EM), NTCM(NT, CM), NGEM(NG, EM), NGCM(NG, CM), EMCM(EM, CM);

	private final String naam;

	private final Profiel profiel1;

	private final Profiel profiel2;

	Profiel(String naam) {
		this.naam = naam;
		profiel1 = null;
		profiel2 = null;
	}

	Profiel(Profiel profiel1, Profiel profiel2) {
		this.naam = profiel1.naam + " / " + profiel2.naam;
		this.profiel1 = profiel1;
		this.profiel2 = profiel2;
	}

	/**
	 * @return Returns the naam.
	 */
	public String getNaam() {
		return naam;
	}

	/**
	 * @return Returns the profiel1.
	 */
	public Profiel getProfiel1() {
		return profiel1;
	}

	/**
	 * @return Returns the profiel2.
	 */
	public Profiel getProfiel2() {
		return profiel2;
	}

}
