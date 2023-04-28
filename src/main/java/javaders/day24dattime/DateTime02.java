package javaders.day24dattime;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {
    public static void main(String[] args) {
        //Anlık zamanı nasıl alırız...
        LocalTime myCurrentime = LocalTime.now();
        System.out.println(myCurrentime);

        int hour = myCurrentime.getHour();
        System.out.println(hour);//12

        int minute = myCurrentime.getMinute();
        System.out.println(minute);//35

        int second = myCurrentime.getSecond();
        System.out.println(second);//18 Saniye

        int nano = myCurrentime.getNano();
        System.out.println(nano);

        LocalTime next =  myCurrentime.plusMinutes(10).minusHours(1);
        System.out.println("next = " + next);

       // Zaman formatı nasıl değiştirilir.
       // DateTimeFormatter.ofPattern() methodu kullanılarak değiştirilebilir.

        /*
        DateTime Class'ta kullanılan tarih saat formatları;
        HH : mm ==> 24'lü saat sistemini veriyor.
        hh : mm ==> 12'lü saat sistemini AM, PM gösterilmez.
        hh : mm a ==> 12'lü saat sistemini AM, PM
        hh : mm : ss ==> saniyeyi gösterir.
        HH : MM ==> Yanlış formattır çünkü MM aylar için kullanılır...
        mm minute demektir, MM month demektir.

        dd-MM-yyyy ==> gün - ay -yıl verir.
        MMM ==> Aug(yani ayın ilk üç harfini veriyor)
        MMMM==> August
         */

        DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("HH:mm");
        String formattedMyCurrentTime = dtf1.format(myCurrentime);
        System.out.println(formattedMyCurrentTime);//13:04

        DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("hh:mm:ss a");
        String formattedMyCurrentTime2 = dtf2.format(myCurrentime);
        System.out.println(formattedMyCurrentTime2);//01:06:47 ÖS

        LocalDate myCurrentDate = LocalDate.of(2023,8,25);
        System.out.println(myCurrentDate);

        DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("MM/dd/yyyy");//Ay olduğu için M'yi büyük yazıyoruz.
        System.out.println("dtf3.format(myCurrentDate) = " + dtf3.format(myCurrentDate));

        //Tarihi gün ay isminin ilk 3 Harfi verecek şekle çeviriniz.25/Aug/23 şeklinde olsun.

        DateTimeFormatter dtf5 = DateTimeFormatter.ofPattern("dd/MMM/yy");
        String formattedMyCurrentDate2 = dtf5.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate2);

        //tarihi 25/August/2023

        DateTimeFormatter dtf6 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedMyCurrentDate3 = dtf6.format(myCurrentDate);
        System.out.println(formattedMyCurrentDate3);

        //Başka bir zaman diliminde ki tarih ve zamanı nasıl alırız?

        //Tokyo'da ayın kaçı? ZoneID.of() ile öğreniyoruz
        LocalDate dateInTokyo = LocalDate .now(ZoneId.of("Asia/Tokyo"));
        System.out.println(dateInTokyo);

        //Amsterdam'da ayın kaçı?
        LocalDate dateInAmsterdam = LocalDate .now(ZoneId.of("Europe/Amsterdam"));
        System.out.println(dateInAmsterdam);

        //Tokyo'da saat kaç?
        LocalTime timeInTokyo = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println(timeInTokyo);

    }
}
