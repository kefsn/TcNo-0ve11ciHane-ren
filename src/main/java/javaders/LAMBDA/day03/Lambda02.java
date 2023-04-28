package javaders.LAMBDA.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {

    public static void main(String[] args) {

        /*
        allMatch(): Tüm elemanlar şartı sağlıyorsa true döndürür.
        anyMatch(): Bir yada birden fazla eleman şartı sağlarsa hemen true döndürür.
        noneMatch(): Hiçbir eleman  şartı sağlamazsa true döndürür.En az bir eleman sarti saglarsa false dondurur.
         */


Universite u1 = new Universite("hacetepe","fizik",1000,75);
Universite u2 = new Universite("odtu","matematik",2000,80);
Universite u3 = new Universite("bagazici","java",3000,85);
Universite u4 = new Universite("marmara","sql",4000,90);
Universite u5 = new Universite("itu","resim",5000,90);
Universite u6 = new Universite("erciyes","api",6000,75);
Universite u7 = new Universite("karaelmas","muzik",7000,80);
Universite u8 = new Universite("bilken","bilgisayar muh",8000,100);

        List<Universite> list = new ArrayList<>(Arrays.asList(u1,u2,u3,u4,u5,u6,u7,u8));
        System.out.println(noteOrt75tenBuyuk(list));
        System.out.println(matematikBolumuVarMi(list));
        System.out.println(ogrenciSayilarinaGoreBuyuktenKucugeListYazdir(list));

    }
    // Task 01 : Butun universitelerin not ortalamasinin 75'ten buyuk oldugunu gosteren bir program olusturunuz.
public static boolean noteOrt75tenBuyuk(List<Universite> list){
    System.out.println("1: ");
        return list.
                stream().
                allMatch(t->t.getNotOrtalamasi()>75);
}



    // Task 02 : Universitelerden herhangi birinde matematik bolumu olup olmadigini kontrol eden bir program olusturunuz.

    public static boolean matematikBolumuVarMi(List<Universite> list){
        System.out.println("2 : ");
        return list.
                stream().
                anyMatch(t->t.getBolumAdi().equalsIgnoreCase("matematik"));
    }



    // Task 03 : Universiteleri ogrenci sayilarina gore buyukten kucuge siralayip liste halinde veren bir program olusturunuz.


    public static List<Universite> ogrenciSayilarinaGoreBuyuktenKucugeListYazdir(List<Universite> list){
        System.out.println("3 : ");
       List<Universite> unvOgrSayilari =  list.
               stream().
               sorted(Comparator.comparing(Universite::getOgrenciSayisi).reversed()).
               collect(Collectors.toList());


return unvOgrSayilari;

    }




















}
