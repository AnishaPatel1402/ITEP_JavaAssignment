//     *
//    *_*
//   *___* 
//  *_____* 
// *********

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            //star
            for(int j=1; j<=2*i-1; j++) 
            if(j==(2*i-1)||j==1||i==n) System.out.print("*");
            else System.out.print(" ");
            System.out.println();
        }
    }
}
