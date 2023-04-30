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

       do {
           System.out.println("Lütfen doğduğunuz yılı giriniz..");
           int year = scan.nextInt();
           System.out.println("Lütfen doğduğunuz ayı giriniz..");
           int month = scan.nextInt();
           System.out.println("Lütfen doğduğunuz günü giriniz..");
           int day = scan.nextInt();

           LocalDate date = LocalDate.of(year,month,day);
           System.out.println("Doğum gününüz : "+date.getDayOfWeek());

       }while (true);


    }

}
