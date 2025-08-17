import java.util.Scanner;
class Employee{
    private int id;
    private String name;
    private double salary;

    //setter
    public void setData(int id, String name, double salary){
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    //getters
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public double getSalary(){
        return this.salary;
    }

    //display;
    public void display(){
        System.out.println("id = "+ getId());
        System.out.println("Name = "+ getName());
        System.out.println("Salary = "+ getSalary());
    }
}

class Test{
    public static void main(String args[]){
        Employee e = new Employee();
        e.setData(101, "Anisha Patel", 50000);
        // System.out.println(e.getName());
        e.display();
    }
}