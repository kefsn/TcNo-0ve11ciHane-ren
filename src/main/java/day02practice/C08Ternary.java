package day02practice;

import java.util.Scanner;

public class C08Ternary {
    public static void main(String[] args) {
        /*
        Kullanıcıdan 100 üzerinden notunu sisteme girmesini isteyiniz.
        Girilen not;
        not>100 ise konsola "100 den buyuk not giremezsiniz" yazdırın
        not>89 ise konsola "A" yazdırın
        not>79 ise konsola "B" yazdırın
        not>69 ise konsola "C" yazdırın
        not>59 ise konsola "D" yazdırın
        not>49 ise konsola "E" yazdırın
        not>-1 ise konsola "F" yazdırın
        degilse " negatif not giremezsiniz" yazdırın

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen  100 üzerinden br not  giriniz...");
        int not = scan.nextInt();
        String str = not>100?"100'den büyük not giremezsiniz": not >=89?
                "A": not >=79?
                "B": not >=69?
                "C": not >=59?
                "D": not >=49?
                "E": not >=-1?
                "F":"Negatif not giremezsiniz!"  ;
        System.out.println(str);

    }
}
