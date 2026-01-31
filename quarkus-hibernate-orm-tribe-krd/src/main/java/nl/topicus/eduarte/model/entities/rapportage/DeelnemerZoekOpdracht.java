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
package nl.topicus.eduarte.model.entities.rapportage;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.security.authentication.Account;
import nl.topicus.eduarte.model.entities.sidebar.IContextInfoObject;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class DeelnemerZoekOpdracht extends InstellingEntiteit implements IContextInfoObject {
	@Column(nullable = false, length = 200)
	private String omschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "account")
	private Account account;

	@Lob
	private String filter;

	private boolean kolommenVastzetten = true;

	private boolean peildatumVastzetten = true;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "zoekOpdracht")
	@BatchSize(size = 20)
	private List<DeelnemerZoekOpdrachtRecht> rechten = new ArrayList<>();

	public DeelnemerZoekOpdracht() {
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	@Override
	public String getContextInfoOmschrijving() {
		return getOmschrijving();
	}

	public List<DeelnemerZoekOpdrachtRecht> getRechten() {
		return rechten;
	}

	public void setRechten(List<DeelnemerZoekOpdrachtRecht> rechten) {
		this.rechten = rechten;
	}

	public String getFilter() {
		return filter;
	}

	public void setFilter(String filter) {
		this.filter = filter;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public boolean isPersoonlijk() {
		return account != null;
	}

	public boolean isKolommenVastzetten() {
		return kolommenVastzetten;
	}

	public void setKolommenVastzetten(boolean kolommenVastzetten) {
		this.kolommenVastzetten = kolommenVastzetten;
	}

	public boolean isPeildatumVastzetten() {
		return peildatumVastzetten;
	}

	public void setPeildatumVastzetten(boolean peildatumVastzetten) {
		this.peildatumVastzetten = peildatumVastzetten;
	}
}