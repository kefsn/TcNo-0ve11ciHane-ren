package javaders.day26polymorhphism;

public class Cat extends Animal{


    public void meow(){
        System.out.println("Cats meow");
    }
    @Override//Override Annotation override kurallarını JAva tarafndan kontrol edilmesini sağlar.
    public void eat(){
        //Child'de ki override edilmiş eat() Methoduna "Overriding Method" denir.
        //Parent'da ki override edilmiş eat() Methoduna "Overriden Method" denir.
        System.out.println("Cats eat");
    }
    @Override
    public void drink(){
        System.out.println("Cats drink");
    }

    @Override
    public Cat create() {
        return new Cat();
    }

    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public Integer multiply(int a, int b) {
        return a*b;
    }
}


