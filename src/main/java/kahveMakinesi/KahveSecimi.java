package kahveMakinesi;

import java.util.Scanner;

public class KahveSecimi {
    Kahve kahve = new Kahve();
    Scanner scan;

    public KahveSecimi() {
        this.scan = new Scanner(System.in);
    }

    public void selectCoffee() {
        System.out.println();
        System.out.println(" ----- COFFE MACHINE READY TO ORDER ----- ");
        System.out.println();

        while(true) {
            System.out.println("Hangi kahveyi istersiniz? ");
            System.out.println("1- Turk Kahvesi");
            System.out.println("2- Filtre Kahve");
            System.out.println("3- Espresso");
            System.out.println("Seciminiz: ");
            this.kahve.hangiKahve = this.scan.nextLine().trim();
            if (this.kahve.hangiKahve.equalsIgnoreCase("turk kahvesi") || this.kahve.hangiKahve.equalsIgnoreCase("filtre kahve") || this.kahve.hangiKahve.equalsIgnoreCase("espresso")) {
                System.out.println(this.kahve.hangiKahve + " hazirlaniyor...");
                this.isMilk(this.kahve);
                this.isSugar(this.kahve);
                this.selectBoyut(this.kahve);
                this.printInfo(this.kahve);
                return;
            }

            System.out.println("Hatali giris yaptiniz! Tekrar deneyiniz");
        }
    }

    public void printInfo(Kahve kahve) {
        System.out.println();
        System.out.println(".....");
        System.out.println("*****  " + kahve.hangiKahve + " " + kahve.boyut + " hazirdir. Afiyet olsun...");
    }

    public void isMilk(Kahve kahve) {
        while(true) {
            System.out.println("Sut eklememizi ister misiniz? (Evet veya Hayir olarak cevaplayiniz.) : ");
            kahve.sut = this.scan.next();
            if (kahve.sut.equalsIgnoreCase("Evet")) {
                System.out.println("Sut ekleniyor...");
            } else {
                if (!kahve.sut.equalsIgnoreCase("Hayir")) {
                    System.out.println("Hatali giris!");
                    continue;
                }

                System.out.println("Sut eklenmiyor...");
            }

            return;
        }
    }

    public void isSugar(Kahve kahve) {
        while(true) {
            System.out.println("Seker eklememizi ister misiniz? (Evet veya Hayir olarak cevaplayiniz.) : ");
            kahve.seker = this.scan.next();
            if (kahve.seker.equalsIgnoreCase("Evet")) {
                System.out.println("Kac seker olsun? ...");
                kahve.kacSeker = Math.abs(this.scan.nextInt());
                System.out.println(kahve.kacSeker + " seker ekleniyor...");
            } else {
                if (!kahve.seker.equalsIgnoreCase("Hayir")) {
                    System.out.println("Hatali giris!");
                    continue;
                }

                System.out.println("Seker eklenmiyor...");
            }

            return;
        }
    }

    public void selectBoyut(Kahve kahve) {
        this.scan.nextLine();

        while(true) {
            System.out.println("Kahveniz hangi boyutta olsun? (Buyuk boy, orta boy, kucuk boy olarak giriniz.) : ");
            kahve.boyut = this.scan.nextLine();
            if (kahve.boyut.equalsIgnoreCase("buyuk boy") || kahve.boyut.equalsIgnoreCase("orta boy") || kahve.boyut.equalsIgnoreCase("kucuk boy")) {
                System.out.println("Kahveniz " + kahve.boyut + " hazirlaniyor");
                return;
            }

            System.out.println("Hatali secim...");
        }
    }

}
