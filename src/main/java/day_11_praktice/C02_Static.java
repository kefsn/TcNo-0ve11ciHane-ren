package day_11_praktice;

public class C02_Static {
    /*

    okulIsmi, okulNo, okulAcikMi seklinde uc tane static variable olusturalım.
    Bu static variable'leri main icerisinde yazdıralım

*/
    static String okulIsmi = "Yildiz Koleji";

    static int okulNo  ;

    static boolean okulAcikMi ;

    public static void main(String[] args) {
        System.out.println(okulIsmi);
        System.out.println(okulNo);
        System.out.println(okulAcikMi);

        okulNo = 102;
        System.out.println(okulNo);
        
        staticMethod();
        System.out.println(okulNo);

    }

    private static void staticMethod() {
        okulNo=200;
        System.out.println(okulNo);

    }


}
