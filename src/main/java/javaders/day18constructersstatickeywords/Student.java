package javaders.day18constructersstatickeywords;

public class Student {
    /*
    -Static olan herkes ve herşey tarafından farkedilir.
    -Static olan herkesi ya da herşeyi ilgilendirir.
    -Herkesi veya herşeyi ilgilendirmeyen şeylere non-static denilir.
    -"statiic" "class member'lar(variable, method, constructor, code blocks)
    tüm objeler tarafından paylaşılır. Gökteki ay örneği gibi, ortak eleman olduğu
    için herkes sahiplenebilir.
    -"static" "class member'lar'dak tüm değişikliler tüm object'Lar tarafından görünür.
    "static" "class member'lar gökteki ayın dünya ya bağlı olduğu gibi
    class'a bağlıdırlar.Bu yüzden "static variable'lara "class variable" da denir.
    -Bu yüzden "static method'lara "class method" da denir.
    -"static" "class member'lar'ın nasıl çalıştığını anlamak için çizim yapıp,
    static olanlara klass'a olmayanları object'e bağlayarak düşünmek bu konuyu kolaylaştırır.
     -'Static class member'ları çağırmak için object oluşturmak gerekmez ve tavsiye edilmez.
     -Non-'Static class member'ları çağırmak için obje oluşturmak şarttır.

     */
    public static int numOfRegisteredStd = 0;
    public int num = 0;

    public Student() {
    numOfRegisteredStd++;
    num++;

    }

    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        System.out.println(numOfRegisteredStd);//3
        System.out.println(s1.num);//1
    }
}
