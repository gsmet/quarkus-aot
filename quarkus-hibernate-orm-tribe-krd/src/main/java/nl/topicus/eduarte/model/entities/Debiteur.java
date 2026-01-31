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

import java.util.Date;

import nl.topicus.eduarte.model.entities.adres.AdresEntiteit;
import nl.topicus.eduarte.model.entities.personen.ExterneOrganisatieContactPersoon;

/**
 * Generieke facade voor een debiteur. Zal in de praktijk een persoon of een externe
 * organisatie zijn.
 * 
 */
public interface Debiteur 
{
	/**
	 * @return Het unieke debiteurnummer van deze debiteur
	 */
	public Long getDebiteurennummer();

	/**
	 * @param debiteurennummer
	 *            Het unieke debiteurnummer van deze debiteur
	 */
	public void setDebiteurennummer(Long debiteurennummer);

	/**
	 * @return Datum van de laatste export. Indien deze kleiner is dan de mutatiedatum,
	 *         dan moet deze debiteur de volgende keer geexporteerd worden.
	 */
	public Date getLaatsteExportDatum();

	/**
	 * @param laatsteExportDatum
	 *            Datum van de laatste export
	 */
	public void setLaatsteExportDatum(Date laatsteExportDatum);

	public Date getLastModifiedAt();

	public String getBankrekeningnummer();

	public String getBankrekeningGiro();

	public String getBankrekeningBank();

	public String getBankrekeningTenaamstelling();

	public void setBankrekeningnummer(String bankrekeningnummer);

	public AdresEntiteit< ? > getPostAdres();

	public AdresEntiteit< ? > getFysiekAdres();

	public AdresEntiteit< ? > getFactuurAdres();

	public IContactgegevenEntiteit getEersteTelefoon();

	public IContactgegevenEntiteit getEersteEmailAdres();

	public String getFormeleNaam();

	public AutomatischeIncasso getAutomatischeIncasso();

	public Date getAutomatischeIncassoEinddatum();

	public String getContactpersoon();

	public char getBetaalwijze();

	public boolean isVerzamelfacturen();

	public Integer getBetalingstermijn();

	public void setBetalingstermijn(Integer betalingstermijn);

	public ExterneOrganisatieContactPersoon getContactpersoonMetRol(String rol);

	public Betaalwijze getFactuurBetaalwijze();
}
