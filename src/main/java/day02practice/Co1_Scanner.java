package day02practice;

import java.util.Scanner;

public class Co1_Scanner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Adınızı, ikinci adınızı ve soyadınız arasında boşşluk olacak şekilde giriniz..");
        String str = scan.nextLine().toUpperCase();

        char adIlkkrtr =str.charAt(0);


        char ikinKrkt = str.charAt(str.indexOf(" ")+1);


        char soyad = str.charAt(str.lastIndexOf(" ")+1);
        System.out.println(""+ adIlkkrtr+ikinKrkt+soyad);


    }
}
