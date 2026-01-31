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

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

import nl.topicus.eduarte.model.entities.organisatie.InstellingEntiteit;

@Entity
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE, region = "Instelling")
public class IbgVerzuimdag extends InstellingEntiteit {
	@Column(nullable = false)
	private Date datum;

	@Column(nullable = false)
	private boolean heledag = true;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "verzuimmelding", nullable = false)
	private IbgVerzuimmelding verzuimmelding;

	@Column(nullable = true)
	private boolean lesuur1;

	@Column(nullable = true)
	private boolean lesuur2;

	@Column(nullable = true)
	private boolean lesuur3;

	@Column(nullable = true)
	private boolean lesuur4;

	@Column(nullable = true)
	private boolean lesuur5;

	@Column(nullable = true)
	private boolean lesuur6;

	@Column(nullable = true)
	private boolean lesuur7;

	@Column(nullable = true)
	private boolean lesuur8;

	@Column(nullable = true)
	private boolean lesuur9;

	@Column(nullable = true)
	private boolean lesuur10;

	@Column(nullable = true)
	private boolean lesuur11;

	@Column(nullable = true)
	private boolean lesuur12;

	public Date getDatum() {
		return datum;
	}

	public void setDatum(Date datum) {
		this.datum = datum;
	}

	public boolean isHeledag() {
		return heledag;
	}

	public void setHeledag(boolean heledag) {
		this.heledag = heledag;
	}

	public IbgVerzuimmelding getVerzuimmelding() {
		return verzuimmelding;
	}

	public void setVerzuimmelding(IbgVerzuimmelding verzuimmelding) {
		this.verzuimmelding = verzuimmelding;
	}

	public boolean isLesuur1() {
		return lesuur1;
	}

	public void setLesuur1(boolean lesuur1) {
		this.lesuur1 = lesuur1;
	}

	public boolean isLesuur2() {
		return lesuur2;
	}

	public void setLesuur2(boolean lesuur2) {
		this.lesuur2 = lesuur2;
	}

	public boolean isLesuur3() {
		return lesuur3;
	}

	public void setLesuur3(boolean lesuur3) {
		this.lesuur3 = lesuur3;
	}

	public boolean isLesuur4() {
		return lesuur4;
	}

	public void setLesuur4(boolean lesuur4) {
		this.lesuur4 = lesuur4;
	}

	public boolean isLesuur5() {
		return lesuur5;
	}

	public void setLesuur5(boolean lesuur5) {
		this.lesuur5 = lesuur5;
	}

	public boolean isLesuur6() {
		return lesuur6;
	}

	public void setLesuur6(boolean lesuur6) {
		this.lesuur6 = lesuur6;
	}

	public boolean isLesuur7() {
		return lesuur7;
	}

	public void setLesuur7(boolean lesuur7) {
		this.lesuur7 = lesuur7;
	}

	public boolean isLesuur8() {
		return lesuur8;
	}

	public void setLesuur8(boolean lesuur8) {
		this.lesuur8 = lesuur8;
	}

	public boolean isLesuur9() {
		return lesuur9;
	}

	public void setLesuur9(boolean lesuur9) {
		this.lesuur9 = lesuur9;
	}

	public boolean isLesuur10() {
		return lesuur10;
	}

	public void setLesuur10(boolean lesuur10) {
		this.lesuur10 = lesuur10;
	}

	public boolean isLesuur11() {
		return lesuur11;
	}

	public void setLesuur11(boolean lesuur11) {
		this.lesuur11 = lesuur11;
	}

	public boolean isLesuur12() {
		return lesuur12;
	}

	public void setLesuur12(boolean lesuur12) {
		this.lesuur12 = lesuur12;
	}
}
