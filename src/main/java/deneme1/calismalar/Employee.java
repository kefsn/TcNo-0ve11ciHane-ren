package deneme1.calismalar;

import java.time.LocalDate;

import static java.lang.String.join;

public class Employee {
    /*
      1-Employee adında bir class ve main metodu içinde barındıracak EmpDriver adında klas oluşturun.
      2-Bu class'ın 4 tane instance ve 5 method olsun.
         5 instance şunlar olsun;
            -the name
            -the salary
            -the work hours
            -the hire year
            -Normal çalışma saati



      3-Class'ın methodları şunları içersin ;
        a) Employee constructor'ı içerisine 4 parametre girin(name,salary,work hours,hire year,Normal çalışma saati).
        b) Tax method salary üzerinden şöyle hesaplma yapsın;
        -Maaş 1000 TL'ye eşit veya daha az ise vergi almasın.
        -Salary 1000 Tl'den daha fazla ise %3'lük vergi alın.
        c) Bonus method employee'nın fazla çalışma  mesailerini şöyle hesaplasın
        -Her 1 saatlik fazla mesai için 30 TL alsın.
        d) RaiseSalary methodu ise empployee için maaş artırma methodu olsun.
        - Eğer 10 yıldan daha az çalışmışsa %5 artış maaşında olsun,
        - 20 yıldan az ve 9 yıldan daha fazla çalışmışsa %10 aartış olsun maaşında,
        -19 yıldan daha fazla çalışmışsa , maaş artışı %15 olsun
        e) toString methodu bize employee hakkında ki bütün bilgileri return etsin
        Örnek;
        Name: Kemal
        Salary: 2000,0
        WOrk Hours : 45
        Hire date : 1985
        Tax : 60.0
        Bonus : 150.0
        Raise of Salary : 300.0

        Note:
        1) Employee'n name, salary, work hours and hire date kullanıcıdan alın.
        2) Önceki değerleri kullanarak Employe objesi oluşturun.
        3) Tax ve bonus'ları gözönünde bulundurarak Total salary hesap edin.
        4) Tax ve bonusları göz önünde bulundurmadan, raise of salary'den sonra, employee'n total salary'sini hesap edin
        5) Employee hakkında ki bilgileri print edin.

        Örnek;
        Name: Kemal
        Salary: 2000,0
        WOrk Hours : 45
        Hire date : 1985
        Tax : 60.0
        Bonus : 150.0
        Raise of Salary : 300.0
        Salary with tax and bonus : 2090.0
        Total salary with the raise of salary : 2300.0

     */
    public static void main(String[] args) {


    }

    private String name;
    public double salary;
    private int workHours;
    private int hireYear;
    private int normalCalismaSaati = 40;

    Employee(int hireYear, int workHours, double salary, String name, int normalCalismaSaati) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
        this.normalCalismaSaati = normalCalismaSaati;

    }

    public double tax() {
        if (this.salary > 1000) {
            return salary * 0.03;

        } else {
            return 0.0;
        }


    }

    public double bonus() {
        int extraHours = this.workHours - normalCalismaSaati;
        if (extraHours > 0) {
            return 30 * extraHours;
        }
        return 0.0;

    }

    public double increase() {
        LocalDate now = LocalDate.now();
        int year = 2020 - this.hireYear;

        if (year < 10) {
            return salary * 0.05;
        } else if (year >= 10 && year < 20) {
            return salary * 0.10;
        } else {
            return salary * 0.15;
        }
    }

    public boolean print() {
        System.out.println("Tax : " + this.tax());
        System.out.println("Bonus : " + this.bonus());
        System.out.println("İncrease : " + this.increase());
        double totalSalary = this.salary - this.tax() + this.bonus();
        System.out.println("Total Salary with tax and bonus :" + totalSalary);
        System.out.println("Total Salary with the raise of salary :" + (this.salary + this.increase()));


        return false;
    }
}



