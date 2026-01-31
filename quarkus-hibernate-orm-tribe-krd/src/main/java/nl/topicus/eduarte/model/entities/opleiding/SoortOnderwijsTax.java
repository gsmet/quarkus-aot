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
package nl.topicus.eduarte.model.entities.opleiding;

public enum SoortOnderwijsTax {
	VWO("3.2.1"), HAVO("3.2.2"), VMBOTL("3.2.3.1"), VMBO("3.2.3.2"), VMBOKBL("3.2.4"), VMBOBBL("3.2.5");

	private String taxCode;

	SoortOnderwijsTax(String taxCode) {
		this.taxCode = taxCode;
	}

	public String getTaxCode() {
		return taxCode;
	}
}