package javaders.day04memorykullanimiwrapperclass;

import java.util.Scanner;

public class C01_Scanner {
    //Kullanicidan aldığıınız 5 basamakalı bir sayının ilk iki ve son
    // iki basamağında ki sayıları yazdıran kodu oluşturunuz.
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 5 basamaklı bir sayı giriniz...");
        int number = input.nextInt();

        // Son rakamı al
        int lastDigit = number%10;
        //rakamı küçült
        number = number/10;

        //Sondan ikinci rakamı al
        int lastSecondDigit = number%10;
        //rakamı küçült
        number = number/10;

        //Sondan Üçüncü rakamı al
        int lastThirdDigit = number%10;
        //Rakamı küçült
        number = number/10;

        int lastFourthDigit = number%10;
        number = number/10;

        int lastFifthDigit = number%10;
        number = number/10;

        System.out.println("Toplam :"+ (lastFifthDigit+lastFourthDigit+lastSecondDigit+lastDigit));



    }//main
}//Class
