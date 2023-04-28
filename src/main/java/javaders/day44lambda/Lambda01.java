package javaders.day44lambda;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {

    public static void main(String[] args) throws IOException {

       //Ex 1: Verilen text file içindeki text'i konsola yazdıran kodu yazdırınız.

        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")).forEach(System.out::println);



        /*
        /Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")) bu methodu bana stream'a çevrilmiş halde verecek.
          Notlar :

           1) lines methoduna dosya yolunu yazmak için Paths classından get methodunu kullanmalıyız.
           2) foreach() methodu ile satır satır okuma yaptık.
           3) Files classındaki lines methodu datayı Stream olarak verir. Bu sebeple stream'deki bütün
              methodları burada kullanabiliriz.
                  lines methodu Paths.get ile calisir.

         files isimli text'imize ulasmamizi saglayan Paths.get icindeki sifreli kismi aldiktan sonra
        java text icindeki metni bir stream halinde satir satir alt alta siraliyor.
         files.lines kismi kizardiginda main metod yanina exemption'i throws keywordu ile ekladik ve kizariklik sona erdi.
        forEach ile yazdirma islemi yapiliyor.

        forEach methodu icinde lambda expression yerine System.out::println yazdik. Makbul olan budur.
         */

        //Example 2 : Verilen text file icindeki text'i buyuk harflerle console' a yazdiran code u yaziniz
        Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")).map(String::toUpperCase).forEach(System.out::println);

//Example 3 : Verilen text file icindeki text'i "Java" kelimesinin olup olmadigini kontrol eden code u yaziniz
    boolean r1 = Files.lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")).anyMatch(t->t.contains("Java"));
        System.out.println(r1);

//Example 4 : Verilen text file icindeki text'lerde kullanilan farkli kelimeleri bir list icinde return ediniz.
    List<String> words = Files.
            lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")).map(t->t.replaceAll("\\p{Punct}", "").
             split(" ")).
            flatMap(Arrays::stream).//Array'ları yıkmak için flatMap kullandık.Streame koyacak bu method.
            distinct().
            collect(Collectors.toList());

        System.out.println(words);

//Example 5: Verilen text file içindeki text'te toplam kaç harf kullanıldığını gösteren kodu yazınız.
  long numOfLetters  = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();

        System.out.println(numOfLetters);
        /*
        Lambda da iki tür method var.
        1-Terminal Method: Kendisinden sonra method kabul etmez.sum(), count() gibi.
        2-Kendisinden sonra method kabul eden methodlar.
         */


        //Example 5: Verilen text file icindeki text'de kullanilan tum harfleri alfabetik olarak ters sirada bir listin
//           icinde return eden kodu yaziniz.
        List<String> printOfLetters  = Files.
                lines(Paths.get("src/main/java/javaders/day44lambda/myTaskFile.txt")).
                map(t->t.replaceAll("[^A-Za-z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println(printOfLetters);

        /*
        Example:6 Text file icinde kullanilan tum harfleri alfabetik olarak ters sirada bir list icinde return
edecegiz.

1. adim:List olustur

2.adim:text file'i dosyaya ulasacak sekilde al, Files.lines(Paths...

3.adim:map metodu ile harf disindaki karakterleri sil

4.adim:2.map ile split metodu ile hiclikten keserek harfleri al. Array olarak verir.

5.adim:flatMap ile duvari kir ve harflere ulas

6.adim:sorted(Comparator.reverseOrder() ile ters sirada harfler sirala

7.adim:collect(Collectors.toList() ile harfleri list icine yerlestir.

sout icine listin ismini yaz ve calistir
         */




}
}
