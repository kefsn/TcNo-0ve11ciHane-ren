package kahveMakinesi;

public class Kahve {
    String hangiKahve;
    String sut;
    String seker;
    int kacSeker;
    String boyut;

    public Kahve() {
    }

    public String toString() {
        return "Kahve{hangiKahve='" + this.hangiKahve + "', sut='" + this.sut + "', seker='" + this.seker + "', kacSeker=" + this.kacSeker + ", boyut='" + this.boyut + "'}";
    }
}
