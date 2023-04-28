package javaders.day05typecastingasciivaluestringmanipulations;

public class C03TypeCasting {
    public static void main(String[] args) {

        /*

        -Nümerik data type'larının birbirine dönüştürülmesine Type Casting denir.
        -Nümerik data Type'ları byte shor int long float ve double'dır.
        -Küçük Data Type'larının büyük data Type'larına dönüştürülmesine Auto Widening (otomatik genişletme) denir.
        -Büyük Data Type'larının küçük data type'larına dönüştürülmesin de java
         sorumluluğu kabul etmez, data kaybı olabileceği için kodu yazanlara bırakır buna
         Explicit Narrowing(Açıktan Daraltma) denir.
        -

         */


        byte age = 13;
        int ageInt = age; // Bu yaptığımıza auto widening(Otomatik genişletme) denir..

        long population = 1234;
        short populationShort = (short) population;//Explicit Narrowing (Açıktan Daraltma)

        int i = 12;
        float f = i;

    }//main
}//Class
