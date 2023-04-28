package introduction.day04scannerwrapperoperators;

import com.sun.jdi.IntegerValue;

public class WrapperClass {
    public static void main(String[] args) {

        //Wrapper Class : Charecter -Boolean -Byte -Short -Integer -Long -Float- Double


        //Wrapper Class'lar non-primitive dir bu yüzden memory de çok fzla yer kaplar.
        //O yüzden şart değilse wrapper class kullanmayi tercih etmeyiz
        //Böyle bir imkanınn varlığından da haberdar olmalıyız

        //'n' yazıp nokta koyarsanız hiç method göremezsiniz, çünkü primitivler method içermez.
        int n = 12;
        //Ama 'm' yazip nokta koyarsanız bu sefer birçok method görebilirsiniz çünkü wrapper classlar method içerirler.
        Integer m = 12;

        byte p = 13;
        Byte r = 13;

        //Örnek!: Short data type'nın minimum ve maksimum değrlerini kod yazarak bukunuz.
        short maxShort = Short.MAX_VALUE;
        System.out.println(maxShort);

        short minValue = Short.MIN_VALUE;
        System.out.println(minValue);

        //Örnek2: İnt data typpenın minimum değeri ile byte data typenınn max değer tolamını bulunuz.
         int minInt = Integer.MIN_VALUE;
         byte maxByte = Byte.MAX_VALUE;
        System.out.println(minInt+maxByte);

        //Örnek3: Primitive int'i wrapper integer'a ceviriniz.
        int num = 13;
        Integer wrapperNum = num;

        //primitive yani method bulunmayan bir kutudaki değeri alarak içindeki
        //bazı methodlar bulunan wrapper kutuya atama yaparsak buna auotoboxing denir.
        //Ör: Wrapper Byte'ı primitive byte ceviriniz.

        Byte t = 33;
        byte primitiveK = t;
        //Wrapper bir kutu içinde bazi metdolarla birlikte bulunan değeri alarak
        //primitive yani method bulunmayan bir kutuya atarsak bu isleme
        //un boxing denir.

        //Örnek 4:i) Primitive char'ı Wrapper Charecter'e çevir

        char k = 'A';
        Character l = 'k';

        //Örnke: Wrapper boolean'ı primitive booleana çevir

        Boolean d = false;
        boolean c = d;




    }
}
