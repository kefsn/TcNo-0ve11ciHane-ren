package javaders.day33maps;

import java.util.HashMap;

public class HashMap01 {
    public static void main(String[] args) {
        String s = "Hello Henry!";
        System.out.println(getTheNumOfOccurenceOfLetters(s));
    }
    //Alfabetik sıralamasını istiyorsak TreeMap yapacağız, Alfabetik istemiyorsak da HashMap yap
    public static HashMap<String, Integer > getTheNumOfOccurenceOfLetters(String s){
      //String'deki harf dışı karakterleri sil.
       s = s.replaceAll("[^A-Za-z]", "");

       //Görünüm sayılarını depolamak için Map oluştur.
        HashMap<String, Integer> numOfOccurence = new HashMap<>();

        //Harfleri al
        String letters[] = s.split("");

        //For each oluştur
        for (String w : letters){
          Integer numOfocc =  numOfOccurence.get(w);

          if(numOfocc==null){
              numOfOccurence.put(w,1);

          }else {
              numOfOccurence.put(w, numOfocc+1);
          }
        }
        return numOfOccurence;
    }
}
