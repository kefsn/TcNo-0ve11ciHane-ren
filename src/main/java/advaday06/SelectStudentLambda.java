package advaday06;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SelectStudentLambda {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen ogrenci sayisini giriniz");
        int numStd = input.nextInt();
        List<Student> students = new ArrayList<>();
        for (int i = 0; i < numStd; i++) {
            System.out.println("Isim : ");
            String name = input.next();
            System.out.println("Cinsiyet : \n kadin ise K\n erkek ise E giriniz: ");
            String gender = input.next().toUpperCase().trim().substring(0, 1);
            System.out.println("boy : ");
            double height = input.nextDouble();
            System.out.println("Kilo : ");
            double weight = input.nextDouble();
            Student student = new Student(name, gender, height, weight);
            students.add(student);
        }
        long time1 = System.nanoTime();
        List<Student> selectedStudent = Stream.concat(students.stream().
                        filter(t -> t.getGender().equalsIgnoreCase("K") && t.getHeight() > 1.50 &&
                                t.getWeight() > 50 && t.getWeight() < 70),
                students.stream().
                        filter(t -> t.getGender().equalsIgnoreCase("E") && t.getHeight() > 1.60 && t.getWeight() > 70
                                && t.getWeight() < 90)).collect(Collectors.toList());
        if (selectedStudent.isEmpty()){
            System.out.println("Malesef kurs gereksinimlerini karşılayan öğrenci bulunamadı.");
        }else {
            System.out.println("************************* Kursa Secilen Ogrenciler**************************************");
            selectedStudent.forEach(t-> System.out.println("Student{" +
                    "name='" + t.getName() + '\'' +
                    ", gender='" + t.getGender() + '\'' +
                    ", height=" + t.getHeight() +
                    ", weight=" + t.getWeight() +
                    '}'));
        }
        long time2 = System.nanoTime();
        System.out.println((time2-time1)/1000); //34782
    }
}
