package javaders.day25varargsinheritance;

public class Vehicle {
    /*
    Animal has a Mammal
    Mammal has a cat.
    Animal has a cat.
    Silsile yukardan aşağıya doğru geliyorsa HAS A RELATİONSHİP denir
    Aşağıdan yukarı doğru gidiyorsa IS A RELATİONSHİP denir.
    1)Javada Object Class tum java class'larinin ortak parentidir
    2)Javada Object Class haric tum class'larin parent'i vardir
    3)Javada Parent'tan child'a olan iliskilere HAS A Relation Ship denir
    4)Javada child'dan parent'a olan iliskilere IS A Relation Ship denir
    5)Java'da her KlasIn bir tane default constructoru vardır. Bu default constructor
    class'ın içinde görünmez çünkü OBject Klas'ın içindedir.
    6) Child Klas'ta bir obje oluşturduğumuzda, constructorlar en üstteki
    Class dan başlatılarak çalıştırılır.
    "super" parent class'daki variable'lari cagirmaya yarar
    7)Child Class'daki constructordan parent classtaki, constructora gidebilmek
    için super() kullanılır.
    8)Parent classda birdn fazla constructor varsa istenilen constructor super()
    ifadesinin içine yazılan parametreler yardımı ile seçilebilir.
    9)Aynı class içindeki construtorları seçmek için this() kullanılır.
    10)Aynı classta birden fazla constroctur varsa istenilern this()
    parantezinin içine yazılan parametre yardımı ile seçilebilir.
    11) super() ifadesini yazmak isteğe bağlıdır. Sİz yazmasanız da java
    sanki varmış gibi davranır.Ama kodunuzu daha okunur kılmak için tavsiye edilir.
    12)super() ve this() ifadeleri constructor içinde her zaman ilk satırda olmalıdır.
    13)Bir constructor içinde super() ve this() ifadeleri sadece bir kere kullanılabir.
    14) Inheritance da variable ve methodları çağırmak için this veya super kullanılır.
    this==> kendi class'indan
    super==> parent class'indan variable yada method çağırmayı sağlar.



     */
    public Vehicle(){
        this(5);
        System.out.println("Vehicle 1");
    }
    public Vehicle(int price){
        System.out.println("Vehicle int parametreli");
    }
}
