package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*Kullanicidan 0'dan küçük 120'den büyük değer giremeyecek şekilde dataları aldıktan sonra
        eğer çalışan kadınsa 60 yaşından büyükse "Emekli olabilir " yazdırın,
        Eğer çalışan erkekse 65 yaşından büyükse "Emekli olabilir " yazdırın kodu yazın
        //egualsIgnoreCase için Male=male=Male Harflerin büyük küçüklüğü görmezden geliyor.

         */
        /*
        1-If içinde if kullanirsanız, "nested if" oluşturmuşsunuz demek.
        2-"Nested if" Java'yı yavaşlatır bu yüzden mecbur kalmadıkça kullanmayız.
        3-"Nested if" gibi Java'yı yavaşlatan kodlar "Time Consuming" olarak adlandırılır.

         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your age ...");
        int age = input.nextInt();

        System.out.println("Please enter your gender....");
        String gender = input.next();

        if(age<0 || age>120){
            System.out.println("Negative ages or ages greater than 120 are invalid");
        }
        else if(gender.equalsIgnoreCase("male")){
            if (age>65){
                System.out.println("Can be retired...");
            }else {
                System.out.println("Should work");
            }

        }else if ( gender.equalsIgnoreCase("female")){
            if ( age>60){
                System.out.println("Can be retired");
            }else {
                System.out.println("Should work");
            }

        }else {
            System.out.println("Undefined gender");
        }

    }
}
