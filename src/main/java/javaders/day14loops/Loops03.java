package javaders.day14loops;

import java.util.Scanner;

public class Loops03 {
    public static void main(String[] args) {
        //while-loop  (Kuralları önceden kontrol edilmesini istiyorssak bu kodu kullanalım.)
        int i = 1;
        while(i<1){
            System.out.println("while loop");
            i++;
        }

        //do-while loop. Eğer önce kodun çalışması sonra da kurallara bakmasını istiyorsak bu kodu kullan.
        int k= 1;
        do{
            System.out.println("do-while loop");
            k++;
        }while(k<1);

        //Kullanıcı bir sayı girsin,sayı 100'den küçük ise kullanıcı kazandınız mesajı alsın
        //diğer durumlarda kaybettini mesajı alsın.

        Scanner input = new Scanner(System.in);

        do{
            System.out.println("Please enter an integer...");
            int n = input.nextInt();
            if(n<100){
                System.out.println("Won!");
            }else{
                System.out.println("Lost!");//For ile yapılan her şey while ile yapılır.

                break;
            }
        }while(true);//Loop'un sürekli çalışması için parantez içine 'True' yazıyoruz.

        //Kullanıcıdan alinan bir cümlenin büyük harfle başlayıp nokta ile
        //bittiğini kontrol eden kodu yazınız.

        do{
            System.out.println("Please enter a word...");
            String s = input.next();


            if(s.endsWith(".") && (s.charAt(0)>='A' && s.charAt(0)<='Z')){
                System.out.println("Your sentence is correct gramaticaly");
            }else{
                System.out.println("Your sentence has gramaticaly mistake");
                break;
            }
        }while(true);

    }

}

