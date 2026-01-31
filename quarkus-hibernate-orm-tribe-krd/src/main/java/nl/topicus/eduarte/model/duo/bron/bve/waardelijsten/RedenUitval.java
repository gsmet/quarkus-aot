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
package nl.topicus.eduarte.model.duo.bron.bve.waardelijsten;

public enum RedenUitval {

    /**
     * 1. Persoonsgebonden factoren waar de instelling in principe absoluut geen
     * invloed
     * op kan uitoefenen, zoals: verhuizing, ziekte, overlijden, geografische
     * afstand.
     */
    PersoonsgebondenGeenInvloed(
            "Persoonsgebonden factoren waar de instelling in principe absoluut geen invloed op kan uitoefenen",
            1),
    /**
     * 2. Persoonsgebonden factoren waar de instelling in principe niets kan doen
     * aan de
     * oorzaken maar in principe en wellicht wel aan de opvang, zoals:
     * sociaal-emotionele
     * problemen, psychische stoornissen, leerproblemen, problemen in de
     * thuissituatie.
     */
    PersoonsgebondenOpvang(
            "Persoonsgebonden factoren waar de instelling in principe niets kan doen aan de oorzaken, maar in principe en wellicht wel aan de opvang",
            2),
    /**
     * 3. Instellingsgebonden factoren. Hierbij gaat het om factoren waarop de
     * instelling
     * in principe wél zelf of samen met andere instanties invloed heeft, en die
     * kunnen
     * variëren van: bijvoorbeeld: problemen met de inhoud en/of vormgeving van
     * opleidingen, het gedrag van docenten, de ervaren veiligheid op school.
     */
    Instellingsgebonden("Instellingsgebonden factoren", 3),
    /**
     * 4. Studie- en beroepskeuzegebonden factoren. Hierbij gaat het om factoren
     * waarop de
     * instelling zelf of samen met andere instanties deels wel en deels geen
     * invloed op
     * kan uitoefenen. Deels wel voor zover deze factoren liggen in de sfeer van de
     * intake
     * en ‘leerloopbaan’-begeleiding. Deels niet voorzover in een eerder stadium
     * bepaalde
     * studie-school-beroepskeuzebeslissingen zijn gemaakt.
     */
    StudieBeroepsgebonden("Studie- en beroepskeuzegebonden factoren", 4),
    /**
     * 5. Arbeidsmarkt- en (externe) omgevingsfactoren. Hierbij gaat het om factoren
     * waarop de instelling merendeels geen invloed heeft, zoals bijvoorbeeld
     * arbeidsovereenkomst opgezegd, ‘groenpluk’ of sollicitatieplicht.
     */
    ArbeidsmarktOmgeving("Arbeidsmarkt- en (externe) omgevingsfactoren", 5),
    /**
     * 6. Zonder diploma, maar wel succesvol / afgesproken resultaat behaald. Dit is
     * een
     * categorie die verwijst naar afspraken in de onderwijsovereenkomst die gemaakt
     * zijn
     * met deelnemers en die gerealiseerd zijn, zonder dat dat gepaard gaat met een
     * diploma. Belangrijk is dat deze ‘ongediplomeerd succesvollen’ scherp
     * geregistreerd
     * worden en dat dergelijke trajecten vastgelegd worden in de
     * onderwijsovereenkomst.
     */
    GeenDiplomaWelSuccesvol("Zonder diploma, maar wel succesvol / afgesproken resultaat behaald", 6),
    /**
     * 7. Onbekend. Daarbij wordt aangegeven waarom de uitvalsreden onbekend is
     * gebleven,
     * zoals bijvoorbeeld ‘niet bereikbaar’. Er wordt naar gestreefd dat de
     * categorie
     * ‘onbekend’ maximaal 5 procent bedraagt. Daardoor wordt voorkomen dat te
     * gemakkelijk
     * ‘uitvalsreden onbekend’ wordt geregistreerd.
     */
    Onbekend("Onbekend", 7),

    /**
     * 8. Het aanleveren van de reden uitstroom is optioneel, maar met de invoering
     * van
     * categorie 8 (geen uitval) zal het in de toekomst verplicht gesteld worden.
     * Heel
     * vaak hoeft er geen reden ingevuld te worden (mag wel) als er een wisseling
     * van
     * opleiding plaatsvindt binnen de instelling. Om technische redenen heeft het
     * gebruikersoverleg BVE besloten de volgende reden in te vullen in alle
     * gevallen dat
     * er niets ingevuld hoeft te worden:
     */
    Experimenteel("Geen uitval", 8),
    Wanbetaler("Wanbetaler", 9);

    private String omschrijving;

    private int code;

    private RedenUitval(String omschrijving, int code) {
        this.omschrijving = omschrijving;
        this.code = code;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public String getCode() {
        return String.valueOf(code);
    }

    @Override
    public String toString() {
        return code + ". " + omschrijving;
    }
}
