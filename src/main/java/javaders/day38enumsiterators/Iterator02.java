package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator02 {

    public static void main(String[] args) {
        /*
        Verilen listedeki her elemanı 3 artıran methodun kodu yazdırınız.

         */
        List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);


       ListIterator itr = list.listIterator();

        while (itr.hasNext()){
            Object sayi = itr.next();
            itr.set((Integer)sayi+3);

        }

        System.out.println(list);
    }
}
