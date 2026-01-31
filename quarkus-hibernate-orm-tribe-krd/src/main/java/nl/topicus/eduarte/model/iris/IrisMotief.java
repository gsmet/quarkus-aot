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

public enum IrisMotief {
    Persoonskenmerken("sociale of emotionele persoonskenmerken", 1,
            MotiefCategorie.Persoonsgebonden),
    Onrechtmatigbehandeld("gevoel onrechtmatig te zijn behandeld", 2,
            MotiefCategorie.Persoonsgebonden),
    Agressie("(instrumentele) agressie", 3, MotiefCategorie.Persoonsgebonden),
    Langdurigconflict("(langdurig) conflict of meningsverschil", 4,
            MotiefCategorie.Persoonsgebonden),
    Problematischegezinskenmerken("problematische gezinskenmerken", 5,
            MotiefCategorie.Persoonsgebonden),
    Schoolproblemen("sociale of emotionele schoolproblemen", 6,
            MotiefCategorie.PersoonsSchoolgebonden),
    Schoolprestaties("problematische schoolprestaties", 7, MotiefCategorie.PersoonsSchoolgebonden),
    Socialeisolatie("sociale isolatie", 8, MotiefCategorie.PersoonsSchoolgebonden),
    Groepsvorming("(anti)sociale groepsvorming(bijv. gang, queen bees)", 9,
            MotiefCategorie.PersoonsSchoolWijkgebonden),
    Problematischewijk("problematische wijk/buurt", 10, MotiefCategorie.PersoonsSchoolWijkgebonden),
    Seksuelegeaardheid("seksuele geaardheid/homoseksualiteit", 11, MotiefCategorie.Discriminatie),
    Geloof("geloof of religie", 12, MotiefCategorie.Discriminatie),
    Beperking("beperking/stoornis", 13, MotiefCategorie.Discriminatie),
    Rascisme("rascisme(etniciteit)", 14, MotiefCategorie.Discriminatie),
    Cultureleverschillen("culturele verschillen", 15, MotiefCategorie.Discriminatie),
    Eerwraak("eerwraak", 16, MotiefCategorie.Discriminatie),
    Geldelijkgewin("geldelijk gewin", 17, MotiefCategorie.Geldelijkgewin),
    Onduidelijk("geen duidelijk motief", 18, MotiefCategorie.Onduidelijk),
    Anders("anders (in toelichting)", 19, MotiefCategorie.Anders);

    IrisMotief(String naam, int code, int sortOrder, MotiefCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = sortOrder;
        this.categorie = categorie.toString();
    }

    IrisMotief(String naam, int code, MotiefCategorie categorie) {
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

    public String getCategorie() {
        return categorie;
    }

    private enum MotiefCategorie {
        Persoonsgebonden("primair persoonsgebonden"),
        PersoonsSchoolgebonden("persoons- en schoolgebonden"),
        PersoonsSchoolWijkgebonden("persoons-, school- en wijkgebonden"),
        Discriminatie("discriminatie"),
        Geldelijkgewin("geldelijk gewin"),
        Onduidelijk("geen duidelijk motief"),
        Anders("anders");

        String omschrijving;

        MotiefCategorie(String omschrijving) {
            this.omschrijving = omschrijving;
        }

        public String getOmschrijving() {
            return omschrijving;
        }
    }
}
