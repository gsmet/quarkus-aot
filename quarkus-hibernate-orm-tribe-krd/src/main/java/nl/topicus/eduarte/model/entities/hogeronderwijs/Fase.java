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
package nl.topicus.eduarte.model.entities.hogeronderwijs;

import jakarta.persistence.*;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefLandelijkOfInstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
	"organisatie"})})
public class Fase extends CodeNaamActiefLandelijkOfInstellingEntiteit
{
	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private Hoofdfase hoofdfase;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "volgendeFase", nullable = true)
	private Fase volgendeFase;

	public Hoofdfase getHoofdfase()
	{
		return hoofdfase;
	}

	public void setHoofdfase(Hoofdfase hoofdfase)
	{
		this.hoofdfase = hoofdfase;
	}

	public Fase getVolgendeFase()
	{
		return volgendeFase;
	}

	public void setVolgendeFase(Fase volgendeFase)
	{
		this.volgendeFase = volgendeFase;
	}
}
