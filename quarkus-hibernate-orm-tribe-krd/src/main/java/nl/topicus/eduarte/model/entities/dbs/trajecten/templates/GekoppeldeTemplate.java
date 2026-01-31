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
package nl.topicus.eduarte.model.entities.dbs.trajecten.templates;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.ForeignKey;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.entities.security.authorization.Rol;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class GekoppeldeTemplate extends InstellingEntiteit {
	public enum KoppelingsRol {
		UITVOERENDE,
		VERANTWOORDELIJKE
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private KoppelingsRol koppelingsRol;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private UitvoerendeType type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "medewerker", nullable = true, foreignKey = @ForeignKey(name = "FK_UitvoerTempl_medewerker"))
	private Medewerker medewerker;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "rol", nullable = true, foreignKey = @ForeignKey(name = "FK_UitvoerTempl_rol"))
	private Rol rol;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "trajectTemplate", nullable = false, foreignKey = @ForeignKey(name = "FK_UitvoerTempl_templ"))
	private TrajectTemplate trajectTemplate;

	public KoppelingsRol getKoppelingsRol() {
		return koppelingsRol;
	}

	public void setKoppelingsRol(KoppelingsRol koppelingsRol) {
		this.koppelingsRol = koppelingsRol;
	}

	public UitvoerendeType getType() {
		return type;
	}

	public void setType(UitvoerendeType type) {
		this.type = type;
	}

	public Medewerker getMedewerker() {
		return medewerker;
	}

	public void setMedewerker(Medewerker medewerker) {
		this.medewerker = medewerker;
	}

	public Rol getRol() {
		return rol;
	}

	public void setRol(Rol rol) {
		this.rol = rol;
	}

	public TrajectTemplate getTrajectTemplate() {
		return trajectTemplate;
	}

	public void setTrajectTemplate(TrajectTemplate trajectTemplate) {
		this.trajectTemplate = trajectTemplate;
	}

}
