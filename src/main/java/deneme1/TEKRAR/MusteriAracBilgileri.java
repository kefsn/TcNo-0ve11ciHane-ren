package deneme1.TEKRAR;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class MusteriAracBilgileri extends AracTalebi {
    /*
      ++ MusteriveAracBilgileri adında method’ları içeren bir class oluşturunuz.
        -	aracTalep() adında bir method oluşturunuz.
        Bu method’da alinacak sehir, teslim edilecek sehir, alinacak gun ve teslim edilecek gun ve teslim saati bilgilerini aliniz.
          Odenecek toplam gun sayisini yazdırın.
        o	Dikkat: Teslim gunu, alis gününden daha once olamaz.
        -	arabalar() create ederek, tüm araç modellerini bir list’e atınız.
           (parametre olarak araç ile bilgileri alan <marka, model, yakıt tipi, vites, gunlukUcret> objeleri list’e atınız.)
                Bu list’i göstererek bir aracı kiralamasını sağlayın.
        -	getAraba() metodu ile seçmiş olduğu aracı gösterin.
         Odeyeceği toplam miktari yazdirin. Onaylar ise, müşteri bilgilerini almak için devam edin.
        -	musteriBilgileri() metodu ile müşteri ile ilgili bilgileri aliniz. AdSoyad, ID, yaş ve telefon.
        -	OdemeBilgieri() metodu ile odeme bilgilerini alacaginiz bir method create ediniz.
        Kart numarası uzunluğu 12 olmalıdır, kontrol ediniz.
     */
    Scanner scan = new Scanner(System.in);
    AracTalebi arac = new AracTalebi();
    private int odenecekToplamGun;
    double toplamUcret;
    int secim;


    public void aracTalep() {

        System.out.println("Aracı almayı istediğiniz sehrı gırınız");
        String alinacakSehir = scan.next();
        arac.setAlinacakSehir(alinacakSehir);

        System.out.println("Aracı teslım etmeyı istediğiniz sehır giriniz");
        String teslimSehir = scan.next();
        arac.setTeslimSehir(teslimSehir);
        tarihFarki();

    }

    public void tarihFarki() {

        for (int i = 1; i < 5; i++) {

            System.out.println("Aracı almak istediğiniz günü giriniz ..");
            int day = scan.nextInt();

            System.out.println("Aracı almak istediğiniz ayı giriniz ..");
            int month = scan.nextInt();

            System.out.println("Aracı almak istediğiniz yılı giriniz ..");
            int year = scan.nextInt();

            System.out.println("Aracı almak istediğiniz saati giriniz..");
            int saat = scan.nextInt();


            LocalDateTime givenDate = LocalDateTime.of(year,month,day,saat,00);
            System.out.println(givenDate + " Verilen Tarih");
            if (givenDate.isBefore(LocalDateTime.now())){
                System.out.println("Geçmiş tarih girdiniz dikkat ediniz...Geçerli tarih ?");
            }

            arac.setAlinacakGun(givenDate);
            System.out.println(arac.getAlinacakGun());





            System.out.println(arac);
            System.out.println("Aracı teslim etmek istediğiniz günü giriniz...");
            day = scan.nextInt();


            System.out.println("Lütfen  teslim etmek istediğiniz ayı giriniz");
            month = scan.nextInt();

            System.out.println("Lütfen  teslim etmek istediğiniz yılı giriniz");
            year = scan.nextInt();

            System.out.println("Aracı teslim etmek istediğiniz saati giriniz..");
            saat = scan.nextInt();

            LocalDateTime teslimGun = LocalDateTime.of(year,month,day,saat,00);
            arac.setTeslimGunu(teslimGun);



            if (givenDate.isBefore(teslimGun) || givenDate.isEqual(teslimGun)) {

            } else {


                if (i > 3) {
                    break;
                } else {
                    System.out.println("Alım tarihiniz teslim tarihinizden önce olamaz..");
                    System.out.println((3 - i) + "Hakkınız kaldı..");
                }

            }


        }
    }

}
