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
package nl.topicus.eduarte.model.ibgverzuimloket;

public enum IbgEnums {
	;

	public enum Verzuimsoort {
		V1 {
			@Override
			public String toString() {
				return "3 schooldagen";
			}
		},
		V2 {
			@Override
			public String toString() {
				return "1/8 in 4 weken";
			}
		},
		V3 {
			@Override
			public String toString() {
				return "16 uren per 4 weken 18-";
			}
		},
		V4 {
			@Override
			public String toString() {
				return "16 uren per 4 weken 18+";
			}
		},
		RMC {
			@Override
			public String toString() {
				return "RMC verzuim 18+";
			}
		},
		L {
			@Override
			public String toString() {
				return "Luxe verzuim";
			}
		},
		LRV {
			@Override
			public String toString() {
				return "Langdurig relatief verzuim 18-";
			}
		},
		O {
			@Override
			public String toString() {
				return "Overig verzuim";
			}
		}
	}

	public enum StatusMeldingRelatiefVerzuim {
		W {
			@Override
			public String toString() {
				return "wacht op verzending";
			}
		},

		R {
			@Override
			public String toString() {
				return "geregistreerd";
			}
		},
		B {
			@Override
			public String toString() {
				return "in behandeling";
			}
		},
		G {
			@Override
			public String toString() {
				return "afgesloten";
			}
		},
		K {
			@Override
			public String toString() {
				return "ter kennisgeving aangenomen";
			}
		},
		D {
			@Override
			public String toString() {
				return "overgedragen aan derden";
			}
		},
		I {
			@Override
			public String toString() {
				return "ingetrokken";
			}
		}
	}

	public enum CCEmailontvanger {
		// vervangen door contactpersoon
		// Melder,
		Contactpersoon {
			@Override
			public String toString() {
				return "CONTACTPERSOON";
			}
		},
		Behandelaar {
			@Override
			public String toString() {
				return "BEHANDELAAR";
			}
		},
		Beide {
			@Override
			public String toString() {
				return "BEIDE";
			}
		}
	}
}
