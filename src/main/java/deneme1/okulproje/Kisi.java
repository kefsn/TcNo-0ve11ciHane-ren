package deneme1.okulproje;

public class Kisi {
    private String adsoyad;
    private String kimlikNo;
    private int yas;//herkesin ortak ozelligi

    public Kisi(String adsoyad, String kimlikNo, int yas) {
        this.adsoyad = adsoyad;
        this.kimlikNo = kimlikNo;
        this.yas = yas;
    }

    public Kisi() {
        System.out.println();
    }

    public void setAdsoyad(String adsoyad) {
        this.adsoyad = adsoyad;
    }

    public void setKimlikNo(String kimlikNo) {
        this.kimlikNo = kimlikNo;
    }

    public void setYas(int yas) {// yas kontrolu yapiniz
        this.yas = yas;
    }

    @Override
    public String toString() {
        return
                "Ad-Soyad   = " + adsoyad +
                        "\nKimlik No  = " + kimlikNo +
                        "\nYas        = " + yas ;
    }

    public String getAdsoyad() {
        return adsoyad;
    }

    public String getKimlikNo() {
        return kimlikNo;
    }

    public int getYas() {
        return yas;
    }
}
