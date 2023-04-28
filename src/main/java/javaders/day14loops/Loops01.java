package javaders.day14loops;

public class Loops01 {
    public static void main(String[] args) {
        //Bir String'deki tekrarli charecterleri ekrana yazdıran kodu yazınız.
        //Alabala ==> la

        String t = "Alala";
        String result = "";

        for (int i = 0; i < t.length(); i++) {

            char ch = t.charAt(i);
            if((t.indexOf(ch) != t.lastIndexOf(ch)) && !result.contains("" +ch)){
                result = result + ch;
            }
        }
        System.out.println(result);
        //What, why, Simple implementation, Mid level Implementation,Advanced level Implementation
    }
}
