package javaders.day28interface;

public interface Animal {
    void eat();
    void drink();
    /*
    1)İnterface'larda ki tüm variable'lar otomatik olarak "Final" dır.
      Bu yüzden interface içinde ki variable oluşturduğunuzda mutlaka değer ataması yapmalısınız.
     'Final' variable'ların değeri değiştirilemez.
    2)İnterface'da ki tüm variable'lar otomatik olarak public'tir.
     3) İnterfacelerdeki tum variablelar otomatik(default) olarak "static"dir.
    */
    /*
    ABSTRAC KLAS İLE  İNTERFACE ARASINDA Kİ FARKLAR:
     *1)Abstract Class'lar hem "abstract" hem de "concrete" method'lar icerebilir fakat interface'ler sadece "abstract" method icerir.
     Ama inderface'lerde istersek "default" ve "static" keyword'lerini kullanarak "concrete" method uretebiliriz.
     *2)Abstract Class'lar multiple inheritance'i desteklemez ama interface'ler destekler.
     *3)Abstract Class'lar icinde her turlu variable olusturulabilir, interface'ler icindeki variable'lara public, static ve final olmak zorundadir.
     4)"interface",  Class'in child'i olamaz ama "abstract class" class'in child'i olabilir.
     5)abstract class'larda constructor vardir ama object uretemez, interface'lerde constructor yoktur bu yuzden object uretilemez.
     */
    int age =4;
    double pi = 3.14;


}
