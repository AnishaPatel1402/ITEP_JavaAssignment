// Write a Java program to create a class called "Employee" with a name, salary, and hire date attributes, and a method to calculate years of service.

class Employee{
    private String name;
    private double salary;
    private Date hireDate;
    public Employee(String name, double salary, Date hireDate){
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }
    public int yearOfService(){
        int currYear = 2025;
        return (currYear - this.hireDate.year);
    }
    public void display(){
        System.out.println("Name = "+ this.name);
        System.out.println("Salary = "+ this.salary);
        System.out.println("Hire Date = "+ this.hireDate.displayDate());
        System.out.println("Year of Service = "+ this.yearOfService());
    }
}

class Date{
    int date;
    int month;
    int year;
    public Date(int date, int month, int year){
        this.date = date;
        this.month = month;
        this.year = year;
    }
    public String displayDate(){
        return (this.date+"-"+this.month+"-"+this.year);
    }

}

class Test{
    public static void main(String args[]){
        Employee e1 = new Employee("Anisha Patel", 200000, new Date(12,4,2005));
        e1.display();
        // System.out.println(e1.yearOfService());
    }
}