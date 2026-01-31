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
package nl.topicus.eduarte.model.entities.landelijk;

import java.util.Calendar;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumLandelijkEntiteit;

/**
 * Cohort wordt gebruikt voor versionering van elementen zoals
 * resultaatstructuren, productregels en formules. Een verbintenis is altijd
 * gekoppeld aan een cohort zodat bepaald kan worden welke regels voor de
 * deelnemer gelden. De begin- en einddatum van een cohort komen overeen met de
 * begin- en einddatum van het (begin)schooljaar van het cohort, dus
 * bijvoorbeeld 01-08-2008 t/m 31-07-2009.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Landelijk")
@BatchSize(size = 100)
public class Cohort extends BeginEinddatumLandelijkEntiteit {
	public static final int BEGIN_MONTH = Calendar.AUGUST;

	public static final int BEGIN_DAY = 1;

	public static final int END_MONTH = Calendar.JULY;

	public static final int END_DAY = 31;

	/** De naam van het cohort in het formaat '2008/2009' */
	@Column(nullable = false, length = 20)
	private String naam;

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}
}
