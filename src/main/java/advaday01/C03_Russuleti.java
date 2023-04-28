package advaday01;

public class C03_Russuleti {
    /*
    ================== RUSSULETI ======================
    Birbirleriyle çarpılacak sayılar yan yana yazılır.
    ilk sayı ikiye bölünür ve sonuç hemen altına yazılır.
            sonuç küsuratlı(kesirli) çıktıysa kesir kısmıyla ilgilenilmez
    sadece tam sayı kısmı yazılır. diğer sayı ise ikiyle çarpılır
    ve sonuç hemen altına yazılır.
    bu işlem yeni sayılar için tekrarlanır,
    ta ki ilk sayı ikiye bölüne,
    bölüne 1(bir) değerine ulaşana kadar.
    birinci sütundaki çift sayıların
    ikinci sütundaki karşılıkları silinir.
    ikinci sütunda silinmeyen sayılar
    toplandığında elde edilen sonuç
    istenilen sayıdır.
    örnek:
            456 x 219 = ? 99864

            456........219
            228........438
            114........876
            57 ........1752
            28 ........3504
            14 ........7008
            7  ........14016
            3  ........28032
            1  ........56064
            */

    public static void main(String[] args) {

        int ilkSayi = 456;
        int ikinciSayi = 219;


        System.out.println(carpim(ilkSayi, ikinciSayi));

    }

    public static int carpim(int ilkSayi, int ikinciSayi) {

    boolean negative = false;
   if (ilkSayi<0){
       ilkSayi = -ilkSayi;
       negative =! negative;
   }
   if (ikinciSayi<0){
       ikinciSayi = -ikinciSayi;
       negative =! negative;
   }

   int toplam = 0;

   do {
       ilkSayi = ilkSayi/2;
       ikinciSayi = ikinciSayi*2;

       if(ilkSayi%2==1){
           toplam = toplam + ikinciSayi;
       }

   }while (ilkSayi>=1);//İlk sayı 1'e eşit oluncaya kadar çalış

        if(negative){
           toplam = -toplam;
        }
        return toplam;
    }

}
