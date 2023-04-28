package javaders.day16arrayforeachloop;

import java.util.Arrays;

public class Arrays9 {
    public static void main(String[] args) {
        //Specisic bir elemanin array'de olup olmadığını anlamak için gereken kodu yazın.
        String names[] = {"K", "C", "R", "A", "S"};
        String el = "A";
        int counter =0;

        for (String w : names) {
            if (w.equals(el)) {
                counter ++;
                break;
            }
            }
        if(counter>0){
            System.out.println("Array has ==>" + el);

        }else{
            System.out.println("Array does not have  ==>" + el);
        }
        //2.Way;
        /*
        -Spesifik elemanı bulmak için Arrays.binarySearch' ı kullanıyoruz.
        Elemanı içinde arayacağımız sepeti(names) yazıyoruz: Sonrada arama
        yapılacak Array ismini(el) yazıyoruz.
        -Bu metodu kullanmak için önceikle sort/sıralama yapmak  gerekiyor.
        -Var olan elemanlar için index'i; olmayanlar için sıralamayı veriyor bize.
         */
        Arrays.sort(names);
        int result = Arrays.binarySearch(names,el);  //Bu kod aradığım elemanın varsa index'ni, eleman yoksa da sırasını  veriyor.
        System.out.println(result);
        if(result>0){
            System.out.println("Array  has   ==>" + el);

        }else{
            System.out.println("Array does not have  ==>" + el);
        }
        /*
        -binarySearch metodunu sort() kullanmadan kullanamayız.Çünkü binarySearch metodu
        sıralı elemanlar için geçerlidir.
        -binarySearch() metodu var olan elemanlar için size o elemanın index'ini verir.
        -binarySearch() metodundan aldığımız index 0 veya 0'dan büyük ise b
        aradığımız elemanın ARRAY'da var demektir.
        -//      "-" isaretinin anlami o eleman arrayde yok demektir
        //      "-" isaretinin yanindaki sayi ise eger o eleman arrayda olsaydi kacinci eleman olurdu demektir

         */

    }
}

