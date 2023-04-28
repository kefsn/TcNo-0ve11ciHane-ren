package deneme1.TEKRAR;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TekrarUtils {
       /*
      SELECT STUDENT
1) Kullanıcının girdiği öğrenci sayısı kadar öğrencinin;
2) isimlerini, cinsiyetlerini, boy ve kilo bilgilerini alarak
   bu bilgileri kullanarak kursa kabul edilecek öğrencileri belirleyen,

   Kursa kabul edilecek öğrencilerin belirlenmesinde de
3) Kadın öğrencilerin boyu 1.50 m'den fazla, kilosu 50 kg ile 70 kg aralığında olanlarin,
4) Erkek öğrencilerin boyu 1.60 m'den fazla, kilosu 70 kg ile 90 kg aralığında olanlarin,
   sartina bakildigive eger hiçbir öğrenci bu koşulları sağlamıyorsa,
   "Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı."
   mesajıni ekrana yazdıran kodu yaziniz
       */
       public static void main(String[] args) {
           Scanner scan = new Scanner(System.in);
           System.out.println("Lütfen öğrnci sayısını giriniz");
           int numStd = scan.nextInt();

           List<Tekrar> tekrars = new ArrayList<>();
           for (int i = 0; i <numStd ; i++) {
               System.out.println("Name : ");
               String name = scan.next();

               System.out.println("Gender : ");
               String gender = scan.next();

               System.out.println("Height : ");
               double height = scan.nextDouble();

               System.out.println("Height : ");
               double weight = scan.nextDouble();
           }



       }

}
