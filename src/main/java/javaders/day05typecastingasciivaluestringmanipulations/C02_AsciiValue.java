package javaders.day05typecastingasciivaluestringmanipulations;

public class C02_AsciiValue {
    public static void main(String[] args) {

        // 'A' kaarkaterinin ascı degerini yazdıran kodu yazınız
        /*
        Java'da char data type nı matematiksel işlemlerde kullanırsanız,
        Ascii table da ki sayısal değerleri alır.
        Char konteyneri hem numara barındırıyor hem resim barındırıyor.
        Numerik data type'ları byte short int long float ve double'dır.
        Bunlar haricinde hem sayısal değer hemde resim karakteri barındırıyor.
        Boolean ==> Numerik olmayan data tipidir. Sadece true ve false döndürür.
           Java da char data type'na int değerde atanabilir sembol harf vs de atanabilir.
           Çünkü char data type'inin Aciii den gelen bir sayısal  numerik karşılığı vardır.

         */



        int aAsciiA = 'A';
        System.out.println(aAsciiA);

        int aAsciia = 'a';
        System.out.println("aAsciia = " + aAsciia);

        int unlemAscii= '!';
        System.out.println(unlemAscii);

        int asciiSembol = '*';
        System.out.println("asciiSembol = " + asciiSembol);

        char ch = 'Z';
        char sembol = '*';
        char space = ' ';
        char isaret = '?';
        char rakam = '9';

        // 149.999TL *2
        int deger = 20;
        char sembl = '$';
        System.out.println(deger + sembl);// $ sembolunun tablodaki degeri 36+20 ==56 değerini verir.

        int deger2 = 0;
        char smbl2 = '+';
        System.out.println("deger2+smbl2 : " +(deger2+smbl2));
        /*
Javada "+" sembolu iki int icin matematikteki gibi toplama islemi yapar
iki String data arasinda ya da bir String bir int arasinda ise yanyana yazdirir
Buna "Concatination" denir
Java metematik bilir islem onceligine gore calisir
  i)Uslu Sayilar
  ii)Parantez ici
  iii)carpma/bolme
  iv) toplama/cikarma

 */
        String name = "123";
        int number = 45;
        System.out.println(name + number );//12345 Concatination denir. Yan yana yazdırmak.

        String str1="Java";
        String str2="Guzel";
        int sayi1=5;
        System.out.println(str1+str2+sayi1);

        String str3="Java";
        char ch3= 'G';
        int sayi4=5;
        System.out.println(str3+(ch3+sayi4));

        char rakam1 = '1';
        System.out.println("rakam1 = " + rakam1);

        char rakam2 = '2';
        System.out.println("rakam2 = " + rakam2);

        char rakam3 = '3';
        System.out.println("rakam3 = " + rakam3);

        char rakam4 = '4';
        System.out.println("rakam4 = " + rakam4);

        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+rakam1+rakam2+rakam3 + rakam4);//1234
        System.out.println("rakam1+rakam2+rakam3+rakam4 = "+(rakam1+rakam2+rakam3 + rakam4));//202

        // Asciide 1== 49  2==50 3==51  4==52
        ///*** Ascii değerlerden faydalanılarak neler yapılabilir***\\\

        byte b = 3;
        char ch2='h';
        System.out.println("b> ch2 :" +(b > ch2));//false

        int hAscii = 'h';
        System.out.println(hAscii);//104

        long l =542168784578L;
        System.out.println("ch2 > l :"+(ch2>l)); //false

        float f = 245648F;
        double d = 219658;
        System.out.println("f>d :"+(f>d));//true

        int sayiInt2 = 9;
        char sayiChar ='9';
        System.out.println(sayiInt2>=sayiChar);//False




    }//main

}//class
