package javaders.day37exceptionsenums;

public class IllegalGradeException extends Exception{
    /*
    1)Custom Exception Class oluşturmak için Exception class'a extends etmeliyiz.
    Exception classa extends ederrek oluşturduğunuz Custom Exception "Compile Time Exception" olur.

    2) Custom Exception Class oluştururkesn constructer oluşturmalısınız.
    Bu constructer, parentteki constructor'ı çağırmalıdır.
    Parenttaki constructor, bu "constructer" mesaj verecek veya vermeyecek şekilde oluşturabailir.

    3) Custom Exception Class oluştururken ismin sonunda Exception Kelimesini kullanmalısınız.
    IllegalGradeException 'da olduğu gibi.
     */
    public IllegalGradeException(String message){
        super(message);//Eğer konsola mesaj da yazssın dersek bunu kullanacağı.
    }

    public IllegalGradeException(){
        super();//Eğer konsola mesaj vermek istemiyorsak bunu kullanacağı.
    }
}
