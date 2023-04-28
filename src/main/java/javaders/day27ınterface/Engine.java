package javaders.day27ınterface;

public interface Engine {
    /*
    INTERFACE'DE Kİ METHODLAR;
    1- "interface" in içine "concrete method" konulamaz.
    2- "interface" içindeki methodların abstract olduğunu Java bilir,
    bu yüzden "interface" içindeki abstrac methodlarda "abstrac"
    keyword kullanmaya gerek yoktur.
    3- "interface" içindeki abstract methodların tamamı public'tir.
    Bu yüzden "interface" içinde abstract method oluştururken. "access modifier
    yazmaya gerek yoktur. Default accessi Public olur.
    4- Bir interface'i, bir "class"ın parenti yapmak istediğinizde "extends" keyword
    yerine "implements" keyword kullanınız.
    5- "Concrete Child Class'lar", "parent interface" daki abstract methodları override etmek zorundadırlar.
    6-Innterface'lar bir application'Da  "Concrete Child Class'lar "ın yapmak zorunda
    oldukları fonksiyonları barındırırlar. Bu yüzden "interface"lar "to do list" de denir.
    7- Birden fazla parent "interface" içinde aynı isimli abstract methodlar oluşturabilirsiniz.
    abstract methodaların body'si olmadığı için child class'lar aynı isimli methodlardan herhangi
    birini override ederek kullanılabilirler.
    8- Birden fazla parent "interface" içinde aynı isimli abstract methodlar oluşturduğunuzda
    methodların "return type"ları aynı olmak zorundadır.
    9- Normalde interface concrete method kullanılamaz ama bazı özel durumlarda
    "İnterface"Ların içine (concrete method) body'si olan method koymak istiyorsak
    void'İn önüne "default" keyword koymak zorundayız.Burda ki default
    access modifier değildir yeni bir keyword'dür.
    a) "default" keyword'unu asagidakai gibi kullanarak interface icine concrete method koyabiliriz
     Ex: default void eco(){System.out.println("Uses gas less...");}

    b)
    "static" keyword'unu asagidakai
     gibi kullanarak interface icine concrete method koyabiliriz
     Ex: static void stop(){ System.out.println("Stops securely....");}
     10- "Default" ve "static" keyword'ü kullanarak oluşturduğumuz concrete mthodların
     "concrete child klass'lar tarafından kullanma zorunluluğu yoktur.
     11-"default" keywordunu kullanarak oluşturuğumuz "concrete methodlara"
      object oluşturularak ulaşılabilir.
      "static" keyword'unu kullanarak olusturdugunuz "concrete methodla"ra ulasmak icin "object" olusturmaya gerek yoktur
   "interface" ismi yeterlidir.
        12-İnterface'larden object oluşturulamazlar, çünkü interface'ların constructor'ı yoktur.
        Method body'si de yoktur.


     */
     void start();
     void hareket();
    void payment();
    default void eco(){
        System.out.println("Uses gas less...");
    }
    static void stop(){
        System.out.println("Stops securely....");
    }


}
