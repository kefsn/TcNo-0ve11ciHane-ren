package javaders.day06typecastingstringmanipulation;

public class C01_StringManipulation {

    public static void main(String[] args) {

        String a = "Tek rakibim dünki ben";
        // ***** toUpperCase() Methodu *******
        String aUpper = a.toUpperCase();
        System.out.println("aUpper = " + aUpper);
        // ***** toLowerCase() Methodu ****
        String aLower = a.toLowerCase();
        System.out.println("aLower = " + aLower);
        // ***** charAt() Methodu ****
        /*
         a değişkenin ilk karakterini almak için code yaz
         parantez içine 0 yazarsak ilk değerialır ama
         parantez içine 2,3,4,5... hangi sayıyı yazarsak o sıradaki karakteri bize yazdırır bize.
        */
        System.out.println("Ilk karakter = " + a.charAt(0));
        System.out.println(a.charAt(10));
        // a String teki bastan birinci ve sondan ikinci karakteri alınızve yanyana yadırınız.

        char firstChar = a.charAt(1);
        char lastSecondChar = a.charAt(19);
        System.out.println("FirstChar + LastSecondChar :" + firstChar + lastSecondChar);
        //a Stringinde bulunulan karakter sayısını bulunuz.

        //Lenght() methodu
        //substring methodu(0 DAHİL 4 indexi hariçtir..)
        String sub1 = a.substring(0, 4);
        a.substring(0, 4);// O dahil ,4 dahil değil değildir...
        a.substring(4, 7);
        System.out.println(a.substring(4, 7));
        // a Strin'indeki rakip kelimesini alınız
        a.substring(10, 15);
        System.out.println(a.substring(10, 15));
       // a Stringinde 'bim' kelimesinin olup olmadığını kontrol ediniz.
        boolean varMi = a.contains("bim");
        System.out.println(varMi);
       //startsWith() Methodu
       // Stringini T harfi ile başlayıp başlamadığını kontorol ediniz.
        a.startsWith("T");
        System.out.println("a.startsWith(\"T\") = " + a.startsWith("T"));
        System.out.println(a.startsWith("Tek", 6));
       //Üni numaraları yıl+BölümKodu+oBölümeGirişSırası olarak düzenlenen
       // bir okulda öğrenci Umra'nın hukuk fakültesinde okuyup okumadığını gösteren kodu yazınız
        /*sinif 22 hukuk 13 bilisayar 44 eczacılık 55 Maliye 66 Kimya Mühendisliği77*/
        String str = "20105501";
        System.out.println("str.startsWith(\"33\", 4) = " + str.startsWith("33", 4));


    }
}