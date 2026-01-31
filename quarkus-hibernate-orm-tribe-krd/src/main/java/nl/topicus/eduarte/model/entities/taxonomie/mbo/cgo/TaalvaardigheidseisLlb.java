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
package nl.topicus.eduarte.model.entities.taxonomie.mbo.cgo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import nl.topicus.eduarte.model.entities.taxonomie.MBONiveau;

/**
 */
@Entity
public class TaalvaardigheidseisLlb extends Taalvaardigheidseis {
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private MBONiveau mboNiveau;

	public MBONiveau getMboNiveau() {
		return mboNiveau;
	}

	public void setMboNiveau(MBONiveau mboNiveau) {
		this.mboNiveau = mboNiveau;
	}
}
