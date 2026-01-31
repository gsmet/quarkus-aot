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
package nl.topicus.eduarte.model.entities.signalering.settings;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity()
@DiscriminatorValue("DeadlineEventAbonnementConf")
public class DeadlineEventAbonnementConfiguration extends AbstractEventAbonnementConfiguration<Integer> {

	@Basic(optional = false)
	@Column(nullable = true, name="config_value")
	private Integer value = 10;

	public DeadlineEventAbonnementConfiguration() {
	}

	public DeadlineEventAbonnementConfiguration(Integer value) {
		setValue(value);
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Verstrijkt over " + getValue() + " dagen";
	}
}
