package javaders.day35exceptions;

public class E03 {
    public static void main(String[] args) {
         /*
        String'lerde olmayan bir index kullandığınız da Java exception atar.
         */

        String s = "Java";
        getCharFromString(s, 2);//v
        getCharFromString(s, 4);

    }

    public static void getCharFromString(String s, int idx) {
        try {
            char ch = s.charAt(idx);
            System.out.println(ch);
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("Olmayan index kullandınız ==> " + e.getMessage());

            System.out.println(e.getCause());//null verir.Hatanın sebebini anlamak için.
            e.printStackTrace();//Bundan sonra program çalışmaya devam eder.



        }  System.out.println("Kimse beni durduramaz :)");
    }
}