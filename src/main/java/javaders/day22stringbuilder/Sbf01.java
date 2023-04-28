package javaders.day22stringbuilder;

public class Sbf01 {
    public static void main(String[] args) {
        /*
        1-StringBuffer Java'da String üreten bir class'tır.
        2-StringBuffer, StrgingBuilder'a çok benzer,yani ikisi de mutable String üretir.
        3- StringBuffer "multi-thread" dır(Çoklu iş yapmaya müsait) ama StringBuldir "multi-thread" değildir.
        Çoklu datalar için StringBuffer seçilir.
        4-Java StringBuffer'ı , StringBuilder'dan önce oluşturdu.Java ilk oluştuurulduğunda StringBuffer vardır.
        5-StringBuilder multi-thread olmadığı için StringBuffer'dan daha hızlı çalışır.

        3 tane String
        -Eğer immutable String lazımsa String klass kullanacağız.
        -Eğer mutable String lazımsa StringBuilder ve StringBuffer klass kullanacağız.
        -Eğer multi-thread gerekirse StrigBuffer, Eğer gerekmezse StringBuilder kullanacağız.
        -Multi-thread yaparken yapılan işlerin sırası öncem arz eder ve
        Yapılan işleri mantıklı bir sıraya koymak "synchronizationa" olarak
        adlandırılır.
        StringBuffer'lar, multi-thread oldukları için sencronitiation'a uygundur

         */

        StringBuffer sbf1 = new StringBuffer("Java");


    }
}
