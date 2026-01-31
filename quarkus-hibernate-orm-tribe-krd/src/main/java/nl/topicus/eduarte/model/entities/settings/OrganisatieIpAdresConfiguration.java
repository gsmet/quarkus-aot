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
package nl.topicus.eduarte.model.entities.settings;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import org.hibernate.annotations.Comment;

@Embeddable
public class OrganisatieIpAdresConfiguration {
	@Column(name = "ipadressen", nullable = true, length = 4000)
	@Comment("Alleen toegang toestaan (voor de hele organisatie) vanaf de hier ingevulde IP adressen. Meerdere adressen worden gescheiden door een komma. Als het adres eindigt op .0 (bijvoorbeeld 192.168.1.0) heeft de hele range 192.168.1.1 t/m 192.168.1.254 toegang.")
	private String ipAdressen;

	public String getIpAdressen() {
		return ipAdressen;
	}

	public void setIpAdressen(String ipAdressen) {
		this.ipAdressen = ipAdressen;
	}
}
