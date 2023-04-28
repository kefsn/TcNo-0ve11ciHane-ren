package javaders.day22stringbuilder;

public class Sb02 {
    public static void main(String[] args) {
        StringBuilder sb1 = new StringBuilder("Java is easy");
        System.out.println(sb1);

        sb1.reverse();//Stringin ters çevrilmesi Loop'lar ile de yapılabilir. BU kısa yoldur.
        System.out.println(sb1);//String'i tersten yazdırır.

        sb1.deleteCharAt(6);//Verilen index'teki karakteri siler.
        System.out.println(sb1);

        sb1.delete(4,7);//Başlangıç index'i dhil, bitiş index'i hariç verilen index aralığını siler.
        System.out.println(sb1);

        sb1.replace(2,5, "X");//Başlangıç index' dahil, bitiş index'i hariç aralığna istediğimiz string'i yerleştirebilir.
        System.out.println(sb1);//İndex 2,3,4 karakterler yerine "X" koyacak.

        sb1.insert(3, "2023");//İlk 3 karakteri geç, araya "2023" yerleştir dedik.
        System.out.println(sb1);

        StringBuilder sb2 = new StringBuilder("Java");
        StringBuilder sb3 = new StringBuilder("Java");
        System.out.println(sb2.compareTo(sb3));//Alfabetik olarak karşılaştırma yapacak ve arada fark varsa '0' sonuç verecek bize.
        //compareTo(): Metodunda eğer eşit değillerse, mesela -3 üç ise, sb2 sb3'den alfabetik olarak 3 önde demektir.

        sb2.toString();//StringBuilder'ı normal String'e çevirir.
        System.out.println(sb2);
       //Aynı değere sahip birden fazla String olduğunda, birini değştirdiğinde
        //diğer değerlerin de değşmemesi için immutable'a ihtiyacımız var.
        //Mesela bankda birden falza Ali varken, sadece birini değiştirmek için kullanırız.

        //StringBuilder nasil String'e cevrilir?
        String str = sb1.toString().toUpperCase();
        System.out.println(str);//String  YSX2023VAJ

        //String nasil StringBuilder'e cevrilir?
        StringBuilder newSb1 = new StringBuilder(str);
        System.out.println(newSb1);//StringBuilder  YSX2023VAJ

    }
}
