package javaders.day34collectionsmaps;

import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queues02 {
    public static void main(String[] args) {
        /*
        1-Queue bir interface'dir, bu yüzden constructor'ı yoktur. dolayısıyla object oluşturuken
        'new' key wordun'den sonra kullanılamaz.Yani data type 'Queue' olan bir object oluşturmak için
        'new' key wordden sonra iki ihtimalimiz var,;
               A) Ya LinkedList veya
               B) PriortyQueue classları kullanılabilir.
          2- Queue oluştururken PriortyGueue oluşturursanız, elemanaları belirleyeceğiniz kurala göre sıralama hakkınız olur.
          FİFO == First in- Frist out kuralı geçerli. İlk giren ilk çıkıyor.

         Deque == Double ended queue(iki uçlu kuyruk) anlamına gelir.

         */

        Queue<String> line = new PriorityQueue<>();
        line.add("Milk");
        line.add("Meat");
        line.add("Egg");
        line.add("Orange");
        line.add("Orange");
        line.add("Tomatoes");
        System.out.println(line);

        //Deque == Double ended queue(iki uçlu kuyruk) anlamına gelir.
        //Deque'daki add(), get(), peek(), poll(), remove() methodları first-Last şeklinde iki uçlu olarak buluruz.

        Deque<String> d = new LinkedList<>();
        d.add("Milk");
        d.add("Meat");
        d.add("Egg");
        d.add("Orange");
        d.add("Orange");
        d.add("Tomatoes");
        System.out.println(d);


    }
}
