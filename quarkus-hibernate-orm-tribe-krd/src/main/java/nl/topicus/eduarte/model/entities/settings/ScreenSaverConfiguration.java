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

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;

import org.hibernate.annotations.Comment;

@Embeddable
public class ScreenSaverConfiguration implements Serializable {
	@Column(nullable = true)
	private boolean actief;

	@Column(name = "timeout", nullable = true)
	private Integer timeout = 0;

	@Column(name = "sessietimeout", nullable = true)
	@Comment("Het aantal minuten waarna de gebruiker uitgelogd wordt, als de screensaver actief is.")
	private Integer sessieTimeout = 0;

	public ScreenSaverConfiguration() {
	}

	public boolean isActief() {
		return actief;
	}

	public void setActief(boolean actief) {
		this.actief = actief;
	}

	public void setTimeout(Integer timeout) {
		this.timeout = timeout;
	}

	public Integer getTimeout() {
		return timeout;
	}

	public void setSessieTimeout(Integer sessieTimeout) {
		this.sessieTimeout = sessieTimeout;
	}

	public Integer getSessieTimeout() {
		return sessieTimeout;
	}
}
