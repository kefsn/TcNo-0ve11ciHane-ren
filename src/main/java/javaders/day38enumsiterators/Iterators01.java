package javaders.day38enumsiterators;

import java.util.*;

public class Iterators01 {

    public static void main(String[] args) {
        /*
        1)Iterator'ler loopların yaptığı aynı işi yapar.
        2) Iterator'lerda sonsuz loop oluşma ihtimali yoktur.
        3)Iterator'ler ile looplar arasında performans farkı yoktur.
        4)Iterator'ler bir colllectiondna eleman silme ve bir collectin'da ki elemanı değiştirme konusunda daha başarılıdırlar.
        5)İki tip Iterator vardır;
        a) Iterator;Bu sadece eleman silmede kullanılır.
        eleman eklemek ve ya elemanı değiştirmek mümkün değildir.

        b)ListIterator: Bu eleman silebilir, ekleyebilir be değiştirrebilir.

        Note: Iterator sadece soldan sağa(ilk eleamndan son elemana) çalışır.
        "LisrIterator" ise iki yönlü çalışır.


        Main method icinde bir List olusturduk ve import ettik. Burada loop yerine Iterator kullandik.
Once List'i Iterator'a donusturmeliyiz ki Iterator icindeki methodlari kullanabilelim.
Listimizin ismini yazip nokta koyunca orada sirali methdolar icinde Iterator methodunu goruruz ve onu seceriz.
Bu method bize String Iterator verir. Oyle olunce String Iterator conteynarina ihtiyacimiz olur.
Biz de Iterator<String> myItr=myList.iterator() olarak conteynerimizi olusturduk. While loop kullandik.
While icine myItr.hasNext() yazarak iteratordaki sonraki eleman var mi diye soracagiz, varsa onu silmesini
isteyecegiz. Su sekilde devam ettik:
myItr.next();
myItr.remove();
Sonda sout icine myList yazarak elemanlari bir list icinde ekranda gorebildik. Iterator sayesinde sonsuz loop
tehlikesi ile karsilasmadik.
Biz bu kodu yazinca Java ayni elemanlari iterator yapisi icine koydu. Biz liste bakinca bir de iteratora bakinca
ayni seyi gorsek de yapi olarak farklidirlar. Fark: Ilk elemanin oncesine iterator bir pointer koyuyor.
Biz has.Next methodu kullaninca bu methodla ilk pointer'a gelip kendisinden sonra bir eleman var mi diye
sormus olduk. Pointer kendisinden sonra Tom olduguna isaret ediyor yani true oluyor. Daha sonra bir sonraki
elemanin onune java tarafindan konulan pointer'a gelip senden sonra eleman var mi diye methodumuz sormaya devam eder.
While loop condition'i true oldugu surece bir sonraki elemanin olup olmadigina bakilir.
Remove methodu ise gelip oldugu anlasilan ilk eleman silinir ve sonraki kisma gelir. Once has.Next sonra
remove methodu her eleman icin calisacak.


//hasNext(); Iterator'da bir sonraki eleman var mi yok mu onu sorar.True veya false dondurur.
//next();Iterator'da bir sonraki elemani almak icin kullanilir


  Note: Sonsuz döngü riski olmadığından dolayı istersek Iterator kulanılabilir.
         */

        List<String> myList = new ArrayList<>();
        myList.add("Tom");
        myList.add("Jim");
        myList.add("Clara");
        myList.add("Angie");
        myList.add("Mark");
        System.out.println(myList);


        //"Iterator'e dönüştürme
        Iterator<String> myItr = myList.iterator();//[Tom, Jim, Clara, Angie, Mark]
        while (myItr.hasNext()) {  //Senden sonra eleman var mI?"hasNext() pointer'a senden sonra eleman var mı diye sorar
            myItr.next(); //.pointerı bir sonra ki elemanın önüne koyar.
            myItr.remove();  //Remove next'in üstünden atladığı elemanı siler ve listten de silinir.
        }
        System.out.println(myList);


        //listIterator'ler Soru: Her elemanın sonuna !(ünlem) işareti koy.
        List<String> yourList = new ArrayList<>();
        yourList.add("Tom");
        yourList.add("Jim");
        yourList.add("Clara");
        yourList.add("Angie");
        yourList.add("Mark");
        System.out.println(yourList);//[Tom, Jim, Clara, Angie, Mark]


        ListIterator<String> yourListItr = yourList.listIterator();

        while (yourListItr.hasNext()) {

            String el = yourListItr.next();

            yourListItr.set(el + "!");//set() methodu list'i update etmeye yarar.
        }

        System.out.println(yourList);//[Tom!, Jim!, Clara!, Angie!, Mark!]

        /*
     hasPrevious(); pointer'a "Senden once eleman var mi?" diye sorar.
    Eleman varsa "true" yoksa "false" return eder. Bu method sagdan sola dogru calisir
         */
        while (yourListItr.hasPrevious()) {
            String el = yourListItr.previous();
            yourListItr.set("?" + el);

        }
        System.out.println(yourList);

        /*
        Pointer'ıe en sona yollanmadan hasPrevious() ve previous() methodu kullanılmaz.
                Sout icine listimizin ismini yazinca ekrana [Tom!, Jim!, Clara!] yazildi. has.Next nethodu calisirken son elemandan
        sonra bir eleman olmadigi anlasilinca false olur ve loop kirilir. Pointer en saga gelmeden hasPrevious methodunu
        kullanamayiz. Kullanirsak bastaki elemanin oncesinde eleman olmadigindan loop kirilir.

   */

        //En sondan en başa nasıl iterate edebiliriz?
        //descendingIterator() methodunu kullanmak için LinkedList kullanmak gerekir.
        LinkedList<String> ourList = new LinkedList<>();
        ourList.add("Tom");
        ourList.add("Jim");
        ourList.add("Clara");
        ourList.add("Angie");
        ourList.add("Mark");
        System.out.println(ourList);

        Iterator<String> ourListItr = ourList.descendingIterator();//Artan sıralamaya ascending, azalan sıralamaya descending denir.

        while (ourListItr.hasNext()) {//Bu method bize sayıları bize büyükten küçüğe verir.
            String el = ourListItr.next();
            System.out.println(el);
        }

       List<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(9);
        list.add(2);
        list.add(1);
        list.add(17);
        list.add(3);
        System.out.print(list+ " ");//[5, 9, 2, 1, 17, 3]

        Iterator itr = list.iterator();

        System.out.println(itr.hasNext());//true
        System.out.println(itr.next());//5 verecek   [5, 9, 2, 1, 17, 3]
        itr.remove();

        System.out.println("List : " +list);
        /*
        remove() üzerinden atladağı elemanı siler. Ancak üzerinden atladığı eleman yoksa
        hata verir IllegalStateExcetion verir. Bu nedenle üst üste iki kere remove() methodu çalıştırmaz.
         */

    }
}
