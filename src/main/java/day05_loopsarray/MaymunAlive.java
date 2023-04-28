package day05_loopsarray;

public class MaymunAlive {
        /* INTERWIEW SORUSU

        Adada yalnız bir maymun var
        Her gün 4 muz yemesi gerekiyor
        o adada sadece 165 muz var
        Maymunun kac gun hayatta kalabilecegini hesaplayan kodu yaziniz.

         */
    public static void main(String[] args) {
        int numberOfBananas = 165;
        int survivalDays = 1;
        boolean monkeyAlive = true;

        do{
            numberOfBananas-=4;//Toplam muz sayısından her gün 4 muz eksilir.
            System.out.println("Kalan muz sayısı : " +numberOfBananas);

            survivalDays++;
            if (numberOfBananas<4){
                monkeyAlive=false;
                System.out.println("Bugün "+survivalDays+". gün. Yeterli muz kalmadı Maymun rahmetli. Reat in peace ");

            }else{
                System.out.println("Bugün "+survivalDays+". gün ve Monkey is still Alive.");
            }
        }while (monkeyAlive);
    }
}
