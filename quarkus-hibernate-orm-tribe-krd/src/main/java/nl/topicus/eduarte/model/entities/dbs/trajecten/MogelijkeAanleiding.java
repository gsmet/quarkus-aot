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
package nl.topicus.eduarte.model.entities.dbs.trajecten;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Immutable;

import nl.topicus.eduarte.model.entities.Entiteit;
import nl.topicus.eduarte.model.entities.ViewEntiteit;
import nl.topicus.eduarte.model.entities.dbs.ZorgvierkantObject;
import nl.topicus.eduarte.model.entities.dbs.bijzonderheden.Bijzonderheid;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Incident;
import nl.topicus.eduarte.model.entities.dbs.gedrag.Notitie;
import nl.topicus.eduarte.model.entities.dbs.testen.DeelnemerTest;
import nl.topicus.eduarte.model.entities.personen.Deelnemer;

@Entity
@Immutable
@Cache(usage = CacheConcurrencyStrategy.READ_ONLY, region = "Instelling")
@Table(name = "MogelijkeAanleiding")
public class MogelijkeAanleiding extends ViewEntiteit implements ZorgvierkantObject {
	public enum MogelijkeAanleidingType {
		INCIDENT(Incident.class, "Incident", Incident.INCIDENT, Incident.VERTROUWELIJK_INCIDENT),
		NOTITIE(Notitie.class, "Notitie", Notitie.NOTITIES, Notitie.VERTROUWELIJKE_NOTITIES),
		DEELNEMER_TEST(DeelnemerTest.class, "Test", DeelnemerTest.DEELNEMERTEST,
				DeelnemerTest.VERTROUWELIJKE_DEELNEMERTEST),
		BIJZONDERHEID(Bijzonderheid.class, "Bijzonderheid", Bijzonderheid.BIJZONDERHEID,
				Bijzonderheid.VERTROUWELIJKE_BIJZONDERHEID),
		GESPREK(Gesprek.class, "Gesprek", Gesprek.GESPREK, Traject.VERTROUWELIJK_TRAJECT),
		TEST_AFNAME(TestAfname.class, "Testafname", Traject.TRAJECT, Traject.VERTROUWELIJK_TRAJECT),
		TAAK(Taak.class, "Taak", Traject.TRAJECT, Traject.VERTROUWELIJK_TRAJECT);

		private String label;

		private String securityId;

		private String vertrouwelijkSecurityId;

		private Class<? extends Entiteit> entiteitClass;

		MogelijkeAanleidingType(Class<? extends Entiteit> entiteitClass, String label, String securityId,
				String vertrouwelijkSecurityId) {
			this.entiteitClass = entiteitClass;
			this.label = label;
			this.securityId = securityId;
			this.vertrouwelijkSecurityId = vertrouwelijkSecurityId;
		}

		public Class<? extends Entiteit> getEntiteitClass() {
			return entiteitClass;
		}

		public String getSecurityId() {
			return securityId;
		}

		public String getVertrouwelijkSecurityId() {
			return vertrouwelijkSecurityId;
		}

		@Override
		public String toString() {
			return label;
		}

		public static List<MogelijkeAanleidingType> getTypes(String securityId) {
			List<MogelijkeAanleidingType> ret = new ArrayList<>();
			for (MogelijkeAanleidingType curType : values()) {
				if (curType.getSecurityId().equals(securityId)
						|| curType.getVertrouwelijkSecurityId().equals(securityId))
					ret.add(curType);
			}
			return ret;
		}
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "deelnemer", nullable = false)
	private Deelnemer deelnemer;

	@Temporal(value = TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date datum;

	@Column(nullable = true, length = 2)
	private Integer zorglijn;

	@Column(nullable = false)
	private boolean vertrouwelijk;

	@Column(nullable = false, length = 255)
	private String omschrijving;

	@Column(nullable = false)
	@Enumerated(EnumType.STRING)
	private MogelijkeAanleidingType type;

	@Column(nullable = false)
	private long entiteitId;

	public Deelnemer getDeelnemer() {
		return deelnemer;
	}

	public void setDeelnemer(Deelnemer deelnemer) {
		this.deelnemer = deelnemer;
	}

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	@Override
	public Integer getZorglijn() {
		return zorglijn;
	}

	public void setZorglijn(Integer zorglijn) {
		this.zorglijn = zorglijn;
	}

	@Override
	public boolean isVertrouwelijk() {
		return vertrouwelijk;
	}

	public void setVertrouwelijk(boolean vertrouwelijk) {
		this.vertrouwelijk = vertrouwelijk;
	}

	public String getOmschrijving() {
		return omschrijving;
	}

	public void setOmschrijving(String omschrijving) {
		this.omschrijving = omschrijving;
	}

	public MogelijkeAanleidingType getType() {
		return type;
	}

	public void setType(MogelijkeAanleidingType type) {
		this.type = type;
	}

	public long getEntiteitId() {
		return entiteitId;
	}

	public void setEntiteitId(long entiteitId) {
		this.entiteitId = entiteitId;
	}

	@Override
	public String getSecurityId() {
		return getType().getSecurityId();
	}

	@Override
	public String getVertrouwelijkSecurityId() {
		return getType().getVertrouwelijkSecurityId();
	}

	@Override
	public boolean isTonenInZorgvierkant() {
		return false;
	}
}
