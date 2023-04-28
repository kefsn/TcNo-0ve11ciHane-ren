package javaders.day36exceptions;

public class E01 {
    /*
     1) Try kisminda birden fazla Exeptions olusturma ihtimali
     olan kod varsa coklu catch kulanabilirsiniz.
     2) Çoklu catch kullandığınızda Exceptions class'lar arasında, paretn-child ilişkisi yoksa
     catch'lerin sırası önemli değildir. Ama kodda ki sıralamaya uymak tavsiye edilir.
     3) Çoklu catch kullandığınızda Exceptions class'lar arasında, paretn-child ilişkisi varsa
      catch'lerin sırasına dikkat etmeliyiz, child class üstte olmalıdır.
     4) Exceptions class'Lar arasında parent-child ilşkisi varsa;
        a)ya child classı üste yazarak child ve parent için özelleştirilmiş codelar yazarsınız
        b)yada child'ı hiç kullanmaz sadece parent ile exceptions'ları handle etmeye çalışırsınız.
      5) Unreachable code olmaması için child'ı parent'ın altına koymuyoruz :)
     */
    public static void main(String[] args) {
        int a = 12;
        int b = 1;
        String s  = "My Java";
        getCharFromString(s,a,b);
    }
    public static void getCharFromString(String s, int a, int b){
try {
    int idx = a/b;
    char ch = s.charAt(idx);
    System.out.println(ch);
}catch ( ArithmeticException e){
    System.out.println("Do not divide by zero...");
}catch (StringIndexOutOfBoundsException e){
    System.out.println("Olmayan index kullandınız...");
}

    }



}


