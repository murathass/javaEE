package marshallingSample;

import javax.xml.bind.annotation.*;


@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name="ogrenciTipi",propOrder = {"ad","soyad","ders"})
public class Ogrenci {

		@XmlElement
		private String ad;
		
		@XmlElement
		private String soyad;
		
		@XmlElement(name="DERS")
		private String ders;
		
		@XmlAttribute
		private int no;
		
		@XmlTransient
		private String babaAd;

		public String getAd() {
			return ad;
		}

		public void setAd(String ad) {
			this.ad = ad;
		}

		public String getSoyad() {
			return soyad;
		}

		public void setSoyad(String soyad) {
			this.soyad = soyad;
		}

		public String getDers() {
			return ders;
		}

		public void setDers(String ders) {
			this.ders = ders;
		}

		public int getNo() {
			return no;
		}

		public void setNo(int no) {
			this.no = no;
		}

		public String getBabaAd() {
			return babaAd;
		}

		public void setBabaAd(String babaAd) {
			this.babaAd = babaAd;
		}
		
}
