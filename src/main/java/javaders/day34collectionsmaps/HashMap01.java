package javaders.day34collectionsmaps;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMap01 {

    public static void main(String[] args) {
        /*
         1-Map'lere sözlüklerdeki gibi kelime ve manası şeklinde bir kulanımı vardır.
         2-'key' kısmı tekrarsız, 'value' kısmı tekrarlı olabilir.
         3-Map'lerde ki key ve value'dan oluşan elemana 'entry' denir.Elemanların tamamına 'EntrySet' denir.
         4-Entry'ler tekrarsız olduğu için 'EntrySet' denilir.
         5- Key ve value'lar ayrı ayrı data type'nda olabilirler.
         6) Map'ler collections değildir.
         7- HashMap'lar entry'leri rastgele sıralar, bu yüzden en hızlı Map'lerdir.
         8) HasHMap == Set + Collections
        */

        HashMap<String, Integer> countryPopulation = new HashMap<>();
        countryPopulation.put("Germany", 83000000);//Map'lara entry put() methodu ile eklenir.
        countryPopulation.put("Albania", 30000000);
        countryPopulation.put("USA", 400000000);
        countryPopulation.put("Turkey", 83000000);
        countryPopulation.put("Netherland", 180000000);

        System.out.println(countryPopulation);//Netherland=180000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000

        //get() methodu key ile çalışır ve value return eder.
       int germanyPopulations = countryPopulation.get("Germany");
        System.out.println(germanyPopulations);//83000000

     //keySet() methodu key'ları almaya yarar.
        Set<String> keys = countryPopulation.keySet();
        System.out.println(keys);//[Netherland, USA, Turkey, Germany, Albania]

        //values() methodu value'ları almaya yarar
        Collection<Integer> valuee = countryPopulation.values();
        System.out.println(valuee);

        //Ex: CountryPopulation 'map'İnde ülkelerin nüfusların ortalaması nedir.

        Collection<Integer> value = countryPopulation.values();
         int sum = 0;
         for (int w : value){
             sum = sum + w;
         }
        System.out.println(sum/value.size());

         //entrySet() map'teki entryleri kalip halinde alip bize set olarak veriyor.
        //Loop'lar map'lar ile kullanılamaz. Bunu için entrySet methodunu kullanırız.

        Set<Map.Entry<String , Integer>> entries =  countryPopulation.entrySet();
        System.out.println("entries = " + entries);//[Netherland=180000000, USA=400000000, Turkey=83000000, Germany=83000000, Albania=30000000]
        //776000033

        //Ex: countryPopulation Map'İnde ki ülklerin isimlerinin character sayısı ile nufüslarını toplamını bulunur.

        int toplam = 0;

        for (Map.Entry<String , Integer> w: entries){

          toplam = toplam +   w.getKey().length() + w.getValue();

        }
        System.out.println(toplam);



    }
}
