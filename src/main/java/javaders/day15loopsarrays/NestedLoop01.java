package javaders.day15loopsarrays;

import java.util.Scanner;

public class NestedLoop01 {
    public static void main(String[] args) {
       /* for(){//Dışarda ki loop bir defa dönünnce içerde daha fazla döner
           for(){//Bu Loop'a nested lopp denilir.Loop içince loop demek

            }
        }*/
        /*Ex: Type code to get the outout
        Week :1
Day :1
Day :2
Day :3
Week :2
Day :1
Day :2
..
Week :3
Day :1
Day :2
..
Week :4
Day :1
Day :2
..
         */
        //Nested for loop 1.Way(Nested loop genellikle for'la kullanılır.)
        for (int i = 1; i <3 ; i++) {
            System.out.println("  Week :" +i);
            for(int k=1;k<4;k++){
                System.out.println("Day :" +k);

            }

        }
        //Nested while-loop 2.way
        int i = 1;

        while(i <3 ){
            System.out.println("  Week :" +i);
            int k=1;
            while(k<4){
                System.out.println("Day :" +k);
                k++;
            }

            i++;
        }
        /*Ex: Write a java program to print rectangle Star Pattern using for Loop
        ****
        ****
        ****
        Not: get the number of the row and the columns from user.
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter number of rows");
        int rows = input.nextInt();
        System.out.println("Please enter number of rows");
        int columns = input.nextInt();

        for (int r = 1; r <= rows; r++) {//Bu satır kodu

            for (int c = 1; c <=columns; c++) {//sütunda ki yıldız sayısı
                System.out.print("* ");
            }
            System.out.println();//Alt satıra inmek için sout yaptık
            //Scanner'den veri aldığımız için r++ yazmadık en alta.
        }
        /*
        Ex: Type code to get the output like.
        1  //1 defa çalışacak
        1 2  //2  defa çalışacak
        1 2 3  //3  defa çalışacak
        1 2 3 4  //4  defa çalışacak
        1 2 3 4 5  //5  defa çalışacak
         */
        System.out.println("Please enter row number");
        int row = input.nextInt();//Sütün sayısı kullanıcıdan almıyoruz, farklı sayı olduğu için
        for (int m = 1; m <= row; m++) {
            for (int n = 1; n <=m ; n++) {//n<=m yaptık çünkü
                System.out.print(n+ " ");

            }
            System.out.println();
        }

    }
}
