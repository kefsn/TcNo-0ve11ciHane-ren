package javaders.day12switchloops;

import java.util.Scanner;

public class Switch01 {
    public static void main(String[] args) {
        //Ex: Ay numarasını söyleyince numarası verilen aydan başlayıp
        // 12. aya kadar tüm ayların isimlerini yazdıran kodu yazınız..
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen başlangıç ayının kaçıncı ay olduğunu giriniz");
        int numOfMonth = input.nextInt();

        switch (numOfMonth){
            case 1 :
                System.out.println("January");
            case 2 :
                System.out.println("February");
            case 3 :
                System.out.println("March");
            case 4 :
                System.out.println("April");
            case 5 :
                System.out.println("May");
            case 6 :
                System.out.println("June");
            case 7 :
                System.out.println("July");
            case 8 :
                System.out.println("Augost");
            case 9 :
                System.out.println("September");
            case 10 :
                System.out.println("October");
            case 11 :
                System.out.println("November");
            case 12 :
                System.out.println("December");
                break;
            default:
                System.out.println("Geçerli ay numarısı giriniz");
                /*
                Note-1: "switch" condition parantez içerisinde
                String, int, byte, short, char data type'lar kullanılabilir..
                Note-2: "switch" condition parantezi içerisinde ,
                long, boolean, float,double data type'lar kullanılmaz...
                 */

        }
    }
}
