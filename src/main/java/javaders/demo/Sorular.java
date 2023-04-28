package javaders.demo;

public class Sorular {


    public static void main(String[] args) {


      /*
    Soru-01: Pozitif bir tamsayıyı input kabul edip en büyük asal çarpanını veren bir METHOD create ediniz.
            Ör: Input : 50
            Bolenler : 2,5,10,20,50
            Asal Bolenler: 2,5
            En buyuk asal carpan: 5
    Soru-02: 100'den 0'a kadar 13'e tam bölünebilen sayıları ve toplamlarını ekrana yazdırınız (büyükten küçüğe).
             Ekran Çıktısı
             91
             78
             65
             52
             39
             26
             13
    Soru-03: 0-255 e kadar olan harflerin , sayı ve harf değerini konsola yazdırınız.
    Soru-04: Girilen bir stringdeki a harfi sayısını bulunuz ama  c harfine  gelirse döngüden çıkılsın
             Ornek: Bugün hava oldukca güzel.-> 2
    Soru-05: Kullanıcıdan 5 adet sayı isteyiniz.Bu sayılardan 5 ile 10 arasındakiler hariç, diğerlerinin toplamını bulunuz.
    Soru-06: Bir top belirli yükseklikten atılmaktadır.
             Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
             Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
             Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan  code blogu create ediniz.
    Soru-07: STRING OLAN PIN kodunuzu kontrol eden ve 3 giris hakki veren bir kod yazınız.
    Soru-08: Verilen iki sayının kombinasyonunu bulan kodu yazınız.
             Hatırlatma C(n,r) = n! / (r!(n-r)!)
             Ekran Çıktısı
             Birinci sayıyı giriniz: 15
             Ikinci sayıyı giriniz: 4
             Kombinasyon: 1365
             Birinci sayıyı giriniz: 5
             Ikinci sayıyı giriniz: 3
             Kombinasyon: 10
    Soru-09: Verilen bir sayının faktöriyelini özyineli (recursive) olarak hespalayan fonksiyonu yazınız.
             Örnek Ekran Çıktıları
             Bir sayi giriniz: 6*5*4*3*2*1=720
             Faktöriyeli: 720
             Bir sayı giriniz: 3*2*1
             Faktöriyeli 6
    Soru-10: Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya musteri karti olup olmadigini sorun,
             Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
             Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10 indirim yapin
    Soru-11: Kullanıcıdan 5 sayı isteyiniz, bu sayılardan en büyüğünü bularak yazdırınız.
    Soru-12: Girilen bir sayıya kadar olan sayılardan sadece tek olanlarını ekrana yazdırınız.(girilen sayı dahil)
    Soru-13: Kullanicinin INTEGER OLAN PIN kodunuzu kontrol eden bir kod yazınız.
    Soru-14: Kullanıcıda x  girilene kadar ekrana "Program çalışıyor" yazan ve x girildiğinde ise "Program bitti" yazan programı yazınız.
    Soru-15: GİRİLEN SAYININ BASAMAKLARINDAKİ RAKAMLARIN TOPLAMINI BULUNUZ.
            */




    //public class StringManipulationPracticeSorulari {
    /*
    Soru-1: Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.
    Soru-2: Kullanıcıdan tek seferde alacağınız 2 kelimelik ad soyadı 2 ayrı kelimeye ayırınız,
            ad ayrı soyad ayrı sekilde ekrana yazdırınız.
    Soru-3: Kullanıcıdan alacağınız, 3 kelimedne oluşan ismi
            Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
    Soru-4: Kullanicidan 4 harfli bir kelime isteyin ve girilen kelimeyi tersten yazdirin
    Soru-5: String seklinde verilen asagidaki fiyatlarin toplamini bulunuz.
            String  str 1= %13.99
            String str 2= %10.55
            ipucu: Double.parseDouble() methodunu kullanabilirsiniz.
    Soru-6: Kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
            örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
    Soru-7: Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir,
            ternary kullanarak harflerin unique(farkli) olup olmadigina bakiniz e.g: ala => 3
            Test data: ali eme all
    Soru-8: Kulanicidan bir kelime isteyin eger kelime 3 ve daha fazla harfden olusuyorsa son
            iki harfini 3 kere yan yana yazdirin. degil ise girilen kelimeyi yazdirin
            ornek:
            input = Ali
            output = lilili
            input = el
            output = el
    Soru-9: StringMethods:
				cift uzunlukta bir degiskenin ilk yarisini konsolda yazdirmak icin bir Java programi yaziniz.
	    	    ORNEK:
		     	INPUT      :  Python
				OUTPUT :   Pyt
    Soru-10: Kullanıcıdan aldığınız  Adı, Soyadı ve kredi kartı numaralarını aşağıdaki gibi özel forma dönüştürün
            Kredi kartı numarasını kontrol edin, yoksa 16 haneden küçük olursa   "Geçersiz kredi kartı numarası" yazdırın.
            input : John White 1234234534561478
            output: Ad : J*** Soyad :W**** kartNo:***********1478 (Adın baş harfleri ve soyadı büyük olmalıdır)
    Soru-11: Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		    String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    Soru-12: Kullanicidan email girmesini isteyin
             @ isareti icermiyorsa "gecerli bir email girin" yazdirin
             @ isaretinden sonra sadece "gmail.com" yaziyorsa "email onaylandi" yazdirin
             @ isaretinden sonra "gmail.com" disinda birsey yaziyorsa "Lutfen gmail hesabinizi girin" yazdirin
             ORNEK:
            INPUT : techproed.com OUTPUT : "gecerli bir email girin "
            INPUT : techproed@gmail.com OUTPUT :  "email onaylandi "
            INPUT : techproed@hotmail.com OUTPUT : "Lutfen gmail hesabinizi girin"
​
          */


    }


}
