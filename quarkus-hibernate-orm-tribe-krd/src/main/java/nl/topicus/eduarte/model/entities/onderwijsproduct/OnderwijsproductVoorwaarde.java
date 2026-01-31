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
package nl.topicus.eduarte.model.entities.onderwijsproduct;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Koppeltabel tussen twee onderwijsproducten die aangeeft dat het ene onderwijsproduct
 * voorwaardelijk is voor het andere onderwijsproduct.
 * 
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {
	"voorwaardelijkProduct", "voorwaardeVoor"})})
public class OnderwijsproductVoorwaarde extends InstellingEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "voorwaardelijkProduct")
	private Onderwijsproduct voorwaardelijkProduct;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "voorwaardeVoor")
	private Onderwijsproduct voorwaardeVoor;

	public OnderwijsproductVoorwaarde()
	{
	}

	public OnderwijsproductVoorwaarde(Onderwijsproduct voorwaardelijkProduct,
			Onderwijsproduct voorwaardeVoor)
	{
		setVoorwaardelijkProduct(voorwaardelijkProduct);
		setVoorwaardeVoor(voorwaardeVoor);
	}

	public Onderwijsproduct getVoorwaardelijkProduct()
	{
		return voorwaardelijkProduct;
	}

	public void setVoorwaardelijkProduct(Onderwijsproduct voorwaardelijkProduct)
	{
		this.voorwaardelijkProduct = voorwaardelijkProduct;
	}

	public Onderwijsproduct getVoorwaardeVoor()
	{
		return voorwaardeVoor;
	}

	public void setVoorwaardeVoor(Onderwijsproduct voorwaardeVoor)
	{
		this.voorwaardeVoor = voorwaardeVoor;
	}

}
