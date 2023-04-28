package javaders.day15loopsarrays;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        /*
        1-Application'larda data ile bu data'ları işleyen kodlar(logic) birbirinden
        ayrılır.Yani logic data'ya bağımlı olmamalıdır.
        Data'ya bağmlı olarak yazılan kodlara "Hard Kod" denir.
        "Hard code" hatalı kod demektir.

        Aşağıdaki grades array'ınde son eleman almak için 24' ve "grades.length-1" kullanılabilir.
        4 kullanırsaniz array'e bir eleman eklendiğinde kodunuz yanlış çıktı verir ama "grades.length-1"  doğr cevabı verir..


         */
        //Array'ları kısa yolddan nasıl oluşturabiliriz?
        int grades[] = {67,98,100,34,76};//Süslü parantez açıp içerisine NOTları giriyoruz.5 not girdik.
        System.out.println(Arrays.toString(grades));
        //Ex: grades array'ına ki en küçük
        // ve en büyük grade'in toplamını ekrana yazdıran kodu yazınız.
        Arrays.sort(grades);//Sort ile küçükten büyüğe sıraladık
        System.out.println(Arrays.toString(grades));//34,100,... ilk index 34 oluyor.
        System.out.println(grades[0]+grades[grades.length-1]);//Son sayı için grade.length-1 yaptık.

        //Ex: Size verilen bir String array'daki isimlerden 5 character'den az
        //charecter içerenleri consola yazınız.
        String stdNames[] = new String[5];
        stdNames[0] = "Ajda";//stdNames Aray'inda index 0'a Ajda koyun demektir.
        stdNames[3] = "Cüneyt";//3. index'e cüneyt yazacak.
        stdNames[2] = "Tom";//2. index Kemal yazacak
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        for(String w :stdNames){
            if(w.length()<5){
                System.out.println(w);
            }
        }
        //Ex:Size verilen String Array'deki isimleri alfabetik sıraya koyduktan
        //sonra 'F' ile başlayan isimlerden önceki isimleri konsola yazdırınız.
        String names[] = new String[5];
        stdNames[0] = "Ajda";//stdNames Aray'inda index 0'a Ajda koyun demektir.
        stdNames[3] = "Cüneyt";//3. index'e cüneyt yazacak.
        stdNames[2] = "Tom";//2. index Kemal yazacak
        stdNames[1] = "Ayhan";
        stdNames[4] = "Filiz";

        Arrays.sort(stdNames);
        for(String w : stdNames){
            if(w.startsWith("F")){
                break;
            }
            System.out.println(w);
        }

        //Ex:Size verilen String Array'deki isimleri alfabetik sıraya koyduktan
        //önceki isimleri ve 'F' ile başlayan isimlerden önceki isimleri konsola yazdırınız.

        Arrays.sort(stdNames);
        for(String w : stdNames){
            System.out.println(w);
            if(w.startsWith("F")){
                break;
            }

        }

        //Ex:Size verilen String Array'deki isimleri alfabetik sıraya koyduktan
        //sonra 'F' ile başlayan isimler hariç isimleri konsola yazdırınız.

        Arrays.sort(stdNames);
        for(String w : stdNames){
            if(w.startsWith("F")){
                continue;//F ile başlarsa boşwer yazdırma anlamında kullandık continue.

            }else{
                System.out.println(w);
            }//sort() methodu numeric data'ları, küçükten büyüğe(Acsending); Stringleri ise alfabetik sırada dizer.
            //ascending+alphabetically=="natural order" denir.Doğal sıralama denir

        }





    }
}
