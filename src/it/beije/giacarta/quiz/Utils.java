package it.beije.giacarta.quiz;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Utils {
	
	public static List<Element> getChildElements(Element element) {
		List<Element> childElements = new ArrayList<Element>();
		
		NodeList nodeList = element.getChildNodes();
        Node node = null;
        for (int i = 0; i < nodeList.getLength(); i++) {
        	node = nodeList.item(i);
        	if (node.getNodeType() == Node.ELEMENT_NODE) {
        		childElements.add((Element)node);
        	}
        }
		
		return childElements;
	}

	public static List<Domanda> readFileDomande(String pathFile) {
		List<Domanda> arrayDomande = new ArrayList<Domanda>();
		
		try {
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	        DocumentBuilder builder = factory.newDocumentBuilder();

	        // Load the input XML document, parse it and return an instance of the
	        // Document class.
	        Document document = builder.parse(new File(pathFile));
	        Element element = document.getDocumentElement();	        
//	        System.out.println(element.getTagName());
	        List<Element> domande = Utils.getChildElements(element);
//	        System.out.println(domande);
	        	        
	        Element domanda = null;
	        List<Element> contenutoDomanda = null;
	        for (int i = 0; i < domande.size(); i++) {
	        	domanda = domande.get(i);
	        	contenutoDomanda = Utils.getChildElements(domanda);
		        int id = Integer.parseInt(domanda.getAttribute("id"));
		        int chapter = Integer.parseInt(domanda.getAttribute("chapter"));
		        String testo = contenutoDomanda.get(0).getTextContent();
		        String risposta = contenutoDomanda.get(1).getTextContent();
		        Risposta r = new Risposta();
		        r.setRispostaEsatta(risposta);
	        	Domanda d = new Domanda(id, chapter, testo, r);
	        	arrayDomande.add(d);
	        }	        		
	        
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return arrayDomande;
	}
}
