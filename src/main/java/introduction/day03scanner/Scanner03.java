package introduction.day03scanner;

import java.util.Scanner;

public class Scanner03 {
    //Kullanicadan adresi alip ekrana yazdiriniz
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen adresinizi giriniz...");
        //next() methodu kullanicidan tek kelimeli String'i almak için kullanilir
        //nextLine() methodu ise kullanicidan çok fazla kelimeli String'i almak için kullanilir.


               String address = input.nextLine();
        System.out.println(address);

    }
}
