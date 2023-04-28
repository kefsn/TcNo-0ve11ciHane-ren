package javaders.day09Stringmanipulationsifstatement;

public class C01_StringManipulationsIfStatement {
    public static void main(String[] args) {

        // Ex: Bir String hic karakter icerip icermedigini kontrol eden kodu yaziniz

        String str = "";//hiclik


        //1.yol
        boolean result1 = str.length() == 0;// Javaya 2 islem yaptirdim 1. lenght() kullandim 2. ==0 kullandim
        System.out.println("String bos mu = " + result1);//true

        //2.yol
        // **************** isEmpty() **************\\
        /*
        isEmpty methodu String datanin icerisinde hicbirsey yoksa true dondurur
        Java'da space de bir karakter oldugu icin space varsa false dondurur
         */
        boolean result2 = str.isEmpty();// Javaya 1 islem yaptirdik isEmpty() kullandik
        System.out.println("String bosmu = " + result2);


        // Ex: Bir String datanin space haric hicbir karakter icerip icermedigini gosteren kodu yaziniz
        String t = " ";
        //1. Yol
        boolean result3 = t.replace(" ", "").length() == 0;//javaya 3 islem yaptirdik
        System.out.println("result3 t = " + result3); //true


        //2.Yol
        boolean result4 = t.replace(" ", "").isEmpty();//javaya 2 islem yaptirdik
        System.out.println("result4 = " + result4);

        //3.Yol
        // ************** isBlank() **************\\
        /*
        isBlank() ==> space + hiclik ise True dondurur
        String bir datanin bosmu dolumu olduguna bakar
        isEmpty'den farki space varsa yine true dondurur
         */

        boolean result5 = t.isBlank();// javaya 1 islem yaptirdik
        System.out.println("result5 = " + result5);
        /*
        indexOf() verilen karakterlerin ilk görünümünün indexini verir.
        int değer döndürür.Çoklu data için kullanıldığında ilk gördüğü
        datanın ilk karakterinin index'ini verir.Olmayan bir karakterin index'i
        sorulursa bize -1 döndürür, bu metodun özelliği bu.
         */

        // EX: Bir String'de a,i,e karakterlerinin ilk gorunumunun indexleri toplamini ekrana yazdiriniz
        String s = "Java is easy to learn";
        int aIdx = s.indexOf('a');
        System.out.println("aIdx = " + aIdx);//1

        int aIdx2 = s.indexOf('i');
        System.out.println("aIdx2 = " + aIdx2);//5

        int aIdx3 = s.indexOf('e');
        System.out.println("aIdx3 = " + aIdx3);//8

        int aIdx4 = s.indexOf('p');
        System.out.println("aIdx3 = " + aIdx4);//Olmayan karkter sorgulanırsa -1 döndürür,p olmadığı için -1 olur.

        System.out.println("Indexler toplamı = " +(aIdx+aIdx2+aIdx3));

        String s2 = "Java is easy to learn to easy to";
        int idx = s.indexOf("to");//Çoklu data için kullanıldığında ilk gördüğü datanın ilk karakterinin index'ini verir.
        System.out.println("idx = " + idx);

        //Ex: Bir Stringde 'java' kelimesinin ilk olarak kaççıncı index' de olduğunu gösteren kodu yazınız.

        String cumle = "Ah Java vah Java sen ne güzel şeysin java";
        int indexJava = cumle.indexOf("Java");
        System.out.println("indexJava = " + indexJava);

        /*
        lastIndexOf() Verilen String bir data da istenilen son görünümünün index'ini verir.
        Olmayan bir karakter sorgulatılırsa bana gene -1 döndürür.
         */

        // EX: Bir String'de a,i,e karakterlerinin son
        // gorunumunun indexleri toplamini ekrana yazdiriniz
        String s1 = "Java is easy to learn";

        int a = s1.lastIndexOf('a');//18
        System.out.println("a = " + a);

        int b = s1.lastIndexOf('i');//5
        System.out.println("b = " + b);

        int c = s1.lastIndexOf('e');//17
        System.out.println("c = " + c);

        System.out.println("Toplam : "+(a+b+c));//40



    }
}
