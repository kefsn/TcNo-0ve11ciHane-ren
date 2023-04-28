package day_01practice;

import java.util.Scanner;

public class C04_Dikdortgen {
    public static void main(String[] args) {

        // Kullanicidan dikdortgenin a ve b kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        // ve Dikdorgenin cevresini hesaplayarak ekrana yazdiriniz

        Scanner scan = new Scanner(System.in);
        System.out.println("Dikdörtgenin 'a' kenarını giriniz...");
        int a = scan.nextInt();

        System.out.println("Dikdörtgenin 'b' kenarını giriniz...");
        int b = scan.nextInt();

        System.out.println("Dikdörtgenin Çevresi : "+(2*a) + (2*b));

    }
}
