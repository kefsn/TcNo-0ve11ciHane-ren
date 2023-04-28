package day05_loopsarray;

import java.util.Scanner;

public class C01_CdenOncekiA {
    public static void main(String[] args) {
        /*
      Kullanıcıdan aldığınız 'c' ve 'a' iceren bir String değer içerisindeki
   'c' karakterinden önceki 'a' karakterlerinin sayısını bulan bir kod yazınız.
   */
        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen 'c' ve 'a' harflerini içeren bir kelime girniz...");
        String str = scan.nextLine().toLowerCase();

        int counter = 0; //Text de sayma diyorsa muhakkak bir sayaç oluşturmalıyız.
        for (int i = 0; i <str.indexOf("c") ; i++) {
            if(str.charAt(i)=='a'){
                counter++;

            }
        }
        System.out.println("C'den önceki a sayısı :" +counter);

        //2. Yol
        int sayac = 0;
        if(str.contains("c") && str.contains("a")){
            for (int i = 0; i <str.length() ; i++) {
                if(str.charAt(i)=='a'){
                    sayac++;
                }else if(str.charAt(i)=='c'){
                    break;
                }
            }
            System.out.println("C den onceki a sayısı " +sayac);
        }else{
            System.out.println("Lütfen 'a' ve 'c' harflerini içeren kelime giriniz");
        }

    }//Main


}//class
