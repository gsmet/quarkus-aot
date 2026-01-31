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
package nl.topicus.eduarte.model.entities.landelijk;

import java.util.Calendar;
import java.util.Date;
import java.util.concurrent.ConcurrentHashMap;
import java.util.regex.Pattern;

import nl.topicus.eduarte.model.entities.begineinddatum.IBeginEinddatumEntiteit;

/**
 * Een <tt>Schooljaar</tt> is de periode tussen twee zomervakanties: van 1
 * augustus van jaar X tot en met 31 juli van jaar X+1. Het schooljaar 2008/2009
 * loopt dus van 1-aug-2008 tot en met 31-jul-2009. Deze klasse is immutable
 * gemaakt aangezien het geen pas heeft om van een schooljaar de properties te
 * kunnen aanpassen.
 *
 * <h2>Gebruik</h2>
 *
 * Als je een veld van type <tt>Schooljaar</tt> wilt gebruiken in een persistent
 * entity, dan moet je de volgende annotatie opnemen:
 *
 * <pre>
 * &#064;Type(type = &quot;nl.topicus.eduarte.hibernate.usertypes.SchooljaarUserType&quot;)
 * private Schooljaar schooljaar;
 * </pre>
 */
public final class Schooljaar implements IBeginEinddatumEntiteit, Comparable<Schooljaar> {
	private static final Pattern officieel = Pattern.compile("(\\d{4})[\\-/](\\d{4})");

	private static final Pattern kort = Pattern.compile("(\\d{2})[\\-/](\\d{2})");

	private static final int START_MAAND = Calendar.AUGUST;

	private static final int START_DAG = 1;

	private static final int EIND_MAAND = Calendar.JULY;

	private static final int EIND_DAG = 31;

	private final int startJaar;

	private final int eindJaar;

	private final Date begindatum;

	private final Date einddatum;

	private final String omschrijving;

	private final String afkorting;

	private static final ConcurrentHashMap<Integer, Schooljaar> schooljaren = new ConcurrentHashMap<>();

	@SuppressWarnings("deprecation")
	private Schooljaar(int jaar) {
		startJaar = jaar;
		eindJaar = startJaar + 1;
		begindatum = new Date(startJaar, START_MAAND, START_DAG);
		einddatum = new Date(eindJaar, EIND_MAAND, EIND_DAG);
		omschrijving = startJaar + "/" + eindJaar;
		afkorting = String.format("%02d/%02d", startJaar % 100, eindJaar % 100);
	}

	private Schooljaar(Date datum) {
		this(bepaalStartJaarVanSchooljaarActiefOpDatum(datum));
	}

	/**
	 * Het start jaar van het schooljaar dat actief is op de peildatum: 30-4-2009
	 * levert 2008 op (30 april 2009 valt in schooljaar 2008-2009), en 11-11-2009
	 * levert 2009 op (11-11-2009 valt in schooljaar 2009-2010).
	 *
	 * @return het start jaar van het schooljaar dat actief is op de peildatum.
	 */
	@SuppressWarnings("deprecation")
	private static int bepaalStartJaarVanSchooljaarActiefOpDatum(Date datum) {
		var jaar = datum.getYear();
		var startVanSchooljaarBeginnendInJaar = new Date(jaar, Calendar.AUGUST, 1);
		if (datum.before(startVanSchooljaarBeginnendInJaar))
			jaar = jaar - 1;
		return jaar;
	}

	/**
	 * @return het jaartal waarin dit schooljaar start (2008 van 2008/2009)
	 */
	public int getStartJaar() {
		return startJaar;
	}

	/**
	 * @return het jaartal waarin dit schooljaar eindigt (2009 van 2008/2009)
	 */
	public int getEindJaar() {
		return eindJaar;
	}

	/**
	 * @return de eerste dag dat dit schooljaar actief is (1 augustus van het jaar)
	 */
	@Override
	public Date getBegindatum() {
		return new Date(begindatum.getTime());
	}

	/**
	 * @return de laatste dag dat dit schooljaar actief is (31 juli van het jaar)
	 */
	@Override
	public Date getEinddatum() {
		return new Date(einddatum.getTime());
	}

	/**
	 * @return een lange omschrijving van het schooljaar <tt>"2008/2009"</tt>
	 */
	public String getOmschrijving() {
		return omschrijving;
	}

	/**
	 * @return een verkorte omschrijving van het schooljaar <tt>"08/09"</tt>
	 */
	public String getAfkorting() {
		return afkorting;
	}

	@Override
	public String toString() {
		return omschrijving;
	}

	/**
	 * @return het schooljaar volgend op dit schooljaar.
	 */
	public Schooljaar getVolgendSchooljaar() {
		return Schooljaar.valueOf(startJaar + 1);
	}

