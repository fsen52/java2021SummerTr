package day34_Inheritance;

public class Muhasebe extends Personel {

	public int ucret;
	public String statu;
	public int maas;
	
	
	
	
	public int maasHesapla() {
		
		maas = 30*8*ucret;
		
		return maas;
	}
	
	
	
	

}
