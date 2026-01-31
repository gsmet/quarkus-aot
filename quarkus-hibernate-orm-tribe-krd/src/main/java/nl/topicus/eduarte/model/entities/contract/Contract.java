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
package nl.topicus.eduarte.model.entities.contract;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.UniqueConstraint;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.VrijVeldable;
import nl.topicus.eduarte.model.entities.begineinddatum.BeginEinddatumInstellingEntiteit;
import nl.topicus.eduarte.model.entities.organisatie.ExterneOrganisatie;
import nl.topicus.eduarte.model.entities.organisatie.Locatie;
import nl.topicus.eduarte.model.entities.organisatie.OrganisatieEenheid;
import nl.topicus.eduarte.model.entities.personen.ExterneOrganisatieContactPersoon;
import nl.topicus.eduarte.model.entities.personen.Medewerker;
import nl.topicus.eduarte.model.entities.sidebar.IContextInfoObject;
import nl.topicus.eduarte.model.entities.vrijevelden.ContractVrijVeld;
import nl.topicus.eduarte.model.entities.vrijevelden.VrijVeldCategorie;

/**
 * Contract
 *
 */
@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
@jakarta.persistence.Table(uniqueConstraints = {@UniqueConstraint(columnNames = {"code",
"organisatie"})})
public class Contract extends BeginEinddatumInstellingEntiteit implements
VrijVeldable<ContractVrijVeld>, IContextInfoObject
{
	@Column(nullable = false, length = 30)
	private String code;

	@Column(nullable = false, length = 100)
	private String naam;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "organisatieEenheid", nullable = true)
	private OrganisatieEenheid organisatieEenheid;

	@Lob
	private String toelichting;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "externeOrganisatie", nullable = true)
	private ExterneOrganisatie externeOrganisatie;

	@Column(nullable = true, length = 20)
	private String externNummer;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "contactPersoon", nullable = true)
	private ExterneOrganisatieContactPersoon contactPersoon;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "soortContract", nullable = false)
	private SoortContract soortContract;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "beheerder", nullable = true)
	private Medewerker beheerder;

	@Column(nullable = true, length = 30)
	private String aanwezigBij;

	@Column(nullable = true)
	private Integer minimumAantalDeelnemers;

	@Column(nullable = true)
	private Integer maximumAantalDeelnemers;

	@Column(nullable = true, scale = 2, precision = 19)
	private BigDecimal kostprijs;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "typeFinanciering", nullable = true)
	private TypeFinanciering typeFinanciering;

	@Column(nullable = false)
	private Date eindeInstroom;

	@ManyToMany(cascade = {CascadeType.PERSIST, CascadeType.REFRESH}, fetch = FetchType.LAZY)
	@JoinTable(name = "ContractLocatieKoppeling", joinColumns = {@JoinColumn(name = "contract_Id")}, inverseJoinColumns = {@JoinColumn(name = "locatie_Id")})
	private List<Locatie> locaties;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contract")
	private List<ContractOnderdeel> contractOnderdelen;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contract")
	private List<ContractVerplichting> contractVerplichtingen;

	/**
	 * Voor keurmerk inburgering moet onderscheid gemaakt worden tussen
	 * inburgeringscontracten in hoofd- en onderaanneming.
	 */
	public enum Onderaanneming
	{
		/**
		 * Geheel onder eigen verantwoordelijkheid uitgevoerd
		 */
		Geen,
		/**
		 * Instelling is hoofdaannemer, andere partij voert de gehele inburgeringscursus
		 * uit
		 */
		GeheelUitbesteed,
		/**
		 * Instelling is hoofdaannemer, andere partij voert een deel van de
		 * inburgeringscursus uit
		 */
		GedeeltelijkUitbesteed,
		/**
		 * Andere partij is hoofdaannemer, instelling voert een deel van de
		 * inburgeringscursus uit
		 */
		InOnderaanneming;
	}

	@Column(nullable = true)
	@Enumerated(EnumType.STRING)
	private Onderaanneming onderaanneming = Onderaanneming.Geen;

	@Column(nullable = true, length = 50)
	private String onderaannemingBij;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "contract")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	@BatchSize(size = 20)
	private List<ContractVrijVeld> vrijVelden;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getNaam() {
		return naam;
	}

	public void setNaam(String naam) {
		this.naam = naam;
	}

	public OrganisatieEenheid getOrganisatieEenheid() {
		return organisatieEenheid;
	}

	public void setOrganisatieEenheid(OrganisatieEenheid organisatieEenheid) {
		this.organisatieEenheid = organisatieEenheid;
	}

	public String getToelichting() {
		return toelichting;
	}

	public void setToelichting(String toelichting) {
		this.toelichting = toelichting;
	}

	public ExterneOrganisatie getExterneOrganisatie() {
		return externeOrganisatie;
	}

	public void setExterneOrganisatie(ExterneOrganisatie externeOrganisatie) {
		this.externeOrganisatie = externeOrganisatie;
	}

	public String getExternNummer() {
		return externNummer;
	}

	public void setExternNummer(String externNummer) {
		this.externNummer = externNummer;
	}

	public ExterneOrganisatieContactPersoon getContactPersoon() {
		return contactPersoon;
	}

	public void setContactPersoon(ExterneOrganisatieContactPersoon contactPersoon) {
		this.contactPersoon = contactPersoon;
	}

	public SoortContract getSoortContract() {
		return soortContract;
	}

	public void setSoortContract(SoortContract soortContract) {
		this.soortContract = soortContract;
	}

	public Medewerker getBeheerder() {
		return beheerder;
	}

	public void setBeheerder(Medewerker beheerder) {
		this.beheerder = beheerder;
	}

	public String getAanwezigBij() {
		return aanwezigBij;
	}

	public void setAanwezigBij(String aanwezigBij) {
		this.aanwezigBij = aanwezigBij;
	}

	public Integer getMinimumAantalDeelnemers() {
		return minimumAantalDeelnemers;
	}

	public void setMinimumAantalDeelnemers(Integer minimumAantalDeelnemers) {
		this.minimumAantalDeelnemers = minimumAantalDeelnemers;
	}

	public Integer getMaximumAantalDeelnemers() {
		return maximumAantalDeelnemers;
	}

	public void setMaximumAantalDeelnemers(Integer maximumAantalDeelnemers) {
		this.maximumAantalDeelnemers = maximumAantalDeelnemers;
	}

	public BigDecimal getKostprijs() {
		return kostprijs;
	}

	public void setKostprijs(BigDecimal kostprijs) {
		this.kostprijs = kostprijs;
	}

	public TypeFinanciering getTypeFinanciering() {
		return typeFinanciering;
	}

	public void setTypeFinanciering(TypeFinanciering typeFinanciering) {
		this.typeFinanciering = typeFinanciering;
	}

	public Date getEindeInstroom() {
		return eindeInstroom;
	}

	public void setEindeInstroom(Date eindeInstroom) {
		this.eindeInstroom = eindeInstroom;
	}

	public List<Locatie> getLocaties() {
		return locaties;
	}

	public void setLocaties(List<Locatie> locaties) {
		this.locaties = locaties;
	}

	public List<ContractOnderdeel> getContractOnderdelen() {
		return contractOnderdelen;
	}

	public void setContractOnderdelen(List<ContractOnderdeel> contractOnderdelen) {
		this.contractOnderdelen = contractOnderdelen;
	}

	public List<ContractVerplichting> getContractVerplichtingen() {
		return contractVerplichtingen;
	}

	public void setContractVerplichtingen(List<ContractVerplichting> contractVerplichtingen) {
		this.contractVerplichtingen = contractVerplichtingen;
	}

	public Onderaanneming getOnderaanneming() {
		return onderaanneming;
	}

	public void setOnderaanneming(Onderaanneming onderaanneming) {
		this.onderaanneming = onderaanneming;
	}

	public String getOnderaannemingBij() {
		return onderaannemingBij;
	}

	public void setOnderaannemingBij(String onderaannemingBij) {
		this.onderaannemingBij = onderaannemingBij;
	}

	@Override
	public List<ContractVrijVeld> getVrijVelden() {
		return vrijVelden;
	}

	@Override
	public void setVrijVelden(List<ContractVrijVeld> vrijVelden) {
		this.vrijVelden = vrijVelden;
	}

	@Override
	public boolean isActief(Date peildatum) {
		return false;
	}

	@Override
	public String getContextInfoOmschrijving() {
		return null;
	}

	@Override
	public ContractVrijVeld newVrijVeld() {
		return null;
	}

	@Override
	public List<ContractVrijVeld> getVrijVelden(VrijVeldCategorie categorie) {
		return null;
	}

	@Override
	public String getVrijVeldWaarde(String naam) {
		return null;
	}
}
