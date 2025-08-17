// 47) WAP to print tables of all the numbers between two entered numbers
import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();
        int i;
        for(i=n1; i<=n2; i++){
            System.out.println("Table of "+ i);
            for(int count=1; count<=10; count++){
                System.out.println(i+" X "+count+" = "+ (i*count));
            }
        }
        
    }
}