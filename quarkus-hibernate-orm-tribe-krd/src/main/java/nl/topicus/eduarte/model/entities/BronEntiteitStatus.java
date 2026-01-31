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
package nl.topicus.eduarte.model.entities;

public enum BronEntiteitStatus
{
	/**
	 * Entiteit is nooit aan BRON aangeleverd geweest.
	 */
	Geen,
	/**
	 * Een melding klaar staat om in een batch te worden opgenomen. Wanneer de melding
	 * wordt afgekeurd, staat de entiteit niet in BRON.
	 */
	Wachtrij,
	/**
	 * Een melding klaar staat om in een batch te worden opgenomen.Wanneer de melding
	 * wordt afgekeurd, staat de entiteit echter nog wel in BRON.
	 */
	WachtrijWelInBron,
	/**
	 * Entiteit is voor de eerste keer onderweg naar BRON. Wanneer de melding wordt
	 * afgekeurd, staat de entiteit niet in BRON.
	 */
	InBehandeling,
	/**
	 * Aanpassing op de entiteit is onderweg naar BRON. Wanneer de melding wordt
	 * afgekeurd, staat de entiteit echter nog wel in BRON.
	 */
	InBehandelingWelInBron,
	/**
	 * Entiteit staat correct in BRON.
	 */
	Goedgekeurd,
	/**
	 * Entiteit is afgekeurd en staat niet in BRON.
	 */
	Afgekeurd,
	/**
	 * Laatste aanpassing op de entiteit is afgekeurd, maar entiteit staat wel in BRON.
	 */
	AfgekeurdWelInBron;
}