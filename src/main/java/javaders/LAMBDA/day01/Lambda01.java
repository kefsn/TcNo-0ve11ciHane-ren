package javaders.LAMBDA.day01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        /*
        1) Lambda method create değil, mevcut methodları libraryden çağırıp kullanmaktır.
        2) Java 8 ile eklenmiştir.
        3) functional programingdir ve mimari yapıya önem vermez.
        4) Hız, clean code ve okunabilirlik açısından önemlidir.
         */

        List<String> iller = new ArrayList<>(Arrays.asList("VAN", "Edirne", "Ordu", "VAN", "Izmir", "Eskişehir", "Safranbolu", "Izmir", "MUS"));


        System.out.println();
        printElements(iller);
        System.out.println();
        printEl(iller);
        System.out.println();
        eHaricElYazdır(iller);
        System.out.println();
        karakSaysDorttenAzyazdir(iller);
        System.out.println();
        dorttenCokOLan(iller);
        System.out.println();
        tekrarsizDorttenCokOLan(iller);
        System.out.println();
        ilkHarfEveyaSOlanlariYazdir(iller);
    }//main

    //Example 1: Bir List'teki elemanlari console'a yazdiran method'u olusturunuz.
    //1.Yol: Structured Programing


    public static void printElements(List<String> iller) {
        for (String w : iller) {
            System.out.print(w + " ");//VAN Edirne Ordu VAN Izmir Eskişehir Safranbolu Izmir MUS
        }
    }


    //2.Yol:LAMBDA
    public static void printEl(List<String> iller) {

        iller.stream().forEach(t -> System.out.print(t + " *"));//VAN *Edirne *Ordu *VAN *Izmir *Eskişehir *Safranbolu *Izmir *MUS *

    }


    //Example 2: Bir List'teki E ile baslayanlar haric tum elemanlari console'a yazdiran method'u olusturunuz.



    public static void eHaricElYazdır(List<String> iller) {
        iller.
                stream().
                filter(t -> !t.startsWith("E")).
                forEach(t -> System.out.print(t + " !"));//VAN !Ordu !VAN !Izmir !Safranbolu !Izmir !MUS !
    }

    //Example 3: Bir List'te character sayisi 4 den az olan tum elemanlari console'a yazdiran method'u olusturunuz.

    public static void karakSaysDorttenAzyazdir(List<String> iller) {
        iller.
                stream().
                filter(t -> t.length() < 4).
                forEach(t -> System.out.print(t + " "));
    }

    //Example 4: Bir List'teki character sayisi 4 den cok olan tum elemanlari buyuk harflerle console'a yazdiran method'u olusturunuz.
    public static void dorttenCokOLan(List<String> iller) {
        iller.
                stream().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()).
                forEach(t -> System.out.print(t + " "));//EDİRNE IZMİR ESKİŞEHİR SAFRANBOLU IZMİR
    }

    //Example 5: Bir List'teki character sayisi 4 den büyük olan tum elemanlari tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void tekrarsizDorttenCokOLan(List<String> iller) {
        iller.
                stream().
                distinct().
                filter(t -> t.length() > 4).
                map(t -> t.toUpperCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.print(t + " "));//EDİRNE IZMİR ESKİŞEHİR SAFRANBOLU IZMİR
    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.


    //Example 7: Bir List'teki elemanlari tekrarsiz olarak kucuk harflerle uzunluklarina gore kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.

    // Example 8: Tum elemanlarin ilk harfini buyuk digerlerini kucuk yazdiran methodu olusturunuz
    public static List<String> ilkHarfBykDigerKucukYazdir(List<String >iller) {
        System.out.print("8) ");
        iller.
                stream().
                map(t->t.substring(0,1).toUpperCase()+t.substring(1).toLowerCase()).
                forEach(t-> System.out.print(t+" "));
        return iller;
    }


    // Example 9: Ilk Harfi "E" veya "S" olanlari bir liste icerisinde yazdiran methodu olusturunuz

    public static List<String> ilkHarfEveyaSOlanlariYazdir(List<String >iller) {
        System.out.print("9) ");
        return     iller.
                stream().
                filter(t->t.startsWith("E") || t.startsWith("S")).
                collect(Collectors.toList());// bir akisin sonuclarini bir listin icinde toparlamak icin kullanilir
    }
}
