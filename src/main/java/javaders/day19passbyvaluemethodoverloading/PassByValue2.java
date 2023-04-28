package javaders.day19passbyvaluemethodoverloading;

public class PassByValue2 {
    public static void main(String[] args) {
        String name = "Tom Hanks";
        System.out.println(name);

       String updatedName = updateName(name, "ali");

       System.out.println(updatedName);
        System.out.println(name);

        name= updateName(name , "senior");
        System.out.println(name);
    }
    public static String updateName(String name, String add){//String add Tom hanks'a eklemek istediğimiz isim.
        name = name+ " " + add;
        return name;
    }
}
