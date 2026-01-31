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
package nl.topicus.eduarte.model.entities.inschrijving;

public enum VrijstellingType {
	/**
	 * Het onderwijsproduct is gewoon afgenomen en is dus geen vrijstelling.
	 */
	Geen("", ""),
	/**
	 * Voor het onderwijsproduct is een vrijstelling afgegeven wegens een
	 * Eerder/Elders Behaalde Competentie/Kwalificatie. Het onderwijsproduct is per
	 * definitie behaald en de deelnemer/student krijgt eventuele bijbehorende
	 * credits.
	 */
	EVC("vr", "vrijstelling"),
	/**
	 * Alleen voor het HO. Het onderwijsproduct hoeft niet te worden gedaan, maar
	 * wordt vervangen door een ander onderwijsproduct. Het onderwijsproduct is
	 * weliswaar behaald (de student kan er niet op zakken qua criteria), maar de
	 * student krijgt er geen credits voor.
	 */
	Vervallen("XX", "vervallen");

	private String afkorting;

	private String omschrijving;

	public boolean isVrijstelling() {
		return this != Geen;
	}

	public boolean tellenCreditsMee() {
		return this != Vervallen;
	}

	public static VrijstellingType[] valuesBVE() {
		return new VrijstellingType[] { Geen, EVC };
	}

	public static VrijstellingType[] valuesHO() {
		return values();
	}

	public String getAfkorting() {
		return afkorting;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	VrijstellingType(String afkorting, String omschrijving) {
		this.afkorting = afkorting;
		this.omschrijving = omschrijving;
	}
}
