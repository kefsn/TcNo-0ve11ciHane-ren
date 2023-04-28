package javaders.day14loops;

import java.util.Scanner;

public class Loops04 {
    public static void main(String[] args) {
        //Kullanici username ve password'u girsin
        //3 kereden fazla yanlış girerse "Your account was blocked" mesajı alsın
        // 3 kereye kadar yanlış girerse"Invalid username or password, try again" mesajı alsın
        //Doğru girerse"Welcome to your account" mesajı alsın..

        Scanner input = new Scanner(System.in);
        int counter = 0;
        String validUserName = "techpro123";
        String validPassword = "Education12?";
        do{//Önce data verilecek sonra kontrol olacağı için do while kullanılır.
           if(counter==3){
               System.out.println("Your account was blocked");
               break;
           }
            System.out.println("Please enter your username");
            String userName = input.next();

            System.out.println("Please enter your password");
            String password = input.next();

            counter++;
            if(userName.equals(validUserName)&& password.equals(validPassword)){
                System.out.println("Welcome to your account");
                break;

            }else{
                System.out.println("Invalid username or password, try again");
                System.out.println((3-counter)+ "right lft");
            }

        }while(true);
    }
}
