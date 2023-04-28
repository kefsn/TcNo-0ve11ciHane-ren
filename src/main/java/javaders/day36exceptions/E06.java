package javaders.day36exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class E06 {
    public static void main(String[] args) {
        /*
        1- File FileNotFoundException ve IOException Compile Time Exceptionlardır, yani code'u yazarken hata alırız.
        2- FileNotFoundException path'in doğruluğu ve dosyanın varlığı ile ilgilidir.
         IOException tüm input ve output işlemleri ile ilgilidir ve parenttir.
        3- IOException Class, FileNotFoundException Class'ın parentidir.
        4- İstenirse FileNotFoundException yerine IOException da kullanılabilir.
        5- IOException clas ve FileNotFoundException beraber kullanılacaksa FileNotFoundException üstte,
        IOException altta kullanılmalıdır.
         */

        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/main/java/javaders/day36exceptions/file.txt");
            int k=0;
            while ((k=fis.read())!= -1){
                System.out.print((char)k);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Path is wrong or the files does not exist");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        //(char)k yaparak sayıyı harfe çevirdik. Type Casting
        }

    }

