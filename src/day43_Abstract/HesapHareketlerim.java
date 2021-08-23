package day43_Abstract;

public class HesapHareketlerim {

    public static void main(String[] args) {
        BenimHesabim obj1 = new BenimHesabim(2500);
        BenimHesabim obj2 = new BenimHesabim();

        System.out.println(obj1.paraYatir(3500));
        System.out.println(obj1.paraCek(2750));

    }
}
