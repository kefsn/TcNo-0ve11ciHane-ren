package javaders.day40lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {

        List<String> iller = new ArrayList<>(Arrays.asList("Van", "MUŞ", "Gumushane", "Kutahya", "Ankara", "MUŞ", "Ordu", "Hatay", "Edirne"));
        System.out.println();
        bykHrfLengthArtanDistinct(iller);
        System.out.println();
        bykHrfSonHarfhArtanDistinct(iller);
        System.out.println();
        bykHrfLengthArtanDistinctLengthAlfabetikSira(iller);
        System.out.println();
        System.out.println(krktrSyBesFzlOlanlariSil(iller));
        System.out.println();
        System.out.println(hIleBaslayanOrRIleBitenElSil(iller));
        System.out.println();
        aa(iller);


    }

    // 1) Tum list elemanlarini buyuk harfle, uzunluklarina gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfLengthArtanDistinct(List<String> iller) {
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));//VAN MUŞ ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE
    }


    // 2) Tum list elemanlarini buyuk harfle,
    // son harflerine gore, artan sirada ,tekrarsiz olarak yazdiriniz
    public static void bykHrfSonHarfhArtanDistinct(List<String> iller) {
        iller.
                stream().
                distinct().
                map(t -> t.toUpperCase()).//Bu yapıya Lambda Expresion denir.
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                forEach(t -> System.out.print(t + " "));//Lambda Expretion KUTAHYA ANKARA GUMUSHANE EDİRNE VAN ORDU HATAY MUŞ
    }


    // 3) Tum list elemanlarini buyuk harfle, uzunluklarina gore artan sirada ,tekrarsiz olarak yazdiriniz
    // Uzunluklari ayni olan elemanlar alfabetik sirada olsunlar
    public static void bykHrfLengthArtanDistinctLengthAlfabetikSira(List<String> iller) {
        iller.
                stream().
                distinct().
                map(String::toUpperCase).//Method referans yöntemi
                sorted(Comparator.comparing(String::length).thenComparing(Comparator.naturalOrder())).
                forEach(System.out::println);//Metho referans yöntemi. MUŞ VAN ORDU HATAY ANKARA EDİRNE KUTAHYA GUMUSHANE
        //Once uzunluklarina gore siraladik.thenComparing() ile natural order'a gore siraladik
    }

    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz
    public static List<String> krktrSyBesFzlOlanlariSil(List<String> iller) {
        System.out.println("4) ");
                iller.
                        removeIf(t -> t.length() > 5);
                return iller;
    }

    // 5)"H" ile baslayan veya "r" ile biten elemanlari siliniz
    public static List<String> hIleBaslayanOrRIleBitenElSil(List<String> iller) {
        System.out.println("6) ");

        iller.removeIf(t -> t.startsWith("H")|| t.endsWith("r"));//[Van, MUŞ, MUŞ, Ordu]
              return iller;


    }

    // 6) List elemanlarini karakter sayilarinin karelerini aliniz
    // Ve bir list olarak ekrana yazdirin

    public static void aa(List<String> iller) {


    }
    //  7) List elemanlarindan karakter sayisi cift sayi olanlari
    //  bir list icinde ekrana yazdiriniz.


}
