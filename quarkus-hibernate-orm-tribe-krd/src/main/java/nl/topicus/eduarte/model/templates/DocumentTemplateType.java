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
package nl.topicus.eduarte.model.templates;

public enum DocumentTemplateType {
	CSV("CSV bestand", "text/csv"),
	RTF("RTF document", "text/rtf"),
	JRXML("Jasper Reports document", "application/octet-stream"),
	PDF("PDF document", "application/pdf"),
	XLS("Excel 97-2003 document", "application/vnd.ms-excel"),
	XLSX("Excel document", "application/vnd.openxmlformats-officedocument.spreadsheetml.sheet"),
	DOCX("Word document",
			"application/vnd.openxmlformats-officedocument.wordprocessingml.document"),
	DOTX("Word template",
			"application/vnd.openxmlformats-officedocument.wordprocessingml.template"),
	DOCM("Word document (macro-enabled)", "application/vnd.ms-word.document.macroEnabled.12"),
	DOTM("Word template (macro-enabled)", "application/vnd.ms-word.template.macroEnabled.12"),
	HTML("HTML-bestand", "text/html"),
	ZIP("Zip bestand", "application/zip"),
	XML("XML-bestand", "text/xml"),
	XHTML("XHTML-bestand", "application/xhtml+xml");

	private DocumentTemplateType(String omschrijving, String mimeType)
	{
		this.omschrijving = omschrijving;
		this.mimeType = mimeType;
	}

	private String omschrijving;

	private String mimeType;
	/**
	 * @return een mooie omschrijving van het bestandstype.
	 */
	public String getOmschrijving()
	{
		return omschrijving;
	}

	/**
	 * @return geeft de mimetype in string formaat terug.
	 */
	public String getMimeType()
	{
		return mimeType;
	}

	/**
	 * @return extensie exclusief "."
	 */
	public String getFileExtension()
	{
		return name().toLowerCase();
	}

}
