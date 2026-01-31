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
package nl.topicus.eduarte.model.entities.dbs.incident;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Lob;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Bevat de private en public key voor communicatie met de IRIS+ webservice
 *
 */
@Entity
public class IrisKoppelingKey extends InstellingEntiteit
{
	@Lob
	@Column(nullable = false)
	private byte[] privateKeyInBytes;

	@Lob
	@Column(nullable = false)
	private byte[] publicKeyInBytes;

	public byte[] getPrivateKeyInBytes() {
		return privateKeyInBytes;
	}

	public void setPrivateKeyInBytes(byte[] privateKeyInBytes) {
		this.privateKeyInBytes = privateKeyInBytes;
	}

	public byte[] getPublicKeyInBytes() {
		return publicKeyInBytes;
	}

	public void setPublicKeyInBytes(byte[] publicKeyInBytes) {
		this.publicKeyInBytes = publicKeyInBytes;
	}
}
