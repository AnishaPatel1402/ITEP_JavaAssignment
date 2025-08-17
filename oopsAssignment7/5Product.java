import java.util.Scanner;
class Product{
    private int productId;
    private String pname;
    private int quantity;
    private double price;

    //setter
    public void setData(int productId, String pname, int quantity, double price){
        this.productId = productId;
        this.pname = pname;
        this.quantity = quantity;
        this.price = price;
    }

    //display;
    public void display(){
        System.out.println("Product Id = "+ this.productId);
        System.out.println("Product Name = "+ this.pname);
        System.out.println("Quantity = "+ this.quantity);
        System.out.println("Price = "+ this.price);
    }
    public void calculatePrice(){
        double p = price * quantity;
        System.out.println("Total price is "+ p);
    }
}

class Test{
    public static void main(String args[]){
       Product p = new Product();
       p.setData(101, "Moisturizer", 2, 750);
       p.display();
       p.calculatePrice();
       
    }
}