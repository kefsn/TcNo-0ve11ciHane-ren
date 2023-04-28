package javaders.day09Stringmanipulationsifstatement;

public class C02_IfStatement {
    public static void main(String[] args) {
        //INTERVİEW QUESTİON USA QA
        /*
        If Statemen() yapısı bazen kodların çalışması belirli koşullara bağlıdır.
        Mesela çok çalışırsam Java öğreneceğim.Java öğrenme eylemi çok çalışma eylemine
        bağlanmıştır.Birinci eylem gerçekleşmeden ikinci eylem gerçekleşmez.
        if(){}
        () parantez içine şart yazılır ve eğer True döndürürse {} body arasındaki
        kod çalışır aksi halde if body dışına çıkar class'ta sonraki kodları
        okumaya devam eder.
        indexOf'tan gelen sayı
         lastIndexOf'dan gelen sayıya eşitse istenilen  karkter tekrarsız anlamına gelir.
         */
        //String str = "abbccdc"; tekrarsız karakteri ekrana yazdırınız.
        String str = "aac";
        char ch = str.charAt(0);
        if (str.indexOf(ch) == str.lastIndexOf(ch)) {
            System.out.println(ch);
        }//if body

        char ch1 = str.charAt(1);
        if (str.indexOf(ch1) == str.lastIndexOf(ch1)) {
            System.out.println(ch1);
        }

        char ch2 = str.charAt(2);
        if (str.indexOf(ch2) == str.lastIndexOf(ch2)) {
            System.out.println(ch2);
        }

        //Ex: Sayi pozitif ise ekrana "Pozitif Sayi" yazdırın kodu yazın


        int num = 20;
        if (num > 0) {
            System.out.println(num);
        }

        //Ex: Sayi -1 ile 10 arasında ise ekrana "Rakam" yazdırınız.
        int num1 = 12;
        if (num1>-1 && num1 < 13){
            System.out.println("Rakam ");
        }

        /*
        Math Class'ı önemli bir Class'tır.İçerisinde bir çok method barındırır.
        abs() methodu içerisinde arguman olarak verilen sayının
        mutlak değerini yani pozitif halini verir.
         */
        //Ex: Sayı üç basamaklı ise ekrana "Sayı 3 basamklıdır " yzdırınız
            int n = -234;
            n = Math.abs(n);
            if(n>99 && n<1000){
                System.out.println("Sayı 3 basamaklıdır...");
            }
        System.out.println("Math.min(5, 9) = " + Math.min(5, 9));



    }
    }
