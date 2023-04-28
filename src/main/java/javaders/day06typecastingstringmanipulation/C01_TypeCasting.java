package javaders.day06typecastingstringmanipulation;

public class C01_TypeCasting {

    public static void main(String[] args) {

        // short data type'nda variable  oluşturup byte data type'na ceviren kodu yazınız.

        /*
        Explicit Narrowing yaparken dikkat edilmeli çünkü çok ciddi data kaybı
        hatta datanın değişmesine neden olabilir.
        -Eğer dönüştürmeye çalıştırdığımız variablen sınırlarının dışında ise java
        sayıyı mod işlemine alır ve kalanı yazdırır.
        Kalan bölenin yarısndan fazla ise kalan sayıyı java küçülmek istediği
        için ve bölümü 1 büyüterek kalanı -(eksi) işaretli olacak şekilde yazdırır.


         */
        short num = 260;
        byte numByte= (byte) num;
        System.out.println("numByte = " + numByte);
        numByte = (byte) num;

        short num2 = 1023;
        byte num2Byte = (byte) num2;
        System.out.println("num2Byte = " + num2Byte);

        short num3 = 1000;
        byte num3Byte = (byte) num3;
        System.out.println("num3Byte = " + num3Byte);

        int intSayi = 8880;
        short shortSayi = (short) intSayi;// 32768 + 32767+0
        System.out.println("shortSayi = " + shortSayi);

        short sh =  320;
        byte b = (byte) sh;
        System.out.println("b = " + b);


    }


}
