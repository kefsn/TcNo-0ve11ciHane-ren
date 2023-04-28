package javaders.day18constructersstatickeywords;

import java.time.LocalDate;

public class StatinNonStaticBlocks {

    /*
    -Bir 'static block'lar static variable'lara ilk değerlerini atamak(initialize) için kullanılır.
    -static variable'lar static bloc kullanılmadan initialize edilebilirler.
     -Static olanlar klassa bağlı olduğu için, claslar'la beraber oluşturulurlar.
     -Static bir variable değer atamak için yazılması gereken kod main metodun
     içinede yazılabilir. Ama static block'a yazılan kod main metoddan önce çalıştırılır.
     -Bir class'ta birden fazla static block varsa, üstteki önce çalıştırılır.

     */
    //Statc block kulanılmadan
    public static double pi = 3.14;
   //Static block kullanılarak aşağıdaki gibi yapılır.
    /*
    Aşağıdai gibi static bir variable değer atamak için kod yazmanız gerekirse 'static block' kullanınız.
     */
    public static  double price ;
    static {
        System.out.println("Hey I am static block...");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==4){//Mart ayı geldiğinde 1000 lira, diğer aylar 1200 yap diyor kod.
            price =1000;
        }else{
            price=1200;
        }
        System.out.println(price);


    }
    static {
        System.out.println("I am static block");
    }
    public static void main(String[] args) {
        System.out.println("Hey I am main metod");
        LocalDate d = LocalDate.now();
        if(d.getMonthValue()==3){//Mart ayı geldiğinde 1000 lira, diğer aylar 1200 yap diyor kod.
            price =1000;
        }else{
            price=1200;
        }
    }
}
