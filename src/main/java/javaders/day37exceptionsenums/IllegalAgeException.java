package javaders.day37exceptionsenums;

public class IllegalAgeException extends RuntimeException{

    /*
    Eğer IllegalAgeException'ı extends RuntimeException  oluşturduğumuz klass RunTimeException'un childe olur.

     1) Eğer Runtime Custom Exception üretmek isterseniz RuntimeException Class'a extend etmek zorundasınız.

        Biz bu exception'i runtime exception yapmak istedik. Bunun icin olusturdugumuz  class'i extends keywordu
        ile RunTimeException'in child'i yaptik.

        Iki exception constructor olusturduk. Birini mesajsiz,
        digerini mesajli yaptik. Mesaj constructor body'si icinde ilk satirdaki super methodu icine yazildi.

        Olusturdugumuz Class'i RunTimeException'in Child' i yaparsak
        o class RunTimeException olur ama Exception Class'in childí yaparsak Compile Time Exception olur
     */

    public IllegalAgeException(){
        super();
    }
    public IllegalAgeException(String message){
        super(message);
    }

}
