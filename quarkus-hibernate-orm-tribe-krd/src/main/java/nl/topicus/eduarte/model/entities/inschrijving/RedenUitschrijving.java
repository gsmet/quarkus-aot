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
package nl.topicus.eduarte.model.entities.inschrijving;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Comment;

import nl.topicus.eduarte.model.duo.bron.bve.waardelijsten.RedenUitval;
import nl.topicus.eduarte.model.entities.IsViewWhenOnNoise;
import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;

/**
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
"organisatie"})})
@IsViewWhenOnNoise
public class RedenUitschrijving extends CodeNaamActiefInstellingEntiteit
{
	@Column(nullable = false)
	@Comment("Selecteer dit wanneer het om de reden van uitschrijven mbt Verbintenis gaat en het de reden van overlijden is. Niet te wijzigingen als deze reden al aan een verbintenis of BPV inschrijving gekoppeld is.")
	private boolean overlijden;

	@Column(nullable = false)
	@Comment("Selecteer dit wanneer het om de reden van uitschrijven mbt een verbintenis gaat")
	private boolean tonenBijVerbintenis;

	@Column(nullable = false)
	@Comment("Selecteer dit wanneer het om de reden van uitschrijven mbt BPV gaat")
	private boolean tonenBijBPV;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	@Comment("Bij uitval: de hoofdcategorie van de uitvalsredenen zoals gespecificeerd door de MBO-raad. Dit wordt bij BVE-deelnemers aangeleverd aan BRON")
	private RedenUitval redenUitval;

	@Column(nullable = false)
	@Comment("Selecteer dit wanneer deze reden betekent dat het diploma is behaald.")
	private boolean geslaagd;

	public enum UitstroomredenWI
	{
		Afgerond("a", "Volledig afgeronde cursus"),
		Kinderopvang("c", "Geen passende kinderopvang"),
		Aanbod("d", "Geen passend aanbod"),
		Werk("e", "Werk (gestart tijdens cursus of uitgebreid tijdens cursus"),
		MeerStudiebelasting("f", "Meer studiebelasting is te zwaar gebleken"),
		VerwachteStudiebelasting("g", "Verwachte studiebelasting is te zwaar gebleken"),
		LangdurigZiek("h", "Langdurig ziek"),
		AndereRoute("i", "Andere route, met goedkeuring van de gemeente"),
		Vrijgesteld("j", "Vrijgesteld door gemeente"),
		Verhuizing("k", "Verhuizing buiten gebied gemeente"),
		NietVerschenen("l", "Zonder opgaaf van reden niet verschenen"),
		Zwangerschap("m", "Zwangerschap"),
		Overlijden("n", "Overlijden"),
		Overig("o", "Overig");

		private String code;

		private String omschrijving;

		UitstroomredenWI(String code, String omschrijving)
		{
			this.code = code;
			this.omschrijving = omschrijving;
		}

		@Override
		public String toString()
		{
			return code + ". " + omschrijving;
		}
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private UitstroomredenWI uitstroomredenWI;

	public boolean isOverlijden() {
		return overlijden;
	}

	public void setOverlijden(boolean overlijden) {
		this.overlijden = overlijden;
	}

	public boolean isTonenBijVerbintenis() {
		return tonenBijVerbintenis;
	}

	public void setTonenBijVerbintenis(boolean tonenBijVerbintenis) {
		this.tonenBijVerbintenis = tonenBijVerbintenis;
	}

	public boolean isTonenBijBPV() {
		return tonenBijBPV;
	}

	public void setTonenBijBPV(boolean tonenBijBPV) {
		this.tonenBijBPV = tonenBijBPV;
	}

	public RedenUitval getRedenUitval() {
		return redenUitval;
	}

	public void setRedenUitval(RedenUitval redenUitval) {
		this.redenUitval = redenUitval;
	}

	public boolean isGeslaagd() {
		return geslaagd;
	}

	public void setGeslaagd(boolean geslaagd) {
		this.geslaagd = geslaagd;
	}

	public UitstroomredenWI getUitstroomredenWI() {
		return uitstroomredenWI;
	}

	public void setUitstroomredenWI(UitstroomredenWI uitstroomredenWI) {
		this.uitstroomredenWI = uitstroomredenWI;
	}
}
