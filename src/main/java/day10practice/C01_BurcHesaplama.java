package day10practice;

import java.util.Scanner;

public class C01_BurcHesaplama {
    public static void main(String[] args) {
        // Kullanicidan dogdugu ay ve gun bilgilerini alarak burcunu hesaplatan kodu yazınız

        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the month that you are born.As a Strging");
        String ay = scan.next();

        System.out.println("Please enter the day that you are born.As an int");
        int gun = scan.nextInt();
        String burccc = (ay.equalsIgnoreCase("Ocak") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc1 = (ay.equalsIgnoreCase("Şubat") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc2 = (ay.equalsIgnoreCase("Mart") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc3 = (ay.equalsIgnoreCase("Nisan") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc4 = (ay.equalsIgnoreCase("Mayıs") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc5 = (ay.equalsIgnoreCase("Haziran") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc6 = (ay.equalsIgnoreCase("Temmuz") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc7 = (ay.equalsIgnoreCase("Ağustos") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc8 = (ay.equalsIgnoreCase("Eylül") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc9 = (ay.equalsIgnoreCase("Ekim") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc10 = (ay.equalsIgnoreCase("Kasım") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";
        String burcc11= (ay.equalsIgnoreCase("Aralık") && gun>22) ?"Kova BUrcu":"Oğlak Burcu";

       /* String burc = "";

        if(ay.equalsIgnoreCase("Ocak")){

            if(gun>22){
                burc="Kova";
            }else{
                burc="Oglak";
            }
        }
        if(ay.equalsIgnoreCase("Subat")){

            if(gun>20){
                burc="Balik";
            }else{
                burc="Kova";
            }
        }
        if(ay.equalsIgnoreCase("Mart")){

            if(gun>21){
                burc="Koc";
            }else{
                burc="Balik";
            }
        }
        if(ay.equalsIgnoreCase("Nisan")){

            if(gun>21){
                burc="Boga";
            }else{
                burc="Koc";
            }
        }
        if(ay.equalsIgnoreCase("Mayis")){

            if(gun>22){
                burc="Ikizler";
            }else{
                burc="Boga";
            }
        }
        if(ay.equalsIgnoreCase("Haziran")){

            if(gun>23){
                burc="Yengec";
            }else{
                burc="Ikizler";
            }
        }
        if(ay.equalsIgnoreCase("Temmuz")){

            if(gun>23){
                burc="Aslan";
            }else{
                burc="Yengec";
            }
        }
        if(ay.equalsIgnoreCase("Agustos")){

            if(gun>22){
                burc="Basak";
            }else{
                burc="Aslan";
            }
        }
        if(ay.equalsIgnoreCase("Eylul")){

            if(gun>23){
                burc="Terazi";
            }else{
                burc="Basak";
            }
        }
        if(ay.equalsIgnoreCase("Ekim")){

            if(gun>23){
                burc="Akrep";
            }else{
                burc="Terazi";
            }
        }
        if(ay.equalsIgnoreCase("Kasim")){

            if(gun>22){
                burc="Yay";
            }else{
                burc="Akrep";
            }
        }
        if(ay.equalsIgnoreCase("Aralik")){

            if(gun>22){
                burc="Oglak";
            }else{
                burc="Yay";
            }
        }


        System.out.println(gun + " " + ay + " " + "tarihinde dogduysanız burcunuz: " + burc);
        */
    }


}
