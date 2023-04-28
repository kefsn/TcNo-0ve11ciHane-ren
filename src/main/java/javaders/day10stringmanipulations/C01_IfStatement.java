package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        //if it rains , I will cancel the picnic.
        //Eğer yağmur yağarsa pikniği iptal edeceğim.

        //Ex: Verilen bir karakterin büyük harf ise ekrana "büyük harf" yazdıran kodu yaz

        char ch = 'A';
        if (ch >= 'A' && ch <= 'Z') {
            System.out.println("Buyuk Harf = " + ch);
        }
        // Verilen sayı çift sayı ise ekrana "Çift Sayi" yazınız.
        byte num = 22;
        if (num % 2 == 0) {
            System.out.println("Cift Sayi = " + num);
        }

        //EX verilene bir sayı 300'den küçük ve ya 1200'den büyük ise "Harika Sayı" yazıran kodu yazınız.

        int sayi = 299;
        if (sayi < 300 || sayi > 1200) {
            System.out.println("Harika sayi = " + sayi);

            // Ex: Kullanicidan alinan datanın Tek mi Çift mi olduğunu bakanız.
            //Bağımsız if yapıları 1. yol
            Scanner input = new Scanner(System.in);
            System.out.println("Lutfen bir sayı giriniz...");
            int a = input.nextInt();
            if (a % 2 == 0) {
                System.out.println("Çift Sayi:" + a);
            }
            if (a % 2 != 0) {
                System.out.println("Tek Sayı = " + a);
            }
            //. Yol if Else

            int num1 = input.nextInt();
            if (num1 % 2 == 0) {//Eğer num içerisinde ki datanun 2'ye bolmunde kalan 0 ise çift sayıya eşit demektir.
                System.out.println("Çift Sayi:" + num1);
            } else {//Else = değilse demek Geriye kalan tüm ihtimalleri için burasi çalışır.
                System.out.println("Tek Sayıdır");
            }

            //Ex: Verilen bir sayının negatif mi, pozitif mi notr mu olduğunu söyleyen kod yazınız.
        }

        // Verilen bir sayı
        int b = 0;
        if (b <0 ){
            System.out.println("Negatif");
        } else if(b==0){
            System.out.println("Notr Sayı");}else{
            System.out.println("Pozitif Sayı");}



    }//main
}//Class
