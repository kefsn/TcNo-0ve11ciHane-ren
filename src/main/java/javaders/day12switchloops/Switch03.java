package javaders.day12switchloops;

import java.util.Scanner;

public class Switch03 {
    public static void main(String[] args) {
        /*
            Ask user to enter country name among "America, England, Germany, Turkey, India, Peru, Spain, Bulgaria, Albania, France"
            Type code to print abbreviation(Kisaltma) of the countries. "US, UK, DE, TR, IN, PE, ES, BG, AL, FR"

            kullanicidan bir ulke ismi aliniz. Alinan ulke adina gore kisaltmalari yaziniz.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen  bir ülke ismi giriniz");
        String countrName = input.nextLine();

        switch (countrName.toLowerCase()){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "germany" :
                System.out.println("DE");
                break;
            case "turkey" :
                System.out.println("TR");
                break;
            case "peru" :
                System.out.println("PE");
                break;
            case "indıa" :
                System.out.println("IN");
                break;
            case "spain" :
                System.out.println("ES");
                break;
            case "bulgaria" :
                System.out.println("BG");
                break;
            case "albania" :
                System.out.println("AL");
                break;
            case "france" :
                System.out.println("FR");
                break;
            default:
                System.out.println("This country is undefined...");


        }
    }
}
