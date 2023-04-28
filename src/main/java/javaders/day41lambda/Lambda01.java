package javaders.day41lambda;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

    public static void main(String[] args) {
        List<Integer> nums = new ArrayList<Integer>();
        nums.add(8);
        nums.add(9);
        nums.add(7);
        nums.add(-4);
        nums.add(9);
        nums.add(2);
        nums.add(4);
        nums.add(6);
        nums.add(15);

        System.out.println(getTheSumOfSquareOfOdds1(nums));
        System.out.println(getMultiplicationOfSquareOfevents1(nums));
        System.out.println(getTheSumOfEvenMaxAndOddMin(nums));
        System.out.println(getTheSumOfEvenLessMaxAndOddMinGreaterThanEight(nums));

    }
    //Ex: Verilen list'teki elemanların tek sayı elamanların
    // kareleri toplamını hesaplayan methodu oluşturunuz.

    public static int getTheSumOfSquareOfOdds1(List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 != 1).
                map(t -> t * t).//Kareleri hesaplamak için map()kullan
                        reduce(0, (t, u) -> t + u);//Toplama içim reduce() kullan

    }
        public static int getTheSumOfSquareOfOdds2(List<Integer> nums){
            return nums.
                    stream().
                    filter(Utils::isOdd).//Utils klasörüne git, isOdd() methodunu kullan.
                    map(Utils::getSquare).//Utils klasörüne git getSquare() methodunu kullan.
                            reduce(0,Math::addExact);
    }



        /*
    t her zaman ilk değerini 0'dan alır ve ondan sonraki değerlerini t+u'dan alır.
    u her zaman değerlerini stream'den alır.

    //Note: reduce() methodundaki toplama isleminde
    "t" ilk parametrenin ilk degerini daha sonraki tum degerleri toplamdan alir, "u" ise stream'den alir

     //reduce() => deger sayisini azaltmak.
      Coklu datayi tekli dataya cevirmek istedigimizde bu method kullanilir
     */
      /*  Lambda expression'lari kaldirmamiz gerekir. Math: : yazdigimizda Math class'i icindeki methodlari goruruz.
    Bize toplama islemi lazim oldugu icin buradan add methodunu aldik. Math: : addExact

    Bu syntax'e method reference denir. Method'a bir atifta bulunduk. Boylece java bu methoda gore islem yapti.

    reduce methodu icinde  (0, (t,u)->t+u) yazmak yerine, (Math: :addExact) yazdik.
    O kisim kizarinca, yenina get methodu ekleyince duzeldi.

    Baska bir kodumuzda sayinin karesini almamiz gerekmisti. Math class'ina gittik ve sayilarin karesini
     alan bir method var mi diye baktik ve bulamadik. Applicationimizda kare alma sikca kullanilacak
     bir islem ise onun  icin package kismina gelip Utils Class isimli class'i olusturmaliyiz. Utils
     demek sik kullanilanlardir ve faydali
    methodlarin depolandigi yer demektir. Bir kere bu class'i olusturup lazim olan methodu bir
    kere olusturup, buraya depolariz ki daha sonra kullanabilelim.

    Utils class'i icinde public static int getSquare(int a){
            return a*a;
}
    Daha sonra kodumuz icinde bu methodu kullanmak icin
    map methoud icinde Utils: :getSquare) yazarak Utils classimizda depoladigimiz methodu alip kullanabildik.
    */



    //Ex 2 : //Example 1 : Verilen bir list'teki çift sayi olan elemanlarin tekrarsız olarak
    ////kareleri çarpımını  hesaplayan method olusturunuz.
    public static int getMultiplicationOfSquareOfevents1(List<Integer> nums) {
        return nums.
                stream().
                filter(t -> t % 2 == 0).
                map(t -> t * t).distinct().//Kareleri hesaplamak için map()kullan
                        reduce(1, (t, u) -> t * u);
        //Soruda, kareleri tekrarsız olmalı deniyor. Bu nedenle distinc methodu, kareleri hesapladiktan sonra (map'ten sonra) yazildi.

    }


    //Example 3: Verilen bir list'teki cift sayi olan elemanlarin maximum degeri
    // reduile tek sayi olan elemanlarin minimum degerinin
//           toplamini hesaplayan method'u olusturunuz
    public static int getTheSumOfEvenMaxAndOddMin(List<Integer> nums) {
        int maxEven = nums.
                stream().distinct().
                filter(t -> t % 2 == 0).reduce( (t, u) -> t>u?t:u).get();//get() methodu 'optional data type'nı normal int data type'na çevirir.

        int minOdd = nums.
                stream().distinct().//tekrarsız dememesine rağmen kullandık
                filter(t -> t % 2 == 1).reduce( (t, u) -> t<u?t:u).get();//get() methodu 'optional data type'nı normal int data type'na çevirir.
return  maxEven + minOdd;


    }
    public static int getTheSumOfEvenLessMaxAndOddMinGreaterThanEight(List<Integer> nums) {
        int maxEven = nums.
                stream().distinct().
                filter(t -> t % 2 == 0 && t<7).reduce( (t, u) -> t>u?t:u).get();//get() methodu 'optional data type'nı normal int data type'na çevirir.
        int minOdd = nums.
                stream().distinct().//tekrarsız dememesine rağmen kullandık
                        filter(t -> t % 2 == 1 && t>8).reduce( (t, u) -> t<u?t:u).get();
        return  maxEven + minOdd;

    }
}
