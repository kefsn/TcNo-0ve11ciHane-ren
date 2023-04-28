package javaders.day25varargsinheritance;

public class Varargs {
    public static void main(String[] args) {
        /*
        Aşağıda ki metodları oluşturarak dynamic çözüm üretemeyiz.
        ÇÜnkü kulllanıcı farklı sayıdaki sayıları toplamak herzaman isteyebilir.
        -Her ihtimal için yeni bir methodu oluşturmak mümkün değildir.
        1- Java farklı sayıda ki parametrelerin hepsini kabul eden bir yapı oluşturdu.
        bu yapıya Varargs denir.
        -Varargs arka planda Array yapısını kullanır.
         */
         /*
   public static int toplama(int a, int b){

        return a+b;
    }
    public static int toplama(int a, int b, int c){
        return a+b+c;
    }
    */
        System.out.println(add(5, 2, 7));

        getInitials("Ali Can", "Veli Han");

    }
    /*
    -Bİr method parantezide birden fazla varargs kulanılamaz.
    -Br method parantezinde birden fazla parametre kullanılıcaksa, Varargs en sonda olmalıdır.
     */
    public static int add(int... a){//Unused code; Kullanılmayan code denir
        int sum = 0;
        for (int w : a){
           sum = sum + w;
        }
        return sum;

    }
    //Ex: Verilen isimlerin ilk harflerini consol'a yazdıran methodu oluşturun.
    // Ali Can ==> AC  Kemal Han==>KH
    public static void getInitials(String... s){
        String initials = "";
        for (String w : s){
          initials = initials +  w.charAt(0) + w.split(" ")[1].charAt(0);
            System.out.println(initials);
            initials = "";//Ali Can'ın AC'sini aldıktan sonra, konteynırdan tekrar silmek için bunu yazıyoruz.
        }
    }

}
