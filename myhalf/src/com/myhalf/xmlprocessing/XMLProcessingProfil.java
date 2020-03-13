package com.myhalf.xmlprocessing;


import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
//import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import com.myhalf.beans.Profil;



public class XMLProcessingProfil {

	public static void createNodeInExistingXMLFile(String nameXmlFile, Profil newProfil)
			throws ParserConfigurationException, TransformerException, SAXException, IOException {
		DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
		DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
		Document document = documentBuilder.parse("profil.xml");
		Element root = document.getDocumentElement();

		ArrayList<Profil> proflist = new ArrayList<Profil>();
		proflist.add(new Profil());

		for (Profil i : proflist) {
			Element profils = document.createElement("profil");
			root.appendChild(profils);

			Element profil = document.createElement("profil");
			//TO MOFIF
			profil.appendChild(document.createTextNode(i.getNom()));
			profil.appendChild(document.createTextNode(i.getPrenom()));
			profil.appendChild(document.createTextNode(i.getEmail()));
			profil.appendChild(document.createTextNode(i.getProfession()));
			profil.appendChild(document.createTextNode(i.getAdresse()));
			profil.appendChild(document.createTextNode(i.getSexe()));
			profil.appendChild(document.createTextNode(i.getSituation()));
			profil.appendChild(document.createTextNode(i.getTelephone()));
			profil.appendChild(document.createTextNode(i.getAge().toString()));


			
		}

		DOMSource source = new DOMSource(document);

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transformer = transformerFactory.newTransformer();
		StreamResult result = new StreamResult("profil.xml");
		transformer.transform(source, result);
	}
	
	public static void mainxmlfile(String nameXmlFile, Profil newP) {
		try {
			File xmlFile = new File("profil.xml");
			DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
			Document document = documentBuilder.parse(xmlFile);
			
			Element documentElement = document.getDocumentElement();
			Element textNode = document.createElement("nom");
			textNode.setTextContent("Ngnikam");
			Element textNode1 = document.createElement("prenom");
			textNode1.setTextContent("Naomi");
			Element textNode2 = document.createElement("email");
			textNode2.setTextContent("naomi@gmail.com");
			Element textNode3 = document.createElement("profession");
			textNode3.setTextContent("etudiante");
			Element textNode4 = document.createElement("adresse");
			textNode4.setTextContent(" rue de Paris");
			Element textNode5 = document.createElement("sexe");
			textNode5.setTextContent(" Feminin");
			Element textNode6 = document.createElement("situation");
			textNode6.setTextContent(" celibataire endurcie ");
			Element textNode7 = document.createElement("telephone");
			textNode7.setTextContent("0674432819");
			Element textNode8 = document.createElement("age");
			textNode8.setTextContent("19");
						
			Element nodeElement = document.createElement("profil");
			nodeElement.appendChild(textNode);
			nodeElement.appendChild(textNode1);
			nodeElement.appendChild(textNode2);
			nodeElement.appendChild(textNode3);
			nodeElement.appendChild(textNode4);
			nodeElement.appendChild(textNode5);
			nodeElement.appendChild(textNode6);
			nodeElement.appendChild(textNode7);
			nodeElement.appendChild(textNode8);
			
			documentElement.appendChild(nodeElement);
			document.replaceChild(documentElement, documentElement);
			Transformer tFormer =
			TransformerFactory.newInstance().newTransformer();
			tFormer.setOutputProperty(OutputKeys.METHOD, "xml");
			Source source = new DOMSource(document);
			Result result = new StreamResult(xmlFile);
			tFormer.transform(source, result);
		
		
		} catch (Exception ex) {
			System.out.println(ex);
			}
		}


	public static void createNodeAndNewXMLFile(String nameXmlFile, Profil newP)
			throws ParserConfigurationException, TransformerException {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		DocumentBuilder builder = factory.newDocumentBuilder();
		Document doc = builder.newDocument();

		Element root = doc.createElementNS("profil.com", "profils");
		doc.appendChild(root);
		root.appendChild(createProfil(doc, newP));

		TransformerFactory transformerFactory = TransformerFactory.newInstance();
		Transformer transf = transformerFactory.newTransformer();

		transf.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
		transf.setOutputProperty(OutputKeys.INDENT, "yes");
		transf.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "2");

		DOMSource source = new DOMSource(doc);

		File myFile = new File(nameXmlFile);

		StreamResult console = new StreamResult(System.out);
		StreamResult file = new StreamResult(myFile);

		transf.transform(source, console);
		transf.transform(source, file);
	}

	private static Node createProfil(Document doc, Profil s) {

		Element user = doc.createElement("profil");
		user.appendChild(createSessionElement(doc, "nom", s.getNom()));
		user.appendChild(createSessionElement(doc, "prenom", s.getPrenom()));
		user.appendChild(createSessionElement(doc, "email", s.getEmail()));
		user.appendChild(createSessionElement(doc, "profession", s.getProfession()));
		user.appendChild(createSessionElement(doc, "adresse", s.getAdresse()));
		user.appendChild(createSessionElement(doc, "sexe", s.getSexe()));
		user.appendChild(createSessionElement(doc, "situation", s.getSituation()));
		user.appendChild(createSessionElement(doc, "telephone", s.getTelephone()));
		user.appendChild(createSessionElement(doc, "age", s.getAge().toString()));
		return user;
	}

	private static Node createSessionElement(Document doc, String name, String value) {
		Element node = doc.createElement(name);
		node.appendChild(doc.createTextNode(value));

		return node;
	}

		
	
}
