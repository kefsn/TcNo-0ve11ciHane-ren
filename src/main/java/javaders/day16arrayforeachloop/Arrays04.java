package javaders.day16arrayforeachloop;

import java.util.Arrays;

public class Arrays04 {
    public static void main(String[] args) {
        //ornek 1 :Size verilen bir cumlede kac kelime oldugunu gosteren kodu yaziniz.
        String s = "Java is easy. Learn Java earn money.";
        String words[] = s.split(" ");
        System.out.println(Arrays.toString(words));
        System.out.println(words.length);

        //Örnek2.Verilen cümlede kaç harf olduğunu harflere ayırarak bulunuz..
        String s1 = "Java is easy. Learn Java earn money.";
        String letters [] = s1.replaceAll("[^a-zA-Z]", "").split("");
        System.out.println(Arrays.toString(letters));
        System.out.println(letters.length);
    }
}
