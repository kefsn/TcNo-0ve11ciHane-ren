package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda01 {
    public static void main(String[] args) {
        //Lambda map haric butun collection uyelerinde kullanilabilir. Map'de
        // kullanilamaz cunku maplerde key value iliskisi vardir.

        List<Integer> sayi = new ArrayList<>(Arrays.asList(-5, -8, -12, 0, 1, 12, 5, 5, 6, 9, 15, 8));

        ciftVepozitifLamExYazdir(sayi);
        System.out.println();
        ciftVepozitifMetRef(sayi);
        System.out.println();
        kareYazdir(sayi);
        System.out.println();
        kareTekrarsizYazdir(sayi);
        System.out.println();
        buyKucukSirala(sayi);
        System.out.println();
        pozitifKuo(sayi);
        System.out.println();
        System.out.println(toplamMetRef(sayi));
        System.out.println();
        topLambaLamEx(sayi);
        System.out.println();
        ciftElKareKucBuySirListReturn(sayi);

    }
    //SORU1: List elemanlarının çift ve pozitif olanlarını, Lambda Expression
    // kullanarak aralarında bosluk olacak sekilde yazdırın

    public static void ciftVepozitifLamExYazdir(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t % 2 == 0 && t > 0).
                forEach(t -> System.out.print(t + " "));
    }

    //SORU2: List elemanlarının çift ve
// pozitif olanlarını, Method Referances kullanarak aralarında bosluk olacak sekilde yazdırın
    public static void ciftVepozitifMetRef(List<Integer> sayi) {
        System.out.println("Deneme");
        sayi.
                stream().filter(t -> t % 2 == 0 && t > 0).
                forEach(Utils::yazdir);
    }

    //SORU3 : List elemanlarının karelerini,
// aralarında bosluk olacak sekilde yazdırın
    public static void kareYazdir(List<Integer> sayi) {
        sayi.
                stream().
                map(Utils::kareAl).
                forEach(Utils::yazdir);
    }

    //SORU4 : List elemanlarının karelerini, tekrarsiz yazdırın
    public static void kareTekrarsizYazdir(List<Integer> sayi) {
        sayi.
                stream(). //25 64 144 0 1 144 25 36 81 225 64
                map(Utils::kareAl).
                distinct().//25 64 144 0 1 36 81 225
                forEach(Utils::yazdir);
    }

    //SORU5: List elemanlarını buyukten kucuge sıralayarak yazdırın
    public static void buyKucukSirala(List<Integer> sayi) {
        sayi.
                stream().
                sorted(Comparator.reverseOrder()).
                forEach(Utils::yazdir);
    }

    // SORU6 : List elemanlarının pozitif olanlarının,
    // kuplerini bulup, birler basamagı 5 olanları yazdırınız
    public static void pozitifKuo(List<Integer> sayi) {
        sayi.
                stream().
                filter(t -> t > 0).
                map(Utils::kupAl).
                filter(t -> (t % 10 == 5)).
                forEach(Utils::yazdir);
    }

    // SORU7: List elemanlarının Method References ile
    // toplamını bulun ve yazdırın
    public static int toplamMetRef(List<Integer> sayi) {

        Integer toplam = sayi.
                stream().
                reduce(Integer::sum).
                get();
        return toplam;
    }

    // SORU8: List elemanlarının Lambda Expression
    // ile toplamını bulun ve yazdırın
    public static void topLambaLamEx(List<Integer> sayi) {
        System.out.println("Expression :");
        Integer toplamLamb =
                sayi.
                        stream().
                        reduce(0, (t, u) -> t + u);
        System.out.println(toplamLamb);

    }
//SORU9 : Listin cift elemanlarının, karelerini,
// kucukten buyuge sıralayıp list halinde return ederek yazdırınız


    public static void ciftElKareKucBuySirListReturn(List<Integer> sayi) {


       sayi.
                stream().
                filter(t -> t % 2 == 0).
                map(Utils::kareAl).
                sorted().
                collect(Collectors.toList());

    }
    public static void ElKareKucBuySirListReturn(List<Integer> sayi) {


        sayi.
                stream().
                filter(t -> t % 2 == 0).
                map(Utils::kareAl).
                sorted().
                forEach(Utils::yazdir);

    }
}
