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

public enum IrisVoorval {

    VerbaalGeweld("verbaal geweld", 1, 1, VoorvalCategorie.direct),
    Bedreiging("bedreiging", 2, 2, VoorvalCategorie.direct),
    FysiekGeweld("fysiek geweld", 3, 3, VoorvalCategorie.direct),
    GrovePesterijen("grove pesterijen", 4, 4, VoorvalCategorie.direct),
    Pesterijen("pesterijen", 33, 5, VoorvalCategorie.direct),
    Afpersing("afpersing", 5, 6, VoorvalCategorie.direct),
    ValseBeschuldiging("valse beschuldiging", 6, 7, VoorvalCategorie.direct),
    Groepsknokpartij("groepsknokpartij", 7, 8, VoorvalCategorie.direct),
    SeksueleIntimidatie("seksuele intimidatie", 8, 9, VoorvalCategorie.direct),
    SeksueelMisbruik("seksueel misbruik", 9, 10, VoorvalCategorie.direct),
    Loverboygirl("loverboy(girl)", 10, 11, VoorvalCategorie.direct),
    Ordeverstoring("ordeverstoring", 11, 12, VoorvalCategorie.direct),
    OnwaarheidSpreken("onwaarheid spreken", 34, 13, VoorvalCategorie.direct),
    HangenSamenscholen("hangen/samenscholen", 12, 14, VoorvalCategorie.direct),
    Vernieling("vernieling", 13, 15, VoorvalCategorie.indirect),
    OnbevoegdAanwezig("onbevoegd aanwezig", 14, 16, VoorvalCategorie.indirect),
    Diefstal("diefstal", 15, 17, VoorvalCategorie.indirect),
    Heling("heling", 16, 18, VoorvalCategorie.indirect),
    Fraude("fraude", 17, 19, VoorvalCategorie.indirect),
    Inbraak("inbraak", 18, 20, VoorvalCategorie.indirect),
    Brandstichting("brandstichting", 19, 21, VoorvalCategorie.indirect),
    Bommelding("bommelding", 20, 22, VoorvalCategorie.indirect),
    Wapenbezit("wapenbezit", 21, 23, VoorvalCategorie.goederen),
    Wapengebruik("wapengebruik", 22, 24, VoorvalCategorie.goederen),
    Wapenverkoop("wapenverkoop", 23, 25, VoorvalCategorie.goederen),
    Drugsbezit("drugsbezit", 24, 26, VoorvalCategorie.goederen),
    Drugsgebruik("drugsgebruik", 25, 27, VoorvalCategorie.goederen),
    Drugsverkoop("drugsverkoop", 26, 28, VoorvalCategorie.goederen),
    Alcoholgebruik("alcoholgebruik", 27, 29, VoorvalCategorie.goederen),
    Tabaksgebruik("tabaksgebruik", 35, 30, VoorvalCategorie.goederen),
    Energiedrank("energiedrank e.d.", 28, 31, VoorvalCategorie.goederen),
    Vuurwerk("(illegaal) vuurwerk", 29, 32, VoorvalCategorie.goederen),
    OnacceptabeleKleding("onacceptabele kleding", 36, 33, VoorvalCategorie.goederen),
    Gezondheid("gezondheid", 30, 34, VoorvalCategorie.gezondheid),
    Ongeval("ongeval", 31, 35, VoorvalCategorie.ongeval),
    Anders("anders(in toelichting)", 32, 36, VoorvalCategorie.anders);

    IrisVoorval(String naam, int code, int sortOrder, VoorvalCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = sortOrder;
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

    private enum VoorvalCategorie {
        indirect("indirect tegen personen"),
        direct("direct tegen personen"),
        goederen("goederen"),
        gezondheid("gezondheid"),
        ongeval("ongeval"),
        anders("anders");

        VoorvalCategorie(String omschrijving) {
            this.omschrijving = omschrijving;
        }

        String omschrijving;

        public String getOmschrijving() {
            return omschrijving;
        }
    }
}
