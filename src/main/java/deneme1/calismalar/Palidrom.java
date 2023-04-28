package deneme1.calismalar;

public class Palidrom {
    static boolean palidrom(int input){
        int temp, tersSayi = 0, kalan;
        temp = input;

        while (temp != 0){
            kalan = temp%10;
            tersSayi = tersSayi * 10 + kalan;
            temp /= 10;
        }
        if(input == tersSayi){
            return  true;
        }else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("palidrom() = " + palidrom(121));
    }
}
