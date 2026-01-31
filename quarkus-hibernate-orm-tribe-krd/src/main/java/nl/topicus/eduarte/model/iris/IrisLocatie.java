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
package nl.topicus.eduarte.model.iris;

public enum IrisLocatie {
    HalEntree("hal/entree", 1, LocatieCategorie.Schoolgebouw),
    ConciergeruimteReceptie("conci\u00EBrgeruimte/receptie", 2, LocatieCategorie.Schoolgebouw),
    Klas("in de klas", 3, LocatieCategorie.Schoolgebouw),
    Lokaal("in studie-/werk-/praktijklokaal", 4, LocatieCategorie.Schoolgebouw),
    Aula("in de aula", 5, LocatieCategorie.Schoolgebouw),
    Gangen("op de gangen", 6, LocatieCategorie.Schoolgebouw),
    Trappen("trappen(huis)", 7, LocatieCategorie.Schoolgebouw),
    Lift("in de lift", 8, LocatieCategorie.Schoolgebouw),
    KantineOverblijfruimte("in de kantine, overblijfruimte", 9, LocatieCategorie.Schoolgebouw),
    Toiletten("op de toiletten", 10, LocatieCategorie.Schoolgebouw),
    Kluisjes("bij de kluisjes", 11, LocatieCategorie.Schoolgebouw),
    Openleercentrum("openleercentrum", 12, LocatieCategorie.Schoolgebouw),
    Bibliotheek("bibliotheek", 13, LocatieCategorie.Schoolgebouw),
    ComputerlokaalMediatheek("computerlokaal/mediatheek", 14, LocatieCategorie.Schoolgebouw),
    Administratieruimte("administratieruimte", 15, LocatieCategorie.Schoolgebouw),
    Kantoor("kantoor", 16, LocatieCategorie.Schoolgebouw),
    LerarenDocentenruimte("leraren-/docentenruimte", 17, LocatieCategorie.Schoolgebouw),
    Magazijn("magazijn", 18, LocatieCategorie.Schoolgebouw),
    Kleedkamer("kleedkamer", 19, LocatieCategorie.Schoolgebouw),
    GymSportzaal("gym-/sportzaal", 20, LocatieCategorie.Schoolgebouw),
    Schoolplein("op het schoolplein", 21, LocatieCategorie.Schoolgebouw),
    Fietsenstalling("in/bij de fietsenstalling", 22, LocatieCategorie.Schoolterrein),
    Parkeerterrein("in/bij het parkeerterrein", 23, LocatieCategorie.Schoolterrein),
    DeurenRamen("deuren/ramen", 24, LocatieCategorie.Schoolterrein),
    BuitenmurenGevels("buitenmuren/gevels", 25, LocatieCategorie.Schoolterrein),
    Dak("op het dak", 26, LocatieCategorie.Schoolterrein),
    Straat("op straat", 27, LocatieCategorie.Omgeving),
    Sportveld("op/bij sportveld", 28, LocatieCategorie.Omgeving),
    Stageplek("op stageplek/-adres", 29, LocatieCategorie.Omgeving),
    ThuisSlachtoffers("thuis bij slachtoffer(s)", 30, LocatieCategorie.Omgeving),
    ThuisDaders("thuis bij dader(s)", 31, LocatieCategorie.Omgeving),
    VanNaarSchool("van/naar school", 32, LocatieCategorie.Omgeving),
    Bus("(taxi)bus", 33, LocatieCategorie.Omgeving),
    Anders("anders(in toelichting)", 34, LocatieCategorie.Anders);

    IrisLocatie(String naam, int code, int sortOrder, LocatieCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = sortOrder;
        this.categorie = categorie.toString();
    }

    IrisLocatie(String naam, int code, LocatieCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = code;
        this.categorie = categorie.toString();
    }

    String naam;

    int code;

    int sortOrder;

    String categorie;

    public String getNaam() {
        return naam;
    }

    public int getCode() {
        return code;
    }

    public int getSortOrder() {
        return sortOrder;
    }

    public String getCategorie() {
        return categorie;
    }

    private enum LocatieCategorie {
        Schoolgebouw("binnen schoolgebouw"),
        Schoolterrein("op het schoolterrein"),
        Omgeving("omgeving van school"),
        Anders("anders");

        LocatieCategorie(String omschrijving) {
            this.omschrijving = omschrijving;
        }

        String omschrijving;

        public String getOmschrijving() {
            return omschrijving;
        }
    }
}