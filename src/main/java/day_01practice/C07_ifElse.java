package day_01practice;

import java.util.Scanner;

public class C07_ifElse {
    public static void main(String[] args) {
        // Kullanicidan ayri ayri sisteme iki sayi girmesini isteyiniz.
        // ilk sayinin ikinci sayidan buyuk olup olmadıgını yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int ilkSayi = scan.nextInt();

        System.out.println("Lütfen ikinci sayıyı giriniz");
        int ikinciSayi = scan.nextInt();
        if(ilkSayi>ikinciSayi){
            System.out.println("İlk sayı ikinci sayıdan büyüktür.");
        }else if (ilkSayi<ikinciSayi){
            System.out.println("İlk sayı ikinci sayıdan büyük değildir...");
        }else{
            System.out.println("Sayılar birbirine eşit...1");
        }

    }
}
