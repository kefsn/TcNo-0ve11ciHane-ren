package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C02_Scanner {
    public static void main(String[] args) {


        /*
        Kullanicidan dta almak için Scanner clasından scan/input/scanner objesi oluştururu.
        BU şekilde kullanıcıyı yönlendirerek gerekli datayı elde ederiz.







         */
        //1.Adım Scanner clasında bir obje oluşuruyoruz.

        Scanner input = new Scanner(System.in);

        //2.Adım kullaniciya ne yapması gerektiğini öylüyoruz..

        System.out.println("Lutfen cinsiyetinizi giriniz...");
        //3.Adım kullanıcıdan alınan data bir uygun variable konteynera yerleştirilir.
        char cinsiyet = input.next().charAt(0);

        //4.Adım ekranda görebilmek için ve kullanıcının da veridği bilgileri teyit edebilmesi için yazdırıyoruz.
        System.out.println("cinsiyet = " + cinsiyet);

        //Kullanıcıya cinsiyetini, adını, memleketini, yaşını, boyunu, ülkesini sevip sevmediğini,maaşını soran bir program yazınız..

        Scanner input2 = new Scanner(System.in);

        System.out.println("Lütfen cinsiyetinizi giriniz...");
        char gender = input2.next().charAt(0);

        System.out.println("Lütfen adınızı giriniz...");
        String name = input2.next();

        System.out.println("LÜtfen memleketinizi giriniz....");
        String country = input2.next();


        System.out.println("LÜtfen yasşınızı giriniz....");
        int age = input2.nextInt();

        System.out.println("Lütfen boyunuuzu giriniz...");
        double height = input2.nextDouble();

        System.out.println("Lütfen kilonuzu giriniz...");
        double weight = input2.nextDouble();

        System.out.println("Lütfen ülekiniz sevip sevmedeğinizi giriniz...");
        boolean seviyorMu = input2.nextBoolean();

        System.out.println("Lütfen maaşınızı giriniz...");
        long wage = input2.nextLong();

        System.out.println("***  Who is he ***");
        System.out.println("gender : " + gender + "\nisim : " + name + "\nmemleket : " + country + "\nyas : " + age + "\nboy : " + height + "\nseviyorMu : " + seviyorMu + "\nmaas : " + age);


    }//main
}//class
