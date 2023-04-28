package javaders.day42lambda;

import javaders.day41lambda.Utils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Lambda02 {

    public static void main(String[] args) {

        System.out.println(getSumInTheGivenRange(10, 7));
        System.out.println(getMultiplicationInTheGivenRange(7,10));
        System.out.println(getSumOfDigitsInTheGivenRange(45,47));

    }

    /*
swap methodu başlangıç değeri ikinci değerden büyükse değerlerin yerini değiştirir.
sadece if kısmı yapılırsa değişimi bize vermez.
 başlangıç ve bitiş değerlerini yani
 çoklu değeri depolamak için list kullanırız. array de kullanılabilir
 list in içine starting yani başlangıç değerini,
  ending yani ikinci değeri aldık. example1 de
 get 0 ve get 1 yazdık çünkü indexlerini yazdık
  */

    //Swap icin bir tane private method olustur
    private static List<Integer> swap(int starting, int ending){
        List<Integer> list = new ArrayList<>();
        if(starting>ending){
            starting = starting + ending;
            ending = starting - ending;
            starting = starting - ending;
        }
        list.add(starting);
        list.add(ending);
        return list;
    }
    //Example 1: 7'den 10'a kadar tamsayilarin toplamini hesaplayan method'u olusturunuz.
    public static int getSumInTheGivenRange(int starting, int ending) {
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).sum();

    }
    //Example 2: 7'den 10'a kadar tamsayilarin carpimini hesaplayan method'u olusturunuz.

    public static int getMultiplicationInTheGivenRange(int starting, int ending) {

        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).reduce(Math::multiplyExact).getAsInt();

        //rangeClosed() methodu ilk sayi buyuk oldugunda calismaz
    }

    //Example 3: 45'den 47'ye kadar tamsayilarin rakamlari toplamini hesaplayan method'u olusturunuz.
    //           45 46 47 == ?   4+5+4+6+4+7  = 30
    public static int getSumOfDigitsInTheGivenRange(int starting, int ending) {
        List<Integer> list = swap(starting,ending);
        return IntStream.rangeClosed(list.get(0), list.get(1)).map(Utils::getSumOfDigits).sum();

    }
}
