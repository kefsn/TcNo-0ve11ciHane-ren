package javaders.day33maps;

import java.util.HashMap;
import java.util.TreeMap;

public class TreeMap01 {
    public static void main(String[] args) {
        /*
        1)TreeMap'lar thread-safe değildir ve synchronized değildir.
        Note: Map'lerde multi-thread kullanmanız gerektiğinde sadece HashTable kullanabilirsiniz.
        2) TreeMap'lar valua'lar da null kulanılmasına müsaade eder , key'sini null yapılmasına müsaade etmez.
        3) TreeMap etry'lerini key'lerine göre natural oder'a göre sıraya koyar.
        Bu yüzden çok yavaştırr.

         */
     long t1 = System.nanoTime();
        TreeMap<String,Integer> countryPoulations = new TreeMap<>();


        countryPoulations.put("Neterland", 400000000);
        countryPoulations.put("USA", 18000000);
        countryPoulations.put("Turkiye", 83000000);
        countryPoulations.put("Belgium", 13000000);
        countryPoulations.put("Mexico", 125000000);
        countryPoulations.put("Brasil", 250000000);
        countryPoulations.put("France", 75000000);
        countryPoulations.put("Finland", 8000000);
        countryPoulations.put("Germany", 85000000);
        countryPoulations.put("Madagaskar", 30000000);

        long t2 = System.nanoTime();

        HashMap<String,Integer> countryPoulate = new HashMap<>();


        countryPoulate.put("Neterland", 400000000);
        countryPoulate.put("USA", 18000000);
        countryPoulate.put("Turkiye", 83000000);
        countryPoulate.put("Belgium", 13000000);
        countryPoulate.put("Mexico", 125000000);
        countryPoulate.put("Brasil", 250000000);
        countryPoulate.put("France", 75000000);
        countryPoulate.put("Finland", 8000000);
        countryPoulate.put("Germany", 85000000);
        countryPoulate.put("Madagaskar", 30000000);

        TreeMap<String, Integer> countrPop2 = new TreeMap<>(countryPoulate);

        System.out.println(countrPop2);

        long t3 = System.nanoTime();
        System.out.println(t2-t1);
        System.out.println(t3-t2);
    }
}
