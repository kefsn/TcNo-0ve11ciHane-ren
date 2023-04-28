package deneme1.calismalar;

import java.time.LocalDate;
import java.util.Scanner;

public class TamirhaneProje {
    public static int aracSayisi = 0;
    public static int gunlukKazanc=0;
    public  static int bakimUcreti ;
    static String aracTipi;
    static int islemno;

    static {

        LocalDate date = LocalDate.now();

        if (date.getMonthValue()==3) {
            bakimUcreti = 300;

        } else bakimUcreti = 500;
        System.out.println("date.getMonthValue() = " + date.getMonthValue());
        System.out.println(bakimUcreti);
    }

    {
        aracSayisi++;
    }

    TamirhaneProje(String aracTipi) {

        switch (aracTipi) {
            case "traktör":
                System.out.println("İşlem yapılan araç traktör");
                this.aracTipi = aracTipi;
                break;
            case "kamyon":
                System.out.println("İşlem yapılan araç Kamyon");
                this.aracTipi = aracTipi;
                break;
            case "oto":
                System.out.println("İşlem yapılan araç bir Otomobil");
                this.aracTipi = aracTipi;
                break;
            case "minibüs":
                System.out.println("İşlem yapılan araç bir Minibüs");
                this.aracTipi = aracTipi;
                break;
            default:
                System.out.println("Lütfen geçerli bir araç tipi giriniz");
        }
        System.out.println(aracTipi + " Tamirhanede işlem görecek");
        System.out.println("Giren araç sayısı: " + aracSayisi);
    }
    public static void tamir(int islemno){

        switch (islemno){
            case 1:
                bakimUcreti +=1000;
                System.out.println("Araç boyanmıştır.İşlem bedeli :" + bakimUcreti + " 'dir.");
                break;
            case 2:
                bakimUcreti+=800;
                System.out.println("Araç lastiği yapılmıştır.İşlem bedeli :" + bakimUcreti + " 'dir.");
                break;
            default:
                System.out.println("Lütfen geçerli bir işlem giriniz");
        }
    }
    public static void main(String[] args) {

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Lütfen araç tipinizi giriniz :");
            System.out.println("İşlemden çıkmak için 'q' ye Günlük kazancı görmek için 333'e basınız.");


            aracTipi = input.next().toLowerCase();
            if (aracTipi.equals("q"))break;

            TamirhaneProje obje1 = new TamirhaneProje(aracTipi);
            System.out.println("Lütfen yapılacak işlem numarasını giriniz");
            System.out.println("Boyama için 1'i, Lastik değişimi için 2'yi tuşlayınız");
            islemno=input.nextInt();
            tamir(islemno);
            gunlukKazanc=gunlukKazanc+bakimUcreti;
            System.out.println("Günlük kazancı öğrenmek için 333'e basınız.");
            if (aracTipi=="333"){
                System.out.println("Günlük kazancınız :" +gunlukKazanc);
            }


            LocalDate date = LocalDate.now();
            if (date.getMonthValue()==3) {
                bakimUcreti = 300;
            } else bakimUcreti = 500;



        }while (true);
        System.out.println("Gün sonu bakılan araç sayısı : "+aracSayisi);
        System.out.println("Gün sonu toplam Kazanç :"+gunlukKazanc);

    }
}

