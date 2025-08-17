// 123456789
//  1     7
//   1   5
//    1 3
//     1

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=n; i>=1; i--){
            //spaces
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            //star
            for(int j=1; j<=2*i-1; j++){
                if(i==n || j==1 || j==(2*i-1))  System.out.print(j);
                else System.out.print(" ");
            }
            System.out.println();
        }
    }
}
