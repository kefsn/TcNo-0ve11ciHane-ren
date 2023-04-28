package javaders.LAMBDA.day04lambda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) throws IOException {

        //EX 1) Bir metin dosyasındaki tüm satırları okuyun ve ekrana yazdırın.
        System.out.println("Ex 1) ");
        Files.
                lines(Paths.get("src/main/java/javaders/LAMBDA/day04lambda/TxtFile")).
                forEach(System.out::println);


        // Ex 2) Bir metin dosyasındaki tüm satırları büyük harflerle okuyun ve ekrana yazdırın.
        System.out.println("Ex 2) ");
        Files.
                lines(Paths.get("src/main/java/javaders/LAMBDA/day04lambda/TxtFile")).
                map(String::toUpperCase).
                forEach(System.out::println);


        // Ex 3) Bir metin dosyasındaki herhangi bir satırda "Java" kelimesi var mı yok mu kontrol edin.
        System.out.println("Ex 3) ");
        boolean varMı = Files.lines(Paths.get("src/main/java/javaders/LAMBDA/day04lambda/TxtFile")).
                anyMatch(t -> t.contains("Java"));
        System.out.println(varMı);

        // Ex 4) Bir metin dosyasındaki tüm farklı kelimeleri bir liste içinde döndürün.
        System.out.println("Ex 4) ");
        List<String> words = Files.
                             lines(Paths.get("src/main/java/javaders/LAMBDA/day04lambda/TxtFile")).
                             map(t -> t.replaceAll("\\p{Punct}", "").
                             split(" ")).
                             flatMap(Arrays::stream).
                             distinct().
                             collect(Collectors.toList());
        System.out.println(words);
        //Ya da flatMap(line->Arrays.stream(line.split( " "))) == flatMap(Arrays::stream).

        // Ex 5) Bir metin dosyasındaki tüm harflerin sayısını hesaplayın.
        System.out.println("Ex 5) ");
        long countLetters  = Files.
                lines(Paths.get("src/main/java/javaders/LAMBDA/day04lambda/TxtFile")).
                map(t->t.replaceAll("[^A-Za-z]", "")).
                map(t->t.split("")).
                flatMap(Arrays::stream).
                count();

        System.out.println(countLetters);

        // Ex 6) Bir metin dosyasındaki tüm harfleri alfabetik olarak ters sırayla bir listeye ekleyin.
        System.out.println("Ex 6) ");
 List<String> letterss =  Files.
        lines(Paths.get("src/main/java/javaders/LAMBDA/day04lambda/TxtFile")).
        map(t->t.replaceAll("[^A-Za-z]", "")).
        map(t->t.split("")).
        flatMap(Arrays::stream).
        sorted(Comparator.reverseOrder()).
        collect(Collectors.toList());
        System.out.println(letterss);

        //2. way
        List<String> reversedAlpLetters= Files.
                lines(Paths.get("src/main/java/LAMBDA/day04/Txt.File")).
                map(line->line.replaceAll("[^a-zA-Z]","")).
                flatMap(line->Arrays.stream(line.split(""))).
                sorted(Comparator.reverseOrder()).
                collect(Collectors.toList());
        System.out.println("reversedAlpLetters = " + reversedAlpLetters);


        /*
        Limit
Elimizde var olan bir veri kaynağını, göstermek istediğimiz kadarını
göstermemize yarayan,sınırlandıran bir metoddur. Parametre olarak
vereceğimiz rakamla aslında Stream içerisinde dönen çok sayıda veri
var ancak sen bize şu kadarını göster diyoruz.

findFirst() => İlk elemanı verir. Optional return eder.

split()=>Bu String öğesini verilen normal ifadenin eşleşmelerine böler.

Comparator => bir Class'tır. Compar karşılaştırmak demektir.
Bazı nesneler koleksiyonuna toplam sıralama uygulayan bir karşılaştırma
işlevi.Karşılaştırıcılar, sıralama düzeni üzerinde hassas kontrol
sağlamak için bir sıralama yöntemine (Collections.sort veya Arrays.sort
gibi) aktarılabilir.Karşılaştırıcılar, belirli veri yapılarının
(sıralı kümeler veya sıralı haritalar gibi) sırasını kontrol etmek veya
doğal sıralaması olmayan nesnelerin koleksiyonları için bir sıralama
sağlamak için de kullanılabilir.

reverseOrder() => Comparator Class'ının bir methodudur.
Doğal sıralamanın tersini (büyükten küçüğe) uygulayan bir Comparator
(karşılaştırıcı) döndürür.
comparing() => karşılaştırma demektir.
reversed() => Bu karşılaştırıcının (comparator) ters sıralanmasını
uygulayan bir karşılaştırıcı (comparator) döndürür.


skip(n) => atlama demek. Akışın ilk n elemanını attıktan sonra bu
akışın kalan elemanlarından oluşan bir akış döndürür.
Bu akış n'den daha az öğe içeriyorsa, boş bir akış döndürülür.
Bu, durum bilgisi olan bir ara işlemdir.
skip(list.size()-1) => List'in uzunluğunun 1 eksiğini yazarsak son
elemanı yazdırırız.












         */
    }
}
