package javaders.LAMBDA.day03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Lambda03 {

    public static void main(String[] args) {
        List<String> iller = new ArrayList<>(Arrays.asList("Van", "Hatay", "Edirne", "Gaziantep",
                "Eskisehir", "Ordu", "MUS", "MUS", "Nevsehir"));
/*
        System.out.println(karakterSysi5tenFazlaElSil(iller));
        System.out.println(hIleBaslayanYadaUıleBıtenElsil(iller));
        System.out.println(elKarakterSysiKareleriniAl(iller));
       */
        System.out.println(elKarakterSysiCiftOlanlar(iller));


    }
    // 4) Karakter sayisi 5 ten fazla olan elemanlari siliniz


    /*
    public  static List<String> karakterSysi5tenFazlaElSil(List<String> iller){

       iller.removeIf(t->t.length()>5);
       return iller;
}



        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 5)"H" ile baslayan veya "u" ile biten elemanlari siliniz


    public  static List<String> hIleBaslayanYadaUıleBıtenElsil(List<String> iller){
        iller.removeIf(t->t.startsWith("H")||t.endsWith("u"));
        return iller;
    }



        ////////////////////// ************************************************\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        // 6) List elemanlarini karakter sayilarinin karelerini aliniz Ve bir list olarak ekrana yazdirin
        public  static List<Integer> elKarakterSysiKareleriniAl(List<String> iller){
           return iller.stream().map(Utils::karesiniAl).//Lambda EXPRESSİON
                   collect(Collectors.toList());//List olarak ekrana yazdırmak için bu methodu kullandık.

        }
        */





        ////////////////////// ************************************************ \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
        //  7) List elemanlarindan karakter sayisi cift sayi olanlari bir list icinde ekrana yazdiriniz.

    public  static List<String> elKarakterSysiCiftOlanlar(List<String> iller){
        return iller.
                stream().
                filter(Utils::sayiCiftMi).
                collect(Collectors.toList());//List olarak ekrana yazdırmak için bu methodu kullandık.

    }
}
