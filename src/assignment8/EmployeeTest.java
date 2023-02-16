package assignment8;

import java.util.Scanner;
class Employee{
    int hrs=0;
    int rate=0;
    Employee(){
    }
    Employee(int hrs, int rate){
        this.hrs=hrs;
        this.rate=rate;
    }
    public void computeSalary(){
        int salary = rate*hrs;
        System.out.println("salary is : "+salary);
    }
    @Override
    public String toString() {
        return "Employee{" + "hrs=" + hrs + ", rate=" + rate + '}';
    }
}
class WageEmployee extends Employee{
    WageEmployee(int hrs, int rate){
        super.rate=rate;
        this.hrs=hrs;
        super.computeSalary();
    }
}
class SalesPerson extends WageEmployee{
    int sales=0;
    int commission=0;
    SalesPerson(int hrs,int rate,int sales,int com){
        super(hrs ,rate);
        this.sales=sales;
        this.commission=com;
    }
    @Override
    public void computeSalary() {
        System.out.println("Salary of SalesPerson :: " + (sales*commission + hrs*rate ));
    }
}
class Manager extends Employee{
    String managerName="Ram";
    int fixedSalary=0;
    int incentive=0;
    Manager(int fixedSalary,int incentive){
        super();
        this.fixedSalary=fixedSalary;
        this.incentive=incentive;
    }
    @Override
    public void computeSalary() {
        System.out.println("Manager Name "+managerName);
        System.out.println("salary of manager "+(fixedSalary+incentive));
    }
}

public class EmployeeTest{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the hrs and rate of employee");
        int hrs = sc.nextInt();
        int rate = sc.nextInt();
        SalesPerson salesPerson = new SalesPerson(20,600,7,70);
        salesPerson.computeSalary();
        Manager manager = new Manager(75000,5000);
        manager.computeSalary();
        Employee [] employees = new Employee[3];
        employees[0]= new Employee(2,400);
        employees[1]= new Employee(6,500);
        employees[2]= new Employee(5,700);

        employees[0].computeSalary();
        employees[1].computeSalary();employees[2].computeSalary();

    }
}
/* Enter the hrs and rate of employee
23
45
salary is : 5000
Salary of SalesPerson :: 5810
Manager Name Ram
salary of manager 60000
salary is : 1600
salary is : 5400
salary is : 3600

Process finished with exit code 0
*/