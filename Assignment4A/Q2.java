// 1 2 3 4 5-----n
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number: ");
        int n = sc.nextInt();
        int i=1; 
        while(i<=n){
            System.out.println(i);
            i++;
        }
    }
}