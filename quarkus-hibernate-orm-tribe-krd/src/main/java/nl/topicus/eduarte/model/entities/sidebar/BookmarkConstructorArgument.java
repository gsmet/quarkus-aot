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

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

/**
 * Argument voor een constructor van een pagina voor een bookmark.
 * 
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"bookmark",
	"volgorde"})})
public class BookmarkConstructorArgument extends InstellingEntiteit
{
	/**
	 * Volgorde van de constructor args.
	 */
	@Column(nullable = false)
	private int volgorde;

	/**
	 * Class name van het constructor argument. Het kan voorkomen dat de waarde als een
	 * ander soort object is opgeslagen dan het gedefinieerde type van het constructor
	 * argument, namelijk als de waarde een subclass is van het type van het constructor
	 * argument, of als de waarde in een IModel opgeslagen is.
	 */
	@Column(nullable = false, length = 256)
	private String className;

	/**
	 * XML-representatie van de waarde van dit argument.
	 */
	@Lob()
	private String waarde;

	/**
	 * Geeft aan of deze waarde uit de context gehaald moet worden. Mag alleen op true
	 * gezet worden als deze waarde verwijst naar een class die de interface
	 * IContextInfoObject implementeert.
	 */
	@Column(nullable = false)
	private boolean haalUitContext;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bookmark", nullable = false)
	private Bookmark bookmark;

	public BookmarkConstructorArgument()
	{
	}

	public BookmarkConstructorArgument(Bookmark bookmark)
	{
		setBookmark(bookmark);
	}

	public int getVolgorde()
	{
		return volgorde;
	}

	public void setVolgorde(int volgorde)
	{
		this.volgorde = volgorde;
	}

	public String getClassName()
	{
		return className;
	}

	public void setClassName(String className)
	{
		this.className = className;
	}

	public String getWaarde()
	{
		return waarde;
	}

	public void setWaarde(String waarde)
	{
		this.waarde = waarde;
	}

	public Bookmark getBookmark()
	{
		return bookmark;
	}

	public void setBookmark(Bookmark bookmark)
	{
		this.bookmark = bookmark;
	}

	public boolean isHaalUitContext()
	{
		return haalUitContext;
	}

	public void setHaalUitContext(boolean haalUitContext)
	{
		this.haalUitContext = haalUitContext;
	}

}
