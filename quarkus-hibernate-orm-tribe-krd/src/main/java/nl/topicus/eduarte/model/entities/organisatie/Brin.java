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
package nl.topicus.eduarte.model.entities.organisatie;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

@Entity()
public class Brin extends ExterneOrganisatie {
	public static final String BRIN_FORMAT = "([0-9]{2}[a-zA-Z0-9]{2})([0-9]{1,2})?";

	public enum Onderwijssector {
		AK("Administratiekantoor", false), AMB("Ambulante Begeleiding"), AOC("Agrarisch Opleidings Centrum"),
		AOCV("AOC met vo onderwijs"), BAS("Basisschool"), BBAS("Buitenlandse basisschool"), BGRE("Bestuur REC", false),
		BGCD("Bestuur Centrale Dienst", false), BGCA("Bestuur t.b.v. Derden (CASO)", false),
		BGTC("Bestuur Technocentrum", false), BINS("Bestuur Van Instelling", false), BSM("BSM t.b.v. Inspectie", false),
		BVOS("Buitenlandse VO-school"), CASO("t.b.v. Derden (CASO)", false), CDPO("Centrale Dienst PO", false),
		DOV("Doveninstituut"), EDU("Educatief Centrum"), EDUV("Educatief Centrum + VO"), ERK("Erkende Instelling"),
		EXA("Examen Instelling BVE"), FAC("Faculteit", false), GJI("Gesloten Jeugdzorg Inrichting"),
		HAS("Hogere Agrarische instelling"), HBOS("Hogeschool"), ILOC("Inspectie Locatie"),
		ISWV("Inspectie Samenwerkingsverband", false), IBR("Instelling Bepaalde Richting"),
		IEB("Instelling Met Breedtegebrek"), JJI("Justitiele Jeugd Inrichting"), LOB("Kenniscentrum BVE", false),
		LAOV("Lagere Overheid", false), LOA("Landelijk Ondersteuning Act.", false), LOC("Locatie"),
		NAUT("Nautisch Onderwijs"), PROS("PRO-school"), REC("Regionaal Expertise Centrum", false),
		REFR("Inst. t.b.v. FRE's", false), // dit zijn de REC's
		RGN("Regionaal Netwerk", false), RGNE("Regionaal Netwerk Experimenten", false),
		RGNS("Startkwalificatie RGN", false), ROC("Regionaal Opleidings Centrum"), ROCV("Verticale School"),
		RVC("Regionale Verwijzings Commissie", false), RVT("Raad van Toezicht", false), SGM("Scholengemeenschap"),
		SWOP("Samenwerkingsovereenkomst PO", false), SWPO("Samenwerkingsverband PO", false),
		SBD("Schoolbegeleidingsdienst", false), SBAS("Speciaal Basisonderwijs"), SPEC("Speciale School"),
		SWVO("Samenwerkingsverband VO", false), TEC("Technocentrum", false), TVST("Tijdelijke Vestiging"),
		TOE("Toezichthouder", false), UNIV("Universiteit"), VAK("Vakschool"), VAKV("Vakschool met VO Vestigingen"),
		VOS("VO-school"), VST("Vestiging"), VSTS("Vestiging Spreidingsnoodzaak"), VSTZ("Vestiging Zorg");

		private final String omschrijving;

		private final boolean school;

		Onderwijssector(String omschrijving) {
			this(omschrijving, true);
		}

		Onderwijssector(String omschrijving, boolean school) {
			this.omschrijving = omschrijving;
			this.school = school;
		}

		public String getOmschrijving() {
			return omschrijving;
		}

		@Override
		public String toString() {
			return getOmschrijving();
		}

		public boolean isBasisonderwijs() {
			return equals(BAS) || equals(SBAS) || equals(BBAS);
		}

		public boolean isSchool() {
			return school;
		}
	}

	// nulllable vanwege opslaan in zelfde tabel als superclass
	@Column(nullable = true, length = 6)
	private String code;

	@Column(nullable = true)
	@Enumerated(value = EnumType.STRING)
	private Onderwijssector onderwijssector;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Onderwijssector getOnderwijssector() {
		return onderwijssector;
	}

	public void setOnderwijssector(Onderwijssector onderwijssector) {
		this.onderwijssector = onderwijssector;
	}
}