package day_06_practice;

import java.util.Scanner;

public class C02_SwitchCase {
    public static void main(String[] args) {
        /*
     Bir ATM'de aşağıdaki banka işlemlerini yapmak için, kullanicidan 1-4 arası işlem numarasını sisteme girmesini isteyiniz.

     işlem 1: Bakiye Sorgulama
     işlem 2: Para Cekme
     işlem 3: Para Yatırma
     işlem 4: İşlemi Sonlandırın

     Ve bu islemleri Switch case kullanarak yaptırınız.
     */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 1-4 arasında bir işlem numarası giriniz"
        +"\n"+"İşle 1 : Bakiye Sorgulama"+"\n"+
                "İşle 2 : Para Çekme"+"\n"+
                "İşle 3 : Para Yatırma"+"\n"+
                "İşle 4 : İşlemi Sonlandır");
        int no = scan.nextInt();
        int bakiye = 1000;

        switch (no){
            case 1:
                System.out.println("Bakiyeniz "+bakiye+" TL'dir.");
                break;

            case 2:
                System.out.println("Çekmek istediğiniz parayı giriniz");
                int cekilecekPara = scan.nextInt();
                if(cekilecekPara<=bakiye){
                    bakiye-=cekilecekPara;
                    System.out.println("Para çekme işleminden sonraki mevcut bakiyeniz:" +bakiye+" Tl");

                }else{
                    System.out.println("Bakiyeniz yetersiz...");
                }
                break;

            case 3:
                System.out.println("Yatırmak istediğiniz parayı giriniz..");
                int yatırılacakPara = scan.nextInt();
               if(yatırılacakPara<=2000){
                   bakiye+= yatırılacakPara;
                   System.out.println("Para yatırma işleminden sonra ki mevcut bakiyeni :" + bakiye+" TL");
               }else{
                   System.out.println("ATM 'de günlük para yatırma limiti 2000 Tl");
               }
                break;
            case 4:
                System.out.println("TechPro Bank'ı kulandıığınız için teşekkür ederiz...");
                break;
            default:
                System.out.println("Lütfen 1-4 arasında geçerli rakamı giriniz");
        }
    }
}
