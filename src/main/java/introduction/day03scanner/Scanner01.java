package introduction.day03scanner;

import java.util.Scanner;
//Java'nın util Library'sından scanner class import edildi anlamına gelir

public class Scanner01 {

    public static void main(String[] args) {
        //1.adim; Scanner Class'ta bir obje olustur.
        Scanner input = new Scanner(System.in);
        //Obje ismini input yaptik cunku bu obje kullanicadan aalinan datayi benim kodlarimin icine koyacak.
        //2. adim;Kullaniciya ne istediğinize dair mesaj veriniz.
        System.out.println("lutfen yasinizi giriniz...");

        //3.adim: Uygun metodu kullanicinin veridgi datayi memorye yerlestiriniz.
        byte age = input.nextByte();
        System.out.println(age);





    }
}
