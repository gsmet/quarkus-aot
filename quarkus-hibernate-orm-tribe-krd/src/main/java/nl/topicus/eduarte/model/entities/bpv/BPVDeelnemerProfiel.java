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

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity
public class BPVDeelnemerProfiel extends InstellingEntiteit
{

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvDeelnemerProfiel")
	private List<BPVCriteriaBPVDeelnemerProfiel> bpvCriteria =
		new ArrayList<BPVCriteriaBPVDeelnemerProfiel>();

	public void setBpvCriteria(List<BPVCriteriaBPVDeelnemerProfiel> bpvCriteria)
	{
		this.bpvCriteria = bpvCriteria;
	}

	public List<BPVCriteriaBPVDeelnemerProfiel> getBpvCriteria()
	{
		return bpvCriteria;
	}
}
