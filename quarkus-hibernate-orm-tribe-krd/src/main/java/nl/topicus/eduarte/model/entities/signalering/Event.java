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
package nl.topicus.eduarte.model.entities.signalering;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Lob;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;
import nl.topicus.eduarte.model.entities.security.authentication.Account;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Event extends InstellingEntiteit
{
	@Column(length = 200)
	private String onderwerp;

	@Lob
	private String omschrijving;

	/**
	 * Wordt gebruikt om te bepalen of een event al eerder is opgetreden.
	 */
	@Column(length = 100)
	private String hash;

	public Event()
	{
	}

	public String getOnderwerp()
	{
		return onderwerp;
	}

	public void setOnderwerp(String onderwerp)
	{
		this.onderwerp = onderwerp;
	}

	public String getOmschrijving()
	{
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving)
	{
		this.omschrijving = omschrijving;
	}

	public String getHash()
	{
		return hash;
	}

	public void setHash(String hash)
	{
		this.hash = hash;
	}

	/**
	 * Return true als het event niet opgeslagen hoeft te worden in de database als er
	 * geen ontvangers zijn. Dit kan nuttig zijn voor events waarvoor het niet mogelijk
	 * dat het event meerdere malen optreed (bijv bij het aanmaken van een object, of
	 * events die dagelijks optreden).
	 */
	public abstract boolean discardWhenNoReceivers();

	/**
	 * Berekend een unieke string uit de properties van het event. Deze string wordt
	 * gebruikt om te bepalen of het event al eerder is opgetreden. Geef null terug al het
	 * event altijd als uniek beschouwd moet worden.
	 */
	public abstract String berekenHash();

	/**
	 * Geeft aan of het toegestaan is de gegeven account het event te laten ontvangen.
	 * Standaard geeft dit true terug, maar subclasses kunnen dit gedrag overschrijven.
	 * 
	 * @param account
	 */
	public boolean isEventAllowed(Account account)
	{
		return true;
	}

	public Deelnemer getDeelnemer()
	{
		return null;
	}
}
