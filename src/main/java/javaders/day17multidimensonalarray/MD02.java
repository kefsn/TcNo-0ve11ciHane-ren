package javaders.day17multidimensonalarray;

import java.util.Arrays;

public class MD02 {
    public static void main(String[] args) {
        //Example 4: Iki boyutlu bir array'i tek boyutlu bir array'e ceviriniz
        int numbers[][] = { {5, 4}, {2, 3, 2} }; // ==> { 5, 4, 2, 3, 2 }

        /*
        1. Step; İki boyutlu arrayda öncelikle kaç eleman olduğunu dinamik olarak bulalım.
        2. Step: Tek boyutlu Array'ı elde ettiğimiz eleman sayisi kullanarak oluşturalım.
        3.Step : iki boyutlu arraydaki elemanları tek boyutlu array'e transfer edelim.
         */
        int toplamElemanSayisi = 0;
        for (int[] w : numbers) {
            toplamElemanSayisi = toplamElemanSayisi + w.length;

        }
        System.out.println(toplamElemanSayisi);

        /*
        2. Step: Tek boyutlu Array'ı elde ettiğimiz eleman sayisi kullanarak oluşturalım.
         */
        int newArr[] = new int[toplamElemanSayisi];
        //3.Step : iki boyutlu arraydaki elemanları tek boyutlu array'e transfer edelim.
        int idx = 0;
        for (int[] w: numbers){
            for (int k : w) {
                newArr[idx] = k;
                idx++;

            }
        }
        System.out.println(Arrays.toString(newArr));

        //Example 5: Bir integer multidimensional array'deki en kucuk ve en buyuk elemanin toplamini bulunuz.
        int ages[][] = { {15, 4}, {12, 43, 21} }; // ==> 4 + 43 = 47

        int small = ages[0][0];//Variable araydan herhangi bir değer atıyoruz önce..
        int big = ages[0][0];
        for (int[] w : ages){
            for (int k : w){
                small = Math.min(small,k);//KIyaslama yapıp küçük olan değeri vereceği için
                 big = Math.max(big,k); //Büyük sayıyı bulmak için Math.max() methodu kullanırı                          //Math.nin() methodu kullanılır.
            }

        }
        System.out.println(small+big);


    }
}
