package deneme1.calismalar;

public class EmpDriver {


    public static void main(String[] args) {

    /*
    Employee emp1 = new Employee(1985, 45, 2000, "Kemal", 40);


        System.out.println( "Name: Kemal" );
        System.out.println("Salary: 2000,0");
        System.out.println("WOrk Hours : 45");
        System.out.println("Hire date : 1985");


        System.out.println(emp1.print()); */



        Calisan yeni = new Calisan("Yunus", 8000,50,2010,40);
        System.out.println(yeni);
       /*
        System.out.println("Name :" +yeni.name);
        System.out.println("Salary : " +yeni.salary);
        System.out.println("Çalıştığı toplam saat :" +yeni.workHours);
        System.out.println("İşe giriş tarihi :"+ yeni.hireYear);
        System.out.println("Normal çalışma saati :" +yeni.normalCalismaSuresi);
        System.out.println("Vergiler :" +yeni.tax());
        System.out.println("Aldığı bonuslar :" +yeni.bonus());
        System.out.println("Maaş artışı :" +yeni.raiseSalary());
        */


        double totalSalarr = yeni.salary + yeni.bonus() - yeni.tax();
        double totalSalaryRaise = yeni.salary + yeni.raiseSalary();

        System.out.println("Bonus ve vergilerle beraber toplam maaş :" +totalSalarr);
        System.out.println("Maaş zammıyla beraber toplam maaş :" + totalSalaryRaise);






    }
}
