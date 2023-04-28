package javaders.day25varargsinheritance;

public class Car extends Vehicle{
    public Car(){
        this("make");//Aynı class içinde ki constructor'a git demek this.
        System.out.println("Car1");
    }
    public Car(String make){

        super(5);//Default'a değil parametreli constructor'a götürür.
        System.out.println("Car string parametreli");
    }
    public String model = "car civic";
    public int km = 20000;
    public String renk = "Beyaz";
}
