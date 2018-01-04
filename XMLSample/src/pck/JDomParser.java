package pck;

import java.io.File;

import org.jdom2.Document;
import org.jdom2.input.SAXBuilder;
import org.jdom2.output.Format;
import org.jdom2.output.XMLOutputter;

public class JDomParser {

	public static void main(String[] args) {
		SAXBuilder builder = new SAXBuilder();
	
		try {
			Document doc = builder.build(new File("Ogrenci.xml"));
			XMLOutputter outputter = new XMLOutputter(Format.getPrettyFormat());
			outputter.output(doc, System.out);
		} catch (Exception e) {
			e.printStackTrace();		}
	}
}
