package day_07_practise;

import java.util.Scanner;

public class C01_While {
    public static void main(String[] args) {
        // Kullanıcıdan sisteme bir rakam girmesini isteyiniz
// kullanıcının girdigi sayının while loop kullanarak faktoriyelini bulunuz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir rakam giriniz");
        int rakam = scan.nextInt();

        int sum = 1;
        int i =1;

        while (i<=rakam){
            sum = sum*i;

            i++;
        }
        System.out.println(rakam + "! :" +sum);
    }
}
