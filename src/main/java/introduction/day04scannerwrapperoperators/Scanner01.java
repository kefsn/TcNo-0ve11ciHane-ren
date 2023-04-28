package introduction.day04scannerwrapperoperators;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Soru: Kullanicidan alacağınız 5 basamaklı bir sayının ilk ve son iki basamağındaki rakamlarin toplamını yazdiran kodu yazınız.
        //Bir tamsayiyi bir tam sayiya bölerseniz java sonucu kesinlikle tamsayi yapar.
        //Ondalikli kismi iptal eder.Java yuvarlama yapmaz.


        Scanner input = new Scanner(System.in);

        System.out.println("Lütfen 5 basamkli bir sayi giriniz...");

        int number = input.nextInt();
        //% ==> Modulus operatör solunda bulunan sayinin saginda bulunan sayiya bolumunden kalani verir.
        //Dolayisiyle %10 her zaman bize birler basamağında ki sayiyi verir.
        //Bir tam sayıyı baska tamsayıya bolersek java sonucu kesinlikle bir tam sayı yapar.
        //Java bu durumda yuvarlama yapmaz ondalikli kismi iptal eder
        //Dolayisiyla bir tam sayıyı 10'a bölersek birler basamağını silmiş olur.

        //son rakamı al
       int lastDigit = number%10;
       //Sayi kucul
       number = number/10;

       //sondan ikinci rakami al
       int lastSecond = number%10;

       //sayi kucult
        number = number/10;
        //sondan ucuncu rakami al
       int lastThird = number%10;
       //sayi kucult
        number = number/10;
        //Sondan dorduncu rakami al
        int lastFourthDigit = number%10;
        //sayi kucul
        number = number/10;
        //sondan besinci rakami al
        int lastFifth = number%10;
        //sayiyi kucult
        number = number/10;

        System.out.println(lastDigit+lastSecond+lastFourthDigit+lastFifth);

        System.out.println("**** 2. Yol *****");

        int a = input.nextInt();
        int s5 = a%10;
        int s4 = (a/10)%10;
        int s3 = (a/100)%10;
        int s2 = (a/1000)%10;
        int s1 = (a/10000)%10;
        System.out.println("Sonuç :" +(s5+s4+s2+s1));





    }

}
