package javaders.day33maps;

import java.util.Hashtable;

public class HashTable01 {
    public static void main(String[] args) {
        /*
        HashMap ile HashTable arasındaki fark nedir?
        1-HashMap, "thread-safe"(Çoklu işi yapmak) değildir. "HashTable" , thread-safe dir.
         -HashMap, synchronized değildir. "HashTable" , synchronized dir.
         2-HashMap bir tane "null" keye ve istediğiniz kadar null value'a müsade eder.
         HashTable key'lerde de value'larda da null kullanılmasına müsaade etmez.
         3-HashMap, hızlıdır. "HashTable" , HashMap'e göre yavaştır.

         Note: HashMap ve HashTable, ikiside entry'leri rastgele sıralar.

         */

        Hashtable<String, Integer> stdAges = new Hashtable<>();

        stdAges.put("Tom", 43);
        stdAges.put("Jim", 52);
        stdAges.put("Jack", 21);
        stdAges.put("Henry", 43);
        stdAges.put("Walker", 85);
        stdAges.put("Walker", 85);

       // stdAges.put(null, 85); HashTable'ların key'ine ve valua'larına null konulamaz.




    }
}
