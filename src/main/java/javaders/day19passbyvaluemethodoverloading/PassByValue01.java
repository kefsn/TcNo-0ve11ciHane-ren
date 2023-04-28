package javaders.day19passbyvaluemethodoverloading;

public class PassByValue01 {
    public static void main(String[] args) {
        /*
          Pass by value
        1- Java Pass by value kullanır.
        2- Yani; Java method'ların orjinal değerin değiştirmesine müsaade etmez.
        3- Java methodlara değer yollarken orjinal değer göndermiyor.
        Orjinal değerin kopyasını gönderir.Method kopya değer içerisinde değişiklik yapar,
        ve orjinal değer korunmuş olur.
        4- Java esnek bir dildi, eğer istersek yazdığımız kod ie orjinal
        değerin değerini değiştirebilirz.
           Pass by reference;
           1-Pass by reference da methoda reference yollanır.
           2-Reference adres demektir. Adres yollanınca method adres kullanarak
           orjinal değere rahtalıkla ulaşabilir ve değiştirir.
           Bu yüzden C#  C++ gibi Pass by Reference kullanan dillerde method variable
            orjinal degerini degisitirir
         */
        int shirtPrice = 100;
        //BUrada pass by value sayesinde shirt price değeri koruma altına alınır.
        int studentShirtPrice = discount("student",shirtPrice);
        //Methoda gönderirken değeri değil kopyasonı göndrir ve değişen değer kopyası olur orjinal değil.
        System.out.println("studentShirtPrice = " + studentShirtPrice);
        System.out.println("shirtPrice = " + shirtPrice);

    }
    public static   int discount(String type, int price){
        switch (type){
            case "student":
                price = price -10;
                break;
            case "veteran":
                price = price -20;
            case " senior":
                price = price -5;
                break;
            default:
                price = price;

        }
        return  price;
    }
}
