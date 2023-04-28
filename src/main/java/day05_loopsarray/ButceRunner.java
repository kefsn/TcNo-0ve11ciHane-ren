package day05_loopsarray;

public class ButceRunner {
    public static void main(String[] args) {

        Butce baba = new Butce();//Adem babamız
        System.out.println("Maas öncesi Butce" + Butce.butce);
        baba.maasAl(30000);
        System.out.println("Maas sonrası Butce" + Butce.butce);

        baba.harclikAl(100);
        baba.harcliktanHarca(80);
        System.out.println("Kalan para" + Butce.butce);

        Butce anne = new Butce();//Havva
        anne.maasAl(50000);
        anne.harclikAl(500);
        anne.harcliktanHarca(500);

        System.out.println(Butce.butce);
        System.out.println("Anne kalan harçlık :" + anne.harclik);

        Butce cocuk = new Butce();
        cocuk.harclikAl(200);
        cocuk.harcliktanHarca(180);
        System.out.println(Butce.butce);
        System.out.println("Çocuk kalan harçlık" +cocuk.harclik);
        System.out.println("Son kalan bakiye"  +Butce.butce);


    }//main
}//Class
