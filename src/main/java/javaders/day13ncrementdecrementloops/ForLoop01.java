package javaders.day13ncrementdecrementloops;

public class ForLoop01 {
    public static void main(String[] args) {

        //Ex: 21'den 180'e kadar hem 4 hem de 6 ile bölünebilen tam sayıları ekrana yazdıran kodu yazınız.
        for (int i = 21; i < 181; i++) {
            if (i % 4 == 0 && i % 6 == 00) {
                System.out.print(i + " ");
                System.out.println();

            }
        }
            //Ex: Size verilen küçük harfle yazılmış Srting'in index'i çift sayı olan karakterlerini
            //büyük harfe dönüştürünüz...
        /*
        Note : Bir String'de son index her zaman lenhgt()-1'dir.Bu metodla bulabiliriz.
        Yazdığınız code belli senaryolar için çalışıyor ancak tüm senaryolar
        için çalışmıyorsa, bu tarz koda ==> hard-code denir ve mutlaka düzeltilmelidir.

        */
            String s = "ankara";
                         //i<=length()-1 ya da i<length() yazabiliriz.İkincisi tercih edilir
            for(int i = 0; i<s.length(); i++){
               String ch = s.substring(i,i+1);
               if(i%2==0){
                   System.out.println(ch.toUpperCase());
               }

            }





    }
}
