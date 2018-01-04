package unmarshallingsample;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class OgrenciXML2Object {
	
	public static void main(String[] args) {
		try {
			JAXBContext jaxbContext = JAXBContext.newInstance(Ogrenci.class);
			Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
			Ogrenci ogrenci = (Ogrenci) unmarshaller.unmarshal(new File("ogrenci.xml"));
			
			ogrenci.setAd("Murat");
			ogrenci.setSoyad("Has");
			ogrenci.setDers("Java");
			ogrenci.setBabaAd("Ali");
			ogrenci.setNo(1);
			
			Marshaller marshaller = jaxbContext.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			marshaller.marshal(ogrenci, new File("ogrenci2.xml"));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
