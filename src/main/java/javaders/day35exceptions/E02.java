package javaders.day35exceptions;

public class E02 {
    public static void main(String[] args) {

        String s = "1234";
        convertStringToInt(s);

        String t = "1234a";//String'den sayıya çevirmeye çalışığımızda,bu NumberFormatException hatası verir.
        convertStringToInt(t);

    }
    public static void convertStringToInt(String s){
        /*
        Eğer içinde rakamlar dışında karakter olan bir Stringi sayıya çevirmke isterseniz
        NumberFormatException hatası verir.
        */
        try {
            int intS=  Integer.valueOf(s);
            System.out.println(intS);
        }catch (NumberFormatException e){

            System.out.println("Bir String'in sayıya dönüştürülebilmesi için rakam dışı karakter içermemesi gerekir");
            System.out.println("e.getMessage() = " + e.getMessage());//For input string: "1234a" teknik mesajı öğrenebiliriz.

        }



    }
}
