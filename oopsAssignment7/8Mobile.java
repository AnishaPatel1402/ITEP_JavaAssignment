import java.util.Scanner;
class Mobile{
    private String brand;
    private int model;
    private double price;

    //setter
    public void setData(String brand, int model, double price){
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public void display(){
        System.out.println("Mobile Brand = "+ this.brand);
        System.out.println("Mobile Model = "+ this.model);
        System.out.println("Mobile Price = "+ this.price);
    }

    public boolean isAffordable(){
        return (this.price < 20000);
    }

}

class Test{
    public static void main(String args[]){
       Mobile m = new Mobile();
       m.setData("iQoo", 1402, 15000);
       m.display();
       System.out.println("Mobile is affordable = "+ m.isAffordable());
    }
}