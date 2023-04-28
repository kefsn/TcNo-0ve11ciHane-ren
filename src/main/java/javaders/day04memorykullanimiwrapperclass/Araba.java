package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class Araba {

    public String model = "v60"; // Variables pasif özellikleri
    public String renk = "Beyaz";
    public int fiyat = 1500000;

    public static void main(String[] args) {



        /*
    Class ==> Variable(Pasif Özellikler)
              Metodlar ( Aktif özellikler)Function da denilebilir



     */
        // Class ismi objenin ismi Atama operatörü NewKeyword Classismi(Constructer)();

        Scanner input = new Scanner(System.in);
        Araba volvo = new Araba();

        hareket();
        dur();
        yakit();
        System.out.println(volvo.fiyat);
        System.out.println(volvo.model);
        System.out.println(volvo.renk);


    }

    private static void yakit() {
        System.out.println("Volvolar a yakit tuketir...");
    }

    static void dur() {
        System.out.println("Volvo guvenle durur..");
    }

    public static void hareket() {

        System.out.println("volvo hizli gider...");
    }


}



