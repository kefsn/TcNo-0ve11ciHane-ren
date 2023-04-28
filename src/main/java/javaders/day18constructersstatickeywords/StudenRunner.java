package javaders.day18constructersstatickeywords;

public class StudenRunner {
    public static void main(String[] args) {
        //Static olan numOfRegisteredStd'ı çağırmak için klass ismini kullanmak yeterli.Obje oluşturmaya ihtiyaç yoktur.
        System.out.println(Student.numOfRegisteredStd);

        //'Static olmayan variable' çağırmak için,obje oluşturmak lazım.
        Student s1 = new Student();
        System.out.println(s1.num);

    }
}
