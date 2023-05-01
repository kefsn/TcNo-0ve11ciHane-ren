package ssgDersler;

import javax.xml.namespace.QName;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class Efsane {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("LÜtfen bir sayı giriniz...");

        int sayi = scan.nextInt();
        carpim(sayi);



    }

    private static void carpim(int sayi) {
        sayi = sayi * 3;
        System.out.println(sayi);

    }

}
