package introduction.day01variables;

public class Variables01 {

    public static void main(String[] args) {
        //Jaava bu satırı da okuma.Kendinizi veya başkasına açıklamadır
        /*
        Java bu satırı da okumaz
         */

        //Variable oluşturmak
        //data type + variable name + atama operatörü + data + noktali virgül
           int              age           =                13       ;

           /* java cümlesi = Statement
           *Java da '=' assignment operator,Sağdaki değeri alır soldaki kutuya koyar
           * Java da eşittir olarak " == "
           * Eğer variable declaration yapar, assignmen yapmazsanız java kendi Default değerlerini yükler
           * Default değer sayılar için sıfırdır
           *
           * Data Type + variable name ==> Variable Declaration
           * Assignment operator ( atama operatorü) + variable değeri ==> Assignment
           * */

        /* Javada temelde iki tip data vardır
             1) Primative data type
             char, boolean,byte,short,int,long, float, double
             2) Non-primative data type
             string

 */

         /* Örnek: Öğrenci ismi için variable oluşturunuz ve değer olarak ali Can atayınız
         // String'lere verilen değer daima çift tırnak içinde olmalıdır.*/

         String studentName = "Ali Can" ;

         //Stringler için " Default value" "null" dır.
         // Null demek sıfır demek değildir çünkü sıfırda coding te bir değerdir.
         // null içi boş obje demektir.


         //Char data type:
         // Tek karakterler için kullanılır. Örneğin==> A, X, 5, >
         // Örnek 2 : Char data type'inde bir ismin ilk harfi olarak bir variable oluşturunuz ve bir değer atayiniz.
         // Char data type'nda değerler tek tırnak içine konulmalıdır.
         char isminIlkHarfi = 'A' ;

         //boolean data type:
         //Boolean iki farklı değer alabilirler true ( doğru) veya false ( yanlış)
         //Örnek3) Boolean data tipinde bir emeklimisiniz sorusu için bir variable oluşturun ve false değerini atayin.
         boolean emeklimisin = false ;

         //Byte data typpe:
         //Tam sayilar icindir.Hafizada bir byte yer kaplar
         //Byte: -128 den +127 e(dahil) kadar tam sayı değerleri için kullanılabilir.
         //Örnek4: Byte data typenda öğrenci yaşı için bir variable oluşturunuz ve değer atayınızı
         byte ogrenciYasi = 23;

         //Short data type:
         //tam sayilar icindir ve hafizada 2 byte yer kaplar
         //Short: -32768 ile 32767 arasindaki tam sayilar için kullanilir.

         short okuldakiOgrenciSayisi = 1300;

         //int data type:
         //tam sayılar icindir, hafızada 4 byte yer kaplar
         //-2142483648 ile 2147483647 arasındaki sayilar icindir
         //Örnedk5: Ülke nüfüsü için bir variable oluşturunuz ve değer ataması yapınız.
         int ulkeNufusu = 800000000 ;

         //Long data type:
         // Tamsayilar içindiir hafizada 8 byte yer kaplar
         //Long:  -9,223,372,036,854,775,808 ile 9,223,372,036,854,775,807 aralığndadır
         //Örnek: İnsan vücüdündaki hucre sayisi için bir variable oluşturunuz?
         //Note:Br değer long ise sonuna 'L'( tercih edilir' yada 'l' konulur.
         //Long demenize rağmen sonuna eğer L koymazsak java mı yoksa int araliğinda is int olarak kabul eder.

         Long cellNumberInhumanBody = 787445446841L;

         //Float data type:
         //Float virgülli sayilar ( Decimal Number) ==> Ondalikli sayılar) için kullanılır
         //fiyatlandırmalar için tercih edilebilir(12.99)
         //Örnek: Gömlek ve ayakkabı fiyatları için 2 tane variable oluşturup toplam fiyatı ekrana yazınız
         //Note:Java ondalikli sayilari yani decimal Numbersa otomatik olarak 'Double' kabul eder.
         //      siz data type'ini float yazarsaniz hata verir.
         //       Float olmasında ısrar ediyorsanız sonuna 'f' ya da'F' konulur.
         //       Float memory de 4 byte yer kaplar, double 8 byte yer kaplar.

         float gomlekFiyati = 12.99F;
         float ayakkabiFiyati = 15.99F;

         System.out.println(gomlekFiyati + ayakkabiFiyati);

         // System.out.print(); kodu parantez  içine yazdıklarimiz ekrana yazdırır

         int a = 12;
         int b = 13;
          System.out.println(a+b);
        // System.out.println(); ekrana yazdirir ve "pointer" i bir sonraki satira koyar
        // System.out.print(); ekrana yazdirir ve "pointer" i ayni satirda tutar.
        int c =313;
        int d =314;
        System.out.print(c);
        System.out.print(d);

          //Double data Type:
          //Double Memoryde daha fazla yer kaplar, virgülden sonraki rakam daha fazla alir

          //Örnek 8: Hücre agirligi ve Amip'in agirligi için iki tane variable oluşturunuz ve agirlikalri farkini ekrana yzdiriniz.
          double weightCell = 0.0000000000000112;
          double weightAmip = 0.0000000000000023;
          // System.out.println(); yazdırmanın kısa yolu Sout yaznı entera basın
          System.out.println(weightCell - weightAmip);

















    }}


