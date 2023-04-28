package day02practice;

import java.util.Scanner;

public class C05Ternary {
    public static void main(String[] args) {
        /*
            Kullanıcıdan bir tam sayı sisteme girmesini isteyin
            Ternary kullanarak;
            Girilen sayı çift ise konsola "Cift Sayi" yazdirin
            Girilen Sayi tek ise girilen sayıyı 3 artırarak konsola yazdırınız.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  bir tamsayı giriniz...");
      int sayi = scan.nextInt();
        String str = sayi%2==0?"Çift Sayıdır":""+(sayi+3);//String yerine object de kullanılabilir.
        System.out.println(str);
    }
}
