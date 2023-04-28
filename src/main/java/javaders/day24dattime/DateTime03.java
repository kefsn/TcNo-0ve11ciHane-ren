package javaders.day24dattime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTime03 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        System.out.println(ldt);//2023-03-21T13:41:22.025657900

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy - hh : mm : a");
        String formattedLdt =  dtf.format(ldt);
        System.out.println(formattedLdt);
    }
}
