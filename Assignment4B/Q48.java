// 48) WAP to find out the factors of all the numbers between two entered numbers

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 1st number");
        int n1 = sc.nextInt();
        System.out.println("enter 2nd number");
        int n2 = sc.nextInt();

        for(int i=n1; i<=n2; i++){
            System.out.print("factors of "+ i + " = ");
            for(int count=1; count<=i; count++){
                if(i%count == 0) System.out.print(count+" ");
            }
            System.out.println();
        }
        
    }
}