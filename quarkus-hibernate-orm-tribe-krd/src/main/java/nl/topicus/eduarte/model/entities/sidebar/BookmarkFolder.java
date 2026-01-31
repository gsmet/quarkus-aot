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
package nl.topicus.eduarte.model.entities.sidebar;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEntiteit;
import nl.topicus.eduarte.model.entities.security.authentication.Account;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class BookmarkFolder extends OrganisatieEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account", nullable = false)
	private Account account;

	@Column(length = 60, nullable = false)
	private String naam;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookmarkFolder")
	private List<Bookmark> bookmarks;

	@Column(nullable = false)
	private int volgorde = -1;

	public BookmarkFolder() {
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public String getNaam() {
		return naam;
	}

	public void setBookmarks(List<Bookmark> bookmarks) {
		this.bookmarks = bookmarks;
	}

	public List<Bookmark> getBookmarks() {
		return bookmarks;
	}

	public void setVolgorde(int volgorde) {
		this.volgorde = volgorde;
	}

	public int getVolgorde() {
		return volgorde;
	}
}
