import java.util.Scanner;
class Test{
    // Write a java program to accept the cost price of a bike
    // and display the road tax to be paid according to the 
    // following criteria.
    // Cost Price(In Rs)		Tax
    //  > 100000			 15%
    //  >50000 and <=100000	 10%
    //  <=50000			 5%	
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the cost price of bike");
        double price = sc.nextDouble();
        double tax;
        if(price > 100000){
            //tax 15%
            tax = price * 15/100;
        }
        else if(price > 50000 && price <= 100000){
            //tax 10%
            tax = price * 10/100;
        } else {
            tax = price * 5/100;
        }
        System.out.println("Tax to be paid = "+ tax);
    }
}