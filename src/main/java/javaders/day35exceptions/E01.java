package javaders.day35exceptions;

public class E01 {
    public static void main(String[] args) {
        /*
        1) Exceptions, beklenmedik problem demektir. Java çözemediği bir sorunla karşılaştığında
        Exception class'ı devreye girer.
        2) Exception class'ı bize karşılaşılan sorunun cinsini, bu sorunun nereden kaynaklandığını ve sebebini verir.
        3) Java exceptions fırlattığında, kodun çalışmasını durdur.Java exceptions oluşturan  kod için bizden bir karar vermemizi ister.
        4) Eğer hiçbirşey yapmaz isek, beklendiği gibi kodumuzun çalışmasını durdurur.
            - KOdumuzun çalışmaya devam etmesini istiyorsak, try-catch ile exception oluşturması muhtemel kodlarımızı catch bloğu içinde yazarız.
         5) Exception'i halletmek için iki temel yol vardır;
            a) Exceptin'a uygun çözümler üretebiliriz.Buna Exception Handling denir.
            b) Exception oluştuğunda bunu ilan eder ve geri çekilirsiniz.Buna da 'Throw Exception' denir.
         6) Exceptin'a uygun çözümler üretmede "try-catch" kullanılır. try block{} içinde yapılması gereken işlemi Java'Dan isteriz.
         Eğer Java bu işlemi sorunsuz bir şekilde yaparsa 'catch block' devreye girmez.
         try block içerisinde eğer bir "exception" oluşursa catch block devreye girer ve catch block içinde kodlar çalışır.
         7) try block içinde işlem yapılırken "Exception" oluşursa try block içindeki exceptiondan sonra ki kodlar çalıştırılmaz.
         8) catch satırında ki parantez içine karşılaşması muhtemel olan exception clas ismini ve obje isimini (ArithmeticException e  yazarız.
         9) if else kullanırsak oluşabilecek her problemi specific if parantezinin içine yazmamız gerekir. Bu da ciddi bir matematik bilgisi gerektirir
         ve yazacağımı kodu çok uzatır.
         Ama try-catch te Java ilgili Exception ile alakalı oluşabilecek tüm problemleri yakalar.

        ArithmeticException: Matematiksel işlemler kullanıyorsak alabileceğimiz muhtemel hatadır.

       NOT: ArithmeticException: Olusan exception cinsi
       NOT: by zero: Hatayi anlatan teknik mesaj

       Exception in thread "main" java.lang.ArithmeticException: / by zero
	    at javaders.day35exceptions.E01.divide(E01.java:17)(Hatanın hangi satırda ve hangi package, klass da olduğunu anlatıyor.
	     at javaders.day35exceptions.E01.main(E01.java:13)

         */
        divide(12,6);
        divide(12, 0);

        divide2(3,0);

    }
    //Tavsiye edilen yöntem değildir.
    public static  void divide(int a, int b){
        if(b==0){
            System.out.println("Sayi 0'a bölünemez");
        }else

        System.out.println(a/b);
        System.out.println("divide methodu içi");
    }

    public static  void divide2(int a, int b){
        try {
            System.out.println(a/b);
        }catch (ArithmeticException e){
            System.out.println("Sayı 0'a bölünemez");
        }
        System.out.println("try catch ile handle edildi");

    }

}
