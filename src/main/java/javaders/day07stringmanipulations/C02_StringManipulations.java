package javaders.day07stringmanipulations;

import java.util.Scanner;

public class C02_StringManipulations {
    public static void main(String[] args) {

        /*
        Aşağıda ki kurallara göre kullanicinin girdiği password'u kontrol ediniz.
           1) En az 8 karakterden oluşşun.
           2) Password space içermesin.
           3) En az 1 tane büyük harf olsun.
           4) En az 1 tane küçük harf olsun.
           5) En az 1 tane sembol olsunn.
           6) En az bir tane de rakam olsun.

        */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen passwordunuzu giriniz..");

                String pwd = input.nextLine();
//1) En az 8 karakterden oluşşun.
        boolean krktrSys = pwd.length()>7;
        //makbul olanı >7 dir Çünkü javaya daha az iş yaptırır.

        //2) Password space içermesin.
        boolean spaceOlmamali = !pwd.contains(" ");
        // ""== space karakteri içer contains  !==İçermemeli

        //En az 1 tane büyük harf olsun.
        boolean bykHrfOlmali = pwd.replaceAll("[^A-Z]", "").length()>0;

        //Methodlari ayni satirda yan yana yazdırabiliriz buna method zinciri(Method Chain) denir,

        //En az 1 tane küçük harf olsun.
        boolean kckHrfOlmali = pwd.replaceAll("[^a-z]", "").length()>0;

        //En az 1 tane sembol olsun
        boolean sembolHrfOlmali = pwd.replaceAll("[a-zA-Z0-9]", "").length()>0;

        //En az bir tane de rakam olsun.
        boolean rakamHrfOlmali = pwd.replaceAll("[^0-9]", "").length()>0;
        System.out.println("Password Geçerli mi :"+(krktrSys && spaceOlmamali
                && bykHrfOlmali && kckHrfOlmali && sembolHrfOlmali && rakamHrfOlmali));







    }//main

}//Class
