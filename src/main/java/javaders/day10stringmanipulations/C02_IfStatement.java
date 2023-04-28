package javaders.day10stringmanipulations;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {

        //Kullanıcı gün ismini girsin kod günü yazsın.Haftanın 1.Günü pazar Yazılımda...
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen gün numarasını giriniz\n1 :Pazar\n2 :Pazartesi\n3 :Salı" +
                "\n4 :Çarşamba\n5 :Perşembe\n6 :Cuma\n7 :Cumartesi...");
        byte gunNO = input.nextByte();
        if(gunNO==1){
            System.out.println("Pazar");
        }else if (gunNO==2){
            System.out.println("Pazartesi");
        }else if (gunNO==3){
            System.out.println("Salı");
        }else if(gunNO==4){
            System.out.println("Çarşamba");
        }else if(gunNO==5){
            System.out.println("Perşembe");
        }else if (gunNO==6){
            System.out.println("Cuma");
        }else if(gunNO==7){
            System.out.println("Cumartesi");
        }else{
            System.out.println("Lütfen geçerli bir rakam giriniz...");
        }

    }//main
}//class
