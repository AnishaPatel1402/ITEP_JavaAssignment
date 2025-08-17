import java.util.Scanner;
class Car{
    private String brand;
    private int model;
    private int year;

    //setter
    public void setData(String brand, int model, int year){
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    //display;
    public void display(){
        System.out.println("Brand = "+ this.brand);
        System.out.println("Model = "+ this.model);
        System.out.println("Year = "+ this.year);
    }
}

class Test{
    public static void main(String args[]){
       Car c = new Car();
       c.setData("BMW", 1402, 2005);
       c.display();
    }
}