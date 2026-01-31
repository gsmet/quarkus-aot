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
package nl.topicus.eduarte.model.entities.bijlage;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.codenaamactief.CodeNaamActiefInstellingEntiteit;
import nl.topicus.eduarte.model.entities.rapportage.DocumentTemplateRecht;

/**
 * Categorie van documenten bij deelnemers en andere entiteiten.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
"organisatie"})})
public class DocumentCategorie extends CodeNaamActiefInstellingEntiteit
{
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "documentCategorie")
	@BatchSize(size = 20)
	private List<DocumentTemplateRecht> rechten = new ArrayList<>();

	@Column(nullable = false)
	private boolean beperkAutorisatie = false;

	public DocumentCategorie()
	{
	}

	public void setRechten(List<DocumentTemplateRecht> rechten)
	{
		this.rechten = rechten;
	}

	public List<DocumentTemplateRecht> getRechten()
	{
		return rechten;
	}

	public void setBeperkAutorisatie(boolean beperkAutorisatie)
	{
		this.beperkAutorisatie = beperkAutorisatie;
	}

	public boolean isBeperkAutorisatie()
	{
		return beperkAutorisatie;
	}

}
