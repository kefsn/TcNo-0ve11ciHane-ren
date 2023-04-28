package day_01practice;

import java.util.Scanner;

public class C05_Scanner {
    public static void main(String[] args) {
        /*

        Kullanıcıdan adını, soyadını, yaşını, boyunu ve kilosunu ayrı ayrı sisteme girmesini isteyin
        ve bunları şu şekilde konsola yazdırın:

        Adı: ...
        Soyadı: ...
        Yas: ...
        Boy: ...
        Kilo: ...

	    */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen adınızı giriniz...");
        String adı = scan.nextLine();

        System.out.println("Lütfen soyadınızı giriniz...");
        String soyadı = scan.nextLine();

        System.out.println("Lütfen yaşınızı giriniz...");
        int yas = scan.nextInt();

        System.out.println("Lütfen boyunuzu giriniz...");
        double boy = scan.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz...");
        double kilo = scan.nextDouble();

        System.out.println("Adı = " + adı+"\nSoyadı :"+soyadı+"\nYas :"+yas+"\nBoy :"+boy+"\nKilo :"+kilo);



    }
}
