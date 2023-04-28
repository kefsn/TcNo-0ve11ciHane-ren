package javaders.day19arraylists;

import java.util.ArrayList;

public class ArrayList01 {
    public static void main(String[] args) {
        /*
        1-Aynı data type'dakki çoklu dataları depolamak için Array'a kullanırız.
        2-Array'lerin negatif yönü var. içine koyacağınız eleman sayisini başta
        belirlemek zordurundasınız.
        3-Array'ler eleman sayısında esnek değildir. BU yüzden Java "ArrayList" adlı
        yeni bir yapi oluşturdu. Bu yapı eleman sayısında esnektir.Hiç eleman
        koymazsanız eleman sayısını sıfır olarak ayarlar, 1000  eleman koyarsanız eleman sayısını 1000
        olarak ayarlar.
        4-"ArrayList" yerine sadece "List" de diyebliriz.
        5-Java "ArrayList" oluştururken,Array'lari iptal etmedi.Çünkü
          a) Arraylar süper hızllıdır.
          b)Array'lar memory'de çok az yer kaplar.
          6-Array'lar primitive data type'ları ve reference'ları depolayabilir.
          ama "ArrayList" ler non- primitive data type'larını depolar. Bu yüzden
          ArrayListler, Array'lardan daha çok yer kaplar.

         */
        //ArrayList nasıl oluşturulur?
        ArrayList<Integer> ages = new ArrayList<>();
        //ArrayList konsola nasıl yazdırılı?
        System.out.println(ages);

        //ArrayList'e eleman nasıl eklenir?
        ages.add(12);//Eleman eklemek için add() methodu kullanılır.
        ages.add(24);
        ages.add(9);//add() methodu elemaları giriş sırasına(insertion order) göre List'e yerleştirir.

        System.out.println(ages);
        //2.way
        ages.add(1,99);//1. index'e 99 yerleştir anlamına gelir.
        System.out.println(ages);

        ArrayList<Integer> price =new ArrayList<>();
        price.add(23);
        price.add(33);
        //3.Way
        ages.addAll(price);//addAll() methodu price'ın içindeki bütün metodları ages'a yerleştirecek
        System.out.println(ages);
        
        //4.way
        ages.addAll(3, price);//index 3' e price'ı yerleştir anlamına geliyor
        System.out.println(ages);
        //Arraylis'te eleman sayısı nasıl bulunur.
        int numOfElement = ages.size();//Eleman sayısını bulmak için size() methodu kullanılır.
        System.out.println(numOfElement);
        //ArrayList'te spesific bir eleman nasıl alınır?
        int el1 = ages.get(3);//Spesific elemanı almak için, index kullanarak get() methodu kullanırız.
        System.out.println(el1);

        //ArrayList'te spesific eleman nasıl değiştirilir
        ages.set(6,111);//ages listinde index'i 6 olan elemanını 111 ile değiştir anlamına gelir. set() methodu
        System.out.println(ages);

        //ArrayList'te bir değerin olup olmadığı öğrenmek
        boolean r1 = ages.contains(99);//içerip içermediğini bize soruyor
        System.out.println(r1);//true

        //ArrayList'te eleman olup olmadığını nasıl anlarız?
        boolean r2 = ages.isEmpty();
        System.out.println(r2);//False

        //Bir ArrayList'teki tüm elemanları nasıl sileriz?
        ages.clear();//ArrayList'tki bütün elemanları temizler.
        System.out.println(ages);//[]
    }
}
