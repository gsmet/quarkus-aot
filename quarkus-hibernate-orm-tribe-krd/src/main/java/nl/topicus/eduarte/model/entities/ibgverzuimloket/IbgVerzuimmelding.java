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
package nl.topicus.eduarte.model.entities.ibgverzuimloket;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.ibgverzuimloket.IbgEnums;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class IbgVerzuimmelding extends BeginEinddatumInstellingEntiteit {
	@Column(nullable = true)
	private boolean actieOndernemen;

	@Column(length = 60, nullable = true)
	private String functieMelder;

	@Column(nullable = true, length = 5)
	private String netnummermelder;

	@Column(length = 100, nullable = true)
	private String toelichting;

	@Lob
	@Column(nullable = true)
	private String toelichtingActieGewenst;

	@Lob
	@Column(nullable = true)
	private String toelichtingOndernomenactie;

	@Column(nullable = true)
	private boolean verzuimdagGespecificeerd;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private IbgEnums.Verzuimsoort verzuimsoort;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date melddatumtijd;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis", nullable = false)
	private Verbintenis verbintenis;

	@Column(length = 10, nullable = true)
	private String abonneenummerMelder;

	@Column(length = 100, nullable = false)
	private String emailadresMelder;

	@Column(length = 200, nullable = false)
	private String vermoedelijkeReden;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "verzuimmelding")
	private List<IbgVerzuimdag> verzuimdagen = new ArrayList<>();

	@Column(nullable = true)
	private boolean alleLessenGemist;

	@Column(length = 100, nullable = false)
	private String aanduidingContactpersoon;

	@Column(nullable = true)
	private Date begindatumSelectie;

	@Column(nullable = false)
	private BigInteger meldingsnummer;

	@Column(nullable = true)
	private Date laatsteMutatieDatum;

	@Column(nullable = true)
	private Date laatsteMutatieTijd;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private IbgEnums.StatusMeldingRelatiefVerzuim status;

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private IbgEnums.CCEmailontvanger ccEmailontvanger;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "locatie", nullable = true)
	private Locatie locatie;

	@Column(nullable = false)
	private boolean verzonden;

	public boolean isActieOndernemen() {
		return actieOndernemen;
	}

	public void setActieOndernemen(boolean actieOndernemen) {
		this.actieOndernemen = actieOndernemen;
	}

	public String getFunctieMelder() {
		return functieMelder;
	}

	public void setFunctieMelder(String functieMelder) {
		this.functieMelder = functieMelder;
	}

	public String getNetnummermelder() {
		return netnummermelder;
	}

	public void setNetnummermelder(String netnummermelder) {
		this.netnummermelder = netnummermelder;
	}

	public String getToelichting() {
		return toelichting;
	}

	public void setToelichting(String toelichting) {
		this.toelichting = toelichting;
	}

	public String getToelichtingActieGewenst() {
		return toelichtingActieGewenst;
	}

	public void setToelichtingActieGewenst(String toelichtingActieGewenst) {
		this.toelichtingActieGewenst = toelichtingActieGewenst;
	}

	public String getToelichtingOndernomenactie() {
		return toelichtingOndernomenactie;
	}

	public void setToelichtingOndernomenactie(String toelichtingOndernomenactie) {
		this.toelichtingOndernomenactie = toelichtingOndernomenactie;
	}

	public boolean isVerzuimdagGespecificeerd() {
		return verzuimdagGespecificeerd;
	}

	public void setVerzuimdagGespecificeerd(boolean verzuimdagGespecificeerd) {
		this.verzuimdagGespecificeerd = verzuimdagGespecificeerd;
	}

	public IbgEnums.Verzuimsoort getVerzuimsoort() {
		return verzuimsoort;
	}

	public void setVerzuimsoort(IbgEnums.Verzuimsoort verzuimsoort) {
		this.verzuimsoort = verzuimsoort;
	}

	public Date getMelddatumtijd() {
		return melddatumtijd;
	}

	public void setMelddatumtijd(Date melddatumtijd) {
		this.melddatumtijd = melddatumtijd;
	}

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public String getAbonneenummerMelder() {
		return abonneenummerMelder;
	}

	public void setAbonneenummerMelder(String abonneenummerMelder) {
		this.abonneenummerMelder = abonneenummerMelder;
	}

	public String getEmailadresMelder() {
		return emailadresMelder;
	}

	public void setEmailadresMelder(String emailadresMelder) {
		this.emailadresMelder = emailadresMelder;
	}

	public String getVermoedelijkeReden() {
		return vermoedelijkeReden;
	}

	public void setVermoedelijkeReden(String vermoedelijkeReden) {
		this.vermoedelijkeReden = vermoedelijkeReden;
	}

	public List<IbgVerzuimdag> getVerzuimdagen() {
		return verzuimdagen;
	}

	public void setVerzuimdagen(List<IbgVerzuimdag> verzuimdagen) {
		this.verzuimdagen = verzuimdagen;
	}

	public boolean isAlleLessenGemist() {
		return alleLessenGemist;
	}

	public void setAlleLessenGemist(boolean alleLessenGemist) {
		this.alleLessenGemist = alleLessenGemist;
	}

	public String getAanduidingContactpersoon() {
		return aanduidingContactpersoon;
	}

	public void setAanduidingContactpersoon(String aanduidingContactpersoon) {
		this.aanduidingContactpersoon = aanduidingContactpersoon;
	}

	public Date getBegindatumSelectie() {
		return begindatumSelectie;
	}

	public void setBegindatumSelectie(Date begindatumSelectie) {
		this.begindatumSelectie = begindatumSelectie;
	}

	public BigInteger getMeldingsnummer() {
		return meldingsnummer;
	}

	public void setMeldingsnummer(BigInteger meldingsnummer) {
		this.meldingsnummer = meldingsnummer;
	}

	public Date getLaatsteMutatieDatum() {
		return laatsteMutatieDatum;
	}

	public void setLaatsteMutatieDatum(Date laatsteMutatieDatum) {
		this.laatsteMutatieDatum = laatsteMutatieDatum;
	}

	public Date getLaatsteMutatieTijd() {
		return laatsteMutatieTijd;
	}

	public void setLaatsteMutatieTijd(Date laatsteMutatieTijd) {
		this.laatsteMutatieTijd = laatsteMutatieTijd;
	}

	public IbgEnums.StatusMeldingRelatiefVerzuim getStatus() {
		return status;
	}

	public void setStatus(IbgEnums.StatusMeldingRelatiefVerzuim status) {
		this.status = status;
	}

	public IbgEnums.CCEmailontvanger getCcEmailontvanger() {
		return ccEmailontvanger;
	}

	public void setCcEmailontvanger(IbgEnums.CCEmailontvanger ccEmailontvanger) {
		this.ccEmailontvanger = ccEmailontvanger;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public boolean isVerzonden() {
		return verzonden;
	}

	public void setVerzonden(boolean verzonden) {
		this.verzonden = verzonden;
	}
}
