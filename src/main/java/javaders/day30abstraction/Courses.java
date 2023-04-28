package javaders.day30abstraction;

public abstract class Courses {
    public abstract void math();



    public void art(){
        System.out.println("Learn art");
    }






    /*
    1)Eğer bir klasstan object oluşturulmasını istemiyorsak ve bu clası
    sadece child classların yapmak zorunda oldukları görevleri belirlemek için
    kullanıyorsak "Abstraction" yaparız.
    2)Bazen parent klassadki methodun body si hiçbir class tarafından kullanılmaz
    bu durumda parenttaki method body yazmak, hiç kullanılmadığı için mantıklı değildir.
    Bizde o methoda body yazmayız.
    3) Body'si yazılmayan methoda Abstract Method denir. Abstract ingilizcede
    vücutsuz ya da soyut demektir.
    4)Methodun body'sini yazmayınca Java bize hata verir bizde abstract keyword'ünü kullanarak
    bu methodun body'si olmayacak deriz.
    5)Abstract keywordunu kullanınca elde ettiğimiz abstract methodlar
    normal klasslara konulmaz.O yüzden classı da abstract yapmalıyız.
    6)Parentta ki method abstract ise bütün child classlar o methodu override etmek zorundadır.
    Bu yüzden tüm childlar için mecburi olmasını istediğimiz fonksiyonları abstract
    yapmak mantıklı seçimdir.
    7)Parent klass da body'si olan methodlar(Conrete method) abstract klassların içine yazılabilir.
    Ama abstract methodlar, concrete methodların içine yazılamazlar.
    Concrete methodlar, child klasslar tarafından override edilmek zorunda değiller.
    8)Abstract keyword ile method body bir methodda aynı anda kullanılamazlar.
    9) Fİnal methodlar Abstract olamazlar ve override edilemezler. Halbuki Abstract methodlar override
    edilmek için oluşturulurlar ve bu bir çelişkidir.Bu yüzden Java Abstract methodların Final olmasına müsaade etmez.
    10)Abstract klassların içinde abstract methodlar olur. Abstract methodların
    bodysi eksik methodlar gibi düşünülebilir.
    Yani Abstract class eksik bir yapı barındırıır, siz Abstract klassdan obje üretirseniz
    Abstract klassda ki eksiklik objeye yansır. Eksik obje'yi Java kabul etmez, istemez.
    Eksik obje eksik iş yapar bu da Applicationun yanlış çalışmasına sebep olur.
    Java'da Applicationu korumak için abstract klasslardan object üretilmesini engellemiştir.
    11)Abstract klassların construtorları vardır ama obje oluşturamazlar.
    12) Abstract klass'Ların Abstract childi veya concrete childi olabilir.
    13)Abstract klaslar private olamazlar. Çünkü child klasslar abstract methodları kullanmak
    zorundadırlar ama private yapınca encapsulate yaptığıız için child ulaşamaz.BUndann dolayı Java Abstract methodların private
    olmasına müsaaede etmez.

     */
}
