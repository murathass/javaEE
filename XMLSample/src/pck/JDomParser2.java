package pck;

import java.util.List;
import java.util.Iterator;
import java.io.File;

import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class JDomParser2 {
	public static void main(String[] args) {
		SAXBuilder builder = new SAXBuilder();
		
		try {
			Document xml = builder.build(new File("Ogrenci.xml"));
			Element root = xml.getRootElement();
			System.out.println("XML in root element:" + root.getName());
			System.out.println("Person in XML : "+ root.getChildren().size());
			List<Element> students = root.getChildren();
			Iterator<Element> itr = students.iterator(); 
				while (itr.hasNext()) {
					Element student = itr.next();
					System.out.println("Student: "+ student.getName());
					System.out.println("Student no: "+ student.getAttributeValue("no"));
					System.out.println("Student name: "+student.getChildText("ad",student.getNamespace()));
					System.out.println("Student name: "+student.getChildText("soyad",student.getNamespace()));
					System.out.println("Student name: "+student.getChildText("yas",student.getNamespace()));
				}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
