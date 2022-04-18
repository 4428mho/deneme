package calismalar;

import java.util.Scanner;

public class Employee {
    private String name;
    public double salary;
    private int workHors,hireYear;
    public Employee(){
        Scanner scan=new Scanner(System.in);
        System.out.println( " lutfen isminizi giriniz");
        this.name=scan.nextLine();
        System.out.println( " maaşınızı giriniz");
        this.salary=scan.nextDouble();
        System.out.println( " haftalık çalışma Saatinizi giriniz");
        this.workHors=scan.nextInt();
        System.out.println( " lütfen işe giriş yılınızı giriniz");
        this.hireYear=scan.nextInt();
    }
    public double tax() {
        if (this.salary >= 1000){
            return 1000 * 0.3;
    }else{
            return 0.0;
        }
    }
    public double bonus(){
        int extraHours=this.workHors-40;
        if(extraHours>0)
        {
            return 30*this.workHors;
        }
        return 0.0;
    }
    public double incrase (){
        int year=2022-this.hireYear;
        if (year<10){

            return salary*0.5;
        }else if (year>10&&year<20){
            return salary*0.10;
        }
        else {
            return salary*0.15;
        }
    }

    public void toString(Employee emp){
        System.out.println("Name  : "+emp.name);
        System.out.println("Tax : "+emp.tax());
        System.out.println("Bonus : "+emp.bonus());
        System.out.println("Incrase salary : "+emp.incrase());
        double totalSalary= emp.salary-(emp.tax()+emp.bonus());
        System.out.println("totalSalary: "+totalSalary);
        System.out.println("totalsalary with thr rise of salary : "+(emp.salary+emp.incrase()));
    }
}
