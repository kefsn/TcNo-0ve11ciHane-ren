package deneme1.polimorphism;

public class ToyotaDizel extends Toyota{

    public void motor(){
        System.out.println("Toyota Dizel araçlar 1.6 motor kullanır");
    }
    public void yakit(){
        System.out.println("Toyota Dizel araç EuroDİzel yakıt kullanır");
    }
    public void yakit(String renk){
        System.out.println("Toyota Dizel 3 renk de üretilmştir..");

        if(renk.equalsIgnoreCase("siyah")||
                renk.equalsIgnoreCase("beyaz")||
                renk.equalsIgnoreCase("mavi")){
            System.out.println("İstediğiniz renkte dizel Toyota bulunmaktadır");
        }else{
            System.out.println("İstediğiniz renkte dizel toyota bulunmaktadır..");
        }
    }

}
