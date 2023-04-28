package javaders.day31collections;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList01 {
    public static void main(String[] args) {
        /*
        -Arraylist'ler eleman ekleme ve silmede tekrar indexleme yapmak zorunda
        olduklarından eleman ekleme ve silmede başarısızdırlar. Eleman ekleme ve silme için
        LinkedList oluşturulmuştur.


        1) ArrayList ler eleman silme ve eleman eklemede basarisizdirlar
       o yuzden eleman silme ve ekleme islemleri coklukla yapilacaksa Arraylist kullanmak tavsiye edilmez
    2) LinkedListler index kullanmadiklarindan dolayi eleman silme ve eklemede re-index yapilamasina gerek yoktur.
       Bu da Linkedlistlerin eleman ekleme ve silmede cok basarili hale getirir.
       Bu yuzden eleman ekleme ve silmenin cok yapilmasi gereken durumlarda Linkedlist kullanmak tavsiye edilir
    3) ArrayListlerde "search" islemi kolay yapilir cunku indexler adres gibidir.
    4) Linkedlistlerde search islemi zor yapilir cunku LinkedListler index kullanmmaz.
       index kullanmayinca herhangi bir elemani bulmak icin en bastan tum elemanlar kontrol edilir
       bu da cok fazla is demektir.
         */
        LinkedList<String> s = new LinkedList<>();
        s.add("Merve");
        s.add("Murat");
        s.add("Vildan");
        s.add("Fatih");
        s.add("Mustafa");

        s.add(1, "Caner");//[Merve, Caner, Murat, Vildan, Fatih, Mustafa]
        System.out.println(s);

        s.addFirst("Ahmet");//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa]
        System.out.println(s);

        s.addLast("Enver");//[Ahmet, Merve, Caner, Murat, Vildan, Fatih, Mustafa, Enver]
        System.out.println(s);

        s.remove(2);//[Ahmet, Merve, Murat, Vildan, Fatih, Mustafa, Enver]
        System.out.println(s);

        s.remove("Ahmet");//[Merve, Murat, Vildan, Fatih, Mustafa, Enver]
        System.out.println(s);

        s.removeFirstOccurrence("Fatih");//Fatih'in ilk görünümünü silecek.
        System.out.println(s);//[Merve, Murat, Vildan, Fatih, Mustafa, Enver]

        s.removeLastOccurrence("Fatih");
        System.out.println(s);//Fatih'in son görünümünü seiliyor.

       String r1 = s.peek();
        System.out.println(r1);//Merve verir. İlk nodu silmeden verir.

        String r2 = s.poll();
        System.out.println(r2);//Merveyi silecek. İlk nodu silep verir bize.

        String r3 = s.element();
        System.out.println(r3);//İlk elemanı silmeden bize verir.Yani copy + paste yapar.
        //List boş ise hata verir ama peek de list boş ise bize null döndürür ama element() metodu null döndürmez.

        String r4 = s.pop();
        System.out.println(r4);//pop() methodu, poll() metodu gibi ilk nodu siler ve bize verir.
        //Aradaki fark,pop() method list boş ise hata verir ama poll(9 method null döndürür bize.

    }
}
