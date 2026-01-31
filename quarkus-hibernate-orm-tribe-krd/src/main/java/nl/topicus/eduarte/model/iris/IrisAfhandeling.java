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

public enum IrisAfhandeling {
    Leraar("eigen leraar/leraren", 1, 1, AfhandelingCategorie.Pedagogisch),
    Ouders("inzet ouders/verzorgers", 2, 2, AfhandelingCategorie.Pedagogisch),
    SociaalEmotioneleExpertise("extra sociaal-emotionele expertise", 3, 3,
            AfhandelingCategorie.Pedagogisch),
    ExpertiseGedragsverbetering("extra expertise gedragsverbetering", 4, 4,
            AfhandelingCategorie.Pedagogisch),
    Nazorg("nazorg voor slachtoffer", 5, 5, AfhandelingCategorie.Pedagogisch),
    Waarschuwing("waarschuwing", 6, 6, AfhandelingCategorie.Schoolmaatregel),
    OntzeggingLes("ontzegging/verwijdering les(sen)", 7, 7, AfhandelingCategorie.Schoolmaatregel),
    OntzeggingSchool("ontzegging schoolgebouw/-terrein", 8, 8, AfhandelingCategorie.Schoolmaatregel),
    SchoolTaakStraf("school- of taakstraf", 9, 9, AfhandelingCategorie.Schoolmaatregel),
    VerliesVanPrivilege("verlies van privilege", 36, 10, AfhandelingCategorie.Schoolmaatregel),
    NablijvenTijdInhalen("nablijven/tijd inhalen", 37, 11, AfhandelingCategorie.Schoolmaatregel),
    Timeout("time-out", 38, 12, AfhandelingCategorie.Schoolmaatregel),
    Schorsing("schorsing", 10, 13, AfhandelingCategorie.Schoolmaatregel),
    AndereSchool("naar andere school", 11, 14, AfhandelingCategorie.Schoolmaatregel),
    AansprakelijkStellen("aansprakelijk stellen voor schade", 12, 15,
            AfhandelingCategorie.Schoolmaatregel),
    Vertrouwenspersoon("inzet vertrouwenspersoon", 13, 16, AfhandelingCategorie.Schoolmaatregel),
    ZAT("inzet ZAT", 14, 17, AfhandelingCategorie.Schoolmaatregel),
    Coordinator("inzet co\u00F6rdinator", 15, 18, AfhandelingCategorie.Schoolmaatregel),
    Collegiaaloverleg("collegiaal overleg", 16, 19, AfhandelingCategorie.Schoolmaatregel),
    Scholing("scholing/training eigen personeel", 17, 20, AfhandelingCategorie.Schoolmaatregel),
    SamenwerkingAndereSchool("samenwerking met andere scholen", 18, 21,
            AfhandelingCategorie.Schoolmaatregel),
    Ehbo("ehbo op school", 19, 22, AfhandelingCategorie.Medisch),
    Spoedeisendehulp("spoedeisende hulp", 20, 23, AfhandelingCategorie.Medisch),
    OverigMedisch("overige medische hulpverlening", 21, 24, AfhandelingCategorie.Medisch),
    Jeugdzorg("melding bij jeugdzorg/-reclassering", 22, 25, AfhandelingCategorie.Buitenschools),
    Vertrouwensinspecteur("melding bij vertrouwensinspecteur", 23, 26,
            AfhandelingCategorie.Buitenschools),
    Maatschappelijkwerk("melding bij maatschappelijk werk", 24, 27,
            AfhandelingCategorie.Buitenschools),
    Leerlplichtambtenaar("melding bij leerplichtambtenaar", 25, 28,
            AfhandelingCategorie.Buitenschools),
    Wijkagent("melding bij wijkagent/politie(0900-8844)", 26, 29,
            AfhandelingCategorie.Buitenschools),
    Alarmnummer("melding bij 112", 27, 30, AfhandelingCategorie.Buitenschools),
    Slachtofferhulp("melding bij slachtofferhulp", 28, 31, AfhandelingCategorie.Buitenschools),
    Schadeexpert("melding bij schade-expert", 29, 32, AfhandelingCategorie.Buitenschools),
    Aangifte("aangifte bij politie", 30, 33, AfhandelingCategorie.Buitenschools),
    Prosociaalgedrag("gericht op prosociaal gedrag", 31, 34, AfhandelingCategorie.Leerlingen),
    Mediator("mediator bij conflicten e.d.", 32, 35, AfhandelingCategorie.Leerlingen),
    Pleinwacht("pleinwacht", 33, 36, AfhandelingCategorie.Leerlingen),
    Streetwatcher("streetwatcher", 34, 37, AfhandelingCategorie.Leerlingen),
    Anders("anders (in toelichting)", 35, 38, AfhandelingCategorie.Anders);

    String naam;

    int code;

    int sortOrder;

    String categorie;

    IrisAfhandeling(String naam, int code, int sortOrder, AfhandelingCategorie categorie) {
        this.naam = naam;
        this.code = code;
        this.sortOrder = sortOrder;
        this.categorie = categorie.toString();
    }

    private enum AfhandelingCategorie {
        Schoolmaatregel("schoolmaatregel"),
        Pedagogisch("pedagogisch"),
        Medisch("medische hulpverlening"),
        Leerlingen("inzet leerlingen ter reductie van onveiligheid"),
        Buitenschools("contact buitenschoolse instantie"),
        Anders("anders");

        String omschrijving;

        AfhandelingCategorie(String omschrijving) {
            this.omschrijving = omschrijving;
        }

        public String getOmschrijving() {
            return omschrijving;
        }
    }
}
