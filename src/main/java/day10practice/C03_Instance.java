package day10practice;

public class C03_Instance {

    int sayi;

    String bransIsmı = "Java";

    boolean okuldaMi; //Default değer false

    public static void main(String[] args) {
         /*

    sayi, bransIsmi, okuldaMi seklinde uc tane instance variable olusturalım.
    Bu instance variable'leri main icerisinde yazdıralım
*/

        C03_Instance obj1 = new C03_Instance();
        System.out.println(obj1.sayi);

        System.out.println(obj1.bransIsmı);

        System.out.println(obj1.okuldaMi);

        C03_Instance obj2 = new C03_Instance();

    }
}
