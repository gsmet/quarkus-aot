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
package nl.topicus.eduarte.model.entities.personen;

import jakarta.xml.bind.annotation.XmlEnum;
import jakarta.xml.bind.annotation.XmlEnumValue;
import jakarta.xml.bind.annotation.XmlType;

@XmlType(name = "Burgelijkestaat")
@XmlEnum(String.class)
public enum BurgerlijkeStaat {
	@XmlEnumValue("gehuwd")
	GEHUWD {
		@Override
		public boolean isGehuwd() {
			return true;
		}

		@Override
		public String toString() {
			return "Gehuwd";
		}

	},
	@XmlEnumValue("geregistreerd partnerschap")
	GEREGISTREERDPARTNERSCHAP {
		@Override
		public boolean isGeregistreerdPartnerschap() {
			return true;
		}

		@Override
		public String toString() {
			return "Geregistreerd partnerschap";
		}
	},
	@XmlEnumValue("gescheiden")
	GESCHEIDEN {
		@Override
		public boolean isGescheiden() {
			return true;
		}

		@Override
		public String toString() {
			return "Gescheiden";

		}
	},
	@XmlEnumValue("ongehuwd")
	ONGEHUWD {
		@Override
		public boolean isOngehuwd() {
			return true;
		}

		@Override
		public String toString() {
			return "Ongehuwd";
		}
	},
	@XmlEnumValue("ontbonden geregistreerd partnerschap")
	ONTBONDENGEREGISTREERDPARTNERSCHAP {
		@Override
		public boolean isOntbondenGeregistreerdPartnerschap() {
			return true;
		}

		@Override
		public String toString() {
			return "Ontbonden geregistreerd partnerschap";
		}
	},
	@XmlEnumValue("weduwe/weduwnaar")
	WEDUWE_WEDUWNAAR {
		@Override
		public boolean isWeduweOfWeduwnaar() {
			return true;
		}

		@Override
		public String toString() {
			return "Weduwe/Weduwnaar";
		}
	};

	public boolean isGehuwd() {
		return false;
	}

	public boolean isGeregistreerdPartnerschap() {
		return false;
	}

	public boolean isGescheiden() {
		return false;
	}

	public boolean isOngehuwd() {
		return false;
	}

	public boolean isOntbondenGeregistreerdPartnerschap() {
		return false;
	}

	public boolean isWeduweOfWeduwnaar() {
		return false;
	}
}
