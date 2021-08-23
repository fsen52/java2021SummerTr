package day43_Abstract;

public abstract class Banka {

    double Bakiye;

    public abstract double paraYatir(double miktar);

    public abstract double paraCek(double miktar);


    public Banka(double Bakiye) {
        this.Bakiye=Bakiye;

    }

    public Banka() {

        System.out.println("Hesap hareketleri");

    }
}
