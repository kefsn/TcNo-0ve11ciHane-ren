package javaders.day13ncrementdecrementloops;

public class ForLoop02 {
    public static void main(String[] args) {
        //Ex: Verilen bir String'de ilk 'a' harfinden önceki tüm
        //karakterleri consola yazdırınız..

        String s = "I love Java";

        for(int i =0 ;i<s.length() ;i++){
            char ch =s.charAt(i);

            if(ch =='a'){
                break;
            }
            System.out.print(ch);
        }
        System.out.println();
        //Ex: Verilen bir String'de son'a'dan sonra ki
        //tüm karakterleri tersten yazdırınız.
        String t = "Germany";

        for (int i = t.length()-1 ; i>=0 ;i-- ){
            char c = t.charAt(i);
            if(c=='a'){
                break;
            }
            System.out.print(c);



        }


    }
}
