package javaders.day18constructersstatickeywords;

public class Car {
    String make = "Honda";
    String model = "Accord";
    int year =2021;
    int price = 18000;
    /*
    -Constructor genelikle public modifier olur.
    -Java'nın otomatik olarak verdiği constructora default constructor denilir.
    -Default Constructor'lar "parametre" kullanmazlar.
    -Defaul Constructer'ların body'si boştur.
    -Java kıskançtır.Eğer default constructor'ı elle yazarsak, object klass
    içerisinde ki default constructer'ı kullandırtmaz.

    1- Constructer nasıl oluşturulur?
        Accses Modifier +Class ismi +()+{}
    2-Method ile Constructer arasındaki farklar nelerdir?
     -"Method'larda "return type" olur, Constructor'larda olmaz.
     -Method'lar yaptıkları işe göre isimlendirilir.Mesela toplama işlemi
      yapacaksak toplama metodu deriz.Constructer'lar ise her zaman class ismi ile isimlendirilirler
     -Method'lar bir aksiyon yapmak için oluşturulur,Mesela; Toplama aksiyonu;
      Constructor'lar ise object oluşturmak içindir,Bize obje dışında birşey üretmez.
     -Method ismi küçük harf,Constructor isimleri ise klass isimleri ile aynı olduğu için büyük harle başlar.
     - Parametreli Constructor'lar oluşturularak aynı class'tan farklı özelliklere
     sahip obje'lr oluşturabiliriz.
    */
    public Car (){

    }
    //Custom Constructor

    public Car(String make, String model, int year, int price) {
        this.make = make;//CarClasında ki 'make' benim istediğim model yap demek
        this.model = model;
        this.year = year;
        this.price = price;
    }

    //Custom Constructor


   public Car(String make){
        this.make = make;
    }

    public Car(String make, int price) {
        this.make = make;
        this.price = price;
    }

}

