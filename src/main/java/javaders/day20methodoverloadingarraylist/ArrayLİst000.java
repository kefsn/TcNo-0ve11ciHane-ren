package javaders.day20methodoverloadingarraylist;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayLİst000 {
    public static void main(String[] args) {

        //ArrayList nasil olusturulur?
        ArrayList<Integer> ages = new ArrayList<>();

        //ArrayList console a nasil yazdirilir?
        System.out.println(ages);//[]

        //Arraylistlere eleman nasil eklenir?
        //Arrayliste eleman eklemek icin add() methodunu kullaniriz
        //add() methodu elemanlari sizin verdiginiz sirada liste ekler (==>insertion order)
        ages.add(9);
        ages.add(12);
        ages.add(10);
        System.out.println(ages);//[9, 12, 10]
        ages.add(1,656);
        System.out.println(ages);//[9, 656, 12, 10]
        ages.add(3,777);
        System.out.println(ages);//[9, 656, 12, 777, 10]
        ages.add(888);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888]

        //List'e coklu eleman nasil eklenir? veya Liste baska bir list nasil eklenir?
        ArrayList<Integer> newAges = new ArrayList<>();
        newAges.add(8);
        newAges.add(9);
        newAges.add(10);

        ages.addAll(newAges);
        System.out.println(ages);//[9, 656, 12, 777, 10, 888, 8, 9, 10]

        ages.addAll(2,newAges);
        System.out.println(ages);//[9, 656, 8, 9, 10, 12, 777, 10, 888, 8, 9, 10]

        //Arraylistte eleman sayisi nasil bulunur?
        //size() methodu bir listteki eleman sayisini bize verir
        int numOfElement = ages.size();
        System.out.println(numOfElement);//12

        //Arraylist te specific bir eleman nasil alinir
        //get() methodu index kullanarak istedigimiz elemani almaya yarar
        int el1 = ages.get(1);
        System.out.println(el1);//656

        //Arraylistte specific bir eleman nasil degistirilir?
        ages.set(2,313);
        System.out.println(ages);

        ages.set(4,353);
        System.out.println(ages);

        //Bir listteki tum elemanlari nasil silebiliriz?
        ages.clear();
        System.out.println(ages);

        //Example1:Bİr list'in boş olup olmadığını kontrol eden kodu yazınız.
        ArrayList<String> names = new ArrayList<>();
        names.add("usame");
        names.add("fatih");
        names.add("ali");
        names.add("ufuk");//List'in size, Array'in length'i olur.

        if(names.size()==0){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }

        //2.Way recommended
        if(names.isEmpty()){
            System.out.println("List is empty");
        }else{
            System.out.println("List has at least 1 element");
        }
        boolean varMI = names.isEmpty();
        System.out.println("varMI = " + varMI);

        //Bir list'in başka bir list ile aynı olup olmadığını nasıl kontrol ederiz.
        //İKi List'tin eşit olması için aynı index'de aynı elemanlar olması gerekir.
        ArrayList<String> names1 = new ArrayList<>();
        names1.add("usame");
        names1.add("fatih");
        names1.add("ali");
        names1.add("ufuk");

        ArrayList<String> names2 = new ArrayList<>();
        names2.add("usame");
        names2.add("fatih");
        names2.add("ufuk");
        names2.add("ali");

        boolean s = names1.equals(names2);
        System.out.println("s = " + s);//False

        //verilen iki integer list'de tamamıyla aynı elemanlar olup olmadığını yazan codu yazınız.

        ArrayList<Integer> nums1 = new ArrayList<>();
        nums1.add(8);
        nums1.add(9);
        nums1.add(10);

        ArrayList<Integer> nums2 = new ArrayList<>();
        nums2.add(8);
        nums2.add(10);
        nums2.add(10);

        Collections.sort(nums1);
        Collections.sort(nums2);

        System.out.println(nums1.equals(nums2));

    }

}
