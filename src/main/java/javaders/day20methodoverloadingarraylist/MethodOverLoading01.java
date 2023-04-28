package javaders.day20methodoverloadingarraylist;

public class MethodOverLoading01 {
    public static void main(String[] args) {
        //Java birden fazla seçeneği varsa kafası karışır
        /*
        1-MethodOverLoading yaparken method ismi değiştirilmez.
        2-parametreler değişir.Parametre değiştirirken parametrelerin;
        a) Data Type'ları değiştirilenbiler.
        b) Parametrelerin yerleri değiştirilebilir ama parametrelerin farklı olması lazım.
        c) Parametre değiştirirken ,parametrelerin sayısı değiştirilebilir.
        3- Java için isim ve parametreleri aynı olan iki metod tamamıyla aynıdır.
        BU yüzden ismi ve  parametre==> method signature olarak adlandırılr.
        4- Method Overloading oluşştururken return type'ı değiştirmenin hiçbir etkisi yoktur.
        - Method Overloading oluşştururken accsess modifier'ı değiştirmenin hiçbir etkisi yoktur.
        - Method Overloading oluşştururken static ve ya non-static yapmanı hiçbir etkisi yoktur.
        5-"privete" methodlar overload edilebilir.Çünkü method overloading
        sadece bir classın içinde olur."Private" ise başka class'lara gidildiğinde problem olur.
        6-"Static" methodlar overLoad edilebilirler.
         */

        add(3,5);

    }
    public static void add(int a, int b){
       System.out.println(a+b);
    }
    public static void add(double a, double b){
        System.out.println(a+b);
    }
    public static void add(double a, int b){
        System.out.println(a+b);
    }
    public static void add(int a, double b){
        System.out.println(a+b);
    }
    public static void add(int a, int b, int c){
        System.out.println(a+b+c);
    }
}
