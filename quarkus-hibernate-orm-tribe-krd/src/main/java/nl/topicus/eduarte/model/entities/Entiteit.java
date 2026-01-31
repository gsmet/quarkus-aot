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
package nl.topicus.eduarte.model.entities;

import java.io.Serializable;
import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.Version;

import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import nl.topicus.eduarte.model.entities.security.authentication.Account;

@MappedSuperclass
public abstract class Entiteit implements Serializable
{
	public static final String STR_CREATED_AT = "CREATED_AT";

	public static final String STR_CREATED_BY = "CREATED_BY";

	public static final String STR_LAST_MODIFIED_AT = "LAST_MODIFIED_AT";

	public static final String STR_LAST_MODIFIED_BY = "LAST_MODIFIED_BY";

	/** unieke identifier voor de entiteit. */
	@Id()
	@GeneratedValue(generator = "hibernate_generator")
	/** generator die het doet op meerdere database omgevingen **/
	@GenericGenerator(name = "hibernate_generator", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {
			@Parameter(name = "sequence_name", value = "HIBERNATE_SEQUENCE"),
			@Parameter(name = "increment_size", value = "1"),
			@Parameter(name = "optimizer", value = "none")})
	private Long id;

	/**
	 * Boolean die aangeeft of dit object gearchiveerd is. Standaard vragen operationele
	 * queries alleen de niet-gearchiveerde gegevens op. Gegegevens moeten handmatig
	 * gearchiveerd worden door de gebruiker. Defaultwaarde is toegevoegd voor de
	 * conversie.
	 */
	@Column(nullable = false)
	private boolean gearchiveerd;

	/**
	 * Creatie datum van deze entiteit, wordt gezet door de
	 * {@link EntiteitAuditInterceptor}.
	 */
	@Column(updatable = false, name = STR_CREATED_AT)
	private Date createdAt;

	/**
	 * Creator account van deze entiteit, wordt automatisch gezet door de
	 * {@link EntiteitAuditInterceptor}.
	 */
	@Column(updatable = false, name = STR_CREATED_BY)
	private Long createdBy;

	/**
	 * Laatste modificatie datum van deze entiteit, wordt automatisch gezet door de
	 * {@link EntiteitAuditInterceptor}.
	 */
	@Column(updatable = true, name = STR_LAST_MODIFIED_AT)
	private Date lastModifiedAt;

	/**
	 * Account die deze entiteit als laatste gewijzigd heeft. Wordt automatisch gezet door
	 * de {@link EntiteitAuditInterceptor}.
	 */
	@Column(updatable = true, name = STR_LAST_MODIFIED_BY)
	private Long lastModifiedBy;

	/**
	 * versie nummer voor de entiteit, hiermee wordt bepaald of een object al door een
	 * ander gewijzigd is.
	 */
	@Version()
	private Long version;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public boolean isGearchiveerd() {
		return gearchiveerd;
	}

	public void setGearchiveerd(boolean gearchiveerd) {
		this.gearchiveerd = gearchiveerd;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Account createdBy) {
		this.createdBy = createdBy.getId();
	}

	public Date getLastModifiedAt() {
		return lastModifiedAt;
	}

	public void setLastModifiedAt(Date lastModifiedAt) {
		this.lastModifiedAt = lastModifiedAt;
	}

	public Long getLastModifiedBy() {
		return lastModifiedBy;
	}

	public void setLastModifiedBy(Account lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy.getId();
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}
}
