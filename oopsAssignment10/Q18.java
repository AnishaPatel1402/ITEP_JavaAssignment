// 18) Create class Product (pid, price, quantity) with parameterized constructor.Create a main function in different class (say XYZ) and perform following task:
// Accept five product information from user and store in an array
// Find Pid of product with highest price.
// Create method (with array of product’s object as argument) in XYZ class to calculate and return total amount spent on all products. (amount spent on single product=price of product * quantity of product).

import java.util.Scanner;
import java.util.ArrayList;

class Shop{
        ArrayList<Product> cart = new ArrayList<Product>();
        Scanner sc = new Scanner(System.in);

        public void init(){
            for(int i=1; i<=5; i++){
            System.out.println("enter the id of " + i + " product ");
            int id = sc.nextInt();
            System.out.println("enter the price of product: ");
            double price = sc.nextDouble();
            System.out.println("enter the quantity of product: ");
            int quantity = sc.nextInt();

            Product p = new Product(id, price, quantity);
            cart.add(p);
            }
        }

        public void displayProductList(){
            for(Product p : cart){
                p.display();
            }
        }

        public int idOfMaxPriceProduct(){
            int maxId = -1;
            double maxPrice = 0;
            for(Product p : cart){
                if(p.getPrice() > maxPrice) {
                    maxPrice = p.getPrice();
                    maxId = p.getId();
                }
            }

            // System.out.println("Product id: "+maxId+" has the max price of : "+ maxPrice);
            return maxId;
        }

        public void totalAmount(){
            double total = 0.0;
            for(Product p : cart){
                total += (p.getPrice() * p.getQuantity());
            }
            System.out.println("Total amount is: "+ total);
        }
}

class Product{
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity){
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    public double getPrice(){
        return this.price;
    }
    public int getId(){
        return this.pid;
    }
    public int getQuantity(){
        return this.quantity;
    }
    public void display(){
        System.out.println("Product Id : "+ this.pid);
        System.out.println("Product Price : "+ this.price);
        System.out.println("Product Quantity : "+ this.quantity);
        System.out.println();
    }
}

class Test{
    public static void main(String args[]){
        Shop s = new Shop();
        s.init();
        s.displayProductList();
        System.out.println("Id of product who has maximum price: "+ s.idOfMaxPriceProduct());
        s.totalAmount();
    }
}