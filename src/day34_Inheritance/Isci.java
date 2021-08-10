package day34_Inheritance;

public class Isci extends Muhasebe {

	public static void main(String[] args) {

		Isci isci1 = new Isci();
		
		isci1.isim = "Omer";
		isci1.soyisim = "AYDIN";
		isci1.id = 1001;
		isci1.izin = false;
		isci1.ucret = 10;
		isci1.maas = isci1.maasHesapla();
		isci1.statu = "amele";
		
		
		System.out.println(isci1.id + " " +isci1.isim + " " + isci1.soyisim + " "+ isci1.statu + " " + isci1.maas + " tl" );
		
		Isci isci2 = new Isci();
		
		isci2.isim = "Ahmet";
		isci2.soyisim = "MAHMUT";
		isci2.id = 1002;
		isci2.izin = false;
		isci2.ucret = 11;
		isci2.maas = isci2.maasHesapla();
		isci2.statu = "büro elemanı";
		
		
		System.out.println(isci2.id + " " +isci2.isim + " " + isci2.soyisim + " "+ isci2.statu + " " + isci2.maas + " tl" );
		
	}

}
 