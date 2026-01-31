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

public enum IrisVoorwerp {
    Steekwapens("steekwapens", 1, VoorwerpCategorie.wapens),
    Vuurwapens("vuurwapens", 2, VoorwerpCategorie.wapens),
    SlagStootwapens("slag- en stootwapens", 3, VoorwerpCategorie.wapens),
    ImitatieVuurwapens("imitatie (vuur)wapens", 4, VoorwerpCategorie.wapens),
    Overigegebruiksvoorwerpen("overige gebruiksvoorwerpen", 5, VoorwerpCategorie.wapens),
    ViaInternetOpSchool("via internet op school", 6, VoorwerpCategorie.technischDigitaal),
    ViaInternet("via internet", 7, VoorwerpCategorie.technischDigitaal),
    ViaMobieleTelefoon("via mobiele telefoon", 8, VoorwerpCategorie.technischDigitaal),
    AndereDigitaleDiensten("andere digitale diensten", 9, VoorwerpCategorie.technischDigitaal),
    Anders("anders(in toelichting)", 10, VoorwerpCategorie.anders);

    IrisVoorwerp(String naam, int code, int sortOrder, VoorwerpCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = sortOrder;
        this.categorie = categorie.getOmschrijving();
    }

    IrisVoorwerp(String naam, int code, VoorwerpCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = code;
        this.categorie = categorie.getOmschrijving();
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

    private enum VoorwerpCategorie {
        technischDigitaal("technisch/digitaal"),
        wapens("wapens"),
        anders("anders");

        VoorwerpCategorie(String omschrijving) {
            this.omschrijving = omschrijving;
        }

        String omschrijving;

        public String getOmschrijving() {
            return omschrijving;
        }
    }
}