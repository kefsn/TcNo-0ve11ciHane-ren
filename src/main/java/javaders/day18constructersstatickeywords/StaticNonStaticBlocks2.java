package javaders.day18constructersstatickeywords;

import static javaders.day18constructersstatickeywords.StatinNonStaticBlocks.price;

public class StaticNonStaticBlocks2 {
    public StaticNonStaticBlocks2(){

        System.out.println("Constructer 1");

    }
    public StaticNonStaticBlocks2(int price){

        System.out.println("Constructer 2");
    }
    public StaticNonStaticBlocks2(String name){

        System.out.println("Constructer 3");
    }
    public StaticNonStaticBlocks2(boolean isOld){

        System.out.println("Constructer 4");
    }
    /*
    //non-static block constructor'larda ortak calistirilmasi gereken ortak kodlari icerir
    //non-static block icindeki kodlar her constructor icin kullanilir.
     */

    {
        System.out.println("I am constructor");
    }

    public static void main(String[] args) {
        StaticNonStaticBlocks2 obj1 = new StaticNonStaticBlocks2();
        StaticNonStaticBlocks2 obj2 = new StaticNonStaticBlocks2(12);
        StaticNonStaticBlocks2 obj3 = new StaticNonStaticBlocks2("Shirt");
        StaticNonStaticBlocks2 obj4 = new StaticNonStaticBlocks2(false);
    }
}
