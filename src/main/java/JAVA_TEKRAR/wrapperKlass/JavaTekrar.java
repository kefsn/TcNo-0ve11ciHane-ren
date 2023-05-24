package JAVA_TEKRAR.wrapperKlass;

import ssgDersler.Efsane;
import ssgDersler.LinkedList01;

import java.util.Scanner;

public class JavaTekrar {

   public static void main(String[] args) {
        int sayi1 = 10;
        int sayi2 = 20;
        swap(sayi1,sayi2);
    }

    private static void swap(int sayi1, int sayi2) {
        int sayi3;
        sayi1 = sayi1 + sayi2;
        sayi2 = sayi1 - sayi2;
        sayi1 = sayi1 - sayi2;
        System.out.println(sayi1);
        System.out.println(sayi2);
//second way;
        /*
        sayi3 = sayi1;
        sayi1 = sayi2;
        sayi2 = sayi3;
        */


    }
}
