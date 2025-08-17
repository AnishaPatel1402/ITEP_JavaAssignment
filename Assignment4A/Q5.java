// 1 3 5 7-----n
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc .nextInt();
        int i=1; 
        while(i<=n){
            System.out.println(2*i-1);
            i++;
        }
    }
}