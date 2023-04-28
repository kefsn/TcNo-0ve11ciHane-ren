package Lambda_Recap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda02 {
    public static void main(String[] args) {


        List<String> meyve = new ArrayList<>(Arrays.asList("elma", "portakal", "uzum", "cilek", "greyfurt",
                "nar", "mandalina", "armut", "elma", "keciboynuzu", "elma"));
        ilkHarfEveyaC(meyve);
        System.out.println();
        elemanBasinaVesonunaYildiz(meyve);
        System.out.println();
        System.out.println(karakterSayGoreBuyKucSirKarSayEnBuyIlk3(meyve));

    }

    // SORU1 : List elemanlarının ilk harfi 'e' veya 'c' olanlari yazdıralım

    public static void ilkHarfEveyaC(List<String> meyve) {
        meyve.
                stream().
                filter(t -> t.startsWith("e") || t.startsWith("c")).
                forEach(Utils::yazdir);
    }

    // SORU2 : List elemanlarının hepsinin basina ve sonuna yildiz ekleyerek yazdiralim
    public static void elemanBasinaVesonunaYildiz(List<String> meyve) {
        meyve.
                stream().sorted().
                forEach(t -> System.out.print(" *" + t + "* "));
    }
    // SORU3 : List elemanlarını karakter sayısına gore buyukten kucuge sıralayınız,
    // karakter sayısı en buyuk ilk 3 elemanı List halinde return ederek yazdırınız
    public static List<String> karakterSayGoreBuyKucSirKarSayEnBuyIlk3(List<String> meyve) {
    return meyve.
                stream().
                sorted(Comparator.comparing(String::length).reversed()).//İster String::length yerine t->t.toString().length() de yazabiliriz.
                limit(3).//"İlk 3'ü yaz" anlamına gelir.
                collect(Collectors.toList());

    }
}
