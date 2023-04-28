package deneme1.polimorphism;

public class UstaBasi extends Isci{
    @Override
    public int maasHesapla() {
        return (30*10*20);
    }

    @Override
    public void calismaSaati() {
        System.out.println("İş bitene kadar çalışır..");
    }
}
