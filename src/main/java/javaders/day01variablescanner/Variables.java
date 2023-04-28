package javaders.day01variablescanner;

import java.util.*;

public class Variables {
    public static void main(String[] args) {

        //byte,short, integer,long, double,float
        //veri tiplerinin max ve min değerlerinizi yazdiralim
        Scanner scan = new Scanner(System.in);
       ArrayList<Integer> kah = new ArrayList<>();

        byte byteMax=Byte.MAX_VALUE;
        byte byteMin = Byte.MIN_VALUE;
        System.out.println("byteMax : "+byteMax);
        System.out.println("byteMin = " + byteMin);

        short shortMax = Short.MAX_VALUE;
        short shortMin = Short.MIN_VALUE;
        System.out.println("shortMax = " + shortMax);
        System.out.println("shortMin = " + shortMin);



    }
}
