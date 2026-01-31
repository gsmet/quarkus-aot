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
package nl.topicus.eduarte.model.entities.hogeronderwijs;

public enum DeficientieStatus {
	DefInst("D", "Deficiënt volgens instelling"), DefIB("J", "Deficiënt volgens IB-Groep"),
	NogNietBep("N", "Nog niet bepaald"), Sufficiënt("S", "Sufficiënt"),
	NietDefIB("T", "Niet Deficiënt volgens IB-Groep"), VoorlNietDefIB("V", "Voorlopig niet deficiënt volgens IB-Groep"),
	VoorlNietDefInst("W", "Voorlopig niet deficiënt volgens Instelling");

	private String veldKey;

	private String veldValue;

	private String omschrijving;

	DeficientieStatus(String veldValue) {
		this.veldValue = veldValue;
		this.omschrijving = veldValue;
	}

	DeficientieStatus(String veldValue, String omschrijving) {
		this.veldValue = veldValue;
		this.omschrijving = omschrijving;
	}

	public String getVeldKey() {
		return veldKey;
	}

	public String getVeldValue() {
		return veldValue;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	@Override
	public String toString() {
		return omschrijving;
	}

	public Boolean isOK() {
		return this.equals(Sufficiënt);
	}
}
