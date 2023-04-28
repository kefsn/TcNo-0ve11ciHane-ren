package deneme1.calismalar;

import java.util.ArrayList;

public class Calisan {
    int sayac;


    public String name;
    public int salary;

    public int workHours, hireYear;
    public int normalCalismaSuresi = 40;

    Calisan(String name, int salary, int workHours, int hireYear, int normalCalismaSuresi) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.normalCalismaSuresi = normalCalismaSuresi;
        sayac++;




    }

    public double tax() {
        if (salary > 10) {
            return salary * 0.03;
        } else {
            return 0.0;
        }
    }

    public double bonus() {
        return 30 * (workHours - normalCalismaSuresi);
    }

    @Override
    public String toString() {
        return "Calisan{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workHours=" + workHours +
                ", hireYear=" + hireYear +
                ", normalCalismaSuresi=" + normalCalismaSuresi +
                '}';
    }

    public double raiseSalary() {
        int year = 2023 - hireYear;
        if (year < 10) {
            return salary * 0.05;
        } else if (year > 9 && year < 20) {
            return salary * 0.1;
        } else {
            return salary * 0.15;
        }






    }
   /* public boolean ahmet() {
        System.out.println("Name :" + name);
        System.out.println("Salary : " + salary);
        System.out.println("Çalıştığı toplam saat :" + workHours);
        System.out.println("İşe giriş tarihi :" + hireYear);
        System.out.println("Normal çalışma saati :" + normalCalismaSuresi);
        System.out.println("Vergiler :" + tax());
        System.out.println("Aldığı bonuslar :" + bonus());
        System.out.println("Maaş artışı :" + raiseSalary());
        return false;
    }*/
}
