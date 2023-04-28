package day02practice;

import java.util.Scanner;

public class C07Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir karakter sisteme girmesini isteyin.
        Ternary kullanarak;
        bu karakterin bir harf olup olmadıgını kontrol edin.
        Harf ise büyük veya kucuk harf oldugunu konsola yazdırın
        Harf degilse konsola "Harf Degil" yazdırın
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  bir karakter giriniz...");
       char x = scan.next().charAt(0);

        System.out.println((x>='a' && x<='z') || (x>='A' && x<= 'Z') ?(x>='A' && x<='Z'?" büyük harftir":"Küçük harftir"):("Harf değil"));
    }
}
