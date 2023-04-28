package javaders.day26polymorhphism;

public class Animal {
    /*
   1) Parent klasındaki methodu, Child class içinde özelleştirerek kullanmaya overriding denir.
   2) Overriding de methodun signature'na(Paramtere(parantez içi) ve isim) dokunulmaz.
   3) private method'lar override edilemez.
   4) Child klas'taki  methodun access modifier'ı parent' ten daha dar olamaz.
    5)Child class da override edilen methodun return type'i ile Parent taki methoudun
    return type arasında IS A ilişkisi varsa return type değiştirilebilir.
    6)Eğerki methodun return type Primitive ise, overriding yaparken primitive değiştirilemez.
    Çünkü return type ya aynı olur ya da parent'tan seçilir ama pirimitivler arasında
    parent-child ilişkisi olmadığında, parent seçmek mevzu bahis olamaz o zaman tek seçenek
    aynısı olmalıdır.
    7) Child'da override edilen methodun return type ile parenttaki methodun
    return type'ı arasında IS A relationship yoksa return type değiştirilemez.
    Mesela; Integer Wrapper class ile long Wrapper classı arasında İS A relation ship
    yoktur, o yüzden return type değiştirilemez.
    8) Methodun  return type void ise, Overriding yaparken return type değiştirilemez.
    9)Java static methodların override edilmesine müsade etmez.Çünkü static methodlar tüm
    childler için ortak methodlardır.Bir child bir ortak methodu değiştirdiğinde diğer child'lar
    bundan olumsuz etkilenebiliri.Bu yüzden Java static methodlrın override edilmesine müsaad etmez.
    10)Final methodlar override edilemezler.Final methodların body'si değiştirilemez ama Override ederken
    Method body'i değiştiririz bu bir çelişkidir.Bu yüzden final methodların override edilmesine müsaade etmez.
    Final keyword'ünü Variable'lar ile kullanabiliriz.
    a) Final keyword unu Variable lar ile kullanabiliriz
           i)final variable ise mutlaka deger atanmalıdır
           ii) ilk atanan deger degistirilmez

    b) Final keyword unu Method lar ile kullanabiliriz
           i)method final ise methodun body si degistirilemez
           ii) methodun body si degistiriemeyince override yapmak mumkun olmaz

    c) Final keyword unu Class lar ile kullanabiliriz
           => class final ise O classin child i olamaz

           ==>polymorphism == Method Overloading + Method Overriding den oluşur.

    */
    public final double PI = 3.14;
    public void eat(){
        System.out.println("Animals eat");
    }
    public void drink(){
        System.out.println("Animals drink");
    }

    public Animal create(){
        return new Animal();
    }
    public  int add(int a, int b){
        return a+b;
    }
    public  Integer multiply(int a, int b){
        return a*b;
    }
}
