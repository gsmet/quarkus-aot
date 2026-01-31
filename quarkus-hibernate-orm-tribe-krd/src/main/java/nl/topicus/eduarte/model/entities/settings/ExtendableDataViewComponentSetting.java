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
package nl.topicus.eduarte.model.entities.settings;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEntiteit;
import nl.topicus.eduarte.model.entities.security.authentication.Account;

/**
 */
@Entity()
@Table(name = "edvcs", uniqueConstraints = { @UniqueConstraint(columnNames = { "account", "panelId", "headerId" }) })
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class ExtendableDataViewComponentSetting extends OrganisatieEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account", nullable = false)
	private Account account;

	@Column(nullable = false, length = 512)
	private String panelId;

	@Column(nullable = false, length = 256)
	private String headerId;

	@Column(nullable = false)
	private int position;

	@Column(nullable = false)
	private boolean visible;

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getPanelId() {
		return panelId;
	}

	public void setPanelId(String panelId) {
		this.panelId = panelId;
	}

	public String getHeaderId() {
		return headerId;
	}

	public void setHeaderId(String headerId) {
		this.headerId = headerId;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	public boolean isVisible() {
		return visible;
	}

	public void setVisible(boolean visible) {
		this.visible = visible;
	}
}
