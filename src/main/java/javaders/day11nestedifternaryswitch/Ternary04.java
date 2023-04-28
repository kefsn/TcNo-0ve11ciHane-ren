package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary04 {
    public static void main(String[] args) {
        /*
        Kullanicidan aldığınız sayı çift ise yarısınız ekrana yazdırınız
        tek ise "Bu sayı ikiye bölünmez" yazdırınız.

        1- Ternary'de true ve durumlar için size verilen data type'ları
        farklı ise oluşturduğunuz konteyner'ın data Type'nı "Object" yapın.
        2- 'Object' Java'da bir classtır.
        3-"Object" Java'da ki bütün class'ların Parent'ıdır,yani babasıdır.
        4-Obcejt Klass'ın parenti yoktur.
        Java'da parent'i olmayan tek class 'Object Class'tır.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an year...");
        int num = input.nextInt();

       Object result = num%2==0 ?num/2 : "Bu sayı ikiye bölünmez";
        System.out.println(result);
    }
}
