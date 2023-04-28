package introduction.day03scanner;

import java.util.Scanner;

public class Scanner05 {
    public static void main(String[] args) {
        //Kullanicidan bir dikdörtgenin iki kenar uzunluğunu aldınız
        //i) Alanini hesaplayiniz
        //ii) Cevresini hesaplayiniz

        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen iki kenar uzunluğunu giriniz...");

        double kisaKenar = input.nextDouble();
        double uzunKenar = input.nextDouble();

        System.out.println(kisaKenar * uzunKenar);
        System.out.println(kisaKenar + kisaKenar + uzunKenar + uzunKenar);

        double alan = kisaKenar * uzunKenar;
        System.out.println("alan = " + alan);


    }
}
