package day43_Abstract;

public class BenimHesabim extends Banka{

    @Override
    public double paraYatir(double miktar) {
        super.Bakiye+=miktar;
        return Bakiye;
    }

    @Override
    public double paraCek(double miktar) {
        super.Bakiye-=miktar;
        return Bakiye;
    }

    public BenimHesabim() {
    }

    public BenimHesabim(double Bakiye) {
        super(Bakiye);

        System.out.println("Bakiyeniz : " + Bakiye);
    }
}
