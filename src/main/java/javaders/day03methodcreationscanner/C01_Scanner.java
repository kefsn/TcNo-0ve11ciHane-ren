package javaders.day03methodcreationscanner;

import java.util.Scanner;

public class C01_Scanner {

    public static void main(String[] args) {

        //Kullanicida aldiğiniz
        // charecter iile asagidaki gibi bir görünme olusturunuz.

        /*
             A
            A A
           A A A
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir character giriniz...");
        char ch = input.next().charAt(0);
        System.out.println("  "+ch+"  ");
        System.out.println(" "+ch+" "+ch+" ");
        System.out.println(ch+" "+ch+" "+ch);
        /*

        Sadec char data type için nextChar() dye bir metod
         olmadığı için kullancıdan data alıp ch konteynerına
         yerleştirmek için next().charAt(0); metodunuzkullanırız
         */

        // aralarında bir tab boşluk
        // birakarak tek sout ile ayni şekli oluşturalim.
        System.out.println("\t\t"+ch+"\t\t\n\t"+ch+" \t" +"\t"+ch+"\t\n"+ch+"\t\t"+ch+"\t\t"+ch);

        System.out.println(" "+ch+""+ch+" "+ch+""+ch+" \n"+ch+"  "+ch+"  "+ch+" \n"+ch+"     "+ch+" \n "+ch+"   "+ch);


    }//main


}//class
