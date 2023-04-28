package javaders.day28interface;

public class Cat implements Mammal {
    @Override
    public void eat() {

    }

    @Override
    public void drink() {

    }

    public static void main(String[] args) {
        //İnterface'larda variable çağırırken, interface adını kullanarak çağırın.
        //Bu hem static olmanın gereğidir hemde okunurluluğu artırır.
        System.out.println(Animal.age);
        System.out.println(Mammal.feedBaby);
        System.out.println(Mammal.age);
    }
}
