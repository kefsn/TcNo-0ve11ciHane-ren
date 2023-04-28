package deneme1.calismalar;

import java.util.Scanner;

public class KullaniciGiris {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen kullanıcı adını giriniz...");
        String kAdi = scan.nextLine();

        System.out.println("Lütfen şifrenizi giriniz...");
        String sifre = scan.nextLine();

        String nick = "y.nazli02";
        String parola = "ynazli123";

        if(kAdi.equals(nick) && sifre.equals(parola)){
            System.out.println("Hesabınıza hoşgeldiniz...");
        }else{
            System.out.println("Yanlış kullanıcı adı veya parola girdiniz, lütfen tekrar deneyiniz..");
        }
    }

}
