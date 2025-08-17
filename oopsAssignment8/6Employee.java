// Write a Java program to create a class called "Employee" with a name, job title, and salary attributes, and methods to calculate and update salary.

class Employee{
    private String name;
    private String jobtitle;
    private double salary;
    
    public Employee(String name, String jobtitle, double salary){
        this.name = name;
        this.jobtitle = jobtitle;
        this.salary = salary;
    }

    public double getSalary(){
        return this.salary;
    }

    public void calculateSalary(int incre){
        this.salary += (this.salary * incre)/100;
        System.out.println("Your salary = "+ this.salary);
    }

}
class Test{
    public static void main(String args[]){
        Employee e1 = new Employee("Ram","SDE", 50000);
        System.out.println(e1.getSalary());
        e1.calculateSalary(15);
    }
}