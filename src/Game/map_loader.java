package Game;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;




public class map_loader {
	
	public static void main(String[] args) throws Exception {
}

	public static void getmap(String mapname) throws Exception {
		File file = new File(mapname);
		DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
		DocumentBuilder db = dbf.newDocumentBuilder();
		Document mapfile = db.parse(file);
		mapfile.getDocumentElement().normalize();
		System.out.println("Root element :" + mapfile.getDocumentElement().getNodeName());
		NodeList nList = mapfile.getElementsByTagName("Map");
		NodeList portalList= mapfile.getElementsByTagName("portal");
		System.out.println("----------------------------");
		System.out.println("Node list: " + nList);
		
		for (int temp = 0; temp < portalList.getLength(); temp++) {
			Node nNode = portalList.item(temp);
			if (nNode.getNodeType() == Node.ELEMENT_NODE) {
	            Element eElement = (Element) nNode;			
	            System.out.println("Portal id : " + eElement.getAttribute("id"));
			}
		}
		
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node nNode = nList.item(temp);

	        System.out.println("\nCurrent Element :" + nNode.getNodeName());

	        if (nNode.getNodeType() == Node.ELEMENT_NODE) {

	            Element eElement = (Element) nNode;

	            System.out.println("Portal id : " + eElement.getAttribute("id"));
	            System.out.println("Node 1: " + eElement.getElementsByTagName("node1").item(0).getTextContent());
	            System.out.println("Node 2 : " + eElement.getElementsByTagName("node2").item(0).getTextContent());
	            System.out.println("Node 3 : " + eElement.getElementsByTagName("node3").item(0).getTextContent());
	            System.out.println("Node 4 : " + eElement.getElementsByTagName("node4").item(0).getTextContent());
		}
	}

	}}
