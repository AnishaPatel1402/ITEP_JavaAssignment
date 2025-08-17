//25. Write a Java program to calculate profit or loss. 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a Cost price");
        int cp = sc.nextInt();
        System.out.println("enter a selling price");
        int sp = sc.nextInt();
        
        int result = sp-cp;
        if(result > 0){
            System.out.println("You will get profit of "+ result+" rs");
        }else{
            System.out.println("You will get loss of "+ result+" rs");
        }
        
    }
}