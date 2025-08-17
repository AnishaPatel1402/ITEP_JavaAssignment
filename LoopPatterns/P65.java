//        1
//      1 1
//    1 2 1
//  1 3 3 1
//1 4 6 4 1

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                if(i==j || j==1) System.out.print(1);
                else System.out.print();
            }
            System.out.println();
        }
        
    }
}

