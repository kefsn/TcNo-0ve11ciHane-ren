package javaders.day03methodcreationscanner;

import static javaders.day02printmethodcreation.MethodCreation.kareAlani;

public class C03_MethodCreation {

    public static void main(String[] args) {

        //Dikdörtgenin alanını hesaplatan bir metod oluşturunuz
        dikdortgeninAlani(10,20);
        double sonuc = 10*20;
        System.out.println("sonuc = " + sonuc);

        dikdortgenAlani(3,5);

        //Karenin alanını hesaplatan methodu yazınız...

        System.out.println(kareninAlani(6)+2);

    }//main

    private static void dikdortgenAlani(int a, int b) {
        System.out.println(a*b);
    }

    private static int kareninAlani(int a) {

        return a*a;
    }

    public static double dikdortgeninAlani(double kisaKenar, double uzunKenar){
        return kisaKenar*uzunKenar;
    }

}//class
