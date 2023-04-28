package deneme1.okulproje;

public class Ogrenci extends Kisi{//cons. kontrol edilecek
    private String ogrenciNo;
    private String sinif;

    public Ogrenci(String adsoyad, String kimlikNo, int yas, String ogrenciNo, String sinif) {
        super(adsoyad, kimlikNo, yas);
        this.ogrenciNo = ogrenciNo;
        this.sinif = sinif;
    }
    public Ogrenci(){

    }

    public String getOgrenciNo() {
        return ogrenciNo;
    }

    public String getSinif() {
        return sinif;
    }

    public void setOgrenciNo(String ogrenciNo) {
        this.ogrenciNo = ogrenciNo;
    }

    public void setSinif(String sinif) {
        this.sinif = sinif;
    }

    @Override
    public String toString() {
        return ""+super.toString() +
                "\nOgrenci No =" + ogrenciNo +
                "\nSinif      =" + sinif
                ;
    }
}
