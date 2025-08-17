// 46) WAP to find out the sum of first and last digit of a user entered number 
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int i = n;
        while(i > 0){
            i = i/10;
        }
        System.out.println("sum of digits = "+ sumOfDigits);
    }
}