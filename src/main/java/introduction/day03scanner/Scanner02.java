package introduction.day03scanner;

import java.util.Scanner;

public class Scanner02 {
    //Kullanicidan ilk ismini ve soy ismini alip ikisini ayni satirda ekrana yaziniz.
    public static void main(String[] args) {

        //1.Adim: Scanner Class'tan obje olustur.
        Scanner input = new Scanner(System.in);

        //2.Adım:Kullaniciya ne istediğinize dair mesaj verin
        System.out.println("İlk isminizi giriniz...");
       String firstName = input.next();

        System.out.println("Soy isminizi giriniz...");
       String lastName = input.next();

        System.out.println(firstName +" " +lastName);


    }
}
