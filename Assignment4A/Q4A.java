//calculate sum of 1, 2, 3, 4, ------- n
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int sum = 0;
        int i=1; 
        while(i<=n){
            sum = sum + i;
            i++;
        }
        System.out.println("Sum = "+ sum);
    }
}