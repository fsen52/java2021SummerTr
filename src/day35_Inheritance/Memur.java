package day35_Inheritance;

public class Memur extends Personel {

	public int maas;
	
	
	
	public Memur(int maas) {
		super();
		
		System.out.println("child class parametreli constructor çalıştı");
	}



	public Memur() {
		System.out.println("child class parametresiz constructor çalıştı");
	
	
	}
	
	
	
	public static void main(String[] args) {

		Memur obj1 = new Memur(2400);
		
		System.out.println(obj1.kesat);
	



	}

}
