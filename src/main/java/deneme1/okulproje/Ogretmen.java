package deneme1.okulproje;

public class Ogretmen extends Kisi{
    private String bolum;
    private String sicilNo;


    public Ogretmen(){
    }

    public Ogretmen(String adsoyad, String kimlikNo, int yas, String bolum, String sicilNo) {
        super(adsoyad, kimlikNo, yas);
        this.bolum = bolum;
        this.sicilNo = sicilNo;
    }

    public Ogretmen(String bolum, String sicilNo) {
        this.bolum = bolum;
        this.sicilNo = sicilNo;

    }


    public String getBolum() {
        return bolum;
    }

    public String getSicilNo() {
        return sicilNo;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public void setSicilNo(String sicilNo) {
        this.sicilNo = sicilNo;
    }

    @Override
    public String toString() {
        return ""+super.toString() +
                "\nBolum      =" + bolum + '\'' +
                "\nSicil No   =" + sicilNo + '\'' +
                '}';
    }
}
