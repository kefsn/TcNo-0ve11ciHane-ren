package day_06_practice;

import java.util.Scanner;

public class C04_ForAgac {
    public static void main(String[] args) {
        /*

         Agac sekli olusturmak icin, kullanicidan yaprak satir sayisini ve gövde satir sayisini ayrı ayrı
         sisteme girmesini isteyiniz.

         Asagıdaki agac seklini konsala yazdırınız


        ^
        ^^
        ^^^
        ^^^^
        ^^^^^
        |||
        |||
        |||
        |||
        |||


         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yaprak satır sayısını giriniz...");
        int yaprakSatirSayisi = scan.nextInt();

        System.out.println("Lütfen gövde satır sayısını giriniz...");
        int govdeSatirSayisi = scan.nextInt();

        String yaprak = "";

        for (int i = 0; i <yaprakSatirSayisi ; i++) {

                yaprak = yaprak + "^";
            System.out.println(yaprak);

        }
            for (int k = 0; k <govdeSatirSayisi ; k++) {
                System.out.println("|||");
            }
        }
    }

