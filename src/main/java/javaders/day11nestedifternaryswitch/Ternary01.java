package javaders.day11nestedifternaryswitch;

import java.util.Scanner;

public class Ternary01 {
    /*
    Kullanicidan alınan iki sayıdan küçük olanını ekrana yazdırınız.
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter two integers...");
        int first = input.nextInt();
        int second = input.nextInt();


        if(first<second){
            System.out.println(first);
        }else{
            System.out.println(second);}

        //2.Yol: Use Ternary:
        int result = first<second ? first: second;
        System.out.println(result);







    }
}
