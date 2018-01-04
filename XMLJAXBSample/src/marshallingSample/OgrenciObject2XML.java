package marshallingSample;

import java.io.File;
import java.io.FileWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

public class OgrenciObject2XML {

	public static void main(String[] args) {
		
		Ogrenci ogrenci = new Ogrenci();
		ogrenci.setAd("Murat");
		ogrenci.setSoyad("Has");
		ogrenci.setNo(1);
		ogrenci.setDers("JavaEE");
		ogrenci.setBabaAd("Ali");
		
		try {
			FileWriter writer = new FileWriter(new File("Ogrenci.xml"));
			JAXBContext jc = JAXBContext.newInstance(Ogrenci.class);
			Marshaller marshaller = jc.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT,true);
			marshaller.marshal(ogrenci, writer);
			marshaller.marshal(ogrenci, System.out);
		} catch (Exception e) {
			e.printStackTrace();
		}


	}

}
