// 17) Create a class Employee with(empNo ,salary and totalSalary)  with following 	features.
// Only parameterized constructor;
// totalSalary always represent total of all the salaries of all employees created.
// empNo should be auto incremented.
// display total employees and totalSalary using class method.


import java.util.Scanner;
class Employee{
    private int empNo;
    private double salary;
    private static int empCount = 0;
    private static double totalSalary;

    public Employee(double salary){
        empCount++;
        this.empNo = empCount;
        this.salary = salary;
        totalSalary += salary;
    }
    public int getEmpNo(){
        return this.empNo;
    }

    public  static void displayTotalSalary(){
        System.out.println("Total employees are " + empCount + " and their total salary is " + totalSalary);
    }

}
class Test{
    public static void main(String args[]){
        Employee e1 = new Employee(20000);
        Employee e2 = new Employee(10000);
        Employee.displayTotalSalary();
        Employee e3 = new Employee(50000);
        Employee e4 = new Employee(200000);
        Employee.displayTotalSalary();
    }
}