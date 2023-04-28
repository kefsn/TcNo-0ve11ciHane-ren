package day_12_practice;

public class C02 {
    String isim;
    int yas;
    String telefon;

    public C02(String name, int age, String phoneNumber) {

        this.isim = name;
        this.yas = age;

    }

    public static void main(String[] args) {

        C02 obj1 = new C02("Burak",32,"0246");
        System.out.println("Adı : " +obj1.isim +"Yaşı :" +obj1.yas+ "Telefon : "+obj1.telefon);

        //Adı : BurakYaşı :32Telefon : null   constructor içinde Telefona atama yapmadığımı için null verir.
    }

}
