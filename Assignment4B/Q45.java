// 45) WAP to find out the sum of all the digits of a number
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int n = sc.nextInt();
        int sumOfDigits = 0;
        int i = n;
        while(i > 0){
            int lastD = i%10;
            sumOfDigits += lastD;
            i = i/10;
        }
        System.out.println("sum of digits = "+ sumOfDigits);
    }
}