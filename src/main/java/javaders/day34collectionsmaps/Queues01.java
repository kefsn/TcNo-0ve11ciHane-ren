package javaders.day34collectionsmaps;

import java.util.LinkedList;
import java.util.Queue;

public class Queues01 {
    public static void main(String[] args) {
        Queue<String> wareHouse = new LinkedList<>();//LinkedList olduğundan dolayı insertion order'a göre dizecek
        wareHouse.add("Milk");
        wareHouse.add("Meat");
        wareHouse.add("Egg");
        wareHouse.add("Bread");
        wareHouse.add("Chese");
        System.out.println(wareHouse);//[Milk, Meat, Egg, Bread, Chese]
        wareHouse.remove();
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]İlke elemanı sildi.

        wareHouse.peek();//Meat verir ama listeden silmez.
        System.out.println(wareHouse);

        System.out.println(wareHouse.element());//Meat verir ama silmez peek gibi.Ama null kabul etmez hata verir.
        System.out.println(wareHouse);//[Meat, Egg, Bread, Chese]





    }

}
