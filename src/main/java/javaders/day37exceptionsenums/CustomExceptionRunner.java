package javaders.day37exceptionsenums;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomExceptionRunner {
    public static void main(String[] args) throws IllegalGradeException {
        /*
        1) try kullandığımızda her senaryo için çalışmasını istediğimiz
        kodları "finally block" içine koyarız.
        2) "final", "finally" ve "finalize" açıklar mısınız?

           "finalize": Garbage Collecetor memory'i remiz tutmak için sürekli tarar ve silinmesi
           gerekenleri siler.
           -Garbege Collecteor silmeden önce sileceği data'ları finalize eder sonra
           siler.


        "finally" sadece try'la, catch olmadan da kullanılabiilir.

          try kullandigimizda her senaryo icin calismasini istedigimiz kodlari "finally block" icine koyariz.
         */
       // System.out.println(getGrades());

        try{
            printAge(-45);
        }catch (IllegalAgeException e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("I always work");
        }

    }
    //Example 1: Ogrenci notlarini bir List'e ekleyen method'u olusturunuz
    public static List<String> getGrades() throws IllegalGradeException {

        List<String> grades = new ArrayList<>();
        String grade = "";

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Please enter the grade. To stop entering press q.");
            grade = input.next();

            int intGrade = 0;

            if(!grade.equals("q")) {
                intGrade = Integer.valueOf(grade);
            }

            if(grade.equals("q")){
                break;
            } else if(intGrade>=0 && intGrade<=100){
                grades.add(grade);
            }else{
                throw new IllegalGradeException("Grades less than zero and greater than 100 are not valid.");
            }

        }while(!grade.equals("q"));

        return grades;
    }

    //Ex2 : Kullanıcının yaşını konsola yazdıran methodu oluşurunuz.
    public static void printAge(int age){
        if (age<0){
            throw new IllegalAgeException("Ages cannot be negative");

        }

        System.out.println(age);
    }


}
