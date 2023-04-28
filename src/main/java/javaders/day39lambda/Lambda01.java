package javaders.day39lambda;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda01 {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Clara");
        myList.add("Tom");
        myList.add("Angelina");

        printElements(myList);
        System.out.println();
        printEl(myList);
        System.out.println();
        printElExceptStartsWithT(myList);
        System.out.println();
        printElemanLengthLessThanFour(myList);
        System.out.println();
        printElemanLengthgraterThanFour(myList);
        System.out.println();
        printElementLengthMorethanFourUniqueLowerCase(myList);
        System.out.println();
        printElUniqueToUpperCaseSorted(myList);
        System.out.println();
       printElUniqueToLowerCaseSortedWithLength(myList);
    }

    //Lambda collection ve listlerde kullanilabilir fakat map'lerde kullanilamaz
    //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.Akışa sunar
    //sorted() methodu natural order olarak calisir.String datalar icin A'dan Z'ye integer datalar icin 1-999 seklinde siralama yapar
    //lambda'da elemanlari azaltan methodlar -bazen istisna olsa da- cogunlukla once kullanilir.
    //tersten siralama reverse order'dir



    //Example 1: Bir List'teki elemanlari console'a yazdiran methodu oluşturunuz.
//1. Yol
    public static void printElements(List<String> myList) {

        for (String w : myList) {
            System.out.println(w + " ");
        }


    }


    //2.yol LAMBDA EXPRESSION
    //Lambda functional programingtir.

    public static void printEl(List<String> myList) {

        myList.stream().forEach(t -> System.out.println(t + " "));//Functional Programing deniliyor buna. Mimari önemsizdir burda.
        //stream() List'in yapisini yukaridan asagiya olacak sekilde degistirir.
    /*
     Functional Programing ==>sadece metodlarin kullanildigi mimarinin onemsiz oldugu kod.
                                                          // Lambda functional programing'dir.

    Ikinci Yolumuz:  Burada Lambda'dan faydalanacagiz. Ayni methodu alip, List'in yapisini stream yapmasini isteyecegiz.
    Boylelikle bircok methodu kullanabiliriz. Ornek: myList.stream().forEach();
    Buarada myList'i stream'e cevirdik ve for each methodunu kullanmasini istedik. for each methodu icine
    t-> System.out.print(t); yazdik. Kodu bu sekilde calistirinca birinci yoldaki ile ayni sonucu ekrana yazdi.

    myList'imizde Tom, Jim, Clara var. stream ile listin [Tom, Jim, Clara] yapisi yukaridan asagiya olacak sekilde
    degisti. Tom
         Jim
         Clara

    stream'a donusunce for each ilk elemani alip t icine koyuyor. Biz java'ya print t deyince buaraya Tom yaziyor.
     Sonra for each gelip ikinci elamani aliyor. javaya print deyince Jim yazdiriyor ve devaminda Clara'yi bu sekilde yazdiriyor. Her yazdirmada bir bosluk birakiyor.
     */
    }
    //Ex: Bir listteki t ile başlayanlar hariç tüm elemanları consola yazdıran methodu oluşturunuz.

    public static void printElExceptStartsWithT(List<String> myList) {
        myList.stream().filter(t -> !t.startsWith("T")).forEach(t -> System.out.println(t + " "));
    }
    /*
    Methodumuz: public static void printElExceptStartsWithT()
Bu method yine bir list kullanacak. Javaya bu listi stream'e cevir, t ile baslayanlari filter et diyecegiz.
myList.stream().filter(t->!t.startsWith("T").forEach(t-> System.out.print(t + " ")
filter methodunu eleme yapmakta kullandik. t ile baslayanlari eledik.
yazdirinca t ile baslayan Tom'u goremedik. Jim ve Clara'yi gorduk.
     */

    //Ex: Bir Lİst'te karakter sayısı 4'den az olan tüm elemanları consola yazdıran kodu yazdırınız.
    public static void printElemanLengthLessThanFour(List<String> myList) {
        myList.stream().filter(t -> t.length() < 4).forEach(t -> System.out.println(t + " "));
    }

    //Ex: Bir listteki karakter 4' den çok olan tüm elemanları büyük harfle consola yazdırınız
    public static void printElemanLengthgraterThanFour(List<String> myList) {
        myList.stream().filter(t -> t.length() > 4).map(t -> t.toUpperCase()).forEach(t -> System.out.println(t));
        //map() var olan elemanları değiştiriyor.nedenle map'i kullanmaliyiz ve elemani uppercase'e cevirmesini javadan isteyecegiz.
    }

    //Example 5: Bir List'teki character sayisi 4 den cok olan tum elemanlari
// tekrarsiz olarak kucuk harflerle console'a yazdiran method'u olusturunuz.
    public static void printElementLengthMorethanFourUniqueLowerCase(List<String> myList) {
        myList.
                stream().
                filter(t -> t.length() > 4).
                distinct().
                map(t -> t.toLowerCase()).
                forEach(t -> System.out.println(t + " "));
//lambda'da elemanlari azaltan methodlar once kullanilir
        //distinct() methodu tekrarsz elemanları bize yazdırır.


    }

    //Example 6: Bir List'teki elemanlari tekrarsiz olarak buyuk harflerle alfabetik sirada console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToUpperCaseSorted(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toUpperCase()).
                sorted().
                forEach(t -> System.out.print(t + " "));
    }

    //Example 7: Bir List'teki elemanlari tekrarsiz olarak
    // kucuk harflerle uzunluklarina kucukten buyuge siralayarak console'a yazdiran method'u olusturunuz.
    public static void printElUniqueToLowerCaseSortedWithLength(List<String> myList) {
        myList.
                stream().
                distinct().
                map(t -> t.toLowerCase()).
                sorted(Comparator.comparing(t -> t.length())).
                forEach(t -> System.out.println(t + " "));//Stringle kullanırsa alfabetik sıralama yapar.

    }

}



