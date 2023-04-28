package javaders.day07stringmanipulations;

public class C01_StringManipulations {
    public static void main(String[] args) {

        /*
        endsWith(); Metodu, metnin belirli bir datayla bitip bitmediğini
        verir.
        Bize boolean bir sonuç döndürür.
        Tek karakterde, çoklu karakterde kullanılabilir.
         */

        String s = "Learn Java earn money";
        boolean isEnd =s.endsWith("money");
        System.out.println("s.endsWith() = " + s.endsWith("money"));
        
        // Ex: s String deki 'money' kelimesini 'dolar' kelimesi ile yer değişitiriniz.
        /*
        replace () Metnin içerisinde belirli bir datanın yerine verilen diğer bir
                   datayı yerleştirir.
                   Bize String bir data döndürür.
                   -Tekli karakterler ile de çoklu karakterler ile de çalışır
                   ancak her iki tarafta da çift tırnak"" ya da her iki tarafta da tek tırnak'' kullanmalıdır.


         */
        String ss = s.replace("money", "dolar");
        System.out.println("s.replace(\"money\", \"dolar\") = " + s.replace("money", "dolar"));

        // Ex: s String'İnde ki 'earn' keimesini 'win' kelimesine çeviriniz.

        String s1 = s.replace("earn", "win");
        System.out.println("s2 = " + s1);

        //EX: s String'de ki 'a' harflerini '*' ile değiltiriniz.

        String s2 = s.replace("a", "*");
        String s3 = s.replace('a', '*');
        //Tek karakter olduğunda hem tek tırnak hem de çift tırnak kullanabiliriz.
        System.out.println("s3 = " + s2);
        System.out.println("s3 = " + s3);

        //Ex: s String'inde ki "n" harflerini "***" ile değiştiriniz.
        String s4 = s.replace("n", "***");
        System.out.println("s.replace(\"n\", \"***\") = " + s.replace("n", "***"));

        //Ex: s String'inde tüm 'e' harflerini siliniz.
        //String s = "Learn Java earn money";
        System.out.println(s.replace("e", ""));

                /*
                char data type'nın içerisine mutlaka bir karakter yerleştirilmelidir.
                Space bir karakterdir.char'in içine yerleştirilebilir.
                ancak hiçlik javada char için kullanılamaz.BU nedenle silme işlemi yaparken
                mutlaka String kullanmalıyız.

                 */
        /*
        replaceAll(): Bir grup datayi değiştirmek için kullanılır.
        -Bir grup datayı ifade edebilmek için Regular Expression( Regex) kullanılır.

         */
        String t = "Yucel 25 ya$indadir sandik ama 30'mis!.";
        // Ex: t String'in deki tüm rakamlari "*" a çeviriniz.
        String t1 = t.replaceAll("[0-9]", "*");
        System.out.println("t1 = " + t1);//t1 = Yucel 25 ya$indadir sandik ama ** ya$inda'miş!.

        /*
        En Çok Kullnılan RegexLer;
        1) Tüm Rakamlar [0-9]
        2) Tüm Küçük Harfler [a-z]
        3)Tüm Büyük Harfler [A-Z]
        4)Tüm Harfler [a-zA-Z]
        5)Tüm Harfler ve Rakamlar[a-zA-Z0-9]
        6)Tüm Noktalama İsaretlerini \\p{Punct} ya da \\p{P}
        7)Tüm Sesli harfler [aeiouAEIOU]

        ^ ==> den farkli, haricinde

        1) Tüm Rakamlar Hariç [^a-z]
        2) Tüm Küçük Harfler Hariç[^a-z]
        3)Tüm Büyük Harfler Hariç[^A-Z]
        4)Tüm Harfler hariç[^a-zA-Z]
        5)Tüm Harfler ve RakamlarHariç[^a-zA-Z0-9]
        6)Tüm Noktalama İsaretlerini Hariç \\p{Punct}
        7)Tüm Sesli Harfler Hariç[^aeiouAEIOU]

         */
        //Ex: t String'de ki tüm harfleri ve tüm rakamları ünleme ! çeviriniz.
        //String t = "Yucel 25 ya$indadir sandik ama 30'mis!.";
        String t2 = t.replaceAll("[a-zA-Z0-9]", "!");
        System.out.println("t.replaceAll(\"[a-zA-Z0-9]\", \"!\") = " + t.replaceAll("[a-zA-Z0-9]", "!"));

        //Ex: t String'inde ki tüm spacelar dişindaki karakteleri +'ya dönüştürünüz.
        String t3 = t.replaceAll("[^ ]", "+");
        System.out.println(t3);

        //Ex: t String'in deki tüm küçük harfleri ? dönüştürünüz.
        String t4 = t.replaceAll("[a-z]", "?");
        System.out.println(t.replaceAll("[a-z]", "?"));

        // t String'inde ki tüm sesli harflri düşünda ki karakterleri &'ne dönüştürünüz
        String t5 = t.replaceAll("[^aeouiAEOUI]", "&");
        System.out.println(t.replaceAll("[^aeouiAEOUI]", "&"));


    }
}
