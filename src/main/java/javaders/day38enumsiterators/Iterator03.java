package javaders.day38enumsiterators;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Iterator03 {
    public static void main(String[] args) {
        //Verilen bir listeyi tersten yazdıran kodu oluşturunuz.

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);

        ListIterator itr = list.listIterator();
        while (itr.hasNext()){
            itr.next();

        }
        while (itr.hasPrevious()){
           Object el = itr.previous();
            System.out.print(el+ " ,");
        }


    }


}
