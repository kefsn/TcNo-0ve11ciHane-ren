package javaders.day42lambda;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Tom");
        names.add("Alex");
        names.add("Jim");
        names.add("Michael");
        names.add("Mary");
        names.add("Alexander");
        names.add("Alex");

        System.out.println(sortWithLastCharDistincUpperInList1(names));
        System.out.println(sortWithLastCharDistincUpperInList2(names));
        System.out.println(sortWithLengtReversedSameLengthInNaturalOrderLowerInList(names));
        System.out.println(isLengthMoreThanTwo(names));
        System.out.println(atLeastOneLengthLessThanFour(names));
    }

    //Example 1: List elemanlarini son harflerine gore natural
    // order'da tekrarsiz olarak buyuk harfle bir list'in icinde return ediniz.
    //1.Way
    public static  List<String> sortWithLastCharDistincUpperInList1(List<String> names){
      return   names.
                stream().
                distinct().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t->t.charAt(t.length()-1))).
                collect(Collectors.toList());//[MİCHAEL, TOM, JİM, ALEXANDER, ALEX, MARY]
    }

    //2.WAy
    public static List<String> sortWithLastCharDistincUpperInList2(List<String> names) {
        return names.
                stream().
                map(String::toUpperCase).
                sorted(Comparator.comparing(t -> t.charAt(t.length() - 1))).
                collect(Collectors.toList());
        /*
        // Normalde distinct(tekrarsız) elemanlari depolamak icin "Set" kullanilir.
                             // ama lambda'daki collect(Collectors.toSet()); method'u elemanlari
                             // rastgele siralar halbuki bu soruda rastgele siralama kabul edilmiyor.
                             // Bu yuzden mecburen collect(Collectors.toList()); kullandik.
         */

    }
    //Example 2:List elemanlarini character sayilarina gore
    // ters sirada kucuk harfle bir list'in icinde return ediniz.
//Ayni character sayisina sahip elemanlar kendi icinde
// alfabetik sirada olsun
    public static  List<String> sortWithLengtReversedSameLengthInNaturalOrderLowerInList(List<String> names){
        return   names.
                stream().
                map(String::toLowerCase).
                sorted(Comparator.comparing(String::length).reversed().thenComparing(t->t.charAt(0))).
                collect(Collectors.toList());

    }

    //Ex: List elemanlarının tamamının character sayısını 2 den büyük
    //olup olmadığını kontrol eden methodu oluşturunuz.

    public static boolean isLengthMoreThanTwo(List<String> names){
      return   names.
                stream().
                allMatch(t->t.length()>2);//Hepsi örtüşüyormu?

    }
    //Example 4: List elemanlarinin hicbirinin character sayisinin 3 den kucuk olmadigini kontrol eden method'u olusturunuz.
    public static boolean noLengthLessThanThree(List<String> names){
        return   names.
                stream().
                noneMatch(t->t.length()<3);//Hiçbiri  örtüşüyormu?

        /*
        Bu soruda yeni olan seyler: Elemanlarin hicbiri dendigine gore noneMatch methodu kullanilacak.
       Yine boolean bir method olusturduk. sirasiyla return names.stream().noneMatch(t->t.length()<3);
         */
    }
    //Example 5: List elemanlarinin en az birinin
    // character sayisinin 4 den kucuk olup olmadigini kontrol eden method'u olusturunuz.
    public static boolean atLeastOneLengthLessThanFour(List<String> names){
        return   names.
                stream().
                anyMatch(t->t.length()<4);//Herhangi örtüşen var mı?

    }
    /*
    Hepsi için allMatch();
    Hiçbiri için noneMatch();
    Herhangi bir eleman içinanyMatch();

    allMatch() ==> tum elemanlar sarti saglarsa true dondurur
    anyMatch() ==>bir yada birden daha fazla eleman sarti saglarsa true dondurur
    noneMatch() ==>hic bir eleman sarti saglamazsa true dondurur
     */



}
