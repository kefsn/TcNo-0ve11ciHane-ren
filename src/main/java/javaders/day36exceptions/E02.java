package javaders.day36exceptions;

public class E02 {

    public static void main(String[] args) {

        String s = "Java";
        getNumberOfChars(s);

        String t = "";
        getNumberOfChars(t);//0 verir

        String u = null;
        getNumberOfChars(u);//NullPointerException verir.Strin method null olduğunda kullanılmıyor.

    }
    /*
    1-String'in değeri null olduğunda String klass da ki bazı methodları kullanmaya
    çalışırsanız Java NullPointerException atar.
     */
    public static void getNumberOfChars(String s){
try{
    int numOfChars = s.length();
    System.out.println(numOfChars);
}catch (NullPointerException e){
    System.out.println("Null değeri için bazı methodlar kullanılamaz!");
}

    }

}
