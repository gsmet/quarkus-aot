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
package nl.topicus.eduarte.model.entities.codenaamactief;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;

import nl.topicus.eduarte.model.entities.organisatie.LandelijkOfInstellingEntiteit;

/**
 */
@MappedSuperclass()
public abstract class CodeNaamActiefLandelijkOfInstellingEntiteit extends LandelijkOfInstellingEntiteit
implements ICodeNaamActiefEntiteit {
	@Column(length = 10, nullable = false)
	private String code;

	@Column(length = 50, nullable = false)
	private String naam;

	@Column(nullable = false)
	private boolean actief = true;

	public CodeNaamActiefLandelijkOfInstellingEntiteit() {
	}

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

	@Override
	public boolean isActief() {
		return actief;
	}

	@Override
	public void setActief(boolean actief) {
		this.actief = actief;
	}
}
