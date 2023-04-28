package introduction.day02datatypesmethodcreation;

public class Variables01 {
    /*
    javada temelde iki tip data vardir
    1) Primative daha type:
    char, boolean, byte,short,int, long, float, double

    2)Non-primative data type
    String

     */

    /*
    Note 1: Primative data typeları java oluşturmuştur,biz oluşturamayı.
    Note 2: Primativ data type'larda isimlerinde sadece küçük harf kullanilir.
    Note 3: Primative datalar data type'laria göre memor'de darkli farkli yer kaplarlar.
    Note 4: Primative datalar içlerinde sadece sizin atadiğiniz değeri barindirilar.


   */
    /*
    non-primative data types:
    1) Örneğin  String bir non-primative data type örneğidir.
    2) Üretilen her bir class aynı zamanda bir non-primative data type' tır. BU yüzden non-primatve data type'ler sınırsız sayıdadır
    3) Non-primative data typlerın isimleri büyük harf ile başlar.
    4) Non- primative data type'lerınn tamamı için java memory de aynı miktarda yer ayırır.


     */
    public static void main(String[]args){
        //Örneğin: Şehir ismi için bir variable oluşturunuz ve bir değer atayiniz
        String cityName = "Ankara";
        System.out.println(cityName);

        int a = 13;
        /*
        Interview sorusu: "primitive" ve "non-primitive" data typler arasındaki fark nedir?
        1) primative'ler sadece bizim atadığımız değeri içerir;
        "non-primativeler'ler bzim atadığımız değer ve methodları içerir.
        2) Primative'ler küçük harfle başlar buna karşılık non-primative'ler büyük harf il başlar.
        3) Primative'leri java üretmiştir 8 tanedir
        Non-prmativeler'i java developerlar ürettebilir bu yüzden sınırsız sayıdadır.
        4)Primative'ler memory'de data type'na göre yer kaplar
        Non-Primative'ler için java memoryde aynı büyüklükte yer ayırır.
         */
    }

}
