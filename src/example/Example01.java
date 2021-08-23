package example;

import java.util.Scanner;

public class Example01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen ekrana yazdırmak istediğiniz ismi giriniz ...");
        String name = scan.next();

        System.out.println("girilen isim : " + name);
    }
}
