package deneme1.calismalar;

import java.util.*;

public class AtmProje {
    public static void main(String[] args) {
        int bakiye = 1000;

        Scanner scan = new Scanner(System.in);
        System.out.println("Merhabalar bankamıza hoşgeldiniz...");
        System.out.println("Güncel bakiyeniz :" + bakiye + " Tl");

        while(bakiye>0){
            System.out.println();
            System.out.println("Lütfen Yapmak istediğiniz işlemi seçiniz");
            System.out.println("1-) Para Yatır");
            System.out.println("2-) Para Çek");
            System.out.println("3-) Bakiye Sorgula");
            System.out.println("4-) Çıkış Yap");

            int input = scan.nextInt();
            if(input==1){
                System.out.println("Yatırmak istediğiniz miktar :" );
                int miktar = scan.nextInt();
                bakiye += miktar;
                System.out.println("Toplam Bakiyeniz :" + bakiye);

            }else if(input==2){
                System.out.println("Çekmek istediğiniz miktar :" );
                int miktar = scan.nextInt();
                if(miktar>bakiye){
                    System.out.println("Yetersiz Bakiye !!");
                }else{
                    bakiye -= miktar;
                    System.out.println("Toplam Bakiyeniz :" + bakiye);
                }
            }else if(input == 3){
                System.out.println("Güncel bakiyeniz "+ bakiye +" Tl");
            }else if(input == 4){
                System.out.println("Çıkış Yapılıyor !!");
                break;
            }else {
                System.out.println("Geçersiz bir işlem girdiniz !");
            }
        }
        System.out.println("Tekrar bekleriz...");


    }



}