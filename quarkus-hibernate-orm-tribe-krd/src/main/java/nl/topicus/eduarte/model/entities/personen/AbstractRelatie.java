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
package nl.topicus.eduarte.model.entities.personen;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.duo.bron.Bron;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.vrijevelden.RelatieVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@DiscriminatorColumn(name = "TYPE", discriminatorType = DiscriminatorType.STRING)
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@IsViewWhenOnNoise
public abstract class AbstractRelatie extends BeginEinddatumInstellingEntiteit
implements VrijVeldable<RelatieVrijVeld> {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "persoon", nullable = false)
	private Persoon deelnemer;

	@Column(nullable = true)
	private boolean wettelijkeVertegenwoordiger;

	@Column(nullable = true)
	private boolean betalingsplichtige;

	@Bron
	@OneToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "relatieSoort", nullable = true)
	private RelatieSoort relatieSoort;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "relatie")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<RelatieVrijVeld> vrijVelden = new ArrayList<>();

	public Persoon getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Persoon deelnemer) {
		this.deelnemer = deelnemer;
	}

	public boolean isWettelijkeVertegenwoordiger() {
		return wettelijkeVertegenwoordiger;
	}

	public void setWettelijkeVertegenwoordiger(boolean wettelijkeVertegenwoordiger) {
		this.wettelijkeVertegenwoordiger = wettelijkeVertegenwoordiger;
	}

	public boolean isBetalingsplichtige() {
		return betalingsplichtige;
	}

	public void setBetalingsplichtige(boolean betalingsplichtige) {
		this.betalingsplichtige = betalingsplichtige;
	}

	public RelatieSoort getRelatieSoort() {
		return relatieSoort;
	}

	public void setRelatieSoort(RelatieSoort relatieSoort) {
		this.relatieSoort = relatieSoort;
	}

	@Override
	public List<RelatieVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<RelatieVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	@Override
	public RelatieVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<RelatieVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}

}
