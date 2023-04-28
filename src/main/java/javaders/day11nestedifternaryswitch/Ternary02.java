package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary02 {
    /*
    Kullanıcıdan bir sayi alınız, o sayi pozitif ise ekrana "Pozitif"
    yazdırın, değilse "pozitif değil" yazdırın
     */
    // Soru işareti ? if anlamında , ve iki nokta : else anlamında kullanılır bazen.

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter an integer...");
        int sayi = input.nextInt();

        String result = sayi>0 ? "Positive": "Not positive";
        System.out.println("result = " + result);
        //sayi>0 eşitliği True ise :'dan önceki değeri "Positive";
        //Eğer False ise :'dan sonraki değeeri "Nor negative"alır ternary'de.



    }
}
