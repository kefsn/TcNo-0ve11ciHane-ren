package javaders.day12switchloops;

public class Loops {
    public static void main(String[] args) {
        //Ex: Ekrana 5 kere "Hi" yazdırınız..

        //1.Way tavsiye edilmez.
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        /*
        Code Standarts
        1-Tekrarlar (repeatition) olmamalıdır.
        2-Dynamic code olmalıdır.
        3-Tamir  (Fix) ve update kolay yapılabilmelidir.

         */
        /*2.Way (Aynı adımlar tekrar tekrar yapılması gerektiğinde 'Loop'lar kullanılır.
        4 tane Loop çeşidimiz var;
        -for-loop
        -while-loop
        -do-while loop
        -for -each loop
      */
        /*
        1) for loop kalıbı şu şekildedir.
        for(Baslangic Değeri ; Loop Çalişma Şarti;Artirma/Eksilme){Çalişacak KOdlar
        }
         */
        for(int i = 1; i<6 ;i++){
            System.out.println("Hi");
        }//5 defa değilde 10 defa yazdırmak istesek i<11 yazardık...

        //Ex:11'den 14'e kadar tüm sayıları ekrana yazdırınız.

        for(int i =11; i<15; i++){
            System.out.println(i);
        }//For loop'ta variable adı genellikle i kullanılır. ++(increment) --(decrement)

        //Ex: 40'dan 23' kadar tüm çift sayıları ekrana yazdırınız
        for(int i =40; i>22; i--){
            if(i%2==0){
                System.out.println(i);
            }
          }

        //EX: 18'den 56'ya kadar tüm tek ayıları yazdır.
        for(int i =18; i<57; i++){
            if(i%2!=0){
                System.out.print(" "+i);
            }//Print yaparak sayıları yanyana yazdık...
        }


    }
}
