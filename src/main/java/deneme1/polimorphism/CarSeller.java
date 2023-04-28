package deneme1.polimorphism;

public class CarSeller {
    public static void main(String[] args) {
//Aynı isim ve aynı klass ama method signatura farklı....
CarSeller obj1 = new CarSeller();
obj1.yakit();
obj1.yakit(2020);
obj1.yakit(2012,5.3);

Toyota obj2 = new Toyota();
obj2.yakit();

Toyota obj3 = new ToyotaBenzinli();
obj3.yakit();

Toyota obj4 = new ToyotaDizel();
obj4.yakit();

Toyota obj5 = new ToyotaElektrikli();
obj5.yakit();
    }
    public void motor(){
        System.out.println("Müsteri nasıl motor isterse bulunur..");
    }
    public void yakit(){
        System.out.println("Müsteri nasıl yakit isterse bulunur..");
    }

    public void yakit(double maxTuketim){
        System.out.println("İstediğiniz " + maxTuketim + " lt tüketime uygun araç buluruz...");
    }
    public void yakit(int yil){
        System.out.println("İstediğiniz " + yil + " şartına uygun araç buluruz...");
    }
    public void yakit(int yil, double maxTuketim){
        System.out.println("İstediğiniz yıl ve maksimum tüketime araç bulunur..");
    }

}
