package deneme1.polimorphism;

public class Isci {
    public static String isim;
    public static String soyisim;
    public static String statu;


    public static void main(String[] args) {
        Isci isci = new Isci();
        isci.isim ="";
        isci.soyisim ="";
        isci.statu ="";



        System.out.println("İşçi adı : Mehmet " +isci.isim + "\n " +
                "İşci soyismi : Bulut"+isci.soyisim+"\n " +
                "Statü : İsci"+isci.statu+"\n"+ "Alacağı maaş :" +isci.maasHesapla()
                );

        Isci geciciIsci = new GeciciIsci();
        System.out.println("İşçi adı : " +isci.isim + "\n " +
                "İşci soyismi : "+isci.soyisim+"\n " +
                "Statü : "+isci.statu+"\n"+ "Alacağı maaş :" +geciciIsci.maasHesapla()
        );

        Isci ustaBasi = new UstaBasi();



    }
    public    int maasHesapla(){

            return (30*8*10);
        }

    public void calismaSaati(){
        System.out.println("İşçiler günlük 8 saat çalışır...");
    }

}
