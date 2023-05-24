package javaders.day22stringbuilder;

public class Student {
    /*
    StdName "public" olduğu için diğer klaslardan ulaşılbilir.
     Aynı klass'da olduğumuzda default ve public'in farkı olmaz.
     Aynı klas'da olduğu için İkisinide ulaşılabilir.
     -Access Modifier'a default olan ile public olan class member'lar
     aynı package içinde kullandıklarında aynı özellikleri gösterirler.
     -fakat farklı package'lara geçtiğimizde"public" olanlara ulaşabilir
     ama "default" olanlara ulaşılamaz.
     -Access Modifier'a private olan Class memberlar, sadece oluşturuldukları class içinden görülebilirler.
     -Protected olanlar, aynı package içindeyken public gibi davranırlar.
     Farkli package'a gectiginizde "protected" olanlar sadece child class'lardan gorulebilir

     */
    public String  stdName = "Ali Can";
    int age = 23;

    private String healthCondition = "Cancer";

    protected String karakter = " Cok cekingen";


}
