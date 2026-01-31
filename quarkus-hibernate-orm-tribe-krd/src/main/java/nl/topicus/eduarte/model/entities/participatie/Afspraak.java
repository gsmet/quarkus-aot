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
package nl.topicus.eduarte.model.entities.participatie;

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

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.bijlage.Bijlage;
import nl.topicus.eduarte.model.entities.bijlage.IBijlageKoppelEntiteit;
import nl.topicus.eduarte.model.entities.onderwijsproduct.Onderwijsproduct;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.participatie.enums.IParticipatieBlokObject;
import nl.topicus.eduarte.model.entities.personen.Persoon;

/**
 * Een afspraak kan bijvoorbeeld een roosterelement, een individueel gesprek
 * tussen een begeleider en een deelnemer, een projectbijeenkomst of een
 * stagebezoek zijn. Een afspraak geeft aan dat een groep van deelnemers en
 * eventueel een of meer begeleiders bij elkaar komen voor een
 * onderwijsactiviteit. Een afspraak kan voor een gedeelte (of helemaal)
 * meetellen voor In Instelling Verzorgd Onderwijs (IIVO). IIVO-uren zijn de
 * uren die meetellen voor de 850-/1040-urennorm.
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@BatchSize(size = 1000)
public class Afspraak extends InstellingEntiteit
		implements IParticipatieBlokObject, IBijlageKoppelEntiteit<AfspraakBijlage> {
	public static final String MEDEWERKER_WRITE = "AFSPRAAK_MEDEWERKER_WRITE";

	public static final String DEELNEMER_WRITE = "AFSPRAAK_DEELNEMER_WRITE";

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "organisatieEenheid")
	private OrganisatieEenheid organisatieEenheid;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "locatie")
	private Locatie locatie;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = false, name = "afspraakType")
	private AfspraakType afspraakType;

	@Column(nullable = false, length = 255)
	private String titel;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "onderwijsproduct")
	private Onderwijsproduct onderwijsproduct;

	@Column(nullable = true, length = 100)
	private String afspraakLocatie;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date beginDatumTijd;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = true)
	private Date eindDatumTijd;

	/**
	 * Het beginlesuur van de afspraak. Niet verplicht, wordt alleen gebruikt voor
	 * informatieve doeleinden.
	 */
	@Column(nullable = true)
	private Integer beginLesuur;

	/**
	 * Het eindlesuur van de afspraak. Niet verplicht, wordt alleen gebruikt voor
	 * informatieve doeleinden.
	 */
	@Column(nullable = true)
	private Integer eindLesuur;

	@Column(nullable = true)
	@Lob
	private String omschrijving;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(nullable = true, name = "auteur")
	private Persoon auteur;

	/**
	 * Het aantal minute dat deze afspraak meetelt voor IIVO. Het aantal minuten
	 * moet tussen 0 en het aantal minuten van de afspraak liggen (inclusief).
	 */
	@Column(nullable = false)
	private int minutenIIVO;

	/**
	 * Moet presentie/absentie bijgehouden worden voor deze afspraak? Zo ja, moet
	 * het veld presentieRegistratieVerwerkt uiteindelijk op True gezet worden.
	 */
	@Column(nullable = false)
	private boolean presentieRegistratieVerplicht;

	/**
	 * Is de presentie/absentieregistratie van deze afspraak uitgevoerd.
	 */
	@Column(nullable = false)
	private boolean presentieRegistratieVerwerkt;

	/**
	 * Mag de deelnemer zelf zijn presentie registratie doen
	 */
	@Column(nullable = false, name = "presentieDoorDeelnemer")
	private boolean presentieRegistratieDoorDeelnemer;

	/**
	 * Als een afspraak niet eenmalig is, maar elke X weken terugkeert wordt een
	 * HerhalendeAfspraak aangemaakt. Alle afspraken die het resultaat zijn van de
	 * herhalende afspraak verwijzen naar dezelfde herhalende afspraak. Op deze
	 * manier kan bij het wijzigen van een herhalende afspraak eventueel ook alle
	 * andere bijbehorende afspraken gewijzigd worden.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "herhalendeAfspraak", nullable = true)
	private HerhalendeAfspraak herhalendeAfspraak;

	/**
	 * Een afspraak kan gedefinieerd zijn binnen een basisrooster.
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "basisrooster", nullable = true)
	private Basisrooster basisrooster;

	/**
	 * Als een afspraak afkomstig is uit een extern systeem, zoals bijvoorbeeld een
	 * roosterprogramma, wordt het id van het externe systeem bijgehouden om bij
	 * eventuele wijzigingen in het bronsysteem de afspraak terug te kunnen vinden
	 * in de participatiemodule. Als het externe roostersysteem geen id aanlevert,
	 * kan door de participatiemodule een id gegenereerd worden die bestaat uit de
	 * identificerende bestanddelen van de afspraak.
	 */
	@Column(length = 500, nullable = true)
	private String externId;

	/**
	 * Het externe systeem waar de afspraak van afkomstig is.
	 */
	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private ExternSysteem externSysteem;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afspraak")
	private List<AfspraakParticipant> participanten = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afspraak")
	private List<AfspraakBijlage> bijlagen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afspraak")
	private List<Waarneming> waarnemingen = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afspraak")
	private List<AfspraakDeelnemer> deelnemers = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "cacheRegion", nullable = true)
	private CacheRegion cacheRegion;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "inloopCollege", nullable = true)
	private InloopCollege inloopCollege;

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public Locatie getLocatie() {
		return locatie;
	}

	public void setLocatie(Locatie locatie) {
		this.locatie = locatie;
	}

	public AfspraakType getAfspraakType() {
		return afspraakType;
	}

	public void setAfspraakType(AfspraakType afspraakType) {
		this.afspraakType = afspraakType;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public Onderwijsproduct getOnderwijsproduct() {
		return onderwijsproduct;
	}

	public void setOnderwijsproduct(Onderwijsproduct onderwijsproduct) {
		this.onderwijsproduct = onderwijsproduct;
	}

	public String getAfspraakLocatie() {
		return afspraakLocatie;
	}

	public void setAfspraakLocatie(String afspraakLocatie) {
		this.afspraakLocatie = afspraakLocatie;
	}

	@Override
	public Date getBeginDatumTijd() {
		return beginDatumTijd;
	}

	public void setBeginDatumTijd(Date beginDatumTijd) {
		this.beginDatumTijd = beginDatumTijd;
	}

	@Override
	public Date getEindDatumTijd() {
		return eindDatumTijd;
	}

	public void setEindDatumTijd(Date eindDatumTijd) {
		this.eindDatumTijd = eindDatumTijd;
	}

	@Override
	public Integer getBeginLesuur() {
		return beginLesuur;
	}

	public void setBeginLesuur(Integer beginLesuur) {
		this.beginLesuur = beginLesuur;
	}

	@Override
	public Integer getEindLesuur() {
		return eindLesuur;
	}

	public void setEindLesuur(Integer eindLesuur) {
		this.eindLesuur = eindLesuur;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public Persoon getAuteur() {
		return auteur;
	}

	public void setAuteur(Persoon auteur) {
		this.auteur = auteur;
	}

	public int getMinutenIIVO() {
		return minutenIIVO;
	}

	public void setMinutenIIVO(int minutenIIVO) {
		this.minutenIIVO = minutenIIVO;
	}

	public boolean isPresentieRegistratieVerplicht() {
		return presentieRegistratieVerplicht;
	}

	public void setPresentieRegistratieVerplicht(boolean presentieRegistratieVerplicht) {
		this.presentieRegistratieVerplicht = presentieRegistratieVerplicht;
	}

	public boolean isPresentieRegistratieVerwerkt() {
		return presentieRegistratieVerwerkt;
	}

	public void setPresentieRegistratieVerwerkt(boolean presentieRegistratieVerwerkt) {
		this.presentieRegistratieVerwerkt = presentieRegistratieVerwerkt;
	}

	public boolean isPresentieRegistratieDoorDeelnemer() {
		return presentieRegistratieDoorDeelnemer;
	}

	public void setPresentieRegistratieDoorDeelnemer(boolean presentieRegistratieDoorDeelnemer) {
		this.presentieRegistratieDoorDeelnemer = presentieRegistratieDoorDeelnemer;
	}

	public HerhalendeAfspraak getHerhalendeAfspraak() {
		return herhalendeAfspraak;
	}

	public void setHerhalendeAfspraak(HerhalendeAfspraak herhalendeAfspraak) {
		this.herhalendeAfspraak = herhalendeAfspraak;
	}

	public Basisrooster getBasisrooster() {
		return basisrooster;
	}

	public void setBasisrooster(Basisrooster basisrooster) {
		this.basisrooster = basisrooster;
	}

	public String getExternId() {
		return externId;
	}

	public void setExternId(String externId) {
		this.externId = externId;
	}

	public ExternSysteem getExternSysteem() {
		return externSysteem;
	}

	public void setExternSysteem(ExternSysteem externSysteem) {
		this.externSysteem = externSysteem;
	}

	public List<AfspraakParticipant> getParticipanten() {
		return participanten;
	}

	public void setParticipanten(List<AfspraakParticipant> participanten) {
		this.participanten = participanten;
	}

	@Override
	public List<AfspraakBijlage> getBijlagen() {
		return bijlagen;
	}

	@Override
	public void setBijlagen(List<AfspraakBijlage> bijlagen) {
		this.bijlagen = bijlagen;
	}

	public List<Waarneming> getWaarnemingen() {
		return waarnemingen;
	}

	public void setWaarnemingen(List<Waarneming> waarnemingen) {
		this.waarnemingen = waarnemingen;
	}

	public List<AfspraakDeelnemer> getDeelnemers() {
		return deelnemers;
	}

	public void setDeelnemers(List<AfspraakDeelnemer> deelnemers) {
		this.deelnemers = deelnemers;
	}

	public CacheRegion getCacheRegion() {
		return cacheRegion;
	}

	public void setCacheRegion(CacheRegion cacheRegion) {
		this.cacheRegion = cacheRegion;
	}

	public InloopCollege getInloopCollege() {
		return inloopCollege;
	}

	public void setInloopCollege(InloopCollege inloopCollege) {
		this.inloopCollege = inloopCollege;
	}

	@Override
	public boolean bestaatBijlage(Bijlage bijlage) {
		return false;
	}

	@Override
	public AfspraakBijlage addBijlage(Bijlage bijlage) {
		return null;
	}

	@Override
	public boolean isActiefOpDatum(Date datum) {
		return false;
	}

	@Override
	public String getCssClass() {
		return null;
	}

	@Override
	public String getTitle() {
		return null;
	}
}
