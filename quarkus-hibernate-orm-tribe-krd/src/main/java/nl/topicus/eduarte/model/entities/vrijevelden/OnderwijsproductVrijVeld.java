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
package nl.topicus.eduarte.model.entities.vrijevelden;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;

/**
 */
@Entity()
public class OnderwijsproductVrijVeld extends VrijVeldEntiteit
{
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "onderwijsproduct", nullable = true)
	private Onderwijsproduct onderwijsproduct;

	public OnderwijsproductVrijVeld()
	{
	}

	public Onderwijsproduct getOnderwijsproduct()
	{
		return onderwijsproduct;
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct)
	{
		this.onderwijsproduct = onderwijsproduct;
	}

	@Override
	public VrijVeldable< ? extends VrijVeldEntiteit> getEntiteit()
	{
		return getOnderwijsproduct();
	}

	@Override
	public void setEntiteit(VrijVeldable< ? extends VrijVeldEntiteit> entiteit)
	{
		setOnderwijsproduct((Onderwijsproduct) entiteit);
	}
}
