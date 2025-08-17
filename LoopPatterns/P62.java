//     1
//    123
//   12345
//  1234567
// 123456789

import java.util.Scanner;
class Test{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number of rows");
        int n = sc.nextInt();
        for(int i=1; i<=n; i++){
            //spaces
            for(int j=1; j<=n-i; j++) System.out.print(" ");
            //number
            for(int j=1; j<=2*i-1; j++) System.out.print(j);
            System.out.println();
        }
    }
}


