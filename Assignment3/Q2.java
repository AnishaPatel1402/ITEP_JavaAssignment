import java.util.Scanner;
class Test{
    // 2.A shop will give discount of 10% if the cost of purchased quantity is more than 1000.
    // Ask user for quantity
    // Suppose, one unit will cost 100.
    // Judge and print total cost for user.

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter purchased quantity");
        int quantity = sc.nextInt();
        int unitCost = 100;
        double cost = quantity * unitCost;

        if(cost > 1000){
            double discount = cost * 10/100;
            cost = cost - discount;
            System.out.println("your final price with discount = "+ cost);
        } 
        else {
            System.out.println("your final price = "+ cost);
        }

    }
}