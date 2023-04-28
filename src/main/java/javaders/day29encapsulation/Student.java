package javaders.day29encapsulation;

public class Student {
    /*
    Encapsulation: Kapsülleme demektir. Data Hiding'tir yani veri saklmak demektir.

    Data nasıl saklanır?
    -Access Modifier'larını Private yaparak datayı diğer classlardan görünmez hale getiririm.
    Böylece datayı saklamış olurum.
     */
    private String stdId = "AC2023102T";
    public int age = 19;
    private double notOrt = 3.53;
    private boolean succesfull = false;

    /*
    Encapsulatin yaptığımız datayı istersek diğer classlardan okuyabiliriz.
    Nasıl okuruz?;
    1) "get method" oluşturularak Encapsulate ediliş datanın değerini okuyabilirz.
    "get method'Lar" public olur çünkü erişmek istiyorum diğer klaslarda.
    "get method'Lar"'ın return type okuduğu variable'n return type ile aynı olur.
    "get method'Lar" bir boolean variable için oluşturulduysa ismi "is" ile başlar.


    //Encapsulation yaptigimiz datayi istersek diger class'lardan okuyabiliriz.
    //Nasil okuruz? "get method" olusturarak Encapsulate edilmis data'nin degerini okuyabiliriz.
    // i) "get method"lari hep "public" olur. ii) get methodu'nun return type'i okudugu methodun return type'i ile ayni olur.
    // iii) get method bir boolean method icin olusturulduysa ismi "is" ile baslar.
    //get==> getter get methodlarin diger adi getter'dir.

//Encapsulation yaptigimiz data'si istersek diger class'lardan nasil degistrebiliriz?
    //Nasil degistirebiliriz? "set method" olusturarak Encapsulate edilmis datanin degerini degistirebiliriz.
    // i) set methodlar hep "public" olur. ii) set methodu'nun return type'i hep "void" olur.
    // iii) set method "parametre" kullanir. parametrenin data type'i variable ile ayni olur.
    // iv) set method kullanarak var olan object uzerinde degisiklikler yaparak o object'i yeni bir object gibi kullanabiliriz.
    // set==> setter set methodlarin diger adi setter'dir.


     */

    public String getStdId() {
        return stdId;
    }

    public double getNotOrt() {
        return notOrt;
    }

    public boolean isSuccesfull() {
        return succesfull;
    }
    /*
    Encapsulation yaptığımız datayı istersek diğer claslardan değiştirebiliriz.
    Nasıl değiştirebiliriz?
    -"set mthod oluşturarak Encapsulate ettiğimiz datatnn değerini değiştirebiliriz.
    a) Set methodları her zaman "public" olur.
    b) Set Methodların return typı her zaman void olur.
    c) Set method parametre kullanır. Parametrenin data type'ı variable ile aynı olmak zorundadır.

    -Set method kullanılarak varolan object üzerinden değişiklikler yaparak o objecti sanki
    yeni bir object miş gibi kullanabiliriz.
    -get methodların diğer adı getter'dır.
    -set methodların diğer adı setter'dır.

     */


    public void setStdId(String stdId) {
        this.stdId = stdId;
    }

    public void setNotOrt(double notOrt) {
        this.notOrt = notOrt;
    }

    public void setSuccesfull(boolean succesfull) {
        this.succesfull = succesfull;
    }
}
