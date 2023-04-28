package javaders.day17multidimensonalarray;

import java.util.Arrays;

public class MultiDimensionalArray {
    public static void main(String[] args) {
        /*
        -Bir array'ın elemanları array ise bu array MultiDimensionalyArraydır.
        -Baştaki kapalı parantez OUTER array, ikinci kapalı paranter İNNER array dir
        -Multidimesional array nasıl oluşturulur?
         */
        int a [][]= new int[3][2];
        //Multidimensional array'lara eleman nasıl eklenir?
        a[0][0] = 5;
        a[1][1] = 45;
        a[2][0] = 123;
        a[0][1] = 12;
        a[1][0] = 81;
        a[2][1] = 0;


        //MultiDimensionla array'ları konsola yazdırmak için deepToString() metodu kullanırız.
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.deepToString(a));

        //MultiDimensionla array içinde spesifik bir array naısl yazdırılır.
        System.out.println(a[1][1]);

        //MultiDimensionla array içindeki array nasıl yazdırılır..
        System.out.println(Arrays.toString(a[0]));
        System.out.println(Arrays.toString(a[1]));
        System.out.println(Arrays.toString(a[2]));

        //Kısa yoldan Muldimensional Array nasıl oluşturulur?
        //Aşağıdaki arrayda kaç eleman var? eleman sayısı?
        String students [][]= {{"Ali" ,"Kemal"},{"Cemal"},{"Ayhan", "Beyhan","Seyhan"},{"Ceyhan","Kayhan"} };
        int sum = 0;

        for(String[] w : students ){
            sum = sum + w.length;
        }
        System.out.println(sum);

        //Example 2: Yukaridaki {{"Ali" ,"Kemal"},{"Cemal"},{"Ayhan", "Beyhan","Seyhan"},{"Ceyhan","Kayhan"} }
        // students array'inde icinde "m" olan isimleri console'a yazdiriniz
        for ( String[] w : students) {
            for(String k : w){
                if(k.contains("m")){
                    System.out.println(k);
                }



            }
            //Example 3: Bir integer multidimensional array olusturunuz, tum elemanlarin carpimini hesaplayiniz
            int nums[][] = { {5, 4}, {2, 3, 2}, {7}};
            int result = 1;
            //{ {5, 4}, {2, 3, 2}, {7}};
            for ( int [] l   :   nums ) {
                for ( int k  : l  ) {
                    result = result*k;
                }
            }
            System.out.println(result);

        }




    }
}
