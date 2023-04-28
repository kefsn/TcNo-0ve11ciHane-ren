package introduction.day02datatypesmethodcreation;

public class MethodCreaiton01 {
    /*
    javada method nasıl oluşturulur

    1)Main Method'un disinda olusturuluyor
    2)Access Modifier + return type + Method ismi+() + {}

    Olusturulan methodlar nasıl kullanılır?
    1)Main Method'un icinden kullanilir
    2)Method'un ismi + () yazin
    3)İslem yapacagimizi parametreler parantezin içine yazılır
     */
    public static void main(String[]args){
       int sonuc = toplamaYap (30, 60);
        System.out.println(sonuc);

       long carpmaSonucu = multiply(3, 5);
        System.out.println(carpmaSonucu);

        int ucluSonuc = carpmaToplama(2, 3, 5);
        System.out.println(ucluSonuc);

        double kup = getCube( 5);
        System.out.println(kup);

        print("Hello Merhaba");

    }
    //Örnek:Toplama işlemi yapan bir method oluşturunuz.
    public static int toplamaYap (int a, int b){
        return a+b;
    }
    //Örnek2: 2 sayiyi çarpma işlemi yapan bir method oluşturun.
    protected static long multiply (int a, int b){
        return a*b;
    }

    //Örnek3: Verilen 3 sayıdan ilk ikisiniz çarpan ve sonuncu sayı ile tıoplayan bir method oluşturunuz.
    private static int carpmaToplama( int a, int b, int c){
        return a*b+c;

    }
    //Örnek4: Verilen bir ondalık sayının küpünü hesapayan methot oluşturup kullanınız.
    //Note: Access modifier'i defaul yapmak istiyorsak default olarak girmiyoruz.
    static double getCube(double a){
        return a*a*a;
    }

    //Örnk5 : Girilen bir kelimeyi ekrana yazdiran bir method oluşturup kullanınız.

    private static void print(String str){
        System.out.println(str);
    }

    // it means it can be used from entire the project.
    // there is no any restriction to use it.
    // 'public' is one of the Access Modifier's.



}
