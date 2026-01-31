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
package nl.topicus.eduarte.model.entities.participatie;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import nl.topicus.eduarte.model.entities.participatie.enums.ExterneAgendaConnection;

@Entity
public class GoogleCalendarKoppeling extends ExterneAgendaKoppeling {
	@Column(length = 100, nullable = true)
	@Basic(optional = false)
	private String applicationName;

	@Column(length = 200, nullable = true)
	@Basic(optional = false)
	private String metafeedURLBase;

	@Column(length = 50, nullable = true)
	@Basic(optional = false)
	private String eventFeedURLSuffix;

	public GoogleCalendarKoppeling() {
	}

	/**
	 * @return Returns the applicationName.
	 */
	public String getApplicationName() {
		return applicationName;
	}

	/**
	 * @param applicationName The applicationName to set.
	 */
	public void setApplicationName(String applicationName) {
		this.applicationName = applicationName;
	}

	/**
	 * @return Returns the metafeedURLBase.
	 */
	public String getMetafeedURLBase() {
		return metafeedURLBase;
	}

	/**
	 * @param metafeedURLBase The metafeedURLBase to set.
	 */
	public void setMetafeedURLBase(String metafeedURLBase) {
		this.metafeedURLBase = metafeedURLBase;
	}

	/**
	 * @return Returns the eventFeedURLSuffix.
	 */
	public String getEventFeedURLSuffix() {
		return eventFeedURLSuffix;
	}

	/**
	 * @param eventFeedURLSuffix The eventFeedURLSuffix to set.
	 */
	public void setEventFeedURLSuffix(String eventFeedURLSuffix) {
		this.eventFeedURLSuffix = eventFeedURLSuffix;
	}

	@Override
	public ExterneAgendaConnection connect(ExterneAgenda agenda) throws ExterneAgendaException {
		return null;
	}

	@Override
	public String getBeschrijving() {
		return null;
	}
}
