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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public enum BegeleidingsHandelingsStatussoort {
	Inplannen, Uitvoeren, Bespreken, Voltooid {
		@Override
		public boolean isEindStatus() {
			return true;
		}
	},
	Geannuleerd {
		@Override
		public boolean isEindStatus() {
			return true;
		}
	};

	public boolean isEindStatus() {
		return false;
	}

	private static final List<BegeleidingsHandelingsStatussoort> EINDSTATUSSEN = new ArrayList<>(
			2);

	private static final List<BegeleidingsHandelingsStatussoort> EINDSTATUSSEN_UNMODIFIABLE = Collections
			.unmodifiableList(EINDSTATUSSEN);

	static {
		for (BegeleidingsHandelingsStatussoort status : BegeleidingsHandelingsStatussoort.values()) {
			if (status.isEindStatus()) {
				EINDSTATUSSEN.add(status);
			}
		}
	}

	/**
	 * @return Alle eindstatussen
	 */
	public static List<BegeleidingsHandelingsStatussoort> getEindStatussen() {
		return EINDSTATUSSEN_UNMODIFIABLE;
	}
}
