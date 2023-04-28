package javaders.LAMBDA.day05;

import java.util.ArrayList;
import java.util.List;

public class Lambda02 {

    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(12);
        nums.add(9);
        nums.add(131);
        nums.add(14);
        nums.add(9);
        nums.add(10);
        nums.add(4);
        nums.add(12);
        nums.add(15);

        allEvenPrint(nums);
        System.out.println();
        isAnyOddPrint(nums);
        System.out.println();
        enKucukIlk3ElemanHaricYuzdeElliArtis(nums);
        System.out.println();
        ciftElemanlar(nums);
        System.out.println();
        tekElemanlarınKareleriniYazdır(nums);
        System.out.println();
        tekElemanlarınupleriniYazdır(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinToplamiYazdır(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinToplamiYazdır2(nums);
        System.out.println();
        benzersizCiftElemanlarınKarelerinCarpimiYazdır(nums);
        System.out.println();
        maxDeger(nums);
        System.out.println();
        minDeger(nums);
        System.out.println();
        minDeger2(nums);
        System.out.println();

    }//main

    //1)  Bir listedeki elemanların hepsinin çift sayı olup olmadığını kontrol eden method'u oluşturunuz.

public static void allEvenPrint(List<Integer> nums){

       boolean allEven = nums.stream().allMatch(t->t%2==0);
    System.out.println(allEven);
}

    //2)  Bir listedeki elemanların herhangi birinin tek sayı olup olmadığını kontrol eden method'u oluşturunuz

    public static void isAnyOddPrint(List<Integer> nums){

        boolean anyOdd = nums.stream().anyMatch(t->t%2!=0);
        System.out.println(anyOdd);
    }

    //3)  Bir listedeki en kucuk ilk 3 eleman haricindekilere %50 artis yapan method'u oluşturunuz.

    public static void enKucukIlk3ElemanHaricYuzdeElliArtis(List<Integer> nums){

       nums.
               stream().
               sorted().
               skip(3).map(t->t+(t*0.5)).
               forEach(t-> System.out.print(t+ " "));
    }


    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.

    public static void ciftElemanlar (List<Integer> nums){
        nums.stream().
                filter(t->t%2==0).
                forEach(t-> System.out.print(t+ " "));
    }


    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void tekElemanlarınKareleriniYazdır( List<Integer> nums ){

        nums.stream().filter(t->t%2!=0).map(t->t*t).forEach(t-> System.out.print(t+" "));

    }

    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.
    public static void tekElemanlarınupleriniYazdır( List<Integer> nums ){

                nums.
                stream().
                distinct()
                .filter(t->t%2!=0).
                map(t->t*t*t).
                forEach(t-> System.out.print(t+" "));

    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftElemanlarınKarelerinToplamiYazdır( List<Integer> nums ){

        int benzersizCiftElKareToplami =
                nums.
                stream().
                distinct()
                .filter(t->t%2==0).
                map(t->t*t).
                reduce(Math::addExact).get();//get() mehodu yerine orElseThrow() kullanabiliriz.

        System.out.print(benzersizCiftElKareToplami);

    }

    public static void benzersizCiftElemanlarınKarelerinToplamiYazdır2( List<Integer> nums ){

        int benzersizCiftElKareToplami2 =
                nums.
                        stream().
                        distinct()
                        .filter(t->t%2==0).
                        map(t->t*t).
                        reduce(0,Integer::sum);//get() mehodu yerine 0,Integer::sum kullanabiliriz.

        System.out.print(benzersizCiftElKareToplami2);

    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftElemanlarınKarelerinCarpimiYazdır( List<Integer> nums ){

        int benzersizCiftElKareCarpimi =
                nums.
                        stream().
                        distinct()
                        .filter(t->t%2==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).get();
             //Not : Terminal methodlardan sonra yazdırma
             // methodu olmadığı için konteynıra atama yapmamız gerekiyor
        System.out.println(benzersizCiftElKareCarpimi);

    }

    //9)Liste ogelerinden max degerini veren bir method olusturunuz
    public static void maxDeger( List<Integer> nums ){

        int maxDeger =
                        nums.
                        stream().
                        distinct().
                        reduce(0,(t,u)->t>u?t:u);

        System.out.print(maxDeger);

    }


    //10)Liste ogelerinden minumum degerini veren method olusturunuz
    public static void minDeger( List<Integer> nums ){

        int minDeger =
                nums.
                        stream().
                        distinct().
                        reduce(Integer.MAX_VALUE,(t,u)->t<u?t:u);

        System.out.print("Min Değer : " +minDeger);

    }



    public static void minDeger2(List<Integer> nums){

        Integer minDeger2 =
                            nums.
                            stream().
                            sorted().
                            distinct().
                            reduce((t,u)->t).
                            get();

                    System.out.println("Min Değer2 : " +minDeger2);

    }
}
