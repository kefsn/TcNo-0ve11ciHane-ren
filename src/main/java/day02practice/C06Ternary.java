package day02practice;

import java.util.Scanner;

public class C06Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayri ayri iki tamsayı sisteme girmesini isteyin.
        Ternary kullanarak;
        Sayılar bir birine esit ise konsolda "Sayılar Birbirine Esit" yazdırın
        Sayılar birbirine esit degilse, buyuk olan sayısı ekrana yazdırın.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  birinci tamsayı giriniz...");
        int sayi = scan.nextInt();

        System.out.println("Lütfen ikinci tamsayı giriniz...");
        int sayi2 = scan.nextInt();
  Object str = sayi==sayi2 ?"Sayılar birbirine eşittir":(sayi>sayi2?"Büyük Sayı :"+ sayi:"Büyük sayı :"+sayi2);
        System.out.println(str);
    }
}