	/**
	 * @return het schooljaar dat voor dit schooljaar ligt
	 */
	public Schooljaar getVorigSchooljaar() {
		return Schooljaar.valueOf(startJaar - 1);
	}

	/**
	 * @return <code>true</code> als de systeemdatum na de einddatum van het
	 *         schooljaar ligt
	 */
	public boolean isAfgelopen() {
		var current = new Date();
		return current.after(getEinddatum());
	}

	/**
	 * @return het schooljaar dat actief is op de systeemdatum
	 */
	public static Schooljaar huidigSchooljaar() {
		return valueOf(new Date());
	}

	/**
	 * @return het schooljaar dat actief is op de gezette peildatum <b>of</b>
	 *         vandaag (als er geen peildatum gezet is)
	 */
	public static Schooljaar schooljaarOpPeildatum() {
		return valueOf(new Date());
	}

	/**
	 * @return het schooljaar dat actief is op de datum
	 */
	public static Schooljaar valueOf(Date datum) {
		var startJaar = bepaalStartJaarVanSchooljaarActiefOpDatum(datum);
		return valueOf(startJaar);
	}

	/**
	 * @return het schooljaar dat start in het <tt>startJaar</tt>
	 */
	public static Schooljaar valueOf(int startJaar) {
		var value = new Schooljaar(startJaar);
		var schooljaar = schooljaren.putIfAbsent(startJaar, value);
		if (schooljaar == null)
			schooljaar = value;
		return schooljaar;
	}

	/**
	 * Parst de <tt>value</tt> en geeft een <tt>Schooljaar</tt> terug als de
	 * <tt>value</tt> een correct geformatteerd schooljaar bevat. Schooljaren kunnen
	 * lang of kort worden weergegeven: 2008/2009 of 08/09. Het scheidingsteken mag
	 * varieren tussen het <tt>-</tt> en <tt>/</tt> karakter.
	 *
	 * @param value de waarde die geparst moet worden in het formaat xxxx/yyyy
	 * @return het schooljaar
	 */
	public static Schooljaar parse(String value) {
		var patterns = new Pattern[] { officieel, kort };
		for (Pattern pattern : patterns) {
			var matcher = pattern.matcher(value);
			if (!matcher.matches()) {
				continue;
			}

			var startJaar = matcher.group(1);

			if (startJaar == null)
				return null;

			return Schooljaar.valueOf(Integer.parseInt(startJaar));
		}
		return null;
	}

	@Override
	public int compareTo(Schooljaar other) {
		return this.startJaar - other.startJaar;
	}

	@Override
	public int hashCode() {
		return startJaar;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		var other = (Schooljaar) obj;

		return startJaar == other.startJaar;
	}

	@Override
	public Date getEinddatumNotNull() {
		return einddatum;
	}

	public boolean isActief() {
		return false;
	}

	/**
	 * Geeft 1 oktober van het beginjaar van het schooljaar terug. Dit is de
	 * peildatum voor BRON voor VO en de eerste peildatum voor BO.
	 */
	public Date getEenOktober() {
		var cal = Calendar.getInstance();
		cal.setTime(begindatum);
		cal.set(Calendar.MONTH, Calendar.OCTOBER);
		cal.set(Calendar.DATE, 1);
		return cal.getTime();
	}

	/**
	 * Geeft 1 januari van het eindjaar van het schooljaar terug. Dit is een
	 * peildatum voor BPVs.
	 */
	public Date getEenJanuari() {
		var cal = Calendar.getInstance();
		cal.setTime(einddatum);
		cal.set(Calendar.MONTH, Calendar.JANUARY);
		cal.set(Calendar.DATE, 1);
		return cal.getTime();
	}

	/**
	 * Geeft 1 februari van het eindjaar van het schooljaar terug. Dit is de tweede
	 * peildatum van een schooljaar voor BRON voor BO.
	 */
	public Date getEenFebruari() {
		var cal = Calendar.getInstance();
		cal.setTime(einddatum);
		cal.set(Calendar.MONTH, Calendar.FEBRUARY);
		cal.set(Calendar.DATE, 1);
		return cal.getTime();
	}

	public boolean voor(Schooljaar anderSchooljaar) {
		return anderSchooljaar != null && this.startJaar < anderSchooljaar.startJaar;
	}

	public boolean gelijkOfVoor(Schooljaar anderSchooljaar) {
		return anderSchooljaar != null && this.startJaar <= anderSchooljaar.startJaar;
	}

	public boolean na(Schooljaar anderSchooljaar) {
		return anderSchooljaar != null && this.startJaar > anderSchooljaar.startJaar;
	}

	public boolean gelijkOfNa(Schooljaar anderSchooljaar) {
		return anderSchooljaar != null && this.startJaar >= anderSchooljaar.startJaar;
	}
}
