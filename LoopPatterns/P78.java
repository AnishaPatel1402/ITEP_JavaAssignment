//    1
//   12
//  123
// 1234
//  123
//   12
//    1

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        //first half
        for(int i=1; i<=n; i++){
            //space
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            //numbers
            for(int j=1; j<=i; j++) System.out.print(j);
            System.out.println();
        }
        //second half
        for(int i=1; i<n; i++){
            //space 
            for(int j=1; j<=i; j++) System.out.print(" ");
            //number
            for(int j=1; j<=n-i; j++) System.out.print(j);
            System.out.println();
        }
    }

}
