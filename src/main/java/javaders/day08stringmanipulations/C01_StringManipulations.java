package javaders.day08stringmanipulations;

import java.util.Scanner;

public class C01_StringManipulations {
    public static void main(String[] args) {

        /*
        Kullanicidan email adresini girmesini isteyin,
    Asagidaki kurallara gore kullanicinin
    girdigi email adresini kontrol ediniz.
           i)mail adresi "@gmail" icermeli
           ii)Space characteri mail'de olmamali
           iii)mail adresinde buyuk harf olmamali
           iv)En az bir tane noktalama isareti bulunmal
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi \ni)mail adresi \"@gmail\" icermeli\n" +
                "           ii)Space characteri mail'de olmamali\n" +
                "           iii)mail adresinde buyuk harf olmamali\n" +
                "           iv)En az bir tane noktalama isareti bulunmal\n şeklinde veriniz..");

        String mail = input.nextLine();

        //i)mail adresi "@gmail" icermeli
        boolean first = mail.contains("@gmail");
        System.out.println(first);

        //ii)Space characteri mail'de olmamali
       boolean second = !mail.contains(" ");
        System.out.println(second);

        //iii)mail adresinde buyuk harf olmamali
        boolean upperCaseNot=mail.replaceAll("[^A-Z]","").length()==0;
        System.out.println("upperCaseNot = " + upperCaseNot);

        boolean third = mail.replaceAll("[a-z0-9]", "").
                replaceAll("[\\p{Punct}]", "").
                replace(" ", "").length()==0;
        System.out.println("Büyük harf olmamalı = " + third);
        /*
        boolean third = !mail.contains("[A-Z]");
        System.out.println(third);
        -Contais metodu Regex karakterleriyle doğru şekilde çalışmaz.
        bu nedenle replaceAll() ya da replace() ile silme yapip
        geriye kalanları length()'ne bakilir.
         */


        //iv)En az bir tane noktalama isareti bulunmalı
        boolean fourth = mail.replaceAll("[a-zA-Z0-9]", "").
                replace(" ", "").length()>0;

        //boolean fourth = mail.replaceAll("^\\p{P}", "").length()>0;
        System.out.println(fourth);

        System.out.println(first&& second&&third&&fourth);
        /*

         */
        String str = "burada bir gariplik var.?-!";
        System.out.println(str.replaceAll("[^\\p{P}]", ""));










    }//main
}//Class
