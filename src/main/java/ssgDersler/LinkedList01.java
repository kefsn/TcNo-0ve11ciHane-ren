package ssgDersler;

import java.util.Arrays;
import java.util.LinkedList;

public class LinkedList01 {

    public static void main(String[] args) {

        LinkedList<String> s = new LinkedList<>();
        s.add("Esra");
      s.add("Steve");
      s.add("Ajda");
      s.add("Muge");
      s.add("Cuneyt");
      s.add("Esra");

      s.add(2,"Efe");

      System.out.println(s);
      s.addFirst("Kemal");
        System.out.println(s);
        s.addLast("Ajdar");
        System.out.println(s);

        s.remove(2);
        System.out.println(s);
        s.remove("Ajdar");

        s.removeFirstOccurrence(s);
        System.out.println(s);

        s.removeLastOccurrence("Esra");
        System.out.println(s);

        System.out.println(s.peek());


    }


}
