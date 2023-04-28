package javaders.day25varargsinheritance;

public class Honda extends Car {
    public Honda(){
        super("make");//Defaul olana değil parametreli KOnctructora götürür
        System.out.println("Honda 1");
        System.out.println(this.model);
        System.out.println(super.km);
        System.out.println(this.renk);

    }
    public String model = "civic";
    public int km = 10000;
    public String renk = "Siyah";
}
