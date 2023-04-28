package javaders.day36exceptions;

public class E04 {
    public static void main(String[] args) {

        /*
        1-Şimdi değerli dostlar, throw keyword'ü, evet keyword diyeyim, bir method body'si içinde istediğimiz yerde hatta ve hatta
        bunları bilerek yazıyorum, mesela canım istedi,istediğimiz koşullar için exception atmasını sağlarız.
        2-Throw keyword'u yazdıktan sonra bir Exception klass Object'i oluşturulur
        new dediğimiz anda gidip klass ismi ile yeni bir obje oluşturulur anlamına gelir.
        3-Exception klass constructor'ının parantez içine istediğimiz Exception mesajını yazabiliriz.

        *** throw ile throws keyword'leri arasında ki fark nedir?
        1-'throw' method body'si içinde, 'throws' ise method parantezinden hemen sonra kullanılır.
        2-'throw' method body'si içinde istenilen yerde istenildiği kadar kullanlabilir;
          'throws' ise method parantezinden hemen sonra ve sadce bir kere kullanılabilir.
        3- 'throw' dan sonra "new" keyword ve constructor kullanılarak object oluşturulur.
          'throws'dan sonra sadece Exception Class ismi yazılır.
        4- 'throw' belli şartlar için Exception atmada kullanılır;
           'throws' ise application'u Exception attıktan sonra durdurur.


         */

       printAge(-3);

    }
    public static void printAge(int age){
        if(age<0){
            throw new IllegalArgumentException("Age can not be negative");

            } else {
                System.out.println(age);
            }
        System.out.println(age);
        }

    }

