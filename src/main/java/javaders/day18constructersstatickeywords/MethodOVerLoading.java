package javaders.day18constructersstatickeywords;

public class MethodOVerLoading {
    public static void main(String[] args) {
        /*
        -Bir method aynı isim ve farklı parametrelerle oluşturulursa buna
        "Method overloading" denir.
        -"Method overloading" Java'da iyi organizasyon için önemlidir.
        -"Method oveloading" yaparken parametre 3 şekilde değiştirilibiler.
        1-Parametrelerin sayıları değiştirilebilir.
        2-Parametrelerin data type'larını değiştirilebilrsin.
        3-Parametrelerin data type'ları farklı ise yerleri değiştirilebilir.

         */
        String s = "Sabir";

    }
    public static int add(int a, int b){
        return a+b;
    }
    public static int add(int a, int b, int c){
        return a+b;
    }
    public static double add(double a, int b){
        return a+b;
    }
    public static double add(int a, double b){
        return a+b;
    }

}
