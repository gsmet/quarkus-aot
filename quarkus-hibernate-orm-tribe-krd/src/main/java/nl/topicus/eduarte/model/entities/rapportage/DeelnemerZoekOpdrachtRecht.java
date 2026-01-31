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
package nl.topicus.eduarte.model.entities.rapportage;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.security.authorization.Rol;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class DeelnemerZoekOpdrachtRecht extends InstellingEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "rol")
	private Rol rol;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "zoekOpdracht")
	private DeelnemerZoekOpdracht zoekOpdracht;

	public DeelnemerZoekOpdrachtRecht() {
	}

	public DeelnemerZoekOpdrachtRecht(DeelnemerZoekOpdracht zoekOpdracht) {
		setZoekOpdracht(zoekOpdracht);
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public DeelnemerZoekOpdracht getZoekOpdracht() {
		return zoekOpdracht;
	}

	public void setZoekOpdracht(DeelnemerZoekOpdracht zoekOpdracht) {
		this.zoekOpdracht = zoekOpdracht;
	}
}
