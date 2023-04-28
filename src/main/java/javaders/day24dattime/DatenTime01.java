package javaders.day24dattime;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class DatenTime01 {
    public static void main(String[] args) {

        //İçinde bulunduğumuz zaman diliminde ki tarihi verir.
        LocalDate myCurrenDate = LocalDate.now(); //Herzaman içinde bulunduğumuz tarhi verir.
        System.out.println(myCurrenDate);//2023-03-21

        //Tarihten istediğimiz bileşini nasıl alırız.?
        int monthValue = myCurrenDate.getMonthValue();
        System.out.println(monthValue);

        int yearValue = myCurrenDate.getYear();
        System.out.println(yearValue);

        int dayValue = myCurrenDate.getDayOfMonth();
        System.out.println(dayValue);

        //Month bir Enum'dır ==Depo olarak aklımıza gelsin
        //Enum, Java da sabit değerleri(ay isimleri, gün isimleri,ülkedeki şehir isimlerini) depolamak için kullanılır.
         Month monthName = myCurrenDate.getMonth();//Ayın ismini verir.
        System.out.println(monthName);//MARCH

        DayOfWeek dayName = myCurrenDate.getDayOfWeek();
        System.out.println(dayName);//TUESDAY(Bu String değildir,enum'dır.)

        //plusDays() metodu güne gün ekler.plusMonth() metodu ileriki aylara götürür.
        //plusYear() metodu mevcut tarihe yıl ekler.
        System.out.println(myCurrenDate.plusDays(13).plusMonths(1).plusYears(2));//2025-05-03

        //Geçmiş tarihe nasıl gidilir...?
        System.out.println(myCurrenDate.minusDays(13).minusYears(2).minusMonths(1));

        //Spesifik bir tarih objesi LocalDate.of() ile oluşturulur...
        LocalDate date1 = LocalDate.of(1980,8,10);


        LocalDate date2 = LocalDate.of(1985,7,19);



        //Bir tarihin başka bir tarihten sonra olup olmadığın nasıl kontrol edilir?

        boolean r1 = date1.isAfter(date2);
        System.out.println(r1);//false

        boolean r2 = date1.isBefore(date2);
        System.out.println(r2);//True

        boolean r3 = date1.isEqual(date2);//false

        //Ex: Kullanıcadan aldınığınz tarih geçmişe ait ise "Geçersiz tarih girdidniz" mesajı veriniz.
        //Kullanıcadan aldınığınz tarih geleceğe ait ise "Zamanı girebilirsiniz" deyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter a year,month, and day numbers in the given order...");
        int year = input.nextInt();
        int month = input.nextInt();
        int day = input.nextInt();

        LocalDate givenDate = LocalDate.of(year,month,day);
        if (givenDate.isBefore(LocalDate.now())){
            System.out.println(givenDate + " Invalid date");
        }else {
            System.out.println("Enter time for the ticket");
        }

        System.out.println("givenDate.lengthOfMonth() = " + givenDate.lengthOfMonth());

        //Ex: Kullanıcın girdiği tarihin gün ismini bulan kodu yazınız...
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter year,month, and day numbers in the given order...");
        int y = scan.nextInt();
        int m = scan.nextInt();
        int d = scan.nextInt();

        LocalDate date = LocalDate.of(y,m,d);
        System.out.println("date.getDayOfWeek() = " + date.getDayOfWeek());
    }
}
