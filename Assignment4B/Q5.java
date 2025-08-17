import java.util.Scanner;
class Test{
    public static void main(String args[]){
        //5) WAP to find out the factorial of a number.
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a  number: ");
        int n = sc.nextInt();
        int factorial = 1;
        int i=n;
        while(i>=1){
            factorial = factorial * i;
            i--;
        }
        System.out.println("factorial = "+ factorial);
    }
}