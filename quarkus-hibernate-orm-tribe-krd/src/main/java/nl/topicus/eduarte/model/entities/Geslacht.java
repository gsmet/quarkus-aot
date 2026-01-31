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
package nl.topicus.eduarte.model.entities;

public enum Geslacht {
    Man("heer", "De heer", 1),
    Vrouw("mevrouw", "Mevrouw", 2),
    Onbekend("heer of mevrouw", "De heer of mevrouw", 3);

    private String aanhef;

    private String adressering;

    private int nummer;

    private Geslacht(String aanhef, String adressering, int nummer) {
        this.aanhef = aanhef;
        this.adressering = adressering;
        this.nummer = nummer;
    }

    @Override
    public String toString() {
        return name();
    }

    public String getAanhef() {
        return aanhef;
    }

    public String getAdressering() {
        return adressering;
    }

    public int getNummer() {
        return nummer;
    }
}
