package day_12_practice;

public class C03 {

    int fiyat = 300000;

    int yil = 2023;

    String marka = "Opel";

    public C03(int price, int age, String marka) {

        this.fiyat = price;
        this.yil = age;
        this.marka = marka;
    }

    public C03() {

    }


    public static void main(String[] args) {

        C03 obj1 = new C03();

        System.out.println(obj1.fiyat);
        System.out.println(obj1.yil-3);
        System.out.println(obj1.marka.replace("Opel", "Mercedes"));


        C03 obj2 = new C03(500000,2021,"Citroen");//Önce obje oluşturup sonra construtor'ı burdan da çağırabiliriz.
        System.out.println(obj2.fiyat + obj2.marka + obj2.yil);


    }

}
