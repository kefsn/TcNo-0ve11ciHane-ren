package javaders.day36exceptions;

public class E03 {

    public static void main(String[] args) {
        /*
        1-Birbirine dönüştürülemeyecek data type'larını dönüştürmekte ısrar ederseniz
        Java ClassCastException atar.
        2- "System.err.println" yaparsak consola yazdığımız yazıyı kırmızı yazar.Kullanılabilir.
        Hata mesajını renkli olarak verir. Hataya dair mesajı okunabilirliği artırmak için
        "System.err.println" kullaılabilir.Ayrıca bu şekilde yazdırdığımızda java error mesajlarını
        ayrı bir yerde depolar.
        */
        Object obj = 13;
        try{
            String str = (String) obj;
            System.out.println(str);
        }catch (ClassCastException e){
            System.err.println("Her data type'ı her data type'a çevrilmez.");
        }



    }
}
