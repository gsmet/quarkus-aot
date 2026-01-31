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
package nl.topicus.eduarte.model.entities.bpv;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import nl.topicus.eduarte.model.entities.bpv.BPVCriteria.BPVCriteriaStatus;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;


@Entity
public class BPVCriteriaBPVPlaats extends InstellingEntiteit
{

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvPlaats", nullable = false)
	private BPVPlaats bpvPlaats;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvCriteria", nullable = false)
	private BPVCriteria bpvCriteria;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private BPVCriteriaStatus status;

	public BPVCriteriaBPVPlaats()
	{
	}

	public BPVCriteriaBPVPlaats(BPVPlaats bpvPlaats)
	{
		this.bpvPlaats = bpvPlaats;
	}

	public void setBpvPlaats(BPVPlaats bpvPlaats)
	{
		this.bpvPlaats = bpvPlaats;
	}

	public BPVPlaats getBpvPlaats()
	{
		return bpvPlaats;
	}

	public void setStatus(BPVCriteriaStatus status)
	{
		this.status = status;
	}

	public BPVCriteriaStatus getStatus()
	{
		return status;
	}

	public void setBpvCriteria(BPVCriteria bpvCriteria)
	{
		this.bpvCriteria = bpvCriteria;
	}

	public BPVCriteria getBpvCriteria()
	{
		return bpvCriteria;
	}

	@Override
	public String toString()
	{
		return bpvCriteria.getNaam();
	}

}