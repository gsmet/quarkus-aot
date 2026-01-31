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
package nl.topicus.eduarte.model.entities.vrijevelden;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public enum VrijVeldCategorie {
	DEELNEMERPERSONALIA {
		@Override
		public String toString() {
			return "Deelnemerpersonalia";
		}
	},
	INTAKE {
		@Override
		public String toString() {
			return "Intakegesprek";
		}
	},
	VOOROPLEIDING {
		@Override
		public String toString() {
			return "Vooropleiding";
		}
	},
	VERBINTENIS {
		@Override
		public String toString() {
			return "Verbintenis";
		}
	},
	PLAATSING {
		@Override
		public String toString() {
			return "Plaatsing";
		}
	},
	UITSCHRIJVING {
		@Override
		public String toString() {
			return "Uitschrijving";
		}
	},
	RELATIE {
		@Override
		public String toString() {
			return "Relatie";
		}
	},
	MEDEWERKERPERSONALIA {
		@Override
		public String toString() {
			return "Medewerkerpersonalia";
		}
	},
	MEDEWERKERAANSTELLING {
		@Override
		public String toString() {
			return "Medewerker-aanstelling";
		}
	},
	ONDERWIJSPRODUCT {
		@Override
		public String toString() {
			return "Onderwijsproduct";
		}
	},
	OPLEIDING {
		@Override
		public String toString() {
			return "Opleiding";
		}
	},
	EXTERNEORGANISATIE {
		@Override
		public String toString() {
			return "Externe organisatie";
		}
	},
	GROEP {
		@Override
		public String toString() {
			return "Groep";
		}
	},
	CONTRACT {
		@Override
		public String toString() {
			return "Contract";
		}
	},
	BPV_INSCHRIJVING {
		@Override
		public String toString() {
			return "BPV Inschrijving";
		}
	},
	DA_DEELNEMERPERSONALIA {
		@Override
		public String toString() {
			return "DA-Deelnemerpersonalia";
		}
	},
	DA_INTAKE {
		@Override
		public String toString() {
			return "DA-Intakegesprek";
		}
	},
	DA_VOOROPLEIDING {
		@Override
		public String toString() {
			return "DA-Vooropleiding";
		}
	},
	DA_RELATIE {
		@Override
		public String toString() {
			return "DA-Relatie";
		}
	};

	public static List<VrijVeldCategorie> getKRDCategorieeeen() {
		var categorieen = new ArrayList<>(Arrays.asList(VrijVeldCategorie.values()));
		//		if (!EduArteApp.get().isModuleActive(EduArteModuleKey.DIGITAALAANMELDEN)) {
		//			categorieen.remove(DA_DEELNEMERPERSONALIA);
		//			categorieen.remove(DA_INTAKE);
		//			categorieen.remove(DA_VOOROPLEIDING);
		//			categorieen.remove(DA_RELATIE);
		//		}
		return categorieen;
	}
}
