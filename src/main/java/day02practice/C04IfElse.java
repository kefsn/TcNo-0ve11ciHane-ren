package day02practice;

import java.util.Scanner;

public class C04IfElse {
    public static void main(String[] args) {
        /*
        Kullanıcıdan ayrı ayrı iki kelime sisteme girmesini isteyin.
        Eger İlk kelimenin karakter sayısı çift ise, ikinci kelimeyi birinci kelimenin ortasına koyun.
        İlk kelimenin karakter sayısı tek ise, konsola "ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli" yazdırın.
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  birinci kelime giriniz...");
        String kelime = scan.next();

        System.out.println("Lütfen  ikinci kelime giriniz...");
        String kelime2 = scan.next();
        if(kelime.length()%2==0){
            String kelimeIlkYar = kelime.substring(0,kelime.length()/2);
            String kelimeIkıncıYar = kelime.substring(kelime.length()/2);
            System.out.println(kelimeIlkYar+kelime2 +kelimeIkıncıYar);

        }else{
            System.out.println("ilk kelimenin ortasina ikinci kelimeyi koyamazsin cunku ilk kelime tek karakterli");
        }
    }
}
