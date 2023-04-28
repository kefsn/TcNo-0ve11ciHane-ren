package javaders.day28interface;

public interface Mammal extends Animal {
        /* CHİLDD       PARENT
        1)  Class --> Class'a parent olur  : extends ile
         interface -- > interface'e parent olur : extends ile
        Class --> interface'e parent olur : implements ile
         interface-->class'a parent olamaz : olamaz
        ikisi de Ayni ise "extends", farkli ise "implements" ile child parent iliskisi kurulabilir.
         "interface"i class'in child'i yapma
        */
    String feedBaby = "Milk";
    int age =6;



}
