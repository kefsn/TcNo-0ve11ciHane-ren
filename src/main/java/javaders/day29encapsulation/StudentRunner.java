package javaders.day29encapsulation;

public class StudentRunner {
    public static void main(String[] args) {
        Student s1 = new Student();
        System.out.println(s1.getStdId());//Private methodu okumuş olduk.
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesfull());

        s1.setStdId("MU123456");
        s1.setNotOrt(4.99);
        s1.setSuccesfull(true);

        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesfull());

        s1.setStdId("DH313756");
        s1.setNotOrt(4.59);
        s1.setSuccesfull(true);

        System.out.println(s1.getStdId());
        System.out.println(s1.getNotOrt());
        System.out.println(s1.isSuccesfull());

        s1.setStdId("Galiba");
        s1.setNotOrt(5.0);
        s1.setSuccesfull(true);

        System.out.println("---------------");

        System.out.println(s1.getStdId());

        Student s2 = new Student();//Yeni obje s2 üzerinden notrtalamasını çağırdığımızda Orjinal değeri verir.
        System.out.println(s2.getNotOrt());


    }
}
