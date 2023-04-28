package day_01practice;

public class C02_Ascii {
    public static void main(String[] args) {

        // Rakam kullanmadan 65, 66, 67, 68, 69, 70 sayilarinin toplamını bulunuz
        int a = 'A';
        int b = 'B';
        int c = 'C';
        int d = 'D';
        int e = 'E';
        int f = 'F';
        System.out.println(a+b+c+d+e+f);
        //2.Way
        System.out.println((int)'A' + (int)'B' + (int)'C' + (int)'D' + (int)'E' + (int)'F');


    }
}
