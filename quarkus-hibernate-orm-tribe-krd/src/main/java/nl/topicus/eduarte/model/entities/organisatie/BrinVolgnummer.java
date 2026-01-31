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
package nl.topicus.eduarte.model.entities.organisatie;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

@Embeddable
public class BrinVolgnummer implements Serializable {
	@Column(nullable = true, length = 2)
	private String brincodeToevoeging;

	public BrinVolgnummer() {

	}

	public BrinVolgnummer(String brincodeToevoeging) {
		setBrincodeToevoeging(brincodeToevoeging);
	}

	public String getBrincodeToevoeging() {
		return brincodeToevoeging;
	}

	public void setBrincodeToevoeging(String brincodeToevoeging) {
		this.brincodeToevoeging = brincodeToevoeging;
	}
}
