package javaders.day31collections;

import java.util.HashSet;
import java.util.TreeSet;

public class Set02 {
    public static void main(String[] args) {
        //Example 1: Ogrenci email adreslerini natural order'da siralanmis olarak depolayiniz.
       long t1 = System.nanoTime();

       TreeSet<String> emails = new TreeSet<>();
        emails.add("a@gmail.com");
        emails.add("c@gmail.com");
        emails.add("b@gmail.com");
        System.out.println(emails);

        long t2 = System.nanoTime();

        //2.Yol recommend
        /*
        Önce data'yı HashSet' koy daha sonra HashSet'teki veriyi TreeSet'e aktar.Daha hızlı olur.
         */

        HashSet<String> emailHs = new HashSet<>();
        emailHs.add("a@gmail.com");
        emailHs.add("c@gmail.com");
        emailHs.add("b@gmail.com");

        TreeSet<String> emailTs = new TreeSet<>(emailHs);//öNce da HashSet oluştur daha sonra,HashSet'in variable nameni al parametreye koy daha hızlıolur.
        System.out.println(emailTs);

        long t3 = System.nanoTime();
        System.out.println(t2-t1);//TreeSet'in ne kadar sürdüğünü bize verecek
        System.out.println(t3-t2);//HashSet'in ne kadar sürdüğünü bize verecek

    }

}
