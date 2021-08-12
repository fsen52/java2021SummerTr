package day35_Inheritance;

public class Personel {
	
	public String isim;
	
	public int kesat;

	public Personel(int kesat) {

		System.out.println("parent class int parametreli constructor çalıştı");
	
	}

	public Personel() {
	
		System.out.println("parent class parametresiz constructor çalıştı");
	
	}

	public Personel(String isim) {

		System.out.println("parent class parametreli constructor çalıştı");
	}


}
