package deneme1.polimorphism;

public class ToyotaBenzinli extends Toyota{
@Override
    public void motor(){
        System.out.println("Toyota Benzinli araçlar 1.4 çevrecidir");
    }
    @Override
    public void yakit(){
        System.out.println("Toyota Benzinli araçlar E10 benzin tüketir");
    }
    public void yakit(Double maxTuketim){
        System.out.println("Toyota Benzinli araçlar ortalama max 6.8 litre benzin kullanır");
    if(maxTuketim<6.8){
        System.out.println("Benzinli bir toyata alabilirsiniz");
    }else{
        System.out.println("İsteğinize uygun benzinli bir toyota bulamazsınız");
    }



    }
}
