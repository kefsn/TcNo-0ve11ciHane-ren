package day_01practice;

public class C01_BasamaklaraAyirma {
    public static void main(String[] args) {

        //12345 sayısını rakamları toplamını bulunuz
        int num = 12345;

        int a = num%10;
        int b= (num/10)%10;
        int c= (num/100)%10;
        int d= (num/1000)%10;
        int e= (num/10000)%10;

        System.out.println(a+b+c+d+e);

    }

}
