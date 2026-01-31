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

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEntiteit;
import nl.topicus.eduarte.model.entities.security.authentication.Account;

/**
 * Bookmark in de sidebar die onder andere constructor argumenten bevat waarmee
 * een specifieke pagina in een specifieke staat opgeroepen kan worden.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class Bookmark extends OrganisatieEntiteit {
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "account", nullable = false)
	private Account account;

	@Column(length = 100, nullable = false)
	private String omschrijving;

	/**
	 * Indicatie of deze bookmark alleen getoond moet worden wanneer de gebruiker op
	 * de pagina zit waarvoor deze bookmark is, of ook op andere pagina's.
	 */
	@Column(nullable = false)
	private boolean pagePrivate;

	/**
	 * Class name van de pagina van deze bookmark
	 */
	@Column(length = 256, nullable = false)
	private String pageClass;

	public enum SoortBookmark {
		Bookmark, ToDo;
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private SoortBookmark soort;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bookmark")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@OrderBy(value = "volgorde")
	@BatchSize(size = 100)
	private List<BookmarkConstructorArgument> arguments;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookmarkFolder", nullable = true)
	private BookmarkFolder bookmarkFolder;

	public Bookmark() {
	}

	/**
	 * Maakt een nieuwe lijst met constructor arguments uit de gegeven arrays.
	 *
	 * @param types                 de constructor argument types
	 * @param values                de waarden in geserialiseerde vorm
	 * @param contextParameterTypes Alle classes waarvoor een context argument
	 *                              gemaakt moet worden
	 * @return de lijst met ctor arguments voor deze bookmark
	 */
	public List<BookmarkConstructorArgument> createBookmarkConstructorArguments(List<Class<?>> types,
			List<String> values, List<Class<? extends IContextInfoObject>> contextParameterTypes) {
		List<BookmarkConstructorArgument> res = new ArrayList<>();
		for (var index = 0; index < types.size(); index++) {
			var arg = new BookmarkConstructorArgument(this);
			arg.setClassName(types.get(index).getName());
			arg.setVolgorde(index);
			if (contextParameterTypes.contains(types.get(index))) {
				arg.setHaalUitContext(true);
			} else {
				arg.setWaarde(values.get(index));
			}
			res.add(arg);
		}
		return res;
	}

	/**
	 * @return Een array van classes die de constructor argument types voor deze
	 *         bookmark weergeven.
	 * @throws ClassNotFoundException Als een van de classes van de arguments niet
	 *                                gevonden kan worden.
	 */
	public Class<?>[] getArgumentTypes() throws ClassNotFoundException {
		var args = getArguments();
		var types = new Class<?>[args.size()];
		var index = 0;
		for (BookmarkConstructorArgument arg : args) {
			types[index] = Class.forName(arg.getClassName());
			index++;
		}
		return types;
	}

	/**
	 * @return Een array met daarin de geserialiseerde waarden van de constructor
	 *         arguments van deze bookmark.
	 */
	public String[] getArgumentValues() {
		var args = getArguments();
		var values = new String[args.size()];
		var index = 0;
		for (BookmarkConstructorArgument arg : args) {
			values[index] = arg.getWaarde();
			index++;
		}
		return values;
	}

	/**
	 * @return true als deze bookmark minimaal 1 contextgevoelig argument bevat
	 */
	public boolean containsContextArguments() {
		for (BookmarkConstructorArgument arg : getArguments()) {
			if (arg.isHaalUitContext()) {
				return true;
			}
		}
		return false;
	}

	/**
	 * @return Een lijst met alle ctor argumenten die afhankelijk van de context
	 *         zijn.
	 * @throws ClassNotFoundException
	 */
	@SuppressWarnings("unchecked")
	public List<Class<? extends IContextInfoObject>> getContextArgumentTypes() throws ClassNotFoundException {
		List<Class<? extends IContextInfoObject>> res = new ArrayList<>();
		for (BookmarkConstructorArgument arg : getArguments()) {
			if (arg.isHaalUitContext()) {
				res.add((Class<? extends IContextInfoObject>) Class.forName(arg.getClassName()));
			}
		}
		return res;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public List<BookmarkConstructorArgument> getArguments() {
		return arguments;
	}

	public void setArguments(List<BookmarkConstructorArgument> arguments) {
		this.arguments = arguments;
	}

	public String getPageClass() {
		return pageClass;
	}

	public void setPageClass(String pageClass) {
		this.pageClass = pageClass;
	}

	public boolean isPagePrivate() {
		return pagePrivate;
	}

	public void setPagePrivate(boolean pagePrivate) {
		this.pagePrivate = pagePrivate;
	}

	public void setSoort(SoortBookmark soort) {
		this.soort = soort;
	}

	public SoortBookmark getSoort() {
		return soort;
	}

	public void setBookmarkFolder(BookmarkFolder folder) {
		this.bookmarkFolder = folder;
	}

	public BookmarkFolder getBookmarkFolder() {
		return bookmarkFolder;
	}
}
