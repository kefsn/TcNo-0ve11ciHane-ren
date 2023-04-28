package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {

        /*
        Array;
        1-Array ,Java'nın çoklu data depolamak için oluşturduğu bir yapıdır.
        2-Array'a farklı data type'ları konulmaz. sadece aynı data type konulur.
        2-Aynı data Type'nda çoklu data depolamak için kullanılır.
        4-Array'lar primitive data type'ları veya referance ile çalışır.
        5-Array'lar "Super fast" ve memoryde çok az yer kaplarlar.
         */
        //Array nasıl oluşturulur?
        String stdNames[] = new String[5];//Ne yazacağını söylemezsek Stringde null sonucu verir


        //Array nasıl yazdırılır
        System.out.println(Arrays.toString(stdNames));// null'a Stringin default değerleridir.

        //Array'a nasıl eleman eklenir?
        stdNames[0] = "Ajda";//stdNames Aray'inda index 0'a Ajda koyun demektir.
        stdNames[3] = "Cüneyt";//3. index'e cüneyt yazacak.
        stdNames[2] = "Kemal";//2. index Kemal yazacak
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";
        System.out.println(Arrays.toString(stdNames));//[Ajda, Ayhan, Kemal, Cüneyt, null]
        
        //Array'daki spesifik bir elemanı nasıl alabilir?
        System.out.println(stdNames[3]);//Cüneyt yazdırır.
        
        //Ex: stdNames aray'ında ki her isimin sonuna * koyarak konsola yazdırınız.
        //1.Way
        for (int i = 0; i < stdNames.length; i++) {//Length elemn sayısınız verir biz array da.Length Stringler'e parantezli(metod); Array'larda parantezsiz(metod değil) kullanılır.
            System.out.println(stdNames[i]+ "*");
        }
        //2.for- each loop==Enhanced (Geliştirilmiş zenginleştirilimş)Loop demek
        //Mümkünse her zaman for-eac loop kullanın.İstediğimiz index'ten başlamak istiyorsak for-loop kullanılırız.
        for (String w: stdNames) {
            System.out.println(w +"*");
            
        }
        //Ex:Bir Integer Array oluşturunuz, 5 eleman ekleyiniz,elemanların toplamını bulup konsola yazdırınız.
        int ages[] = new int[5];
        ages[0] = 12;
        ages[1] = 23;
        ages[2] = 9;
        ages[3] = 38;
        ages[4] = 27;
        System.out.println(Arrays.toString(ages));

        int sum = 0;//Toplamanın sonucu koymak için bu variable oluşturmak lazım.
        for(int w : ages){

            sum = sum +w;

        }
        System.out.println(sum);
        //Ex: Bir char Arrays olusturunuz, 3 eleman ekleyiniz, elemanlarin carpimini bulup console yazdiriniz
        char initials[] = new char[3];
        initials[0] = 'J';
        initials[1] = 'P';
        initials[2] = 'A';
        int carpim = 1;//1 yapıyoruz çünkü 1 çarpmada etkisiz elemandır.
        for(char w : initials){
            carpim = carpim*w;
        }
        System.out.println(carpim);



    }
}
