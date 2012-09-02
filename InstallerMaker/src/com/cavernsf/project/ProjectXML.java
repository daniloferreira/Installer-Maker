package com.cavernsf.project;

import java.io.IOException;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.output.XMLOutputter;

/**
 * Project xml adm
 * @author Danilo Ferreira
 *
 */

public class ProjectXML {

	
	public void save() throws IOException {
		Element project = new Element("InstallerMaker");
		project.setAttribute("name", "teste");
		Document doc = new Document(project);
		XMLOutputter xmlOut = new XMLOutputter();
		xmlOut.output(doc, System.out);
		
	}
}
