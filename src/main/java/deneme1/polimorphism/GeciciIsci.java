package deneme1.polimorphism;

public class GeciciIsci extends Isci{
    @Override
    public int maasHesapla() {
        return (25 * 8*5);
    }

    @Override
    public void calismaSaati() {
        System.out.println("Geçici işçiler haftalık 25 saat çalışır.");
    }
}
