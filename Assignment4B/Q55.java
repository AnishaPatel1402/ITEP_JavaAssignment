//55) WAP to print all the odd numbers between two entered numbers
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number1");
        int n1 = sc.nextInt();
        System.out.println("enter the number2");
        int n2 = sc.nextInt();

        for(int i=n1; i<=n2; i++){
            if(i%2!=0) System.out.print(i+"\t");
        }
        
    }
}