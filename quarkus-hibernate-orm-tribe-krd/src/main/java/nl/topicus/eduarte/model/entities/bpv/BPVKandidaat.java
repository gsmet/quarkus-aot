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
package nl.topicus.eduarte.model.entities.bpv;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import org.hibernate.annotations.BatchSize;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.inschrijving.Verbintenis;
import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity()
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class BPVKandidaat extends InstellingEntiteit
{
	public enum MatchingType
	{
		Instelling("Zoek %1 voor %2."),
		Deelnemer("%1", "%1 mag zelf zoeken."),
		Profiel("%1 mag profiel aanmaken, bedrijven kunnen zoeken.");

		MatchingType(String title)
		{
		}

		MatchingType(String label, String title)
		{
		}
	}

	public enum MatchingStatus
	{
		Kandidaat,
		Gematched,
		MatchAkkoord,
		BPVAangemaakt
		{
			@Override
			public String toString()
			{
				return "BPV aangemaakt";
			}
		},
		Geannuleerd;

		public MatchingStatus[] getVervolgEnHuidig()
		{
			switch (this)
			{
			case Kandidaat:
				return new MatchingStatus[] {Kandidaat, Geannuleerd};
			case Gematched:
				return new MatchingStatus[] {Gematched, MatchAkkoord, Geannuleerd};
			case MatchAkkoord:
				return new MatchingStatus[] {MatchAkkoord, BPVAangemaakt, Geannuleerd};
			case BPVAangemaakt:
				return new MatchingStatus[] {BPVAangemaakt};
			case Geannuleerd:
				return new MatchingStatus[] {Geannuleerd, Kandidaat};
			default:
			}
			return new MatchingStatus[] {};
		}
	}

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MatchingType matchingType;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MatchingStatus matchingStatus;

	@BatchSize(size = 20)
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvKandidaat")
	@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
	private List<BPVMatch> bpvMatches = new ArrayList<>();

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verbintenis", nullable = false)
	private Verbintenis verbintenis;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "bpvInschrijving", nullable = true)
	private BPVInschrijving bpvInschrijving;

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvKandidaat")
	private List<BPVCriteriaBPVKandidaat> bpvCriteria = new ArrayList<>();

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "bpvKandidaat")
	private List<BPVKandidaatOnderwijsproduct> onderwijsproducten =
	new ArrayList<>();

	public MatchingType getMatchingType() {
		return matchingType;
	}

	public void setMatchingType(MatchingType matchingType) {
		this.matchingType = matchingType;
	}

	public MatchingStatus getMatchingStatus() {
		return matchingStatus;
	}

	public void setMatchingStatus(MatchingStatus matchingStatus) {
		this.matchingStatus = matchingStatus;
	}

	public List<BPVMatch> getBpvMatches() {
		return bpvMatches;
	}

	public void setBpvMatches(List<BPVMatch> bpvMatches) {
		this.bpvMatches = bpvMatches;
	}

	public Verbintenis getVerbintenis() {
		return verbintenis;
	}

	public void setVerbintenis(Verbintenis verbintenis) {
		this.verbintenis = verbintenis;
	}

	public BPVInschrijving getBpvInschrijving() {
		return bpvInschrijving;
	}

	public void setBpvInschrijving(BPVInschrijving bpvInschrijving) {
		this.bpvInschrijving = bpvInschrijving;
	}

	public List<BPVCriteriaBPVKandidaat> getBpvCriteria() {
		return bpvCriteria;
	}

	public void setBpvCriteria(List<BPVCriteriaBPVKandidaat> bpvCriteria) {
		this.bpvCriteria = bpvCriteria;
	}

	public List<BPVKandidaatOnderwijsproduct> getOnderwijsproducten() {
		return onderwijsproducten;
	}

	public void setOnderwijsproducten(List<BPVKandidaatOnderwijsproduct> onderwijsproducten) {
		this.onderwijsproducten = onderwijsproducten;
	}
}