package javaders.day08stringmanipulations;

public class C02_StringManipulations {

    public static void main(String[] args) {
        /*
    replaceFirst(): replace metodu ile  aynı işi
    yapıyor ama ilk gördüğü datayı değiştiriyor.Birden fazla
    data varsa sadece gördüğü ilk datayı değiştiriyor.
     */
        String str = "Hayirli Olsunda";

        // Ex: str String'in de ki ilk görünen "a" harifni "e"ile değişitiriniz.
        System.out.println(str.replaceFirst("a", "e"));

        String str1 = str.replaceFirst("a", "e");
        System.out.println("str1 : " +str1);
        /*
        trim() Bir String'de ki başında ve sonunda ki space karakerlerini siler.
        Aradaki space'lere dokunmaz.
         */
        //Ex: str Stringndeki bas ve sonda varsa karakterlerini siliniz.

        String str2 = "     Ali Can   ";
        System.out.print(str2);
        System.out.println("*******");
        String strTrim = str2.trim();
        System.out.print("str2 = " + str2);
        System.out.println("****");

        //Ex: Aşığıda fiyatları verilen ürünlern toplam fiyatını bulunuz
        //String tv=599.99$  String laptop = 299.99$

        String tv="599.99$";
        String laptop = "299.99$";

        String tv2 = tv.replace("$", "");
        System.out.println("tv2 = " + tv2); //Dolar işaretinden kurtulmak için replace kullandık

        String laptop2 = laptop.replace("$", "");
        System.out.println("Laptop = " + laptop2);//dolar işaretinden kurtulmak için replace kullan.

        Double totalPrice = Double.valueOf(tv2)+Double.valueOf(laptop2);
        System.out.println("totalPrice = " + totalPrice);
        /*
        valuOf() metodu String olan bir datayı bize sayı haline(double) getirir.

         */
        //Ex: Verilen isminin ilk isminin ilk harfini
        //ve soyisminin ilk harfini ekrana yazdırınız...
        String tamIsim = " mehmet fatih ";
        char first = tamIsim.trim().toUpperCase().charAt(0);// M almış olduk

        char second = tamIsim.trim().toUpperCase().split(" ")[1].charAt(0);
        System.out.println("second = " + second);//F

        /*
        /Split ile parçaladıktan sonra Mehmet 0. (sıfırıncı)  index
        fatih 1. index olduğundan dolayı split()[1] köşeli parantezin
        içine 1 yazıyoruz...
         */


        System.out.println("İlk harf son harf :" +first+second);

        String str3 = "  mehmet fatih yıldrım ";
        char first1 = str3.trim().toUpperCase().charAt(0);// M almış olduk
        char second2 = str3.trim().toUpperCase().split(" ")[1].charAt(0);
        char third = str3.trim().toUpperCase().split(" ")[2].charAt(0);
        System.out.println("İlk harf son harf :" +first+second+third);





    }


}
