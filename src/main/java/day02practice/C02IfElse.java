package day02practice;

import java.util.Scanner;

public class C02IfElse {
    public static void main(String[] args) {
        /*
        Kullanicidan ucgenin a, b ve c kenarlarinin uzunluklarini ayri ayri sisteme girmesini isteyiniz.
        Girilen uzunlukların, bir dik ucgenin kenar uzunlukları olup olmadıgını konsola yazdırınız

        Örnek Ekran Çıktısı:

        birinci kenarı giriniz: 3
        ikinci kenarı giriniz:  4
        üçüncü kenarı giriniz:  5
        Bu bir dik üçgendir
     */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen üçgenin 'a' kenarını giriniz...");
        int a = scan.nextInt();

        System.out.println("Lütfen üçgenin 'b' kenarını giriniz...");
        int b = scan.nextInt();

        System.out.println("Lütfen üçgenin 'c' kenarını giriniz...");
        int c = scan.nextInt();
        if(a*a + b*b== c*c ){
            System.out.println("Bu bir dik üçgendir...");
        }else if( a*a + c*c ==b*b){
            System.out.println("Bu bir dik üçgendir.");
        }else if(c*c + b*b==a*a){
            System.out.println("Bu bir dik üçgendir.");
        }else{
            System.out.println("Bu bir dik üçgen değildir..");
        }
    }
}
