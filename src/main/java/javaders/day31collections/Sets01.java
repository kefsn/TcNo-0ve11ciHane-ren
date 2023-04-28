package javaders.day31collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Sets01 {
    /*
    1) Set'ler tekrarsız eleman(Unique) eleman depolamak için kulllanılır.
    2) 3 tane set klass'ımız var.
      a) HashSet Clas :
      "Hash" benzersiz br ID oluşturma tekniğidir. Bu tekniğe  Hashing tecnique denir.
      "HashSet" elemanlarını rastgele sıralar.
      "HashSet" elemanları sıralamadığından çok hızlı çalışır.
      "HashSet" ler tekrarsız eleman depolamak için kullanılır.
      "HashSet" ler 'null'ı eleman olark kabul eder.

      b) LinkedHashSet Class:
       "LinkedHashSet" elemanları sizin verdiğiniz sıraya göre dizer.(insertaion order) dizdiklerinden, HashSet'lere göre yavaşdırlar.
       "LinkedHashSet"  ler tekrarsız eleman depolamak için kullanılır.

      c) TreeSet Class:
        "TreeSet" ler  elemanları natural order'a göre (Ya küçükten büyüğe, ya da alfabetik sıraya) göre dizerler.
        "TreeSet" ler elemanları natural order'a göre dizdiklerinden çok yavaştırlar.
        "TreeSet" ler en yavaş setlerdir.Tembel Hayvan gibi.
         "TreeSet" ler tekrarsız eleman depolamak için kullanılır.

     */
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();
        hs.add("Merve");
        hs.add("Tuba");
        hs.add("Sema");
        hs.add("Fatih");
        hs.add("Rana");
        hs.add("Sema");//Tekrarlı eleman eklediğimizde hata vermez ama tekrarlı elemanı bir kere depolar/yazar.
        System.out.println(hs);//[Fatih, Sema, Rana, Merve, Tuba]
        System.out.println(hs.hashCode());

        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
        lhs.add(313);
        lhs.add(19);
        lhs.add(353);
        lhs.add(7);
        lhs.add(null);//Null'ı kabul eder.
        System.out.println(lhs);//[313, 19, 353, 7] Bizim eklediğimiz sıraya göre bize verir.İnsertaion order.


        LinkedHashSet<Integer> ls = new LinkedHashSet<>();
        ls.add(313);
        ls.add(195);
        ls.add(353);
        ls.add(17);
        System.out.println(ls);
        System.out.println(lhs.retainAll(ls));//retainALL() methodu lhs methodu ile ortak olan elemanları verir, diğerlerini siler.
        System.out.println(ls);//Lhs De ortak olmayan siliniyor ama ls de herhangi bir değişiklik olmaz.

        TreeSet<Character> ts = new TreeSet<>();
 ts.add('G');
 ts.add('A');
 ts.add('Z');
 ts.add('R');
 ts.add('U');
 //ts.add(null); TreeSetler 'null' kabul etmiyor.
        System.out.println(ts);//[A,G,R,U,Z] natural ordera göre dizer

        System.out.println(ts.first());
        System.out.println(ts.last());
        System.out.println(ts.lower('R'));// G sonucu verir. Yani verilen elemanın bir öncekini verir.
        System.out.println(ts.lower('D'));//A verir. Listede yoksa harf, olması durumunda hangi harften önceyse onu yazdırır bize.
        System.out.println(ts.higher('R'));//U verir. Girilen harften sonrakini bize verir Higher methodu.
        System.out.println(ts.higher('T'));//U verir. Listede yoksa harf, olması durumunda hangi harften sonraysa onu yazdırır bize.
        System.out.println(ts.headSet('R'));//[A.G] verir.
        System.out.println(ts.headSet('R', true));//[A.G,R] verir.
        System.out.println(ts.tailSet('R'));//[R,U,Z]
        System.out.println(ts.tailSet('R', false));//[U,Z]
        System.out.println(ts.ceiling('R'));//R verir//Setin içinde varsa direk bize veriyor.
        System.out.println(ts.ceiling('T'));//U verir/Setin içinde yoksa, olası durumunda nerde olurdu onu verir. Sonrasını higher gibi verir.
        System.out.println(ts.floor('G'));//G verir.Setin içinde varsa onu verir
        System.out.println(ts.floor('T'));//R verir.Setin içinde, Yoksa lower gibi öncesini verir.
        System.out.println(ts.subSet('G', 'Z'));//Başlangıç indexini alır bitiş indexini almaz.Substring vazifesi görür.
        System.out.println(ts.subSet('G', false, 'Z', true));//Z dahil alır.
    }
}
