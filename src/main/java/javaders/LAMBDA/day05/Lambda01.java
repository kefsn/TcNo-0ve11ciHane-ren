package javaders.LAMBDA.day05;

import java.util.ArrayList;
import java.util.List;

public class Lambda01 {

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

        ciftElYazdır(nums);
        System.out.println();
        ciftElYazdır2(nums);
        System.out.println();
        tekElYazdır(nums);
        System.out.println();
        tekElKupTekrarsizYazdır(nums);
        System.out.println();
        benzersizCiftElKareToplamiYazdır(nums);
        System.out.println();
        benzersizCiftElKareCarpimiYazdır(nums);
        System.out.println();
        maxDegerMethod(nums);
        System.out.println();
        minDegerMethod(nums);



    }

    //1)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ElYazdır(List<Integer> nums) {
        for (Integer w : nums) {

                System.out.print(w + " ");

        }
    }

    //2)  Bir list'teki elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)


    //3)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Structured)
    public static void ciftElYazdır(List<Integer> nums) {
        for (Integer w : nums) {
            if (w % 2 == 0) {
                System.out.print(w + " ");
            }
        }
    }

    //4)  Bir list'teki cift elemanlari ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void ciftElYazdır2(List<Integer> nums) {
     nums.
             stream().
             filter(t->t%2==0).
             forEach(t-> System.out.print(t +" "));
    }

    //5)  Bir list'teki "tek sayi" olan elemanlarin "kare"lerini ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElYazdır(List<Integer> nums) {
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t).
                forEach(t-> System.out.print(t +" "));
    }
    //6) Bir list'teki "tek sayi" olan elemanlarin "kup"lerini "tekrarsiz" olarak ayni satirda aralarina bosluk koyarak yazdiran method'u olusturunuz.(Functional)
    public static void tekElKupTekrarsizYazdır(List<Integer> nums) {
        nums.
                stream().
                filter(t->t%2!=0).
                map(t->t*t*t).
                distinct().
                forEach(t-> System.out.print(t +" "));

    }

    //7) Benzersiz cift sayilarin karelerinin toplamini hesaplamak icin bir method olusturunuz
    public static void benzersizCiftElKareToplamiYazdır(List<Integer> nums) {
      Integer benzersizCiftKareToplam =
              nums.
                stream().
                distinct().
                filter(t->t%2 ==0).
                map(t->t*t).
                reduce(Math::addExact).
                get();

        System.out.println(benzersizCiftKareToplam);
    }

    //8)Benzersiz cift sayilarin karelerinin carpimini hesaplamak icin bir method olusturunuz

    public static void benzersizCiftElKareCarpimiYazdır(List<Integer> nums) {
        Integer benzersizCiftKareCarpim =
                        nums.
                        stream().
                        distinct().
                        filter(t->t%2 ==0).
                        map(t->t*t).
                        reduce(Math::multiplyExact).
                        get();//45158400

        System.out.println(benzersizCiftKareCarpim);
    }
    //9)Liste ogelerinden max degeri veren bir method olusturunuz
    public static void maxDegerMethod(List<Integer> nums) {

        Integer max =

                        nums.
                        stream().
                        distinct().
                        reduce(Integer.MIN_VALUE,(t,u)->t>u?t:u);//Integer MİN_VALUE en hızlısı kullan.

        System.out.println(max);
    }

    //10)Liste ogelerinden minumum degeri veren method olusturunuz

    public static void minDegerMethod(List<Integer> nums) {

     Integer min =   nums.
                stream().
                 sorted().
                distinct().
                reduce((t,u)->t<u ? t : u).get();

        System.out.println(min);

        //2.Yol
        Integer miNN =   nums.
                stream().
                sorted().
                distinct().
                reduce((t,u)->t).get();//reduce((t,u)->t) sana iki değer eriyorum u döndür bana ver

        System.out.println(min+ " K");

        Integer min3 =
                nums.
                stream().
                distinct().
                reduce(0,(t,u)->t<u?t:u);
//Min değer bulacağımız zaman Integer.MAX_VALUE Kullan;
        //Max değer bulacağımız zaman Integer.MIN_VALUE kullan
        System.out.println(min);
    }
}




