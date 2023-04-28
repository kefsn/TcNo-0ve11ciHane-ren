package javaders.day02printmethodcreation;

public class MethodCreation {
    public static void main(String[] args) {

        //static ==> protocol tribünü vip class


        //Karenin alanını veren kodu yazınız.
        double sonuc = kareAlani(4);
        System.out.println("sonuc = " + sonuc);
        //Dikdörtgenin alanını veren kodu yazınız

    }//main



    public static double kareAlani(double a){
        return a*a;
    }

}//class
