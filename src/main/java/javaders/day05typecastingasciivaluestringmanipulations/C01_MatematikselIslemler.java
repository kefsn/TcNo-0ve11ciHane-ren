package javaders.day05typecastingasciivaluestringmanipulations;

public class C01_MatematikselIslemler {
    /*
    -Java da farklı data Type'ları arasında işlem yapılıyorsa sonuç büyük olan
    data typenın türünde olur.
    -Karşılaştırma operatörlerinde sonuç hep boolean döner.
       Aşağıdakiler karşılaştırma operatorudür;
       < Küçüktür
       >Büyüktüe
       == Eşittir
       != Eşit değildir
       <= Küçük eşitdir.
       >= Büyük eşittir
       && and (ve) operatorü
       || or (veya) operatorü



     */
    public static void main(String[] args) {
        System.out.println(4*(5+2)/3);//9
        //int/int ==> int olacağı için 9.33.. yerine virgülden sonraki
        //kısmı siler tam sayı kısmını alır ekranda 9 yazdıırr.

        System.out.println(6*6/8);//4

        double sonuc = 4*(2+5)/3;//9
        System.out.println(sonuc);

        double sonuc2=4.0*(2+5)/3;
        System.out.println(sonuc); //

        System.out.println(4*(1+5)/3);
        int sayi1 = 5;
        int sayi2 =2;
        double sayi3 =2;

        System.out.println(sayi1/sayi2);//2
        System.out.println(sayi1+sayi3/sayi2);//6.0
        boolean  first =2<4;
        boolean second = 2+6 !=8;
        boolean third = 2+3*5<20;

        System.out.println("first = " + first);//true
        System.out.println("second = " + second);//false
        System.out.println("third = " + third);//True

        System.out.println(first && second);//false
        System.out.println(first || second);//True



    }
}
