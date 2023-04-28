package day_01practice;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini ve soyismini arasında bosluk olacak sekilde tek bir String olarak sisteme girmesini isteyiniz.
        // isminin ilk karakterini ve soyisminin ilk karakterini BUYUK harfle yazdırınız.

        Scanner scan = new Scanner(System.in);
        System.out.println("İsminizi ve soyisminizi giriniz..");
        String isimSoyisim = scan.nextLine().toUpperCase();

       char isimİlkKarakter = isimSoyisim.charAt(0);
       char soyisimİkinci = isimSoyisim.charAt(isimSoyisim.indexOf(" ")+1);
        System.out.println("" +isimİlkKarakter+soyisimİkinci);
       //2Way
        char soyIsimIlkKarakter2 = isimSoyisim.split(" ")[1].charAt(0);
        System.out.println(soyIsimIlkKarakter2);


    }
}
