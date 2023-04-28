package deneme1.TEKRAR;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class AracTalebi {
    /*
      Bir araç kiralama projesi hazırlayınız.        Arac Talebi adında bir POJO class oluşturunuz.
         -	alınacaksehir, alınacakgun, alıssaati, teslimGunu, teslimSaati (kiralama ile ilgili bilgiler)
         -	marka, model, yakitTipi, vites ve gunlukUcret (araç ile ilgili bilgiler).
        -	Kiralama ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
        -	Araç ile ilgili variable’ları içeren parametreli bir constructor oluşturun.
        -	Tum variable’lar için Getter ve Setter method’ları oluşturun (Encapsulation).
     */


    private String alinacakSehir ;
    private String teslimSehir;
    private LocalDateTime alinacakGun ;

    private LocalDateTime teslimGunu ;


    private String marka;
    private String model;
    private String yakitTipi;
    private String vites;
    private int gunlukUcret;


    public AracTalebi() {
    }



    public AracTalebi(String alinacakSehir, String marka, String model, String yakitTipi, String vites, int gunlukUcret) {
        this.alinacakSehir = alinacakSehir;
        this.marka = marka;
        this.model = model;
        this.yakitTipi = yakitTipi;
        this.vites = vites;
        this.gunlukUcret = gunlukUcret;
    }

    public AracTalebi(String alinacakSehir, LocalDateTime alinacakGun, LocalDateTime teslimGunu,String teslimSehir) {
        this.alinacakSehir = alinacakSehir;
        this.alinacakGun = alinacakGun;

        this.teslimGunu = teslimGunu;

        this.teslimSehir = teslimSehir;
    }

    public String getAlinacakSehir() {
        return alinacakSehir;
    }

    public String getTeslimSehir() {
        return teslimSehir;
    }

    public void setTeslimSehir(String teslimSehir) {
        this.teslimSehir = teslimSehir;
    }

    public void setAlinacakSehir(String alinacakSehir) {
        this.alinacakSehir = alinacakSehir;
    }

    public LocalDateTime getAlinacakGun() {
        return alinacakGun;
    }

    public void setAlinacakGun(LocalDateTime alinacakGun) {
        this.alinacakGun = alinacakGun;
    }





    public LocalDateTime getTeslimGunu() {
        return teslimGunu;
    }

    public void setTeslimGunu(LocalDateTime teslimGunu) {
        this.teslimGunu = teslimGunu;
    }





    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakitTipi() {
        return yakitTipi;
    }

    public void setYakitTipi(String yakitTipi) {
        this.yakitTipi = yakitTipi;
    }

    public String getVites() {
        return vites;
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public int getGunlukUcret() {
        return gunlukUcret;
    }

    public void setGunlukUcret(int gunlukUcret) {
        this.gunlukUcret = gunlukUcret;
    }

    @Override
    public String toString() {
        return "AracTalebi{" +
                "alinacakSehir='" + alinacakSehir + '\'' +
                ", teslimSehir='" + teslimSehir + '\'' +
                ", alinacakGun=" + alinacakGun +

                ", teslimGunu=" + teslimGunu +

                ", marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", yakitTipi='" + yakitTipi + '\'' +
                ", vites='" + vites + '\'' +
                ", gunlukUcret=" + gunlukUcret +
                '}';
    }
}
