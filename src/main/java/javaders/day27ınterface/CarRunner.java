package javaders.day27ınterface;

public class CarRunner {
    public static void main(String[] args) {
    Engine.stop();//stop() methodu static oldğundan "interface" ismi ile ulaştım.
        Honda h = new Honda();//Obje'yi childden oluşturuyoruz.Honda obje üretiyoruz.
        //Çünkü void start(); Body'si yoktur burdan obje oluşturamayız.
    h.eco();//Eco() methodu static olmadığında object le ulaşıldı.İnterface'Larden obje oluşturulamaz.Body'si yok çünkü.



    }
}
