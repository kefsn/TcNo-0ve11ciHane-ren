package javaders.day35exceptions;

public class E04 {
    public static void main(String[] args) {
        /*
        Array'Larda olmayan bir index kullandığınız da Java exception atar.
         */

        String arr[] = {"A", "G", "M", "L"};
        getElementFromArray(arr, 1);//G

        getElementFromArray(arr, 5);

    }

    public static void getElementFromArray(String[] s, int idx) {
       try{ String el = s[idx];
        System.out.println();
    }catch(ArrayIndexOutOfBoundsException e){
           System.out.println(e.getCause());//null
           System.out.println(e.getMessage());//Index 5 out of bounds for length 4
       }
    }

}
